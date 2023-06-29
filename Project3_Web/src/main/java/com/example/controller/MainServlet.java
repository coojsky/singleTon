package com.example.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.service.MemberService;

public class MainServlet extends HttpServlet {
	
	MemberService memberService;
       
    public MainServlet() {
        System.out.println("MainServlet() 호출됨");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() 호출됨");
		
		memberService = MemberService.getInstance();
	}

	public void destroy() {
		System.out.println("destroy() 호출됨");
	}

//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("service() 호출됨");
//
//	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() 호출됨");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		String resultMsg = memberService.login(id, pw);
		PrintWriter out = response.getWriter();
		out.append(resultMsg);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost() 호출됨");
	}

}
