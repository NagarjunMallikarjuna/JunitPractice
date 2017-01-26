package com.mockito.Example;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

public class PortfolioTester {

	Portfolio portfolio;
	StockService stockService;
	
	public static void main(String[] args){
		PortfolioTester tester = new PortfolioTester();
		tester.setUp();
	}
	
	public void setUp(){
		portfolio = new Portfolio();
		stockService = mock(StockService.class);
		portfolio.setStockService(stockService);
	}
	
	public boolean testMarketValue(){
		List<Stock> stocks = new ArrayList<Stock>();
		Stock googleStock = new Stock("1","Google",10);
		Stock appleStock = new Stock("2","Apple",20);
		stocks.add(googleStock);
		stocks.add(appleStock);
		
		portfolio.setStocks(stocks);
		
		when(stockService.getPrice(googleStock)).thenReturn(50.00);
		when(stockService.getPrice(appleStock)).thenReturn(1000.00);
		
		double marketValue = portfolio.getMarketValue();
		return marketValue == 100500.00;
	}
}
