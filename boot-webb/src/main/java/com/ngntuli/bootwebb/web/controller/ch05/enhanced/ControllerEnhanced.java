package com.ngntuli.bootwebb.web.controller.ch05.enhanced;

import com.ngntuli.bootwebb.web.data.ch05.enhanced.RequestData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Optional;

@Controller
@RequestMapping("/ch05/enhanced/")
@SessionAttributes("data")
public class ControllerEnhanced {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    @Qualifier("protoDefaultBean")
    private ObjectFactory<RequestData> requestDataProvider;

    @ModelAttribute("data")
    public RequestData modelData() {
        return requestDataProvider.getObject();
    }

    private String viewLocation(String viewName) {
        return "ch05/enhanced/" + viewName;
    }

    @GetMapping("process")
    public String process() {
        return viewLocation("process");
    }

    @GetMapping("restart")
    public String restart(SessionStatus status) {
        status.setComplete();
        return "redirect:edit";
    }

    @PostMapping("confirm")
    public String confirm(@ModelAttribute("data") Optional<RequestData> dataForm) {
        return "redirect:confirm";
    }

    @GetMapping("confirm")
    public String confirm() {
        return viewLocation("confirm");
    }

    @GetMapping("edit")
    public String edit() {
        return viewLocation("edit");
    }

    @GetMapping
    public String doGet() {
        return edit();
    }
}
