package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Member member = new Member("희을", "010-5900-7430");
        System.out.println(member.getName() + " : " + member.getPhone());
        System.out.println("test");
    }
}