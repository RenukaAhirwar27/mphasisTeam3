package com.mphasis.main;

import com.mphasis.Portfolio;
import com.mphasis.entities.Stock;
import com.mphasis.services.Calculate;
import com.mphasis.services.CalculatorService;
import com.mphasis.services.StockService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class Main {
    @InjectMocks
    Portfolio portfolio = new Portfolio();

    @Mock
    StockService stockService;

//    Portfolio portfolio;
//    StockService stockService;


    // Transforming code to use Junit instead of boilerPlate
//    public static void main(String[] args) {
//        Main main = new Main();
//        main.setUp();
//        System.out.println(main.testMarketValue());
//    }
//    public void setUp(){
//        portfolio = new Portfolio();
//
//        //mocking objects
//        stockService = mock(StockService.class);
//        portfolio.setStockService(stockService);
//    }

    @Test
    public void testMarketValue(){
        List<Stock> stocks = new ArrayList<Stock>();
        Stock googleStock = new Stock("1","Google",10);
        Stock microsoftStock = new Stock("2","Microsoft",100);

        stocks.add(googleStock);
        stocks.add(microsoftStock);

        portfolio.setStocks(stocks);

        // mocking methods
        when(stockService.getPrice(googleStock)).thenReturn(50.00);
        when(stockService.getPrice(microsoftStock)).thenReturn(1000.00);

        double marketValue = portfolio.getMarketValue();
        assertEquals(100500.0,marketValue,0.0);
        //return marketValue==100500.0;

    }
    @Mock
    CalculatorService calculatorService;

    @InjectMocks
    Calculate calculate;

    @Test(expected = RuntimeException.class)
    public void testAdd() {
        doThrow(new RuntimeException("Add operation not implemented")).when(calculatorService).add(4,5);
        int value = calculatorService.add(4,5);
        Assert.assertEquals(9,value,0);
    }

    @Test
    public void AddTest() {
        when(calculatorService.add(6,7)).thenReturn(13);
        int value = calculatorService.add(6,7);
        Assert.assertEquals(13,value,0);
    }

    @Test
    public void SubtractTest() {
        when(calculatorService.subtract(4,4)).thenReturn(0);
        int value = calculatorService.subtract(4,4);
        Assert.assertEquals(0,value,0);
    }

    @Test
    public void MultiplyTest() {
        when(calculatorService.multiply(3,4)).thenReturn(12);
        int value = calculatorService.multiply(3,4);
        Assert.assertEquals(12,value,0);
    }

    @Test
    public void DivideTest() {
        when(calculatorService.divide(4,4)).thenReturn(1);
        int value = calculatorService.divide(4,4);
        Assert.assertEquals(1,value,0);
    }

}
