package com.myproj;

public class Demo {
    public static void main(String[] args) {
        int num=17;
        boolean flag=false;
        String name="Lakshmi";
        String nameRev="";
        for(int j=name.length();j>0;j--){
            nameRev=nameRev+name.substring(j-1,j);
        }
        System.out.println("New Name ::"+nameRev);
            if(num==0 || num==1){
                System.out.println(" Its Prime number"+num);
                flag = true;
            }else {
                for (int i = 2; i < num / 2; i++) {
                    if (num % i == 0) {
                        System.out.println("Its not a prime number as its divisible by number :"+i);
                        flag = true;
                        break;
                    }
                }
            }
        if(!flag)
            System.out.println("Prime number ::"+num);
      int var=3;
        for(int ii=1;ii<=var;ii++)
            System.out.println("Integer value ::"+ii);
    }
}
