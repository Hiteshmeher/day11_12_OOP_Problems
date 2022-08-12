package com.bridgelabz.StockAccount;

import java.util.Scanner;
/**
 * 
 * @author HITESH
 *
 */
public class StockPortfolio extends Stock {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of Stocks");
		setNoOfStocks(sc.nextInt());
		for (int i = 1; i <= getNoOfStocks(); i++) {
			Stock st = new Stock();
			st.addShare();
			TotalValue += StockPrice;
		}
		System.out.println("\nTotal Value is " + TotalValue);
	sc.close();
	}
}