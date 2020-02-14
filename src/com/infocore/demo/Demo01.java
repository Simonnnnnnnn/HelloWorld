package com.infocore.demo;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author XiangZhang
 * @date 2020/2/12 - 23:04
 */
public class Demo01 {

    //模板六：prsf 可生成private static final
    private static final String A = "1";

    //psf public static final
    public static final int NUM = 1;

    //psfi public statci final int
    public static final int NUM2 = 2;

    //psfs public static final String
    public static final String B = "b";

    /**
     * 客户端名称
     */
    private String username;



    private int a;
    //模板一：psvm main方法
    public static void main(String[] args) {
        Date date = new Date();
        //模板二：sout
        //soutp parameter 输出形参
        //soutm 输出方法名
        //soutv 输出变量
        //xxx.sout 输出xxx

        //模板三：fori
        String[] arr = new String[]{"a","b","c"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //iter 增强for循环
        for (String s : arr) {
            System.out.println("s = " + s);
            System.out.println(s);
        }

        //itar 普通for循环
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
        }

        //模板四：list.for
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        for (String s : list) {
            System.out.println("s = " + s);//soutv
            System.out.println(s);//s.sout
        }

        //list.fori 正序遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //list.forr 倒序遍历集合
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }


    }


    public void methdo(){
        int num2 = 10;

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        //模板五：ifn
        if (list == null) {

        }

        //inn
        if (list != null) {

        }

        //xxx.nn / xxx.null
        if (list != null) {

        }

        if (list == null) {

        }

    }
}
