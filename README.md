
# Java8 study to OCA

## Movies to help
https://word-to-markdown.herokuapp.com/ (thanks to it)

https://www.youtube.com/watch?v=a450CqNXFgs - Lambdas

https://www.edureka.co/blog/methods-and-method-overloading-in-java/ - Overload method

https://www.edureka.co/blog/java-tutorial/


## Abstract

**CHAPTER 01**

1. **Identifiers (OCA Objective 2.1)**

- Identifiers can begin with a letter, an underscore, or a currency character.
- After the first character, identifiers can also include digits.
- Identifiers can be of any length.

2. **Executable Java Files and main() (OCA Objective 1.3)**

- You can compile and execute Java programs using the command-line programs javac and java, respectively. Both programs support a variety of command-line options.
- The only versions of main() methods with special powers are those versions with method signatures equivalent to public static void main(String[] args).
- main() can be overloaded.

3. **Imports (OCA Objective 1.4)**

- An import statements only job is to save keystrokes.
- You can use an asterisk (\*) to search through the contents of a single package.
- Although referred to as &quot;static imports&quot; the syntax is **import static** .
- You can import API classes and/or custom classes.

4. **Source File Declaration Rules (OCA Objective 1.2)**

- A source code file can have only one public class.
- If the source file contains a public class, the filename must match the public class name.
- A file can have only one package statement, but it can have multiple imports.
- The package statement (if any) must be the first (noncomment) line in a source file.
- The import statements (if any) must come after the package statement (if any) and  before the first class declaration.
- If there is no package statement, import statements must be the first (noncomment) statements in the source file.
- **package** and **import** statements apply to all classes in the file.
- A file can have more than one nonpublic class.
- Files with no public classes have no naming restrictions.

5. **Class Access Modifiers (OCA Objective 6.4)**

- There are three access modifiers: public, protected, and private.
- There are four access levels: public, protected, default, and private.
- Classes can have only public or default access.
- A class with default access can be seen only by classes within the same package.
- A class with public access can be seen by all classes from all packages.
- Class visibility revolves around whether code in one class can:
  - Create an instance of another class
  - Extend (or subclass) another class
  - Access methods and variables of another class

6. **Class Modifiers (nonaccess) (OCA Objectives 1.2, 7.1, and 7.5)**

- Classes can also be modified with **final** , **abstract** , or **strictfp**.
- A class cannot be both final and **abstract**.
- A **final** class cannot be subclassed.
- An **abstract** class cannot be instantiated.
- A single **abstract** method in a class means the whole class must be abstract.
- An abstract class can have both abstract and nonabstract methods.
- The first concrete class to extend an abstract class must implement all of its abstract methods.

7. **Interface Implementation (OCA Objective 7.5)**

- Usually, interfaces are contracts for what a class can do, but they say nothing about the way in which the class must do it.
- Interfaces can be implemented by any class from any inheritance tree.
- Usually, an interface is like a 100 percent abstract class and is implicitly abstract whether or not you type the abstract modifier in the declaration.
- Usually interfaces have only abstract methods.
- Interface methods are by default public and usually abstract—explicit declaration of these modifiers is optional.
- Interfaces can have constants, which are always implicitly **public** , **static** , and **final**.
- Interface constant declarations of **public** , **static** , and **final** are optional in any combination.
- As of Java 8, interfaces can have concrete methods declared as either **default** or **static**.
- Note: This section uses some concepts that we HAVE NOT yet covered. Don&#39;t panic: once you&#39;ve read through all of the book, this section will make sense as a reference.
- A legal nonabstract implementing class has the following properties:
  - It provides concrete implementations for the interface&#39;s methods.
  - It must follow all legal override rules for the methods it implements.
  - It must not declare any new checked exceptions for an implementation method.
  - It must not declare any checked exceptions that are broader than the exceptions declared in the interface method.
  - It may declare runtime exceptions on any interface method implementation regardless of the interface declaration.
  - It must maintain the exact signature (allowing for covariant returns) and return type of the methods it implements (but does not have to declare the exceptions of the interface).
- A class implementing an interface can itself be abstract.
- An abstract implementing class does not have to implement the interface methods (but the first concrete subclass must).
- A class can extend only one class (no multiple inheritance), but it can implement many interfaces.
- Interfaces can extend one or more other interfaces.
- Interfaces cannot extend a class or implement a class or interface.
- When taking the exam, verify that interface and class declarations are legal before verifying other code logic.

