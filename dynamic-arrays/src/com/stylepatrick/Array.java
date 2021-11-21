package com.company;

public class Array {

    private int[] arr;
    private int count;

    public Array(int length) {
        this.arr = new int[length];
    }

    public void removeAt(int index) {
        // O(n)
        // Check if index is in range
        if (index < count && index >= 0) {
            // Move values bigger than index to position + 1
            for (int i = index; i < count; i++) {
                if (i + 1 < this.arr.length) {
                    this.arr[i] = this.arr[i+1];
                }
            }
            count--;
        }
    }

    public void addAt(int index, int val) {
        // O(n)
        if (index < count && index >= 0) {
            // Create new array with +1 position
            int[] clone = new int[count + 1];
            // Add values to new array as long index > i
            // If i == index add new value
            // if index < i add value to same position
            for (int i = 0; i < clone.length; i++) {
                if (i > index) {
                    clone[i] = this.arr[i - 1];
                } else if (index == i) {
                     clone[i] = val;
                } else {
                    clone[i] = this.arr[i];
                }
            }
            this.arr = clone;
            count++;
        }
    }

    public int indexOf(int index){
        // O(1)
        if (index < count && index >= 0) {
            return this.arr[index];
        }
        else {
            return -1;
        }
    }

    public void insert(int el) {
        // O(n)
        // If array doesn't have more space
        if (count == this.arr.length) {
            // Add new array with position + 1 and add all elements.
            // Add new element at end
            int[] clone = new int[count + 1];
            for (int x = 0; x < count; x++) {
                clone[x] = this.arr[x];
            }
            this.arr = clone;
        }
        this.arr[count++] = el;
    }

    public void print() {
        // O(n)
        for (int x = 0; x < count; x++){
            System.out.println(arr[x]);
        }
    }
}
