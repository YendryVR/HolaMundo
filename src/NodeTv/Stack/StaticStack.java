
package NodeTv.Stack;

public class StaticStack implements Stack {
    
    private Object S[];
    private int top;

    public StaticStack(int n) {
        if(n <= 0)
            System.exit(0);
        this.S = new Object[n];
        top = -1;
    }
    
    @Override
    public int getSize() throws StackException{
        return top+1;
    }

    @Override
    public boolean isEmpty() throws StackException{
        return top<0;
    }

    @Override
    public Object top() throws StackException{        
        if(isEmpty())
            throw new StackException("The stack is empty");
        return S[top];
    }

    @Override
    public void push(Object element) throws StackException {
        if(getSize()==S.length)
            throw new StackException("The Stack is Full");
        S[++top]= element; 
    }

    @Override
    public Object pop() throws StackException { 
        if(isEmpty())
            throw new StackException("The stack is empty");
        return S[top--];
    }

    @Override
    public String toString() {
        String stackData="";
        for (int i = top; i >= 0; i--) {
            stackData +="Value: "+S[i]+"\n";
        }
        
        return stackData;
    }
    
    
    
}
