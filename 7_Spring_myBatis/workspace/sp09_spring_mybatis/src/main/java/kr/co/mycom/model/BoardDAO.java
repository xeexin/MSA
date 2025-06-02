package kr.co.mycom.model;

import java.util.HashMap;
import java.util.List;

public interface BoardDAO {
	
	public void insertBoard(BoardDTO dto); // insert

	public List<BoardDTO> getBoardList(HashMap map); // selectAll

	public BoardDTO getBoardByNum(int num); // selectByNum
}
