package com.kata.vasyaclerk;

public class ClerkLine {
    public String tickets(int[] peopleInLine) {
        int bill100 = 0;
        int bill50 = 0;
        int bill25 = 0;

        for (int i = 0; i < peopleInLine.length; i++) {
            if (peopleInLine[i] == 100) {
                bill100++;
                if (bill50 > 0) {
                    bill50--;
                    bill25--;
                } else {
                    bill25 = bill25 - 3;
                }
            } else if (peopleInLine[i] == 50) {
                bill50++;
                bill25--;
            } else {
                bill25++;
            }
            if (bill25 < 0){
                return "NO";
            }
        }
        return "YES";
    }
}
