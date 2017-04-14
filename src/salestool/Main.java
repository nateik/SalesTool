package salestool;

public class Main {

	public static void main(String[] args) {
		SalesData salesData = new SalesData();

		displayMessage();
		salesData.salesMessage();
	}

	public static void displayMessage() {
		System.out.println("INFO ON SALES DATA");
		System.out.println("FEEDBACK FROM SALES DATA");
	}

}
