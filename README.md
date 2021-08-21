# programacaoWeb

## ATIVIDADE 01

**1- Descreva os passos necess�rios para estar com o ambiente Eclipse + Apache Tomcat preparado para iniciar a programa��o web.**

� Passo 1: Fazer instala��o dos programas necessarios, entre eles: JDK 16, Eclipse IDE e Apache Tomcat v8.5.
O jdk e o apache tomcat s�o de f�cil instala��o, quanto ao eclipse, deve ser escolhida no momento da instala��o a vers�o "Eclipse IDE for Enterprise Java and Web Developers", ap�s escolher a vers�o aparecer� para escolher a vers�o do java a ser utilizado.

� Passo 2: Ap�s instalar os programas, o pr�ximo passo � conectar o servidor do tomcat no eclipse, para isso basta selecionar a op��o servers no eclipse ou caso n�o esteja aparecendo a op��o, clicar em "Window", depois "show view" e selecionar "servers", clicar na op��o em azul para criar um novo server, selecionar o servidor do tomcat v8.5 e selecionar o caminho no qual o tomcat est� armazenado. Feito isso o tomcat estar� funcionando e o projeto poder� ser iniciado.

**2 - Descreva os passos para se criar e executar um projeto web simples usando essas ferramentas.**

� Passo 1: Aperte 'CTRL + N', ou v� na op��o "File", ou clique com o bot�o direito do mouse na aba do "Project Explorer", v� em "new" e selecione "other...".

� Passo 2: Na janela que abriu, pesquise o tipo "Dynamic Web Project" e o selecione, ap�s isso clique em "next", coloque um nome para o projeto em "Project name" e clique em next duas vezes para chegar na ultima p�gina, nela marque a op��o "Generate web.xml deployment descriptor" e clique em "finish".

� Passo 3: Crie um arquivo "jsp file" com nome de "index.jsp", e ter� o primeiro arquivo jsp, no qual poder� definir um t�tulo e contruir o conte�do no body dele.

� Passo 4: Executar o projeto no servidor Tomcat, para isso pressione, 'alt + shift + x' e logo em seguida pressione 'r'.

**3 - Qual o link para clonar o seu projeto?**

https://github.com/hcjunior/programacaoWeb

## ATIVIDADE 03

**1 - Descreva o ciclo de vida dos Servlets.**

O cliente manda uma solicita��o para o servidor, o servidor acessa o conte�do da servlet e invoca o m�todo init() da servlet, ap�s isso o servidor envia o conte�do ao cliente e ap�s concluir as atividades da servlet o servidor invoca o metodo destroy(), o qual encerra a servlet.

**2 - Identifique quais m�todos da classe HttpServlet est�o envolvidos no processamento de requisi��es web. Descreva como esses m�todos s�o utilizados para processar as requisi��es feitas pelos clientes atrav�s dos navegadores web.**

O m�todo get recebe a requisi��o por ancora e o m�todo post recebe a requisi��o via action do bot�o submit.

**3 - Descreva os passos necess�rios para configurar uma aplica��o web para que o Servlet aluno.MeuServlet possa ser executado. Anexe prints do ambiente configurado.**

O servletHelitonChagas fica dentro de um package, e pode ser chamado atrav�s de tags como ancoras ```(<a href='servletHelitonChagas'>Clique aq</a>)```
ou bot�es de formularios atraves do action ```(<form action='servletHelitonChagas'><input type='submit' value='post'></form>.```