8. **Member Access Modifiers (OCA Objective 6.4)**

- Methods and instance (nonlocal) variables are known as &quot;members.&quot;
- Members can use all four access levels: public, protected, default, and private.
- Member access comes in two forms:
  - Code in one class can access a member of another class.
  - A subclass can inherit a member of its superclass.
- If a class cannot be accessed, its members cannot be accessed.
- Determine class visibility before determining member visibility.
- public members can be accessed by all other classes, even in other packages.
- If a superclass member is public, the subclass inherits it—regardless of package.
- Members accessed without the dot operator (.) must belong to the same class.
- **this.** always refers to the currently executing object.
- **this.aMethod()** is the same as just invoking aMethod().
- **private** members can be accessed only by code in the same class.
- **private** members are not visible to subclasses, so private members cannot be inherited.
- **Default** and **protected** members differ only when subclasses are involved:
  - **Default** members can be accessed only by classes in the same package.
  - **protected** members can be accessed by other classes in the same package, plus subclasses, regardless of package.
  - **protected** = package + kids (kids meaning subclasses).
  - For subclasses outside the package, the protected member can be accessed only through inheritance; a subclass outside the package cannot access a protected member by using a reference to a superclass instance. (In other words, inheritance is the only mechanism for a subclass outside the package to access a protected member of its superclass.)
  - A protected member inherited by a subclass from another package is not accessible to any other class in the subclass package, except for the subclass&#39;s own subclasses.

9. **Local Variables (OCA Objectives 2.1 and 6.4)**

- Local (method, automatic, or stack) variable declarations cannot have access modifiers.
- **final** is the only modifier available to local variables.
- Local variables don&#39;t get default values, so they must be initialized before use.

10. **Other Modifiers—Members (OCA Objectives 7.1 and 7.5)**

- **final** methods cannot be overridden in a subclass.
- **abstract** methods are declared with a signature, a return type, and an optional throws clause, but they are not implemented.
- **abstract** methods end in a semicolon—no curly braces.
- Three ways to spot a nonabstract method:
  - The method is not marked abstract.
  - The method has curly braces.
  - The method MIGHT have code between the curly braces.
- The first nonabstract (concrete) class to extend an abstract class must implement all of the abstract class&#39;s abstract methods.
- The **synchronized** modifier applies only to methods and code blocks.
- **synchronized** methods can have any access control and can also be marked final.
- **abstract** methods must be implemented by a subclass, so they must be inheritable. For that reason:
  - **abstract** methods cannot be private.
  - **abstract** methods cannot be final.
- The **native** modifier applies only to methods.
- The **strictfp** modifier applies only to classes and methods.

11. **Methods with var-args (OCA Objective 1.2)**

- Methods can declare a parameter that accepts from zero to many arguments, a so-called var-arg method.
- A var-arg parameter is declared with the syntax type... name; for instance: doStuff (int... x) { }.
- A var-arg method can have only one var-arg parameter.
- In methods with normal parameters and a var-arg, the var-arg must come last.

12. **Constructors (OCA Objectives 1.2, and 6.3)**

- Constructors must have the same name as the class.
- Constructors can have arguments, but they cannot have a return type.
- Constructors can use any access modifier (even private!).

13. **Variable Declarations (OCA Objective 2.1)**

- Instance variables can:
  - Have any access control
  - Be marked final or transient
- Instance variables can&#39;t be abstract, synchronized, native, or strictfp.
- It is legal to declare a local variable with the same name as an instance variable; this is called &quot;shadowing.&quot;
- **final** variables have the following properties:
  - **final** variables cannot be reassigned once assigned a value.
  - **final** reference variables cannot refer to a different object once the object has been assigned to the final variable.
  - **final** variables must be initialized before the constructor completes.
- There is no such thing as a **final** object. An object reference marked **final** does NOT mean the object itself can&#39;t change.
- The **transient** modifier applies only to instance variables.
- The **volatile** modifier applies only to instance variables.

14. **Array Declarations (OCA Objectives 4.1 and 4.2)**

- Arrays can hold primitives or objects, but the array itself is always an object.
- When you declare an array, the brackets can be to the left or to the right of the variable name.
- It is never legal to include the size of an array in the declaration.
- An array of objects can hold any object that passes the **IS-A** (or **instanceof** ) test for the declared type of the array. For example, if Horse extends Animal, then a Horse object can go into an Animal array.

