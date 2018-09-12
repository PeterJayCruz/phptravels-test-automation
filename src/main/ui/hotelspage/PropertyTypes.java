package ui;

public enum PropertyTypes {

	APARTMENT(0),
	HOTEL(1),
	GUEST_HOUSE(2),
	MOTEL(3),
	RESIDENCE(4),
	RESORT(5),
	TIME_SHARE(6),
	EXTENDED_STAY(7),
	VILLA(8);
	
	private final int index;
	
	private PropertyTypes(int index) {
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}
}
