//public class temp <T> {
//    private T t;
//
//    public T getT() {
//        return t;
//    }
//
//    public void setT(T t) {
//        this.t = t;
//    }
//
//    public static void main(String[] args) {
//        temp obj = new temp();
//        obj.setT("test");
//        obj.setT(10);
//        obj.setT("%");
//        System.out.println(obj.getT());
//    }
//}


class temp {
//    String name;
//    temp(String name) {
//        this.name = name;
//    }

    public static void main(String[] args) {
        Person alex = new Person("Alex");
        Person mariam = alex;
        System.out.println("before changing alex");
        System.out.println(alex.name + ":" + mariam.name);

        alex.name  = "Alexander";
        System.out.println("after changing alex");
        System.out.println(alex.name + ":" + mariam.name);

        mariam.name = "Mariam";
        System.out.println("after changing mariam");
        System.out.println(alex.name + ":" + mariam.name);

//        temp saina = new temp("saina");
//        temp neha = saina;
//        System.out.println("before changing alex");
//        System.out.println(saina.name + ":" + neha.name);
//
//        saina.name  = "Saina Nehaval";
//        System.out.println("after changing saina");
//        System.out.println(saina.name + ":" + neha.name);
//
//        neha.name = "Nehval";
//        System.out.println("after changing neha");
//        System.out.println(saina.name + ":" + neha.name);

    }

    static class Person {
        String name;
        Person(String name) {
            this.name = name;
        }
    }
}