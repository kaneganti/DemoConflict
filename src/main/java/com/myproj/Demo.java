package com.myproj;

public class Demo {
    public static void main(String[] args) {
        int num=1;
        boolean flag=false;

            if(num==0 || num==1){
                System.out.println(" Its Prime number"+num);
                flag = true;
            }else {
                for (int i = 2; i < num / 2; i++) {
                    if (num % i == 0) {
                        flag = true;
                        break;
                    }
                }
            }
        if(!flag)
            System.out.println("Prime number ::"+num);
        System.out.println("my intellij proj");
        System.out.println("My remote changes applies");

        System.out.println("my local changes applied");
    }
}
