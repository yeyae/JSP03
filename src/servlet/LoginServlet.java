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
	// "login" 요청을 받아서 처리
	
	private String tmpId = "hong";
	private String tmpPw = "1234";
	// 1. 요청의 파라미터에서 userid와 userpw를 가져온다.
	// 2. 임시 id와 pw를 파라미터에서 가져온 값과 비교
	// 3. 비교해서 id와 pw가 같으면 로그인 처리, 메인화면 보여들라고 main 에요청
	// 	  id와 pw가 다르면 로그인창으로 다시 보내기
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProc(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProc(req, resp);
	}
	
	
	protected void doProc(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//get, post 요청 둘다 처리
		
		// form 태그의 input name 과 일치하는 값 가져오기
		String userId = req.getParameter("userid");
		String userPw = req.getParameter("userpw");
		
		String url = "loginForm.jsp"; // 로그인 결과에 따라 다음에 어디로 이동할지
		if(userId != null && userId.equals(tmpId)) {
			// 아이디 존재 , 아이디 일치
			
			if(userPw != null && userPw.equals(tmpPw)) {
				// 비밀번호 일치
				// 로그인 상태 
				// 쿠키 생성해서 브라우저에게 전달
				
				// 사용자 아이디 정보 쿠키에 담기
				Cookie cookie = new Cookie("userid" , userId);
				// 쿠키를 응답객체에 추가
				resp.addCookie(cookie);
				// 로그인 성공했으니 메인페이지로 보내기
				url = "main";
			} else {
				// 비밀번호 틀림
			}
			
		} else {
			// 아이디 존재 x , 또는 아이디 틀림
		}
		
		// 페이지 이동
		resp.sendRedirect(url);
	}

}
