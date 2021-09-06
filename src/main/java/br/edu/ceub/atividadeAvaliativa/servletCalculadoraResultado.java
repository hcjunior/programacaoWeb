package br.edu.ceub.atividadeAvaliativa;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletCalculadoraResultado
 */
@WebServlet("/servletCalculadoraResultado")
public class servletCalculadoraResultado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletCalculadoraResultado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double valor1 = Double.parseDouble(request.getParameter("valor1"));
		double valor2 = Double.parseDouble(request.getParameter("valor2"));
		double resultado = valor1 + valor2;
		response.getWriter().write("<html><body><p>A soma dos parametros " + valor1 + " + " + valor2 + " é: " + resultado + "</p>");
		response.getWriter().write("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
