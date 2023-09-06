
public class JavaEncapsulation {
    public static void main(String[] args) {
        Person personObj = new Person();
        personObj.setName("Sabbir Hossain");
        System.out.println(personObj.getName());
    }
}

class Person {
    private String name; // private = restricted access

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String newName) {
        this.name = newName;
    }
}