package br.edu.ceub.sessoes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class servletCadastro1
 */
@WebServlet("/servletCadastro1")
public class servletCadastro1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletCadastro1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter x = response.getWriter();
		String nome =  request.getParameter("nome");
		String sobrenome =  request.getParameter("sobrenome");
		String rua =  request.getParameter("rua");
		String complemento =  request.getParameter("complemento");
		String cidade =  request.getParameter("cidade");
		String cep =  request.getParameter("cep");
		String estado =  request.getParameter("estado");
		HttpSession cadastro = request.getSession();
		cadastro.setAttribute("nome", nome);
		cadastro.setAttribute("sobrenome", sobrenome);
		cadastro.setAttribute("rua", rua);
		cadastro.setAttribute("complemento", complemento);
		cadastro.setAttribute("cidade", cidade);
		cadastro.setAttribute("cep", cep);
		cadastro.setAttribute("estado", estado);
		x.write("<html>"
				+ "<head>"
				+ "<title>Cadastro</title>"
				+ "</head>"
				+ "<body>"
				+ "<form action='servletCadastro2'>"
				+ "<p>Empresa:<input type='text' name='empresa'></p>"
				+ "<p>Rua empresa:<input type='text' name='ruaEmpresa'></p>"
				+ "<p>Complemento Empresa:<input type='text' name='complementoEmpresa'></p>"
				+ "<p>Cidade empresa:<input type='text' name='cidadeEmpresa'></p>"
				+ "<p>CEP empresa:<input type='text' name='cepEmpresa'></p>"
				+ "<p>Estado empresa:<input type='text' name='estadoEmpresa'></p>"
				+ "<p><input type='submit' value='enviar'></p>"
				+ "</form>"
				+ "</body>"
				+ "</html>");
		
	}

}
