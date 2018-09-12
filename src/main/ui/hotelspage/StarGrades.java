package ui.hotelspage;

public enum StarGrades {

	ONE_STAR(0),
	TWO_STAR(1),
	THREE_STAR(2),
	FOUR_STAR(3),
	FIVE_STAR(4);
	
	private final int index;
	
	private StarGrades(int index) {
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}
}
