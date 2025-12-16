package UnboundedArrayStack;

import java.util.NoSuchElementException;

public class UnboundedArrayStack {

    private int[] arr;   
    private int top;  

    
    public UnboundedArrayStack() {
        arr = new int[2];  
        top = -1;          
    }

    
    public void push(int x) {
        
        if (top == arr.length - 1) { // If array is full, double the size
            resize(arr.length * 2);
        }
        arr[++top] = x;
    }

   
    public int pop() {
        if (empty()) {
            throw new NoSuchElementException("Stack is empty!");
        }

        int value = arr[top--];

        
        if (top >= 0 && top == arr.length / 4) {
            resize(arr.length / 2);
        }

        return value;
    }

   
    public boolean empty() {
        return top == -1;
    }

    
    public int top() {
        if (empty()) {
            throw new NoSuchElementException("Stack is empty!");
        }
        return arr[top];
    }

    
    private void resize(int newSize) {
        int[] newArr = new int[newSize];
        for (int i = 0; i <= top; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

   
    public static void main(String[] args) {

        UnboundedArrayStack s = new UnboundedArrayStack();

        System.out.println("Testing Unbounded Array Stack\n");

        System.out.println("isEmpty : " + s.empty());
        System.out.println("Current Array Size(index): " + s.top);
        System.out.println("Current Array Capacity(length): " + s.arr.length);

        System.out.println("= = = = = = = =");

        s.push(3);
        System.out.println("Push : 3  Top Index : " + s.top +
                "  Capacity : " + s.arr.length);

        s.push(5);
        System.out.println("Push : 5  Top Index : " + s.top +
                "  Capacity : " + s.arr.length);

        s.push(7);
        System.out.println("Push : 7  Top Index : " + s.top +
                "  Capacity : " + s.arr.length);

        System.out.println("Top : " + s.top());

        System.out.println("= = = = = = = =");

        System.out.println("Pop : " + s.pop() +
                "  Top Index : " + s.top +
                "  Capacity : " + s.arr.length);

        System.out.println("= = = = = = = =");

        s.push(9);
        System.out.println("Push : 9  Top Index : " + s.top +
                "  Capacity : " + s.arr.length);

        System.out.println("= = = = = = = =");

        System.out.println("Pop : " + s.pop() +
                "  Top Index : " + s.top +
                "  Capacity : " + s.arr.length);

        System.out.println("Pop : " + s.pop() +
                "  Top Index : " + s.top +
                "  Capacity : " + s.arr.length);

        System.out.println("isEmpty : " + s.empty());
    }
}
