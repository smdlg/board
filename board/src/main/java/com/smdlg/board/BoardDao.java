package com.smdlg.board;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smdlg.board.BoardVO;

@Repository
public class BoardDao {
	
	@Autowired
	SqlSessionTemplate mybatis;
	
	public void insert(BoardVO boardVO) {
		mybatis.insert("", boardVO);
	}

	public void update(String qid, BoardVO boardVO) {
		mybatis.update(qid, boardVO);
	}
	public void delete(String qid, BoardVO boardVO) {
		mybatis.delete(qid, boardVO);
	}
	public List<BoardVO> select(String qid, BoardVO boardVO) {
		return mybatis.selectList(qid, boardVO);
	}
}
