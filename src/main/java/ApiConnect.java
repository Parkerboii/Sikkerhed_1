import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ApiConnect", urlPatterns = "/api")
public class ApiConnect extends HttpServlet{

    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        PrintWriter writer = response.getWriter();
//        request.getRequestDispatcher("PersonaleHome.html").include(request, response);
//        writer.close();
//    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String cpr = req.getParameter("cpr");
        String diet = req.getParameter("kost");
        String liquid = req.getParameter("vaeske");
        if (cpr.toLowerCase().equals("qq") && diet.equals("qq")) {
            resp.addCookie(new Cookie("session", cpr));
            PrintWriter writer = resp.getWriter();
            resp.sendRedirect("PersonaleHome.html");
        } else {
            resp.sendRedirect("index.html");
        }
    }
}

