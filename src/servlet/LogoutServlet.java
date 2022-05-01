package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProc(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProc(req,resp);
	}
	
	protected void doProc(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 쿠키 제거
		// 서버에서는 쿠키를 직접 제거할수는 없고
		// 유효시간을 0 으로 설정하는 방법을 사용
		
		// 삭제할 쿠키의 이름과 똑같은 이름을 가진 새로운 쿠키를 생성
		Cookie cookie = new Cookie("userid", "");
		cookie.setMaxAge(0);
		
		// 이름이 같은 쿠키를 또 추가하면 기존의 쿠키대신 새로운 쿠키가 추가됨
		// 새로 추가된 쿠키의 유효시간은 0초 이므로 바로 사라짐
		resp.addCookie(cookie);
		resp.sendRedirect("loginForm.jsp");
		
	}
}
