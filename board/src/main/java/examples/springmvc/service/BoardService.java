package examples.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import examples.springmvc.dao.BoardsMapper;
import examples.springmvc.dto.Board;
import examples.springmvc.dto.SearchCondition;

@Service
public class BoardService {
	@Autowired
	private BoardsMapper boardsMapper;
	
	@Transactional(readOnly=true)
	public List<Board> getBoards(SearchCondition searchCondition) {
		
//		SearchCondition searchCondition = new SearchCondition();
		return boardsMapper.getBoards(searchCondition);
	}
	
	@Transactional(readOnly=true)
	public Board getBoard(Long id) {
		return boardsMapper.getBoard(id);
	}
	@Transactional(readOnly=false)
	public int addBoard(Board board) {
		return boardsMapper.addBoard(board);
	}
}
