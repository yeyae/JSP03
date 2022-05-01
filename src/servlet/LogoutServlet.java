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
		// ��Ű ����
		// ���������� ��Ű�� ���� �����Ҽ��� ����
		// ��ȿ�ð��� 0 ���� �����ϴ� ����� ���
		
		// ������ ��Ű�� �̸��� �Ȱ��� �̸��� ���� ���ο� ��Ű�� ����
		Cookie cookie = new Cookie("userid", "");
		cookie.setMaxAge(0);
		
		// �̸��� ���� ��Ű�� �� �߰��ϸ� ������ ��Ű��� ���ο� ��Ű�� �߰���
		// ���� �߰��� ��Ű�� ��ȿ�ð��� 0�� �̹Ƿ� �ٷ� �����
		resp.addCookie(cookie);
		resp.sendRedirect("loginForm.jsp");
		
	}
}
