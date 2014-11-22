package com.fcs.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fsc.dto.Publish;
import com.google.gson.Gson;
/**
 * @author WH141006P
 * Ajax demo
 * Oct 22, 2014
 */
public class PubServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setCharacterEncoding("UTF-8");
		List<Publish> pubs = new ArrayList<Publish>();
		Publish pubArr[] = new Publish[5];
		for (int i = 0; i < pubArr.length; i++) {
			pubArr[i] = new Publish(i+1,"publish"+i);
			pubs.add(pubArr[i]);
		}
		Gson gson = new Gson();
		out.print(gson.toJson(pubs));
	}

}
