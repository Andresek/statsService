package ru.netology.stats;

public class StatsService {
    // сумма всех продаж
    public long sumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (long) (sum + sales[i]);
        }
        return sum;
    }

    // средняя сумма продаж в месяц
    public long averageSalePerMonth(long[] sales) {
        long sum = sumSales(sales);
        return sum / 12;
    }

    // месяц с пиком продаж
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i; //
            }
        }
        return maxMonth + 1;
    }

    // месяц с минимумом продаж
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return (int) minMonth + 1;
    }

    // количество месяцев с продажами ниже средних
    public int lowerMiddleMonth(long[] sales) {
        int minMonth = 0;
        int sumLowerMonth = 0;
        long averageSale = averageSalePerMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSale) {
                minMonth = 1;
                sumLowerMonth += minMonth;
            }
        }
        return sumLowerMonth;
    }

    // количество месяцев с продажами выше средних
    public int higherMiddleMonth(long[] sales) {
        int maxMonth = 0;
        int sumHigherMonth = 0;
        long averageSale = averageSalePerMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSale) {
                maxMonth = 1;
                sumHigherMonth += maxMonth;
            }
        }
        return sumHigherMonth;
    }
}
