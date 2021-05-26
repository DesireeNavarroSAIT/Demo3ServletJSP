package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class helloWorldServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //this will display the requested JSP as a view
        getServletContext().getRequestDispatcher("/WEB-INF/helloWorldJSP.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Capture the parameters from the POST requesst (the form)
        String firstname = request.getParameter("first_name");
        String lastname = request.getParameter("last_name");
        
        if(firstname == null || firstname.equals("") || lastname == null || lastname.equals("")){
            request.setAttribute("message","Invalid entry. Please enter both a first and last name");
            //forward the request and response object to the JSP
            //display the form again
            getServletContext().getRequestDispatcher("/WEB-INF/helloWorldJSP.jsp").forward(request,response);
            return;//very important! Stop the code call.
        }
        
        request.setAttribute("firstName",firstname);
        request.setAttribute("lastName",lastname);
        
        //display the helloWorld JSP
        getServletContext().getRequestDispatcher("/WEB-INF/HelloWorld.jsp").forward(request, response);
        
        //no code here...

    }

}