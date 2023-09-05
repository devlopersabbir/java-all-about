
abstract class javaAbs {
    public String fName = "Sabbir";
    public int age = 19;

    public abstract void study();
}

// let create sub class from the main class

class Student extends javaAbs {
    public int graduationYear = 2018;

    public void study() {// the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}

class JavaAbstract {
    public static void main(String[] args) {
        Student studyObject = new Student();
        System.out.println(studyObject.graduationYear);
    }
}