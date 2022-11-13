package com.ngntuli.bootweb.ch04.controller;

import com.ngntuli.bootweb.ch04.models.RequestData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/ch04/controller/Controller")
public class ControllerHelper {

    @Autowired
    @Qualifier("requestDataDefaultBean")
    RequestData data;

    String viewLocation(String view) {
        return "/ch04/restructured/" + view;
    }

    @GetMapping
    public String doGet(HttpServletRequest request) {
        String address;

        request.getSession().setAttribute("data", data);

        data.setHobby(request.getParameter("hobby"));
        data.setAversion(request.getParameter("aversion"));

        if (request.getParameter("processButton") != null) {
            address = viewLocation("process");
        } else if (request.getParameter("confirmButton") != null) {
            address = viewLocation("confirm");
        } else {
            address = viewLocation("edit");
        }
        return address;
    }

    public RequestData getData() {
        return data;
    }
}
