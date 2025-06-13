package com.tistoryexample.java;


public class StringSwitchDemo {
	// week 파라미터에 "August" 의 리터럴을 참조하고 있는 스트링 클래스 객체의 인스턴스 참조값을
	// 아규먼트로 전달하고 있음.
	public static int getWeekNumber(String week) {
        int weekNumber = 0;

        // null : 아무것도 참조하고 있지 않다.
        // String nextWeek = null;       
        // 주의해서 보기!!
        if (week == null) {
            // 현재 getWeekNumber 메서드의
        	// return statement가 if(week == null) "블럭"의 statement로 작성되있음.
        	// 곧바로 getWeekNumber 메서드 호출자에게 리턴함!!!
        	return weekNumber;
        }
        // toLowerCase는 String 클래스의 인스턴스 메서드!!
        // toLowerCase : week 참조 변수가 참조하고 있는 String 클래스 객체의 인스턴스 필드에[value]의 스트링을
        // 소문자 타입으로 리턴한다
        // "Wednesday" -->"wednesday"
        // week.value ---> 전부 소문자화
        String lowerCaseString = week.toLowerCase();
        							
        switch (week.toLowerCase()) {
            case "monday":
            	weekNumber = 1;
                break;
            case "tuesday":
            	weekNumber = 2;
                break;
            case "wednesday":
            	weekNumber = 3;
                break;
            case "thursday":
            	weekNumber = 4;
                break;
            case "friday":
            	weekNumber = 5;
                break;
            case "saturday":
            	weekNumber = 6;
                break;
            case "sunday":
            	weekNumber = 7;
                break;
            default: 
            	weekNumber = 0;
                break;
        }
        return weekNumber;
    }

    public static void main(String[] args) {
        String week = "Saturday";

        int returnedWeekNumber =
            StringSwitchDemo.getWeekNumber(week);

        if (returnedWeekNumber == 0) {
            System.out.println("Invalid week");
        } else {
            System.out.println(returnedWeekNumber);
        }
	}
}
