package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	// "login" ��û�� �޾Ƽ� ó��
	
	private String tmpId = "hong";
	private String tmpPw = "1234";
	// 1. ��û�� �Ķ���Ϳ��� userid�� userpw�� �����´�.
	// 2. �ӽ� id�� pw�� �Ķ���Ϳ��� ������ ���� ��
	// 3. ���ؼ� id�� pw�� ������ �α��� ó��, ����ȭ�� �������� main ����û
	// 	  id�� pw�� �ٸ��� �α���â���� �ٽ� ������
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProc(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProc(req, resp);
	}
	
	
	protected void doProc(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//get, post ��û �Ѵ� ó��
		
		// form �±��� input name �� ��ġ�ϴ� �� ��������
		String userId = req.getParameter("userid");
		String userPw = req.getParameter("userpw");
		
		String url = "loginForm.jsp"; // �α��� ����� ���� ������ ���� �̵�����
		if(userId != null && userId.equals(tmpId)) {
			// ���̵� ���� , ���̵� ��ġ
			
			if(userPw != null && userPw.equals(tmpPw)) {
				// ��й�ȣ ��ġ
				// �α��� ���� 
				// ��Ű �����ؼ� ���������� ����
				
				// ����� ���̵� ���� ��Ű�� ���
				Cookie cookie = new Cookie("userid" , userId);
				// ��Ű�� ���䰴ü�� �߰�
				resp.addCookie(cookie);
				// �α��� ���������� ������������ ������
				url = "main";
			} else {
				// ��й�ȣ Ʋ��
			}
			
		} else {
			// ���̵� ���� x , �Ǵ� ���̵� Ʋ��
		}
		
		// ������ �̵�
		resp.sendRedirect(url);
	}

}
