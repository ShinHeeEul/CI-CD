package org.example;



public class Member {

    private String name;
    private String phone;
    private String kkk;

    public Member(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.kkk = "null";
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
<<<<<<< HEAD
        return phone;
        //return name;
=======
        //return phone;
        return name;
>>>>>>> 28aca71d46b5e1fefb13ec959f74db08060455ea
    }
}
