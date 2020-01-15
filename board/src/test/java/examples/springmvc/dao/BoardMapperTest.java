package examples.springmvc.dao;


import examples.springmvc.config.ApplicationConfig;
import examples.springmvc.dto.Board;
import examples.springmvc.dto.SearchCondition;
import examples.springmvc.dto.Board;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
@Transactional // test코드가 실행된 후, 롤백되기 때문에 원본 데이터는 문제가 발생하지 않는다. 해당 어노테이션을 붙이지 않으면 25번째 줄에서 오류가 발생할 수 있다. 테스트 메소드의 실행순서는 메소드 선언 순이 아니기 때문이다.
public class BoardMapperTest {

	@Autowired
	BoardsMapper boardMapper;
	
	@Test
	public void getBoards() throws Exception{
		SearchCondition searchCondition = new SearchCondition();
		
		List<Board> boards = boardMapper.getBoards(searchCondition);
		Assert.assertEquals(boards.size(), 7);
	}
	
	@Test
	public void getBoard() throws Exception{
		Long board_id = (long) 1;
		Board board = boardMapper.getBoard(board_id);
		System.out.println(board);
//		System.out.println(Board.getName());
//		System.out.println(Board.getBoardId());
		Assert.assertEquals(board.getId(), board_id);
	}

	@Test
	public void addBoard() throws Exception{
		Board board = new Board();
		board.setUserId("kgw");
		board.setTitle("테스트");
		board.setContent("테스트 게시물");
		board.setReadCount(0);
		
		int insertCount = boardMapper.addBoard(board);
		
		Assert.assertEquals(insertCount, 1);		
		Assert.assertEquals(((Board)boardMapper.getBoard(board.getId())).getTitle(), "테스트");
	}

}
