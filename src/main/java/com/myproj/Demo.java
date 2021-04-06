package com.myproj;

public class Demo {
    public static void main(String[] args) {
        int num=17;
        boolean flag=false;
            if(num==0 || num==1){
                System.out.println(" Its Prime number"+num);
                flag = true;
            }else {
                for (int i = 2; i < num / 2; i++) {
                    if (num % i == 0) {
                        System.out.println("Its nota prime number as its divisible by :")+i;
                        flag = true;
                        break;
                    }
                }
            }
        if(!flag)
            System.out.println("Prime number ::"+num);
      int num=3;
        for(int ii:num)
            System.out.println("Integer value ::"+ii);
    }
}
