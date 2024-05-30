/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Archive;

/**
 *
 * @author samir
 */
public interface List {
    
    void cancel();

    int getSize();

    boolean isEmpty();

    void addHead(Object element);

    void addEnd(Object element);

    void addSort(Object element);

    Node getByPosition(int n);

    Node getByValue(Object element);

    boolean delete(Object element);

    boolean exists(Object element);

    Object lastInList();

    Object firstInList();
}
