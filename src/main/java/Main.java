package main.java;

import java.util.ArrayList;
import java.util.List;


public class Main

{

//    public static void filterMoney(List<Money> piggyBank, checkM tester, boolean printit)
//    {
//
//        for (Money m: piggyBank)
//        {
//            if (tester.test(m))
//            {
//                if(printit)
//                {
//                    System.out.println(m.getName());
//                }
//            }
//        }
//    }

    public static void main(String[] args)
    {
        System.out.println("Can you see this?");

        List<Money> piggyBank = new ArrayList<>();

        piggyBank.add(new Quarter("Quarter", 1));
        piggyBank.add(new Dime("Dime",8));
        piggyBank.add(new Dollar("Dollar",6));
        piggyBank.add(new Nickle("Nickle",3));
        piggyBank.add(new Penny("Penny",10));

        // first i need to print the whole array? Maybe a hashmap is better
        // thank fucking god - why was this so hard to think through.

        double total = 0;
        for (Money m : piggyBank)
        {
            System.out.println(m.strValueMany());

        }

        // now we need to add all the items together!

        for (int i = 0; i <piggyBank.size() ; i++)
        {
            total += piggyBank.get(i).getValue();

        }
        System.out.println("This is the total of the piggy bank " + "$" + total);


//
//        double sum = 0;
//        for(Double d : m)
//            sum += d;
//        return sum;












        // next i need to add all the cash in her the piggy bank

        // how do i do this? IDKKK MAN!!!












    }

}
