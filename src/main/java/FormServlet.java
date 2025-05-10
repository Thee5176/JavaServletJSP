import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        User userBeans = createUserBean(request);
        
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<p>ご確認ください。</p>");

        try {
            out.println("<p>名前: " + userBeans.getName() + "</p>");
        } catch(Exception e){
            out.println(e.getMessage());
        }

        try {
            out.println("<p>性別：" + userBeans.getGender() + "</p>");
        } catch(Exception e){
            out.println(e.getMessage());
        }

        try {
            out.println("<p>趣味</p>");
            out.println("<ol>");
            for (String h : userBeans.getHobby()) {
                out.println("<li>" + h + "</li>");
            }
            out.println("</ol>");
        } catch(Exception e){
            out.println(e.getMessage());
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.sendRedirect("/form.jsp");
    }
    
    private User createUserBean(HttpServletRequest request){
        User new_user = new User();
        final String[] GENDER = {"女性","男性"};
        
        new_user.setName(request.getParameter("name"));
        
        int gender_id = request.getParameter("gender").equals("1") ? 1 : 0;
        new_user.setGender(GENDER[gender_id]);
        
        new_user.setHobby(request.getParameterValues("hobby"));
        
        return new_user;
    }
}
