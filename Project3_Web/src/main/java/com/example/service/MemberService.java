package com.example.service;

import com.example.dao.MemberDAO;

public class MemberService {
	
	MemberDAO memberDAO;
	private static MemberService instance;
	
	public static MemberService getInstance() {
		if(instance == null) {
			instance = new MemberService();
		}
		
		return instance;
	}
	
	private MemberService() {
		memberDAO = new MemberDAO();
	}
	
	public String login(String id, String pw)
	{
		System.out.println("Member DAO login...");
		return memberDAO.login(id, pw);
	}

}
