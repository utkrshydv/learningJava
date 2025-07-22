package marketing;

import general.Employee;

public class Sales extends Employee {
    public double tallowance(double basic) {
        double totalEarnings = earnings(basic);
        return totalEarnings * 0.05;
    }
}
