## [Java String](./JavaString.java)

Strings are used for storing text.

- 05.1 String Length

  A `String` in Java is actually an object. which contain methods that can
  perform certain operations on strings. For example, the length of a string can
  be found with the `length()` method:

  ````java

  String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  System.out.println("The length of the txt string is: " + txt.length());```
  ````

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
