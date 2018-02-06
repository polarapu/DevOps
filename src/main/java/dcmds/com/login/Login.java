package dcmds.com.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("inside login");
		String  username ="";
		String password = "";
		if(request.getParameter("username")!=null && !request.getParameter("username").equals(""))
			username= request.getParameter("username").toString();
		if(request.getParameter("password")!=null && !request.getParameter("password").equals(""))
			password = request.getParameter("password").toString();
	 
	    if(username.equalsIgnoreCase("Prasad") && password.equals("Prasad")){
	    	request.setAttribute("username",username);
	    	RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp"); 
	    	  rd.forward(request,response); 
	    	   
	    }
	    else{
	    	RequestDispatcher rd=request.getRequestDispatcher("loginError.jsp"); 
	    	  rd.forward(request,response); 
	    	
	    }
	    	
	    	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
