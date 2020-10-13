
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.AccountService;
import models.User;

/**
 *
 * @author 831719
 */
public class LoginServlet extends HttpServlet {




    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        String logout = request.getParameter("logout");
        
        if (logout != null)
        {
            session.invalidate();
            session = request.getSession();
        }
        
        String username = (String) session.getAttribute("username");
        
        if (username != null)
        {
            response.sendRedirect("home");
        }
        else
        {
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                    .forward(request, response);   
        }
    }
        
        
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("") && password.equals(""))
        {
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
            return;
        }
        
        AccountService as = new AccountService(username, password);
        User user = new User(username, password);
        as.login(username, password);
        
        if(user != null)
        {
            session.setAttribute("username", user.getUsername());
            response.sendRedirect("home");
        }
        else
        {
            request.setAttribute("message", "Invalid login.");
            request.setAttribute("username", username);
            request.setAttribute("password", password);
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
        }

        
    }
    
}
