package com.kosa.model;

import java.util.List;

public interface GiftDAO {
	public List GiftAll();

	public void insertGift(GiftDTO dto); // insert

	public void deleteGift(int dno); // delete

}
