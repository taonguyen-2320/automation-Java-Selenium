package javabasic.basicconcepts;

public class Ex_Operator {

	public static void main(String[] args) {

		int totalSlots = 100;
		int bookedSlots = 95;
		
		// Declare a variable that holds available slots, use total slots and booked slots to calculate value for this variable
		int availableSlots = (totalSlots-bookedSlots);
		
		// Declare a variable that holds available slots ratio against total slots, have a proper calculation for it
		float availableSlotsRatio = (float)availableSlots/totalSlots;
		
		boolean isAvailableSlotsRatio = true;
		boolean isAvailableSlot = true;
		
		System.out.println(availableSlots);
		System.out.println(availableSlotsRatio);
		
		// Declare a boolean variable that shows if the available slots ratio is less than or equals to 0.1
		if (availableSlotsRatio <= 0.1) {
			System.out.println(isAvailableSlotsRatio);
		} else {
			System.out.println(!isAvailableSlotsRatio);
		}
		
		// Declare a variable that shows if the above statement is true OR the available slot is less than 10
		if (isAvailableSlotsRatio == true || availableSlots <= 10) {
			System.out.println(isAvailableSlot);
		} else {
			System.out.println(!isAvailableSlot);
		}
		
	}

}
