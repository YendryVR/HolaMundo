package Stack;

public class StaticStack<E> implements Stack<E> {
    
    private E[] S;
    private int top;

    public StaticStack(int n) {
        if(n <= 0)
            System.exit(0);
        // Crear el array de tipo E
        this.S = (E[]) new Object[n];
        top = -1;
    }
    
    @Override
    public int getSize() throws StackException{
        return top + 1;
    }

    @Override
    public boolean isEmpty() throws StackException{
        return top < 0;
    }

    @Override
    public E top() throws StackException{        
        if(isEmpty())
            throw new StackException("The stack is empty");
        return S[top];
    }

    @Override
    public void push(E element) throws StackException {
        if(getSize() == S.length)
            throw new StackException("The Stack is Full");
        S[++top] = element; 
    }

    @Override
    public E pop() throws StackException { 
        if(isEmpty())
            throw new StackException("The stack is empty");
        return S[top--];
    }

    @Override
    public String toString() {
        StringBuilder stackData = new StringBuilder();
        for (int i = top; i >= 0; i--) {
            stackData.append("Value: ").append(S[i]).append("\n");
        }
        return stackData.toString();
    }  
}
