package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totDisks = 0;

        System.out.println("Tower of Hanoi Game.");
        System.out.println("This program will solve this puzzle for you.");
        System.out.println("Please input number of disks to solve for:");
        while(totDisks < 1)
        {
            try
            {
                totDisks = input.nextInt();
                if(totDisks < 1)
                    throw new Exception();
            }
            catch(Exception e)
            {System.out.println("The amount of disks you want must be higher then 1");}
        }
        TowersOfHanoi tower = new TowersOfHanoi(totDisks);
        System.out.println("Instructions:");
        tower.solve();
        System.out.println("Finished");
    }

    }
