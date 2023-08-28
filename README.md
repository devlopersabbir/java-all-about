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

## 04 Data type

Java data type

### 04.1 Number Data Type
