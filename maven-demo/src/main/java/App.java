import chocolates.Chocolate;
import chocolates.Cadbury;
import chocolates.Barone;
import chocolates.Galaxy;
import gift.Gift;
import sweets.Sweets;
import sweets.Gulabjamun;
import sweets.Kheer;
import sweets.Kajukatli;
import sweets.Rasgulla;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //int choice;
        Scanner io=new Scanner(System.in);
        System.out.println("Getting chocolates....");
        Chocolate chocolate1=new Cadbury("Cadbury Dairy Milk",60,20);
        Chocolate chocolate2=new Barone("Barone",30,20);
        Chocolate chocolate3=new Galaxy("Galaxy",50,20);
        System.out.println("Getting Sweets....");
        Sweets sweets1=new Gulabjamun("Gulabjamun",300,200);
        Sweets sweets2=new Kheer("Kheer",300,100);
        Sweets sweets3=new Kajukatli("Kajukatli",300,100);
        Sweets sweets4=new Rasgulla("Rasgulla",400,100);
        Gift gift=new Gift();
        gift.addChocolates(chocolate1,chocolate2,chocolate3);
        gift.addSweets(sweets1,sweets2,sweets3,sweets4);
        System.out.println("Sorting items in gift according to price");
        gift.sort();
        System.out.println("Total Weight of Gifts : "+gift.findTotalWeight());
        
    }
   // private static <T> String mostExpensive(ArrayList<T> arrayList){
       // return arrayList.get(0).toString();
    //}
}
