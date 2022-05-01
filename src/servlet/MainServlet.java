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
		// �α��� ���¸� main.jsp �� ������
		// �α��� ���°� �ƴϸ� loginForm.jsp �� �ٽ� ������
		
		// ��� ��Ű ��������
		Cookie[] cookies = req.getCookies();
		
		String url = "loginForm.jsp"; // �α��� ���°� �ƴϸ� ���� �ּ�
		if(cookies != null && cookies.length > 0) {
			for(int i=0; i<cookies.length; i++) {
				// �츮�� loginServlet ���� �߰��� ��Ű�� �̸��� �˻�
				if(cookies[i].getName().equals("userid")) {
					// �̸��� userid�� ��Ű�� �ִ� ==> �α��� ���´�.
					// main �������� �����ش�.
					url = "mainCookie.jsp";
				}
			}
		}
		resp.sendRedirect(url);
	}
	
}
