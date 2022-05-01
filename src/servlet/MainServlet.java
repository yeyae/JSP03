package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/main")
public class MainServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProc(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProc(req,resp);
	}
	
	protected void doProc(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 로그인 상태면 main.jsp 로 보내고
		// 로그인 상태가 아니면 loginForm.jsp 로 다시 보내기
		
		// 모든 쿠키 가져오기
		Cookie[] cookies = req.getCookies();
		
		String url = "loginForm.jsp"; // 로그인 상태가 아니면 보낼 주소
		if(cookies != null && cookies.length > 0) {
			for(int i=0; i<cookies.length; i++) {
				// 우리가 loginServlet 에서 추가한 쿠키의 이름을 검사
				if(cookies[i].getName().equals("userid")) {
					// 이름이 userid인 쿠키가 있다 ==> 로그인 상태다.
					// main 페이지로 보내준다.
					url = "mainCookie.jsp";
				}
			}
		}
		resp.sendRedirect(url);
	}
	
}
