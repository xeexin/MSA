package kr.co.mycom.service;

import java.util.HashMap;
import java.util.List;

import kr.co.mycom.model.BoardDTO;

public interface BoardService {

	public void insertBoard(BoardDTO dto); // insert

	public List<BoardDTO> getBoardList(HashMap map); // selectAll

	public BoardDTO getBoardByNum(int num); // selectByNum

	public int getBoardCount();

	// delete
	public int deleteBoard(BoardDTO dto);

	public int updateHit(int num);

	public int updateBoard(BoardDTO dto);

	public void insertReply(BoardDTO dto);

	public void updateSort(BoardDTO dto);

	// update
}
