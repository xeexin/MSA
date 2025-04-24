package quiz3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class VideoClass {
	int videoNum;
	String title;
	String genre;
	boolean rent;
	String rentCustomer;
	String rentDate;

	// constructor

	public VideoClass(int videoNum, String videoName, String videoGenre, boolean rent, String rentName,
			String rentDateStr) {
		this.videoNum = videoNum;
		this.title = videoName;
		this.genre = videoGenre;
		this.rent = rent;
		this.rentCustomer = rentName;
		this.rentDate = rentDateStr;
	}

	public VideoClass(int videoNum, String videoName, String videoGenre, boolean rent) {
		this.videoNum = videoNum;
		this.title = videoName;
		this.genre = videoGenre;
		this.rent = rent;
		this.rentCustomer = null;
		this.rentDate = null;
	}

	
	// getter setter
	public int getVideoNum() {
		return videoNum;
	}

	public void setVideoNum(int videoNum) {
		this.videoNum = videoNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public boolean isRent() {
		return rent;
	}

	public void setRent(boolean rent) {
		this.rent = rent;
	}

	public String getRentCustomer() {
		return rentCustomer;
	}

	public void setRentCustomer(String rentCustomer) {
		this.rentCustomer = rentCustomer;
	}

	public String getRentDate() {
		return rentDate;
	}

	public void setRentDate(String rentDate) {
		this.rentDate = rentDate;
	}

	@Override
	public String toString() {
		return "VideoClass [videoNum=" + videoNum + ", title=" + title + ", genre=" + genre + ", rent=" + rent
				+ ", rentCustomer=" + rentCustomer + ", rentDate=" + rentDate + "]";
	}

	
}
