package com.tistoryexample.nestedclassexample.nestedclass;

public class OuterClass {

    // 인스턴스 필드
    String outerField = "Outer field";

    // 정적(static) 필드
    static String staticOuterField = "Static outer field";

    // 정적 중첩 클래스 인스턴스 참조 변수
    StaticNestedClass staticNestedInstance;

    // 생성자
    public OuterClass() {
        // 정적 중첩 클래스 인스턴스를 생성하여 필드에 저장
        staticNestedInstance = new StaticNestedClass();
    }

    // ✅ 인스턴스 내부 클래스 (Inner Class)
    class InnerClass {
        void accessMembers() {
            // 외부 클래스의 인스턴스 필드와 정적 필드 모두 접근 가능
            System.out.println("InnerClass accessing: " + outerField);
            System.out.println("InnerClass accessing: " + staticOuterField);
        }
    }

    // ✅ 정적 중첩 클래스 (Static Nested Class)
    static class StaticNestedClass {
        void accessMembers(OuterClass outer) {
            // 외부 클래스의 인스턴스 필드에는 외부 인스턴스를 통해서만 접근 가능
            System.out.println("StaticNestedClass accessing: " + outer.outerField);

            // 외부 클래스의 정적 필드는 직접 접근 가능
            System.out.println("StaticNestedClass accessing: " + staticOuterField);
        }
    }

    // 외부에서 정적 중첩 클래스의 메서드를 호출
    public void callStaticNestedMethod() {
        staticNestedInstance.accessMembers(this);
    }
}