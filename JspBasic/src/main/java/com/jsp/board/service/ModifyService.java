package com.jsp.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.servlet.board.model.BoardRepository;
import com.jsp.servlet.board.model.BoardVO;

public class ModifyService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		int bId = Integer.parseInt(request.getParameter("bId"));
		BoardVO vo = BoardRepository.getInstance().getContent(bId);
		request.setAttribute("article", vo);
		request.setAttribute("boardNo", bId);
		
	}

}
