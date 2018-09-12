package ui.hotelspage;

public enum Amenities {

	AIRPORT_TRANSFER(0),
	BUSINESS_CENTER(1),
	DISABLED_FACILITIES(2),
	NIGHT_CLUB(3),
	LAUNDRY_SERVICE(4),
	RESTAURANT(5),
	WIFI_INTERNET(6),
	BAR_LOUNGE(7),
	SWIMMING_POOL(8),
	INSIDE_PARKING(9),
	SHUTTLE_BUS_SERVICE(10),
	FITNESS_CENTER(11),
	SPA(12),
	CHILDREN_ACTIVITIES(13),
	AIR_CONDITIONER(14),
	BANQUET_HALL(15),
	CARDS_ACCEPTED(16),
	ELEVATOR(17),
	PETS_ALLOWED(18);
	
	private final int index;
	
	private Amenities(int index) {
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}
	
}
