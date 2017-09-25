# h1 Design Pattern – Singleton using Enum

Singleton Design Pattern is one of GOF (Gang of Four) design pattern. It comes under creational patterns. The main idea behind the Singleton is, create only one object of a specific class is ever created. There are couple of ways to implement the Singleton design pattern in Java with their own pros and cons. But the easiest way is using Enum in Java.

## h2 There are 2 type of initialization
1.Eager initialization – create an instance when initialize. It might be not required at that moment.
2.Lazy initialization – create an instance when required.


@[How to create it.]({"stubs": ["src/main/java/com/mydevgeek/Singleton.java"],"command": "com.mydevgeek.SingletonTest#singletonTest"})

How to call the singleton instance.

Joshua Bloch explained using an Enum in his Effective Java Reloaded talk at Google I/O 2008.

### h3 Pros

+An Instance is thread-safe.
+Easy to implement.

### h3 Cons

+Not create an instance when required (Eager initialization)

Original post find it here :- http://mydevgeek.com/design-pattern-singleton-using-enum/
