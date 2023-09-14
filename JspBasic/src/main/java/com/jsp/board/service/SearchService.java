package com.jsp.board.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.servlet.board.model.BoardRepository;
import com.jsp.servlet.board.model.BoardVO;

public class SearchService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		String keyword = request.getParameter("keyword");
		
		List<BoardVO> list = BoardRepository.getInstance().search(keyword);
		
		request.setAttribute("boardList", list);
	}

}
