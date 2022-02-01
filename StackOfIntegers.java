
public class StackOfIntegers {
    private int[] elements;
    private int size;

    public StackOfIntegers(){
        elements = new int[16]; //default capacity of 16
    }
    public StackOfIntegers(int capacity){
        elements = new int[capacity]; //specific capacity
    }
    public boolean empty() {
        if(size <= 0){  //return true if empty
            return true;
        }
        else{
            return false;
        }
    }

    public int peek() {
        return elements[size -1]; 
    }

    public void push(int value) {
        size++;
        elements[size-1] = value;
    }

    public int pop() {
        int i = elements[size-1];
        size--;
        return i;
    }

    public int getSize() {
        return size;
    }
    
}
