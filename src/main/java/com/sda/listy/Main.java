package com.sda.listy;

public class Main {
    public static void main(String[] args) {
        CustomList<Integer> list = new CustomList<Integer>();
        list.add(2);
        list.add(12);
        list.add(32);
        list.add(42);
        list.add(52);
        list.add(62);
        list.add(62);
        list.add(62);
        list.add(62);
        list.add(62);
        list.add(62);
        list.add(62);
        list.get(5);

        for (CustomList list1: list){
            System.out.println(list1);
        }
    }
}
