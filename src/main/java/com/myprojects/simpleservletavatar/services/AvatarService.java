package com.myprojects.simpleservletavatar.services;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@WebServlet("/avatar/gerar")
public class AvatarService extends HttpServlet {
	
	@Autowired
	RestTemplate restTemplate; 
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String textParameter = req.getParameter("name");
		String typeParameter = req.getParameter("type");
		String url = String.format("<img src=\"https://robohash.org/%s.png?set=%s\">", textParameter, typeParameter);
		resp.addHeader("content-type", "text/html");
		resp.getWriter().write(url);
	}
}
