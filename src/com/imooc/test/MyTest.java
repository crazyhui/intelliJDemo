package com.imooc.test;

public class MyTest {
    //psvm  main()
    //打印输出 sout
    public static void main(String[] args) {
        String a = "hao";
        System.out.println("开始进行调试");
        for (int i = 0; i < 4; i++) {
            print();
            a = a + " "+i;
        }
    }

    private static void print() {
        System.out.println("请叫我大师兄");
        System.out.println("第二次修改！！！");
    }
}
