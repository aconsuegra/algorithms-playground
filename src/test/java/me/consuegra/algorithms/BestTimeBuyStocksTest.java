package me.consuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BestTimeBuyStocksTest {

    BestTimeBuyStocks bestTimeBuyStocks = new BestTimeBuyStocks();

    @Before
    public void setUp() {
        bestTimeBuyStocks = new BestTimeBuyStocks();
    }

    @Test
    public void testLargeArray() {
        assertThat(bestTimeBuyStocks.maxProfit(new int[] {7, 1, 5, 3, 6, 4}), is(5));
    }

    @Test
    public void testNoProfit() {
        assertThat(bestTimeBuyStocks.maxProfit(new int[] {3, 2}), is(0));
    }

    @Test
    public void testDuplicatedProfit() {
        assertThat(bestTimeBuyStocks.maxProfit(new int[] {7, 2, 6, 1, 5}), is(4));
    }

}