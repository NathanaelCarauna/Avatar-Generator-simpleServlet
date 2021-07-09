package com.myprojects.simpleservletavatar.services;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/avatar")
public class Index extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.addHeader("content-type","text/html");
		resp.getWriter().write("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Avatar Generator</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "	<h1>Avatar Generator</h1>\r\n"
				+ "	<form action=\"http://localhost:8080/avatar/gerar\" method=\"post\">\r\n"
				+ "		<label for=\"name\">Informe seu nome:</label><br> \r\n"
				+ "		<input type=\"text\" id=\"name\" name=\"name\"><br> <br>\r\n"
				+ "		<label>Escolha o tipo de avatar:</label><br>\r\n"
				+ "		<input type=\"radio\" id=\"robo\" name=\"type\" value=\"set3\">\r\n"
				+ "		<label for=\"robo\">Robo</label><br>\r\n"
				+ "        <input type=\"radio\" id=\"gato\" name=\"type\" value=\"set4\">\r\n"
				+ "        <label for=\"gato\">Gato</label><br>\r\n"
				+ "        <input type=\"radio\" id=\"monstro\" name=\"type\" value=\"set2\">\r\n"
				+ "        <label for=\"monstro\">Monstro</label>\r\n"
				+ "		<input type=\"submit\" value=\"Submit\">\r\n"
				+ "	</form>\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}
	
}
