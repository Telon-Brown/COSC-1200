package Package1;
import java.util.Date;

public class assignment3 {
	private int vaccineID;
	private int vaccineId;
    private String vaccineName;
    private double unitCost;
    private int quantityAvailable;
    private Date expiryDate;
    private String specialInstructions;
    
    public assignment3() {
        this.vaccineId = 0;
        this.vaccineName = "Unknown";
        this.unitCost = 0.0;
        this.quantityAvailable = 0;
        this.expiryDate = new Date();
        this.specialInstructions = "None";
    }

    // Parameterized constructor
    public assignment3(int vaccineID, String vaccineName, double unitCost, int quantityAvailable, Date expiryDate, String specialInstructions) {
        this.vaccineID = vaccineID;
        this.vaccineName = vaccineName;
        this.unitCost = unitCost;
        this.quantityAvailable = quantityAvailable;
        this.expiryDate = expiryDate;
        this.specialInstructions = specialInstructions;
    }

    // Setters
    public void setVaccineID(int vaccineID) {
        this.vaccineID = vaccineID;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    // Getters
    public int getVaccineID() {
        return vaccineID;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    // Display function
    public void display(boolean inTableFormat) {
        if (inTableFormat) {
            System.out.println("SKU | Vaccine Name | Unit Cost | QTY | Expiry | Special Instructions");
            System.out.println("----|--------------|-----------|-----|--------|-----------------------");
            System.out.println(vaccineID + " | " + vaccineName + " | $" + unitCost + " | " + quantityAvailable + " | " + expiryDate.toString() + " | " + specialInstructions);
        } else {
            System.out.println("SKU: " + vaccineID);
            System.out.println("Vaccine Name: " + vaccineName);
            System.out.println("Unit Cost: $" + unitCost);
            System.out.println("Quantity on hand: " + quantityAvailable);
            System.out.println("Expiry Date: " + expiryDate.toString());
            System.out.println("Special Instructions: " + specialInstructions);
        }
        

	public static void main(String[] args) {
		// Declaring Variables
		int vacine_ID = "Vacine ID";
		

	}
