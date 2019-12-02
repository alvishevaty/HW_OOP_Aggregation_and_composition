package by.home.les09.entity;

public enum Food {
	
	ALLINCLUSIVE("All Inclusive"),
	BREAKFAST("Breakfast"),
	LUNCH("Lunch"),
	DINNER("Dinner"),
	NOFOOD("Whithout food");
	
	private String title;

	private Food(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
}
