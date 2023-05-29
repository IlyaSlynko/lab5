package org.dstu;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MammalsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String[] names = req.getParameterValues("name");
        if (!names[0].equals("медведь")) {
            req.getRequestDispatcher("notfound.jsp").forward(req, resp);
        }
    }
}
