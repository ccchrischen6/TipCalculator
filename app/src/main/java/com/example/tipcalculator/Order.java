package com.example.tipcalculator;

import java.io.Serializable;

public class Order implements Serializable {
    private double amount;
    private double taxRate;
    private double tipRate;

    public Order(double amount, double taxRate, double tipRate) {
        this.amount = amount;
        this.taxRate = taxRate;
        this.tipRate = tipRate;
    }

    @Override
    public String toString(){
        return "Total: " + amount +
                "\n Sales Tax :" + amount*taxRate +
                "\n Tip: " + amount*tipRate +
                "\n Grand Total: " + amount*(1+taxRate+tipRate);
    }

    public double getAmount() {
        return amount;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getTipRate() {
        return tipRate;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public void setTipRate(double tipRate) {
        this.tipRate = tipRate;
    }

}
