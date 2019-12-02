package by.home.les09.entity;

public enum TourType {
	
	RECREATION("Recreation"),
	TOURS("Tours"),
	TREATMENT("Treatment"),
	SHOPPING("Shopping"),
	CRUISE("Cruise"),
	MUSICFEST("Music_festival");
	 
	private String title;
	
	private TourType(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
}
