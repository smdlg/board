package com.smdlg.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	
	@Autowired
	BoardDao boardDao;
	
	/*public void insert(String qid, BoardVO boardVO) {
		boardDao.insert(qid, boardVO);
	}*/
	public void update(String qid, BoardVO boardVO) {
		boardDao.update(qid, boardVO);
	}
	public void delete(String qid, BoardVO boardVO) {
		boardDao.delete(qid, boardVO);
	}
	public List<BoardVO> select(String qid, BoardVO boardVO) {
		return boardDao.select(qid, boardVO);
	}
	
}
