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


# `this();`, `this.c = c;` ve `super();` ifadelerinin kullanım sıralaması,

yapıcı metot içindeki işlemlere ve ihtiyaçlara bağlı olarak değişir. 
Genel bir kural olarak aşağıdaki sıralama tercih edilir:

1. `super();`: Eğer bir alt sınıfın yapıcı metodu içinde `super();` ifadesi kullanıyorsanız, 
genellikle bu ifade yapıcı metot içindeki ilk işlem olarak kullanılır. 
Bu şekilde, üst sınıfın yapıcı metodu tamamlanır ve ardından alt sınıfın yapıcı metodu devam eder.

2. `this();`: Eğer bir sınıfın yapıcı metodu içinde başka bir yapıcıyı `this();` ifadesiyle çağırıyorsanız,
genellikle bu ifade yapıcı metot içindeki ilk işlem olarak kullanılır. 
Bu şekilde, diğer yapıcı metot çağrısı yapılır ve ardından yapıcı metot içindeki diğer işlemler devam eder.

3. `this.c = c;`: Eğer bir sınıfın yapıcı metodu içinde bir üye değişkene `c` değerini atamak için 
`this.c = c;` ifadesini kullanıyorsanız, genellikle bu ifade yapıcı metot içinde diğer işlemlerden sonra kullanılır.
Bu şekilde, diğer inşa işlemleri tamamlandıktan sonra üye değişkene değer atanır.

Örnek kullanım:

```java
public class MyClass extends SuperClass {
    private int c;
    
    public MyClass() {
        super(); // Üst sınıfın yapıcı metodu çağrılır
        this(); // Aynı sınıftaki başka bir yapıcı metodu çağrılır
        this.c = 0; // Üye değişkene değer atanır
    }
    
    public MyClass(int c) {
        super(); // Üst sınıfın yapıcı metodu çağrılır
        this.c = c; // Üye değişkene değer atanır
    }
}
```

Ancak, sıralama ihtiyaçlara ve tasarım tercihlerine bağlı olarak değişebilir. Önemli olan, `super();` ve `this();`
ifadelerinin genellikle yapıcı metot içinde diğer işlemlerden önce yer alması ve yapıcı metot içindeki işlemlerin 
mantıklı bir sıraya sahip olmasıdır.

# Aşağıda, `int`, `byte`, `char`, `boolean`, `double`, `long`, `float`, `String`, `Integer` ve `Character`
veri tiplerinin genellikle kabul edilen bir sıralaması bulunmaktadır:

1. `boolean`: Mantıksal bir değeri (`true` veya `false`) temsil eder.

2. `byte`: 8 bit işaretli tam sayı değerini temsil eder.

3. `char`: 16 bit Unicode karakterini temsil eder.

4. `short`: 16 bit işaretli tam sayı değerini temsil eder.

5. `int`: 32 bit işaretli tam sayı değerini temsil eder.

6. `long`: 64 bit işaretli tam sayı değerini temsil eder.

7. `float`: 32 bit kayan noktalı sayı değerini temsil eder.

8. `double`: 64 bit kayan noktalı sayı değerini temsil eder.

9. `String`: Metin veya karakter dizisini temsil eder. 
Bu veri tipi, bir sınıf olduğu için diğer temel veri tiplerinden ayrılır.

10. `Integer`: `int` değerini saran ve ilave işlevlere sahip bir sınıftır.

11. `Character`: `char` değerini saran ve ilave işlevlere sahip bir sınıftır.

Bu sıralama, genel olarak veri tiplerinin büyüklüklerine veya bellek boyutlarına dayanır.
Ancak, bazı veri tipleri sınıflar olduğu için farklı işlevlere sahiptir ve sıralama sadece bellek boyutlarına göre belirlenmez.

# String == or equals

```java
String str = "Hello";
String str1 = "Hello";
String str2 = new String("Hello");

System.out.println(str == str1);  // true, aynı String nesnesini işaret ediyorlar
System.out.println(str == str2);  // false, farklı String nesnelerini işaret ediyorlar
```

Bu örnekte, `str` ve `str1` değişkenleri aynı `String` nesnesini işaret ediyorlar 
çünkü her ikisi de değer olarak "Hello" metnini içeriyorlar. Bu nedenle, `str == str1` ifadesi `true` dönecektir.

Ancak, `str2` değişkeni `new` anahtar kelimesi ile yeni bir `String` nesnesi oluşturarak "Hello" metnini içeriyor. 
Bu nedenle, `str` ve `str2` farklı `String` nesnelerini işaret eder.
Bu durumda, `str == str2` ifadesi `false` dönecektir.

Sonuç olarak, `str` ve `str1` aynı `String` nesnesini işaret ediyorsa, `str == str1` ifadesi `true` döner.
Ancak, `equals()` metodu kullanılarak içerik tabanlı karşılaştırma yapmak daha yaygın ve güvenilirdir.

# StringBuilder sb1 = new StringBuilder("Duke"); 

String str = "Duke"; 

ifadesi, string havuzunda ("string pool") zaten var olan bir "Duke" stringi referans eden bir referans oluşturur.

Bu ifade, var olan bir string nesnesine referans yapar.

String str = sb1.toString(); ifadesi ise sb1 nesnesinin içeriğini temsil eden yeni bir string nesnesi oluşturur 
ve bu nesneyi referans olarak kullanır. Bu ifade, dinamik olarak bir string nesnesi oluşturur
ve bu nesneye referans yapar.

Dolayısıyla, bu iki ifade farklı string nesnelerini referans alır. 
Referanslarının değeri (içeriği) aynı olabilir örneğin "Duke" metni, her iki ifadede de kullanılmış olabilir.
Ancak, referanslarının kendisi (adresleri) farklıdır.

Sonuç olarak, iki ifade farklı referanslara sahip olduğu için, referanslarının eşitlik durumu
(== operatörüyle kontrol edildiğinde) false olarak değerlendirilecektir.

# Bir sınıftaki bir değişkene doğrudan erişmek için, değişkenin statik (static) olması gerekmektedir.

Statik bir değişkene sınıf adıyla erişmek için aşağıdaki syntax kullanılabilir:

```
ClassName.variableName
```

Örneğin, aşağıdaki şekilde MyClass sınıfındaki static bir değişkene doğrudan erişilebilir:

```java
public class MyClass {
    public static int myStaticVariable = 10;
}
```

Başka bir sınıfta, MyClass sınıfındaki myStaticVariable'a erişmek için a
şağıdaki şekilde kullanabilirsiniz:

```java
int value = MyClass.myStaticVariable;
```

Bu şekilde, MyClass sınıfına ait bir nesne oluşturmadan myStaticVariable'a erişebilirsiniz.
Ancak dikkat edin, normalde bir değişkenin erişilebilir olması için 
uygun erişim belirleyicisi (public, private, protected vb.) kullanılmalıdır.