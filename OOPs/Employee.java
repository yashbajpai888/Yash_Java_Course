public class Employee {
    private int employeeID;
    private String name;
    private String companyName;
    private double monthlySalary;

    // Constructor
    public Employee(int employeeID, String name, String companyName, double monthlySalary) {
        this.employeeID = employeeID;
        this.name = name;
        this.companyName = companyName;
        this.monthlySalary = monthlySalary;
    }

    // Method to calculate annual income
    public double calculateAnnualIncome() {
        return monthlySalary * 12;
    }

    // Method to determine tax
    public double calculateTax() {
        double annualIncome = calculateAnnualIncome();
        double tax = 0;

        if (annualIncome <= 800000) {
            tax = 0;
        } else if (annualIncome > 1200000) {
            tax = annualIncome * 0.15;
        } else {
            tax = annualIncome * 0.10;
        }

        return tax;
    }

    // Getters and setters
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an employee object
        Employee employee1 = new Employee(101, "John Doe", "ABC Company", 50000);

        // Display employee information
        System.out.println("Employee ID: " + employee1.getEmployeeID());
        System.out.println("Name: " + employee1.getName());
        System.out.println("Company Name: " + employee1.getCompanyName());
        System.out.println("Monthly Salary: Rs." + employee1.getMonthlySalary());

        // Calculate and display annual income and tax
        double annualIncome = employee1.calculateAnnualIncome();
        double tax = employee1.calculateTax();
        System.out.println("Annual Income: Rs." + annualIncome);
        System.out.println("Tax: Rs." + tax);
    }
}
