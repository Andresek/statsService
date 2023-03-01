package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void sumForYearWithoutLoss() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageForYearWithoutLoss() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAver = 15;
        long actualAver = service.averageSalePerMonth(sales);

        Assertions.assertEquals(expectedAver, actualAver);
    }

    @Test
    public void maxSalesForYearWithoutLoss() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxSales = 8;
        int actualMaxSales = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void minSalesForYearWithoutLoss() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinSales = 9;
        int actualMinSales = service.minSales(sales);

        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void lowerMiddleSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedLower = 5;
        int actualLower = service.lowerMiddleMonth(sales);

        Assertions.assertEquals(expectedLower, actualLower);
    }

    @Test
    public void higherMiddleSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedHigher = 5;
        int actualHigher = service.higherMiddleMonth(sales);

        Assertions.assertEquals(expectedHigher, actualHigher);
    }
}