15. **Static Variables and Methods (OCA Objective 6.2)**

- They are not tied to any particular instance of a class.
- No class instances are needed in order to use **static** members of the class or interface.
- There is only one copy of a static variable/class, and all instances share it.
- **static** methods do not have direct access to nonstatic members.

16. **enums (OCA Objective 1.2)**

- An **enum** specifies a list of **constant** values assigned to a type.
- An **enum** is NOT a String or an int; an **enum** constant&#39;s type is the **enum** type. For example, SUMMER and FALL are of the **enum** type Season.
- An **enum** can be declared outside or inside a class, but NOT in a method.
- An **enum** declared outside a class must NOT be marked **static** , **final** , **abstract** , **protected** , or **private**.
- **enums** can contain constructors, methods, variables, and constant-specific class bodies.
- **enum** constants can send arguments to the **enum** constructor, using the syntax BIG(8), where the int literal 8 is passed to the **enum** constructor.
- **enum** constructors can have arguments and can be overloaded.
- **enum** constructors can NEVER be invoked directly in code. They are always called automatically when an **enum** is initialized.
- The semicolon at the end of an enum declaration is optional. These are legal:
  - enum Foo { ONE, TWO, THREE} enum Foo { ONE, TWO, THREE};
- values() returns an array of MyEnum&#39;s values.

17. **Legal Identifiers**

- Identifiers must start with a letter, a currency character ($), or a connecting character such as the underscore (\_). Identifiers cannot start with a digit!
- After the first character, identifiers can contain any combination of letters, currency characters, connecting characters, or numbers.
- In practice, there is no limit to the number of characters an identifier can contain.
- You can&#39;t use a Java keyword as an identifier.

18. **Variable Declarations**

There are two types of variables in Java:

- **Primitives** -  A primitive can be one of eight types: **char, boolean, byte, short, int, long, double, or float**. Once a primitive has been declared, its primitive type can never change, although in most cases its value can change.
- **Reference variables** A reference variable is used to refer to (or access) an object. A reference variable is declared to be of a specific type, and that type can never be changed. A reference variable can be used to refer to any object of the declared type or of a subtype of the declared type (a compatible type). We&#39;ll talk a lot more about using a reference variable to refer to a subtype in Chapter 2, when we discuss polymorphism.

 ##### imagem da tabela que está no documento ####

19. **Instance Variables**

- **Instance** variables are defined inside the class, but outside of any method, and are initialized only when the class is instantiated. Instance variables are the fields that belong to each unique object.

- Can use any of the four access levels (which means they can be marked with any of the three access modifiers)
- Can be marked final
- Can be marked transient
- Cannot be marked abstract
- Cannot be marked synchronized
- Cannot be marked strictfp
- Cannot be marked native
- Cannot be marked static because then they&#39;d become class variables

**CHAPTER 02**

1. **Encapsulation **,
   **IS-A, HAS-A - (OCA Objective 6.5)**

- Encapsulation helps hide implementation behind an interface (or API).
- Encapsulated code has two features:
  - Instance variables are kept protected (usually with the private modifier).
  - Getter and setter methods provide access to instance variables.
- IS-A refers to inheritance or implementation.
- IS-A is expressed with the keyword extends or implements.
- IS-A, &quot;inherits from,&quot; and &quot;is a subtype of&quot; are all equivalent expressions.
- HAS-A means an instance of one class &quot;has a&quot; reference to an instance of another class or another instance of the same class. \*HAS-A is NOT on the exam, but it&#39;s good to know.

2. **Inheritance (OCA Objective 7.1)**

- Inheritance allows a type to be a subtype of a supertype and thereby inherit public and protected variables and methods of the supertype.
- Inheritance is a key concept that underlies IS-A, polymorphism, overriding, overloading, and casting.
- All classes (except class Object) are subclasses of type Object, and therefore they inherit Object&#39;s methods.

3. **Polymorphism (OCA Objective 7.2)**

- Polymorphism means &quot;many forms.&quot;
- A reference variable is always of a single, unchangeable type, but it can refer to a subtype object.
- A single object can be referred to by reference variables of many different types—as long as they are the same type or a supertype of the object.
- The reference variable&#39;s type (not the object&#39;s type) determines which methods can be called!
- Polymorphic method invocations apply only t
