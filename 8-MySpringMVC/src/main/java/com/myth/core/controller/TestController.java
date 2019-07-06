package com.myth.core.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myth.annotation.MyController;
import com.myth.annotation.MyRequestMapping;
import com.myth.annotation.MyRequestParam;

@MyController
@MyRequestMapping("/test")
public class TestController {
	

	
	 @MyRequestMapping("/Test")
    public void test1(HttpServletRequest request, HttpServletResponse response,
    		@MyRequestParam("param") String param){
 		System.out.println(param);
	    try {
	    	// 解决有多个参数的问题.
            response.getWriter().write( "Test method success! param:"+param);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	 
	 
	 @MyRequestMapping("/Test2")
    public void test2(HttpServletRequest request, HttpServletResponse response){
        try {
            response.getWriter().println("Test2 method success!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
