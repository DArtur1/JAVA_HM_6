package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void HowMuchWasSold(){
        StatsService sale = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int actualSell = sale.allMonthSales(sales);
        System.out.println("Сумма всех продаж за месяц = " + actualSell + " руб");
    }

    @Test
    public void MonthlyAverageSales(){
        StatsService persale = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int monthAverageSale = persale.averageMonthlySales(sales);
        System.out.println("Средняя сумма продажи за месяц = " + monthAverageSale + " руб");
    }

    @Test
    public void MinMonthSale(){
        StatsService minSale = new StatsService();
        int[] sales = {
                80, 150, 130, 15, 170, 200, 190, 200, 70, 140, 140, 180
        };
        int minMonthSale = minSale.getMinMonthSale(sales);
        System.out.println("Минимальные продажи в " + minMonthSale + " месяце");
    }

    @Test
    public void MaxMonthSale(){
        StatsService maxSale = new StatsService();
        int[] sales = {
                80, 1150, 130, 15, 170, 200, 190, 200, 70, 140, 140, 1150
        };
        int maxSaleMonth = maxSale.getMaxMonthSale(sales);
        System.out.println("Максимальные продажи в(во) " + maxSaleMonth + " месяце");
    }

    @Test
    public void NumberOfMonthSalesBelow(){
        StatsService monthSalesBelow = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int belowOfMonth = monthSalesBelow.getMonthsBelowAverage(sales);
        System.out.println("Количество месяцев где продажи ниже среднего = " + belowOfMonth);
    }

    @Test
    public void NumberOfMonthSalesOver(){
        StatsService monthSalesOver = new StatsService();
        int[] sales = {
                80, 150, 130, 150, 107, 200, 190, 200, 170, 140, 140, 180
        };
        int overOfMonth = monthSalesOver.getMonthsOverAverage(sales);
        System.out.println("Количество месяцев где продажи выше среднего = " + overOfMonth);
    }


}
