
package NodeTv.Stack;


public interface Stack {
            
    //Number at elements of out 
    public int getSize() throws StackException;
    
    //return true or false if stack is empty
    public boolean isEmpty() throws StackException;
    
    //return last element in the Stack
    public Object top() throws StackException;
    
    // push element in the stack
    public void push(Object element) throws StackException;
    
    // remove last element in stack
    public Object pop() throws StackException;
}
