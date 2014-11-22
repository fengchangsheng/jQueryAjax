package com.fcs.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

public class Abc extends HttpServlet {
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		PrintWriter pw = arg1.getWriter();
		/**
		 * pw.print("45"); 
		 * 可直接打印数字  无需转换为json类型  但是涉及到字母或者对象的话必须手动转换
		 * 也许就是因为数字与字符串关系的特殊性吧   数字转换为字符串大部分转换都是一样的
		 */
		Gson gson = new Gson();
		pw.print(gson.toJson("123"));
	}
}
