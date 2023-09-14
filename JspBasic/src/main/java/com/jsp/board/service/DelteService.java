package com.jsp.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.servlet.board.model.BoardRepository;

public class DelteService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		int bId = Integer.parseInt(request.getParameter("bId"));
		
		BoardRepository.getInstance().delete(bId);
		
	}

}
