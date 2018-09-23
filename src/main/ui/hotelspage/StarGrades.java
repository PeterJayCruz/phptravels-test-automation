package ui.hotelspage;

public enum StarGrades {

	ONE_STAR(0, 1),
	TWO_STAR(1, 2),
	THREE_STAR(2, 3),
	FOUR_STAR(3, 4),
	FIVE_STAR(4, 5);

	private final int index;
	private final int value;

	private StarGrades(int index, int value) {
		this.index = index;
		this.value = value;
	}

	public int getIndex() {
		return index;
	}

	public int getValue() {
		return value;
	}
}
