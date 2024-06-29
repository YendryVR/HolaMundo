
package NodeTv.Stack;

/**
 *
 * @author Usuario
 */
public class Node {

    //Atributes 
    //1) Store the data/information of the node
    public Object element;
    //2) Pointer to next nodes 
    public Node next;

    public Node(Object elemet) {
        this.element = elemet;
        this.next = null;
    }//Constructor 

}//EndClassNode
