package com.Tistory.Java;

import java.util.ArrayList;
import java.util.List;
public class SwitchFallThroughDemo {
    public static void main(String[] args) {
   		List<String> weekString = new ArrayList<>();
    	
    	int week = 3;
 
   		switch (week) {
   	    case 1: 
   	        weekString.add("Monday")  ; 
        case 2:  
        	weekString.add("Tuesday");
        case 3:  
        	weekString.add("Wednesday"); 
        case 4:
        	weekString.add("Thursday"); 
        case 5:
        	weekString.add("Friday");  
        case 6:
        	weekString.add("Saturday"); 
        case 7:
        	weekString.add("Sunday");  
        default:
            break;
        }
   		if (weekString.isEmpty()) {
            System.out.println("Invalid week number");
        } else {
            for (String monthName : weekString) {
               System.out.println(monthName);
            }	
        }
    }
}
