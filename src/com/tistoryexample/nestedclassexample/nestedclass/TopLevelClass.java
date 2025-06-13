package com.tistoryexample.nestedclassexample.nestedclass;

public class TopLevelClass {
	 void accessMembers(OuterClass outer) {     
	        // Compiler error: Cannot make a static reference to the non-static
	        //     field OuterClass.outerField
//	         System.out.println(OuterClass.outerField);
	        System.out.println("TopLevelClass accessing: " + outer.outerField);
	        System.out.println("TopLevelClass accessing: " + OuterClass.staticOuterField);
	        
    }
}
