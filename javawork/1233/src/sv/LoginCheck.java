package sv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("rdname");
		String userPwd=request.getParameter("rdps");
		String info=" ";
		if(("root".equals(userName))&&("123".equals(userPwd)))
		{
			info="GOOD"+userName+"��";
		}
		else
		{
			info="DEAD";
		}
		request.setAttribute("outputMesage", info);
		request.getRequestDispatcher("sy_6_1_info.jsp").forward(request, response);
	}

}
