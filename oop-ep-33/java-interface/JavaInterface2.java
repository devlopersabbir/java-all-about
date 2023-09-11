public class JavaInterface2 {
    public static void main(String[] args) {
        MyAbout getAbout = new MyAbout();
        getAbout.about();
    }
}

class MyAbout implements SabbirAbout {
    public void about() {
        System.out.println("Age is: " + age + "; Name is: " + name + "; Semester: " + semester);
    }
}

interface SabbirAbout extends IAbout {
    String semester = "4th";
}

interface IAbout {
    String name = "Sabbir Hossain";
    int age = 19;
}