package com.Tistory.NestedClassExample.nestedclass;

import com.Tistory.NestedClassExample.nestedclass.OuterClass.StaticNestedClass;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Inner class:");
        System.out.println("------------");
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.accessMembers();

        System.out.println("\nStatic nested class:");
        System.out.println("--------------------");
        StaticNestedClass staticNestedObject = new StaticNestedClass();        
        staticNestedObject.accessMembers(outerObject);

        System.out.println("\nStatic nested class accessed from OuterClass:");
        System.out.println("---------------------------------------------");
        outerObject.callStaticNestedMethod();

        System.out.println("\nTop-level class:");
        System.out.println("----------------");
        TopLevelClass topLevelObject = new TopLevelClass();        
        topLevelObject.accessMembers(outerObject);                
    }
}
