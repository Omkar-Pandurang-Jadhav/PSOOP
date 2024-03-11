/*
The cost of stock on each day is given in an array A[] of size N. Day 1 price in first location, day 2 price in
second location etc. Find all the days on which you buy and sell the stock any number of times so that in
between those days your profit is maximum.A new transaction can only start after the previous
transaction is complete. Person can hold only one share at a time. Create a class Stock that has the name
of stock and array of prices. Also it has input method that initialises the predicted price of the stock in an
array of length N. Create class Transaction that is a sub class of Stock class. It has method
findMaximumProfit method.
Example Stock Prices: {1, 5, 2, 3, 7, 6, 4, 5}
Total profit earned is 10
Buy on day 1 and sell on day 2
Buy on day 3 and sell on day 5
Buy on day 7 and sell on day 8
*/



import java.util.Scanner;

class Stock{
    String name;
    int [] price ;
    public Stock(){}
    public Stock(String name,int []price){
        this.name=name;
        this.price=price;
    }


    public void inputprice(){
        System.out.println("Enter number of days -");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        price = new int [n+2];
        System.out.println("Enter the stockprice of name "+name+".");
        for(int i=0;i<price.length-2;i++){
            System.out.print("Day "+(i+1)+" :");
            price[i]=sc.nextInt();
        }
        price[n]=0;
        price[n+1]=0;
    }

    void findProfit(){
        int j=0;
        int c=0;
        int profit=0;
        for(int i=0;i<price.length;i++) {
            if (i < price.length - 3) {
                if (price[i] < price[i + 1] && (price[i + 1] < price[i + 2] || price[i + 1] > price[i + 2])) {
                    if (price[i + 2] > price[i + 1]) {
                        j = i + 2;
                    } else {
                        j = i + 1;
                    }
                    profit = profit + price[j] - price[i];
                    System.out.println("Buy on day " + (i + 1) + " and sell on day " + (j + 1));
                    if (price[i + 2] > price[i + 1]) {
                        i=j+1;
                    }
                }
            }
        }
        System.out.println("Total profit :"+profit);
    }

}

class Transaction extends Stock{
    public Transaction(){}
    public Transaction(String name,int [] price){
        super(name,price);
    }

}
public class Program5A1{
    public static void main(String args[]){


        Transaction t = new Transaction();
        t.inputprice();
        t.findProfit();

    }
}