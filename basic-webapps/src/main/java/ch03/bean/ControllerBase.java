package ch03.bean;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerBase {
    protected final HttpServlet servlet;
    protected final HttpServletRequest request;
    protected final HttpServletResponse response;

    public ControllerBase(HttpServlet servlet, HttpServletRequest request, HttpServletResponse response) {
        this.servlet = servlet;
        this.request = request;
        this.response = response;
    }
}
