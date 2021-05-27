package day18_conditions_practice_strings_intro;

import javax.swing.*;

public class SwitchSeasonFinder {
    public static void main(String[] args) {
       /* Winter:12,1,2
        Spring: 3,4,5
        Summer: 6,7,8
        Fall: 9,10,11*/

        int month = 9;

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        }
        switch (month) {
            case 12:
                month = 12;
            case 1:
                month = 1;
            case 2:
                month = 2; /// or to make it shorter your can write case 12 : case 1 : case 2
                System.out.println("Winter");
                break;
        }
        switch (month) {
            case 3:
                month = 3;
            case 4:
                month = 4;
            case 5:
                month = 5;
                System.out.println("Spring");
                break;
            case 6:
                month = 6;
            case 7:
                month = 7;
            case 8:
                month = 8;
                System.out.println("Summer");
                break;
            case 9:
                month = 9;
            case 10:
                month = 10;
            case 11:
                month = 11;
                System.out.println("Fall");
                break;
            default:
                System.out.println("invalid month "+ month);
        }
    }
}