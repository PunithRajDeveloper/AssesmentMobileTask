package mobile;
import java.util.*;

class Mobile {
	String brandName;
    String os;
    int ram;
    int memory;
    int price;
    int rating;
    
    public Mobile(String os, int ram, int memory, int price, int rating,String brandName) {
        this.os = os;
        this.ram = ram;
        this.memory = memory;
        this.price = price;
        this.rating = rating;
        this.brandName=brandName;
    }
}

public class MobileShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        List<Mobile> mobiles = new ArrayList<>();
        System.out.println("1 for seller\n2. for buyer\n for exit");
        int choice=sc.nextInt();
        while(true) {
        	switch(choice) {
        	case 1:{
        		System.out.println("How many phone data u needto enter");
            	int  n=sc.nextInt();
            for (int i = 0; i < n; i++) {
            	System.out.println("enter os");
                String os = sc.next();
                System.out.println("enter ram");
                int ram = sc.nextInt();
                System.out.println("enter memory");
                int memory = sc.nextInt();
                System.out.println("enter price");
                int price = sc.nextInt();
                System.out.println("enter the name of the phone");
                String brandName=sc.next();
                System.out.println("enter ratings");
                int rating = sc.nextInt();
                Mobile mobile = new Mobile(os, ram, memory, price, rating, brandName);
                mobiles.add(mobile);
                
            } 
            System.out.println("1 for seller\n2. for buyer\n 3 for exit");
            choice=sc.nextInt();
        	}
        	break;
        	case 2:{
        		System.out.println("enter the featurse");
        		 int q = sc.nextInt();
                 for (int i = 0; i < q; i++) {
                	 System.out.println("enger the os");
                     String os = sc.next();
                     System.out.println("enter the ram");
                     int ram = sc.nextInt();
                     System.out.println("enter the memory");
                     int memory = sc.nextInt();
                     System.out.println("enetr the budget");
                     int budget = sc.nextInt();
                     System.out.println("enter the rating");
                     int maxRating = -1;
                     for (Mobile mobile : mobiles) {
                         if (mobile.os.equals(os) && mobile.ram == ram && mobile.memory == memory && mobile.price <= budget) {
                        	 System.out.println("Suggested brand"+mobile.brandName);
                             maxRating = Math.max(maxRating, mobile.rating);
                             System.out.println("suggested brand ratings "+maxRating+ " stars out of 5");
                         }
                     }
                     System.out.println("1 for seller\n2. for buyer\n 3 for exit");
                     choice=sc.nextInt();
                 }
        	}
        	case 3:{
        		System.out.println("thank u for using our application");
        		System.exit(0);
        	}
        	}
    }
    }
}
