package ders;

	import java.util.Scanner;

	public class StockMain {
		
		public static void main(String[]args) {
			Scanner console = new Scanner(System.in);
			System.out.println("Ýlk magaza ismi: ");
			String store1= console.next();
			Stock stock1= new Stock(store1);
			int profit1= makePurchases(stock1,console);
			System.out.println("Ýkinci magaza ismi: ");
			String store2= console.next();
			Stock stock2= new Stock(store2);
			int profit2= makePurchases(stock2,console);	
			if(profit1<profit2) {
				System.out.println(store1 + "daha yararlýdýr");
				
			}
			else if(profit1>profit2) {
				System.out.println(store2 + "daha yararlýdýr");
				
			}
			else {
				System.out.println(store1 + "ve" + store2 + "eþittir ");
			
			}
		}
		public static int makePurchases(Stock currentStock, Scanner console) {
			System.out.println("Kaç kez satýn alma yapýldý?");
			int numPurchases = console.nextInt();
			for(int i=1;i<=numPurchases;i++) {
				System.out.println(i+"Alýmda kaç adet alýndý? - Birim fiyat?");
				int numShares = console.nextInt();
				int priceShare = console.nextInt();
				currentStock.purchase(numShares,priceShare);
			}
			System.out.println("Güncel birim fiyat");
			int currentPrice=console.nextInt();
			
			int profit = currentStock.getProfit(currentPrice);
			System.out.println("net kazanc/kayýp: "+profit+"TL");
			System.out.println();
			
			return profit;	
		}	
		}
	


