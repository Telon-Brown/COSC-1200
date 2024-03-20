package Package1;
import java.util.Date;
public class assignment3class {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Create an empty Vaccine using the default constructor
		        assignment3 emptyVaccine = new assignment3();

		        // Display the values of the Vaccine in a non-linear format
		        emptyVaccine.display(false);

		        // Use the setters to add values to the empty Vaccine
		        emptyVaccine.setVaccineID(1);
		        emptyVaccine.setVaccineName("COVID-19 Vaccine");
		        emptyVaccine.setUnitCost(25.0);
		        emptyVaccine.setQuantityAvailable(1000);
		        emptyVaccine.setExpiryDate(new Date(2024, 12, 31));
		        emptyVaccine.setSpecialInstructions("Keep refrigerated");

		        // Display the values of the Vaccine in a non-linear format
		        emptyVaccine.display(false);

		        // Use the parameterized Constructor to create at least two more vaccines
		        assignment3 vaccine1 = new assignment3(2, "Flu Vaccine", 15.0, 500, new Date(2024, 11, 30), "No special instructions");
		        assignment3 vaccine2 = new assignment3(3, "Hepatitis B Vaccine", 30.0, 200, new Date(2024, 10, 31), "For adults only");

		        // Create an array to save all the vaccines
		        assignment3[] vaccines = {emptyVaccine, vaccine1, vaccine2};

		        // Use the array to display the contents of your Vaccines in a table format
		        System.out.println("Displaying vaccines in table format:");
		        for (assignment3 assignment3 : vaccines) {
		            assignment3.display(true);
		        }
		        
	}}
		
