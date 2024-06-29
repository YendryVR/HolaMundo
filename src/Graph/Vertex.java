
package Graph;


public class Vertex {

    //Atributes
    Object element;//saves the element that represent each vertex
    boolean visited;//in charge of validating if I already passed this vertex before
    boolean destiny;//control the destination in my graph
    boolean origin;//controls the origin in my graph

    //If the graph is dynamic we will use LinkedLists/Arraylists
    // ListaCircularDoblementeEnlazada lcde;
    public Vertex(Object element) {
        this.element = element;
        this.visited = false;
        this.destiny = false;
        this.origin = false;

        //in case we are using linkedList, new instance of the LinkedList
        //this.lcde = new ListaCircularDoblementeEnlazada();
    }

}
