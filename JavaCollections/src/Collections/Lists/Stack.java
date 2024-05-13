package Collections.Lists;

import java.util.ArrayDeque;

public class Stack {
    ArrayDeque<Integer> stack  = new ArrayDeque<>();
    public Stack(){
    }

    public void push(Integer e){
        stack.push(e);
    }

    public void pop(){
        stack.pop();
    }

    public void peek(){
        stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

}
