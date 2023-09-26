package ru.netology.javaqa.javaqamvn.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindTotalSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 180;
        int actualDay = service.totalSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 15;
        int actualDay = service.meanPriceSales(sales);
        //System.out.println(expectedDay);
        // System.out.println(actualDay);
        Assertions.assertEquals(expectedDay, actualDay);
    }


    @Test
    public void shouldFindNumberMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 9;
        int actualDay = service.minSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindNumberMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 8;
        int actualDay = service.maxSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindHigherAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 5;
        int actualDay = service.higherMeanPriceSales(sales);
        // System.out.println(expectedDay);
        // System.out.println(actualDay);
        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindBelowAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 5;
        int actualDay = service.belowMeanPriceSales(sales);
        // System.out.println(expectedDay);
        // System.out.println(actualDay);
        Assertions.assertEquals(expectedDay, actualDay);
    }


}
