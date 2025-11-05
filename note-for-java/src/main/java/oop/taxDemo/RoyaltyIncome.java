package oop.taxDemo;

/**
 * 稿费收入税率是20%
 */
public class RoyaltyIncome implements Income {
    private double income;

    public RoyaltyIncome(double income) {
        this.income = income;
    }

    @Override
    public double getTax() {
        if (income <= 0) {
            return 0;
        }
        return this.income * 0.2;


    }
}