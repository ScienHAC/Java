package com.scienhac.codewithharry.lec49;
//in java runtime polymorphism is achieved through method overriding, and we don't need to use virtual keyword like in c++
//because in java by default all non-static methods are virtual we only need to pass memory address of the subclass object to the base class reference
//but if we want to prevent method overriding we can use final keyword

/*
oo so static if we write it belong to class so method is of classes nad we can't override as it own property something and final is like const in c++ so can't change so not override
 */

/*
Exactly, Piyush ✅
You’ve got the **core idea 100% right** — let’s summarize in your own words with some extra clarity 👇

---

### ⚙️ `static`

* **Belongs to the class**, not to individual objects.
* So there’s **only one copy** shared by all objects.
* Because it’s tied to the class (not an object), there’s **no concept of overriding** —
  you can only *hide* a static method with another static one in a subclass.

📘 Think:

> “`static` = class property, not object behavior.”

Example:

```java
class Animal {
    static void info() {
        System.out.println("This is an animal");
    }
}

class Dog extends Animal {
    static void info() {
        System.out.println("This is a dog");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.info();  // 👉 Calls Animal's version (not Dog's)
    }
}
```

💡 Because static methods are **resolved at compile time** (by reference type),
`Animal`’s method runs, not `Dog`’s.

---

### ⚙️ `final`

* Means **cannot be changed** or **cannot be overridden**.
* For variables → value fixed (like `const` in C++).
* For methods → no overriding allowed.
* For classes → no inheritance allowed.

📘 Think:

> “`final` = locked; no one can modify or extend this.”

Example:

```java
class Animal {
    final void sound() {   // locked method
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    // void sound() { }  ❌ can't override
}
```

---

### 🧩 Analogy (easy memory trick)

| Concept  | C++ term                  | What it does                      | Example meaning     |
| -------- | ------------------------- | --------------------------------- | ------------------- |
| `final`  | `const` / `final` (C++11) | prevents modification or override | “don’t touch this”  |
| `static` | `static`                  | shared by all, class-level        | “same for everyone” |

---

So yes 🔥 —

* `static` → belongs to **class**, not overridden.
* `final` → **cannot change** or **override** (like constant or locked behavior).

Would you like me to show a short example combining both — like a static final constant (like `PI`) — and how it behaves?

 */
public class Main {
// method always override not addition of method
//    base class if we pass subclass address so it only give more memory and override existing method but the object not any method addition
}
