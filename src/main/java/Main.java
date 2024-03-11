import ru.netology.hw9.stats.StatsService;

public class Main {

    public static void main(String[] args) {

        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println("Sum of sales: " + statsService.sum(sales));
        System.out.println("Average of sales: " + statsService.average(sales));
        System.out.println("Month with max sales: " + statsService.monthMaximumSale(sales));
        System.out.println("Month with min sales: " + statsService.monthMinimumSale(sales));
        System.out.println("Months below average: " + statsService.salesBellowAverage(sales));
        System.out.println("Months above average: " + statsService.salesOverAverage(sales));
    }
}



