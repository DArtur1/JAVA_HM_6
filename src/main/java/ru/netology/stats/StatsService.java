package ru.netology.stats;

public class StatsService {

    public int allMonthSales(int[] monthSales) {
        int salesSum = 0; //
        for (int i = 0; i < monthSales.length; i++) {
            salesSum = salesSum + monthSales[i];
        }
        return salesSum;
    }

    public int averageMonthlySales(int[] monthSales) {
        int salesSum = allMonthSales(monthSales); // Обращение к методу все продажи
        int monthlySales = monthSales.length;
        int averageSales = salesSum / monthlySales;
        return averageSales;
    }

    public int getMinMonthSale(int[] monthlySales) {
        int minPay = 0;
        for (int i = 0; i < monthlySales.length; i++) {
            if (monthlySales[i] <= monthlySales[minPay]) {
                minPay = i;
            }
        }
        return minPay + 1;
    }

    public int getMaxMonthSale(int[] monthlySales) {
        int maxPay = 0;
        for (int i = 0; i < monthlySales.length; i++) {
            if (monthlySales[i] >= monthlySales[maxPay]) {
                maxPay = i;
            }
        }
        return maxPay + 1;
    }

    public int getMonthsBelowAverage(int[] monthSales) {
        int averageSales = averageMonthlySales(monthSales); // Обращение к методу средняя продажа в месяц

        int monthBelow = 0;
        for (int i = 0; i < monthSales.length; i++) {
            if (averageSales > monthSales[i]) {
                monthBelow++;
            }
        }
        return monthBelow;

    }

    public int getMonthsOverAverage(int[] monthSales) {

        int averageSales = averageMonthlySales(monthSales); // Обращение к методу средняя продажа в месяц
        int monthOver = 0;
        for (int i2 = 0; i2 < monthSales.length; i2++) {
            if (averageSales < monthSales[i2]) {
                monthOver++;
            }
        }
        return monthOver;

    }
}












