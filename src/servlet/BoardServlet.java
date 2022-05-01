package servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Board;

@WebServlet("/board")
public class BoardServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProc(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProc(req, resp);
	}
	
	protected void doProc(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		Board board = new Board();
		board.setEmail(req.getParameter("email"));
		board.setName(req.getParameter("name"));
		board.setPass(req.getParameter("pass"));
		board.setCreatedTime(new Date());
		board.setTitle(req.getParameter("title"));
		board.setContent(req.getParameter("content"));
		
		req.setAttribute("board", board);
		
		req.getRequestDispatcher("boardInfo.jsp").forward(req, resp);
		
	}
}
