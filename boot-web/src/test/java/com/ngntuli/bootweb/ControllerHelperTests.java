package com.ngntuli.bootweb;

import com.ngntuli.bootweb.ch04.models.RequestData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.MultiValueMap;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@Import(TestsConfig.class)
public class ControllerHelperTests {
    private static String suffix;
    private static String prefix;
    private static String hobbyRequest;
    private static String aversionRequest;
    private static MultiValueMap<String, String> requestParams;
    private static MultiValueMap<String, String> nonsenseParams;

    @Autowired
    @Qualifier("requestDataDefaultBean")
    RequestData data;
    private String locationUrl;
    private String controllerName;
    private String expectedUrl;
    private String viewName;
    private String expectedContent;
    private String buttonName;
    private String buttonValue;
    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    @BeforeAll
    private static void setupAll() {
        suffix = ".jsp";
        prefix = "/WEB-INF/views/";
        hobbyRequest = "Yoga";
        aversionRequest = "Gutters";
        requestParams.add("hobby", "Yoga");
        requestParams.add("aversion", "Gutters");
        nonsenseParams.add("none", "none");
    }

    @BeforeEach
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @BeforeEach
    private void setupEach() {
        locationUrl = "/ch04/restructured/";
        controllerName = "Controller";
        expectedUrl = "/ch04/restructured/";
        viewName = "edit";
        expectedContent = "Edit Page";
        buttonName = "none";
        buttonValue = "none";
        data.setHobby(null);
        data.setAversion(null);
    }

    private void makeRequestTestContent(
            String locationUrl,
            String controllerName,
            String expectedUrl,
            String viewName,
            String buttonName,
            String buttonValue,
            MultiValueMap<String, String> passedParams) throws Exception {
        mockMvc.perform(get(locationUrl + controllerName)
                .param(buttonName, buttonValue)
                .params(passedParams)
        ).andDo(print())
                .andExpect(status().isOk())
                .andExpect(forwardedUrl(prefix + expectedUrl + viewName + suffix))
                .andDo(print());
    }

    @BeforeEach
    public void testDoGetConfirmWithButton() throws Exception {
        expectedUrl = "ch04/restructured/";
        viewName = "confirm";
        expectedContent = "Confirm Page";
        buttonName = "confirmButton";
        buttonValue = "Confirm";
        makeRequestTestContent(
                locationUrl,
                controllerName,
                expectedUrl,
                viewName,
                buttonName,
                buttonValue,
                requestParams
        );
        Assertions.assertEquals(hobbyRequest, data.getHobby());
        Assertions.assertEquals(aversionRequest, data.getAversion());
    }
}
