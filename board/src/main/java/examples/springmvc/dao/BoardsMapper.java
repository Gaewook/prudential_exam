package examples.springmvc.dao;

import java.util.List;

import examples.springmvc.dto.Board;
import examples.springmvc.dto.SearchCondition;
import examples.springmvc.dto.User;
import examples.springmvc.mapper.Mapper;

@Mapper
public interface BoardsMapper {
	public int addBoard(Board board);
	public Board getBoard(Long id);
	public List<Board> getBoards(SearchCondition searchCondition);
	public Long getBoardCount();
}
