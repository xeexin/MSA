package kr.co.mycom.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.mycom.model.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insertBoard(BoardDTO dto) {
		BoardService service = sqlSession.getMapper(BoardService.class);
		service.insertBoard(dto);

	}

	@Override
	public List<BoardDTO> getBoardList(HashMap map) { // selectAll
		BoardService service = sqlSession.getMapper(BoardService.class);

		return service.getBoardList(map);
	}

	@Override
	public BoardDTO getBoardByNum(int num) { // selectByNum
		BoardService service = sqlSession.getMapper(BoardService.class);

		return service.getBoardByNum(num);
	}

	@Override
	public int getBoardCount() { // ÃÑ °Ô½Ã¹° ¼ö
		BoardService service = sqlSession.getMapper(BoardService.class);

		return service.getBoardCount();
	}

	@Override
	public int updateHit(int num) {
		BoardService service = sqlSession.getMapper(BoardService.class);
		return service.updateHit(num);
	}

	@Override
	public int updateBoard(BoardDTO dto) {
		BoardService service = sqlSession.getMapper(BoardService.class);
		return service.updateBoard(dto);
	}

	@Override
	public void insertReply(BoardDTO dto) {
		BoardService service = sqlSession.getMapper(BoardService.class);
		service.updateSort(dto);
		service.insertReply(dto);
	}

	@Override
	public void updateSort(BoardDTO dto) {
		BoardService service = sqlSession.getMapper(BoardService.class);
		service.updateSort(dto);
	}

	@Override
	public int deleteBoard(BoardDTO dto) {
		BoardService service = sqlSession.getMapper(BoardService.class);
		return service.deleteBoard(dto);
	}

}
