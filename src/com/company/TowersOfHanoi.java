package com.company;

/**
 * Created by nb035 on 1/17/17.
 */
public class TowersOfHanoi {
    /*constructor:
    accepts total # of disks

    solve method
    move the tower
    recursive method is going to show up
//Move the specified number of disks from one tower to another by moving a subtower of n-1 disks out of the way, moving one disk, then moving the subtower back. Base case of 1 disk
            moveOneDisk
    SOP instructions on how to move.
*/


    public TowersOfHanoi(int x){
        disks = x;
        tower = new int[x];
        for(int i = 0; i < tower.length; i++)
        {
            tower[i] = 1;
        }
        counter = 0;
    }
    public void solve(){
        for(int i = 1; i <= disks; i++)
            move(i);
    }
    public void move(int size) {
        if (size > 0) {
            counter++;
            System.out.print("Turn " + counter + " : Move one disk from tower " + tower[size - 1] + " to tower ");
            tower[size - 1] = (tower[size - 1] + (disks % 2 == size % 2 ? -1 : 1) + 3) % 3;
            if (tower[size - 1] == 0)
                tower[size - 1] = 3;
            System.out.println(tower[size - 1]);
            for (int i = 1; i < size; i++)
                move(i);
        }
    }
        public int disks;
        public int[] tower;
        public int counter;
}
