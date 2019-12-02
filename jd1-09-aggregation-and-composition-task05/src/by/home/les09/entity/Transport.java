package by.home.les09.entity;

public enum Transport {
	BUS("Bus"), 
	TRAIN("Train"), 
	PLAIN("Plain"), 
	FERRY("Ferry");

	private String title;

	private Transport(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
}
