package ch03.bean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ControllerHelper extends ControllerBase {
    private final RequestData data;

    public ControllerHelper(HttpServlet servlet, HttpServletRequest request, HttpServletResponse response) {
        super(servlet, request, response);
        data = new RequestData();
    }

    public void doGet() throws ServletException, IOException {
        String address;

        request.getSession().setAttribute("refData", this);

        data.setUserName(request.getParameter("userName"));
        data.setPassword(request.getParameter("password"));

        if (request.getParameter("processButton") != null) {
            address = "Process.jsp";
        } else if (request.getParameter("confirmButton") != null) {
            address = "Confirm.jsp";
        } else {
            address = "Edit.jsp";
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(address);
        dispatcher.forward(request, response);
    }

    public Object getData() {
        return data;
    }
}
