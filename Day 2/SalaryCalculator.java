public class SalaryCalculator {
    public static void main(String[] args) {
        double basicSalary = 40000.0;
        double hra = 0.30 * basicSalary;
        double da = 0.10 * basicSalary;
        double gross = basicSalary + hra + da;

        System.out.println("=== Salary Breakdown ===");
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA (30%): " + hra);
        System.out.println("DA (10%): " + da);
        System.out.println("-------------------------");
        System.out.println("Gross Salary: " + gross);
    }
}
