# Largest-element-in-an-Array
This Java program finds the **largest element** in an integer array using a simple loop.

## ✅ Features

- Works for any integer array
- Uses a method for code reuse
- Efficient in both time and space

## 📌 Time and Space Complexity

- **Time Complexity**: Θ(n) — linear scan through the array
- **Space Complexity**: Θ(1) — uses constant extra space

## 🧾 Code Overview

```java
public class Largest {
    public static void main(String[] args) {
        int arr1[] = {31, 14, 25, 21, 18};
        System.out.println("Largest Element in an array: " + element(arr1));

        int arr2[] = {45, 86, 66, 10, 74};
        System.out.println("Largest Element in an array: " + element(arr2));
    }

    static int element(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
