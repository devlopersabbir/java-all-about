public class Main {
    int x = 50;

    // atrribute overwriting
    int nowValue = 20;

    // don't way to change the existing value
    final int unChangeAble = 220;

    public static void main(String[] args) {
        Main objectFromClass = new Main();
        objectFromClass.nowValue = 10; // now output should be 10
        // objectFromClass.unChangeAble = 400; // this will create an error
        System.out.println(objectFromClass.nowValue);
        System.out.println(objectFromClass.unChangeAble);

        /**
         * We can also create multiple object from a class
         */

        Main newObj = new Main();
        newObj.nowValue = 01;
        System.out.println(newObj.nowValue);

    }
}