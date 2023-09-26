package ru.netology.javaqa.javaqamvn.stats;

public class StatsService {

    public int totalSales(int[] sales) {
        int total = 0;

        for (int i = 0; i < sales.length; i++) {
            total = total + sales[i];
        }
        return total;
    }

    public int meanPriceSales(int[] sales) {
        int total = 0;
        int month = 0;
        int average;
        for (int i = 0; i < sales.length; i++) {
            total = total + sales[i];
            month = month + 1;
        }
        return average = total / month;


    }

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int higherMeanPriceSales(int[] sales) {
        int total = 0;
        int month = 0;
        int average;
        for (int i = 0; i < sales.length; i++) {
            total = total + sales[i];
            month = month + 1;
        }
        average = total / month;
        int higherMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                higherMonth = higherMonth + 1;
            }
        }

        return higherMonth;


    }

    public int belowMeanPriceSales(int[] sales) {
        int total = 0;
        int month = 0;
        int average;
        for (int i = 0; i < sales.length; i++) {
            total = total + sales[i];
            month = month + 1;
        }
        average = total / month;
        int belowMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                belowMonth = belowMonth + 1;
            }
        }

        return belowMonth;
    }


}