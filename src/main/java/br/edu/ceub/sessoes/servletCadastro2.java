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
 * Servlet implementation class servletCadastro2
 */
@WebServlet("/servletCadastro2")
public class servletCadastro2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletCadastro2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter x = response.getWriter();
		String empresa =  request.getParameter("empresa");
		String ruaEmpresa =  request.getParameter("ruaEmpresa");
		String complementoEmpresa =  request.getParameter("complementoEmpresa");
		String cidadeEmpresa =  request.getParameter("cidadeEmpresa");
		String cepEmpresa =  request.getParameter("cepEmpresa");
		String estadoEmpresa =  request.getParameter("estadoEmpresa");
		HttpSession cadastro = request.getSession();
		String nome = (String) cadastro.getAttribute("nome");
		String sobrenome = (String) cadastro.getAttribute("sobrenome");
		String rua = (String) cadastro.getAttribute("rua");
		String complemento = (String) cadastro.getAttribute("complemento");
		String cidade = (String) cadastro.getAttribute("cidade");
		String cep = (String) cadastro.getAttribute("cep");
		String estado = (String) cadastro.getAttribute("estado");
		x.write("<html>"
				+ "<head>"
				+ "<title>Cadastro2</title>"
				+ "</head>"
				+ "<body>"
				+ "<p>Dados pessoais:</p>"
				+ "<p>nome: "+ nome +"</p>"
				+ "<p>sobrenome: "+ sobrenome + "</p>"
				+ "<p>rua: "+ rua +"</p>"
				+ "<p>complemento:"+ complemento +"</p>"
				+ "<p>cidade:"+ cidade +"</p>"
				+ "<p>cep:"+ cep +"</p>"
				+ "<p>estado:"+ estado +"</p>"
				+ "<p></p>"
				+ "<p>Dados da empresa:</p>"
				+ "<p>nome Empresa: "+ empresa +"</p>"
				+ "<p>rua Empresa: "+ ruaEmpresa +"</p>"
				+ "<p>complemento Empresa:"+ complementoEmpresa +"</p>"
				+ "<p>cidade Empresa:"+ cidadeEmpresa +"</p>"
				+ "<p>cep Empresa:"+ cepEmpresa +"</p>"
				+ "<p>estado Empresa:"+ estadoEmpresa +"</p>"
				+ "</body>"
				+ "</html>");
		
	}

}
