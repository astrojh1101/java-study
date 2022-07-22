package chap11.sec01.exam09;

import chap06.Car;

public class ResourcePathExample {
    public static void main(String[] args) {
        Class clazz = Car.class;

        String photo1path = clazz.getResource("photo1.jpg").getPath();
        String photo2path = clazz.getResource("images/photo2.jpg").getPath();

        System.out.println(photo1path);
        System.out.println(photo2path);
    }
}
