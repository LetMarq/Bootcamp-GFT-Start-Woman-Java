public class FluxControl {
    public static void main(String[] args) {

        defineMonth(5);
        defineVacation("july");
        defineDependencies();

    }

    private static void defineDependencies() {

        double monthlySalary = 18931.12d;
        double medianOfSalary = 10500d;

        int numberOfDependencies = 4;
        int medianOfDependencies = 2;

        boolean lowSalary = monthlySalary < medianOfSalary;
        boolean tooManyDependencies = numberOfDependencies >= medianOfDependencies;
        boolean needAssistance = lowSalary && tooManyDependencies;

        if (needAssistance) {
            System.out.println("Employee must receive assistance");
        } else {
            System.out.println("Employee doesnt need assistance");
        }
    }

    private static void defineVacation(String month) {
        if (month == "july" || month == "december" || month == "january") {
            System.out.println("Vacation");
        }

    }

    private static void defineMonth(int month) {
        if (month == 1) {
            System.out.println("Jan");
        } else if (month == 2) {
            System.out.println("Feb");
        } else if (month == 3) {
            System.out.println("Mar");
        } else if (month == 4) {
            System.out.println("Apr");
        } else if (month == 5) {
            System.out.println("May");
        } else if (month == 6) {
            System.out.println("Jun");
        } else if (month == 7) {
            System.out.println("Jul");
        } else if (month == 8) {
            System.out.println("Aug");
        } else if (month == 9) {
            System.out.println("Sep");
        } else if (month == 10) {
            System.out.println("Oct");
        } else if (month == 11) {
            System.out.println("Nov");
        } else {
            System.out.println("Dec");
        }

    }
}
