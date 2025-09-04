
# ⏱️ Digital Timer – Java Lab 💻

This Java program simulates a **digital timer** using object-oriented programming concepts.  

---

## 🚀 Features

- Uses a `Timer` class to represent **hours** and **minutes** ⏰  
- Supports **tick operation** to increment minutes and wrap-around hours 🌙  
- Can be initialized with **default time (00:00)** or **custom time** 🕘  
- Displays **formatted digital time** (HH:MM)  

---

## 🎮 How to Run

1. Compile the Java file:
```bash
javac DigitalTimer.java
````

2. Run the program:

```bash
java DigitalTimer
```

3. Observe the **time incrementing** every tick.

Example output:

```
00:00
00:01
00:02
00:03
00:04

Test minute wrap-around:
09:58
09:59
10:00
10:01
10:02

Test hour wrap-around:
23:58
23:59
00:00
00:01
00:02
```

---

## 💡 Notes

* `Timer` class handles individual **value, limit, and reset** operations
* `DigitalTimer` class uses **composition** (has two `Timer` objects)
* Demonstrates **OOP principles**: encapsulation, composition, and method usage

---

## 👨‍💻 Author

**Hasan Zarook** 
