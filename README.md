# Java All About

List of the Java class

## 01. Hello World Program [Hello](./Hello.java)

- Code example

  ```java
  public class Hello {
  public static void main(String[] arg) {
      System.out.println("Hello World");
      }
  }
  ```

## 02. Comments in Java [Comments](./Comments.java)

- Code example

  ```java
  public class Comments {
  // To returning my name
  public static String name() {
          return "Sabbir Hossain"; // it's return name as string
      }

  /*
  * For showing my name
  */
  public static void main(String[] arg) {
          System.out.println(name());
      }
  }
  ```

## 03. Variable in Java [Variable](./Variable.java)

The variable syntax looks like this.

```console
type variableName = value;
```

> Types of varibale

- The first is a type: type is means which kind of data you want to store, on
  this varibale. based on your went to stored value, you have to call a type
  like

  1. **String** - stores text, such as "Hello". String values are surrounded by
     double quotes or single quote.
  2. **int** - stores integers (whole numbers), `111, -111`
  3. **float** - stores number with decimals like: `11.34, -55.10`
  4. **char** - Single characters like: `a or "A"`
  5. **boolean** - Store true or false value only

  ### Code example

  ```java
  public class Variable {
    public static void main(String[] arg) {
        /*
         * Variable in java
         */
        String friendName = "Rafiul"; // this is varibale to store friend name
        System.out.println(friendName);

        final int myNumber = 20;
        System.out.println(myNumber);

        // perform mathmetical task
        int fNumber = 20;
        int lNumber = 10;
        // make a varibale for storing result inside the result variable
        int result = fNumber + lNumber; // answer should be 30
        System.out.println(result);
    }
  }
  ```

## 04 Data type [data-type](./data-types)

Java data type

### 04.1 Number Data Type [Number](./data-types/NumberType.java)

## 05 Defarent between primitive & Non-Primitive

| Primitive                                                                     | Non-Primitive                                                                                    |
| ----------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------ |
| Primitive types are predefined (already defined) in Java                      | Non-primitive types are created by the programmer and is not defined by Java (except for String) |
| Non-primitive types can be used to call methods to perform certain operations | while primitive types cannot                                                                     |
| A primitive type has always a value                                           | while non-primitive types can be null                                                            |
| A primitive type starts with a lowercase letter                               | while non-primitive types starts with an uppercase letter                                        |

## 05. [Java String](./String/JavaString.java)

Strings are used for storing text.

- 05.1 String Length

  A `String` in Java is actually an object. which contain methods that can
  perform certain operations on strings. For example, the length of a string can
  be found with the `length()` method:

  ```java

  String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  System.out.println("The length of the txt string is: " + txt.length());
  ```

- 05.2 More String Methods There are many string methods available, for example
  `toUpperCase()` and `toLowerCase()`:
  ```java
  String txt = "Hello World";
  System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
  System.out.println(txt.toLowerCase());   // Outputs "hello world"
  ```
- 05.3 Finding a Character in a String The `indexOf()` method returns the index
  (the position) of the first occurrence of a specified text in a string
  (including whitespace):

  ```java
  String txt = "Please locate where 'locate' occurs!";
  System.out.println(txt.indexOf("locate")); // Outputs 7
  ```

## 36. [Java Method](./oop-ep-33/java-method/JavaMethod.java)

Java method work as like same as normal method that can help us to perform any
kind of task

#### Deffrent between public & Static Keyword

- Public
  - Public methods must be called by creating objects
- Static
  - Static methods can be called without creating objects

## [Java Polymorphism](./oop-ep-33/java-polymorphism/JavaPolymorphism.java)

The word polymorphism means having many forms. In simple words, we can define
polymorphism as the ability of a message to be displayed in more than one form.

Real-life Illustration Polymorphism: A person at the same time can have
different characteristics. Like a man at the same time is a father, a husband,
and an employee. So the same person possesses different behavior in different
situations. This is called polymorphism.

#### What is Polymorphism in Java?

Polymorphism is considered one of the important features of Object-Oriented
Programming. Polymorphism allows us to perform a single action in different
ways. In other words, polymorphism allows you to define one interface and have
multiple implementations. The word “poly” means many and “morphs” means forms,
So it means many forms.

#### Types of Java polymorphism

In Java polymorphism is mainly divided into two types:

- Compile-time Polymorphism

  ##### Compile-Time Polymorphism

  It is also known as static polymorphism. This type of polymorphism is achieved
  by function overloading or operator overloading.

  > Note: But Java doesn’t support the Operator Overloading. **Function
  > Overloading**

  ```java
  class JavaPolymorphism {
    public static void main(String[] args) {
        System.out.println(Helper.multiply(2, 3));
        System.out.println(Helper.multiply(2.3, 3.8));
    }
  }

  class Helper {
      static int multiply(int a, int b) { // we reveive 2 number a and b which is intiger types
          return a * b;
      }

      static double multiply(double a, double b) {
          return a * b;
      }
  }

  ```

  **Output**

  ```
  6
  1.1399999999999992
  ```

- Runtime Polymorphism

```

```
