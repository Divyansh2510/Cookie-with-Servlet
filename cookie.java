import java.io.IOException; 
import java.io.PrintWriter; 
import jakarta.servlet.ServletException; 
import jakarta.servlet.annotation.WebServlet; 
import jakarta.servlet.http.Cookie; 
import jakarta.servlet.http.HttpServlet; 
import jakarta.servlet.http.HttpServletRequest; 
import jakarta.servlet.http.HttpServletResponse; 

@WebServlet(urlPatterns={"/cookie"}) public class cookie extends HttpServlet{
    
    static int i=1;
    @Override 
    public void doGet ( HttpServletRequest request,HttpServletResponse response)
             throws ServletException, IOException{
        
        // processRequest(request, response); response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        String k = String.valueOf(i);
        Cookie c = new Cookie("Visit",k);
        response.addCookie(c);
        int j = Integer.parseInt(c.getValue());
        if(j==1)
        {
            out.print("Welcome");
        }
        else
        {
            out.print("You visteted the page "+ i+ " times");
        }i++;
        
    }
}