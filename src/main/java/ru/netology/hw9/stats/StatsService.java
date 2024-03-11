package ru.netology.hw9.stats;

public class StatsService {

    public int calculateAverage(long[]sales) {
        long total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return (int) (total / sales.length);
    }
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }
    public long average(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale / sales.length;
    }

    public int monthMaximumSale(long[] sales) {
        int monthMaximum = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximum]) {
                monthMaximum = i;
            }
        }
        return monthMaximum + 1;
    }

    public int monthMinimumSale(long[] sales) {
        int monthMinimum = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinimum]) {
                monthMinimum = i;
            }
        }
        return monthMinimum + 1;
    }

    public int salesBellowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int salesOverAverage(long[] sales) {
        int counter = 0;
        long AverageSales = average(sales);
        for (long sale : sales) {
            if (sale > average(sales)) {
                counter++;
            }
        }
        return counter;
    }
}
