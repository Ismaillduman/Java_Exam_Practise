# In Java, the switch statement follows certain rules and conventions.
Here are the rules for using the switch statement in Java:

  *1. The expression used in the switch statement must be of type byte, short, int, char, or an enumerated type (enum).

  -2. Each case within the switch statement should be a unique constant value. Duplicate case values are not allowed.

  -3. The case labels must be constant expressions, which means they should be compile-time constants and not variables or expressions.

  -4. The default case is optional and is executed if none of the case values match the expression.

  -5. The switch statement can have zero or more case statements and an optional default statement.

  -6. Once a matching case is found, the corresponding code block is executed,
  and all subsequent case blocks are also executed unless a break statement is encountered.
  This is called "fall-through" behavior.

  -7. The break statement is used to terminate the execution of the switch statement and exit the switch block.

  -8. If a break statement is omitted, the execution will "fall through" to the next case and
  continue executing the code until a break statement is encountered or the end of the switch statement is reached.

  -9. It is good practice to include a break statement at the end of each case block to prevent unintentional fall-through behavior.

  -10. The switch statement can be nested inside other switch statements or control structures like loops or if-else statements.
  These are the general rules that apply to using the switch statement in Java.

  It's important to follow these rules to ensure correct and predictable behavior of your code.
  
```java
char grade = 'B';
switch (grade) {
    default:
        System.out.println("Invalid grade");
        break;
    case 'A':
    case 'B':
    case 'C':
        System.out.println("Pass");
        break;
    case 'D':
    case 'F':
        System.out.println("Fail");
        break;
}
```
```java
int number = 5;
switch (number) {
    default:
        System.out.println("No case statements matched");
        break;
}
```

```java
char grade = 'B';
switch (grade) {
    case 'A':
        System.out.println("Excellent");
        break;
    case 'B':
        System.out.println("Good");
        break;
    case 'C':
        System.out.println("Fair");
        break;
    default:
        System.out.println("Poor");
        break;
}
```

# İşte bazı yaygın checked ve unchecked exception'ların isimleri:

## Checked Exception'lar:

IOException
SQLException
ClassNotFoundException
FileNotFoundException
InterruptedException
ParseException

## Unchecked Exception'lar:

RuntimeException
NullPointerException
IllegalArgumentException
ArrayIndexOutOfBoundsException
ClassCastException
ArithmeticException
Bu sadece bazı örneklerdir ve her bir kategori için daha fazla istisna türü bulunmaktadır. 
Checked exception'lar, Exception sınıfından türetilen ve RuntimeException sınıfından türetilmeyen istisna sınıflarını içerirken, 
unchecked exception'lar RuntimeException sınıfından türetilen istisna sınıflarını içerir.

# Super keyword

. super() is used to call Parent class constructor from Child class constructor
• If parent class has default (No-Argument) constructor, compiler will put super()
automatically
• If parent class only has constructor with parameters, then child constructor MUST
make a matching super(params) call

# `this.c = c;` and `this(c);` serve different purposes in the Java programming language:

1. `this.c = c;`: This statement is used to assign a value to a member variable (`c`) within a class. 
The `this` keyword refers to the current instance (object) of the class,
and `this.c` refers to the `c` member variable of that class.

   Example usage:
   ```java
   public class MyClass {
       private int c;
   
       public void setC(int c) {
           this.c = c; // this.c refers to the member variable, c refers to the value passed as a parameter
       }
   }
   ```

2. `this(c);`: This statement is used to invoke another constructor within the same class. 
The `this(c)` syntax calls another constructor in the same class and passes a specific parameter to it.
This helps to prevent code duplication and allows constructors to work with different parameter combinations.

   Example usage:
   ```java
   public class MyClass {
       private int value;
   
       public MyClass(int value) {
           this.value = value;
       }
   
       public MyClass() {
           this(0); // Calls the MyClass(int value) constructor and passes 0 as the value
       }
   }
   ```

The usage of these statements helps with assigning values to member variables and 
invoking different constructors within a class. `this.c = c;` is used to assign a value to a member variable, 
while `this(c);` is used to invoke different constructors.

This(c); ayni class taki bir constructor cagirmak icin 
Super(c); ise farkli bir sinifin constructor 'i cagirmak icin kullanilir 