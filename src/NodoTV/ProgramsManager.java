package NodoTV;

import Stack.StackException;
import Stack.StaticStack;
import java.util.HashMap;
import java.util.Map;

/**
 * Manages television programs across different channels using stacks of linked lists.
 * Gestiona programas de televisión en diferentes canales usando pilas de listas enlazadas.
 */
public class ProgramsManager {
    private Map<String, StaticStack<doubleLinkedList>> channelPrograms; // Map to store stacks of linked lists per channel ,Mapa para almacenar pilas de doubleLinkedList por canal
    private int maxProgramsPerChannel; // Maximum programs per channel,Máximo programas por canal

    /**
     * Constructor to initialize the programs manager with a maximum capacity for channels.
     * Constructor para inicializar el gestor de programas con capacidad máxima para canales.
     *
     * @param maxProgramsPerChannel Maximum number of programs per channel / Número máximo de programas por canal
     */
    public ProgramsManager(int maxProgramsPerChannel) {
        this.maxProgramsPerChannel = maxProgramsPerChannel;
        this.channelPrograms = new HashMap<>(); // // Initialize the map of stacks of linked lists,Inicialización del mapa de pilas de doubleLinkedList

        // Adding predefined channels
        // Añadir canales predefinidos
        String[] predefinedChannels = {
            "canal 1", "canal 2", "canal 3", "canal 4", "canal 5",
            "canal 6", "canal 7", "canal 8", "canal 9", "canal 10"
        };
        for (String channel : predefinedChannels) {
            addChannel(channel);
        }
    }

    /**
     * Method to add a new channel with its associated stack of linked lists.
     * Método para agregar un nuevo canal con su pila de listas enlazadas asociada.
     *
     * @param channel Channel name / Nombre del canal
     */
    public void addChannel(String channel) {
        if (!channelPrograms.containsKey(channel.toLowerCase())) {
            channelPrograms.put(channel.toLowerCase(), new StaticStack<>(10)); // Cambia 10 por el tamaño máximo deseado
        }
    }

   
    /**
     * Private method to retrieve the stack corresponding to a given channel.
     * Método privado para obtener la pila correspondiente a un canal dado.
     *
     * @param channel Channel name / Nombre del canal
     * @return Stack of linked lists / Pila de listas enlazadas
     * @throws IllegalArgumentException If channel is invalid / Si el canal no es válido
     */
    private StaticStack<doubleLinkedList> getProgramsByChannel(String channel) {
        StaticStack<doubleLinkedList> stack = channelPrograms.get(channel.toLowerCase());
        if (stack == null) {
            throw new IllegalArgumentException("Canal no válido: " + channel);
        }
        return stack;
    }

     /**
     * Method to add a program to the linked list of the corresponding channel.
     * Método para agregar un programa a la lista enlazada del canal correspondiente.
     *
     * @param channel Channel name / Nombre del canal
     * @param program Program to add / Programa a agregar
     * @throws StackException If there is an issue with the stack / Si hay un problema con la pila
     */
    public void addProgram(String channel, Programs program) throws StackException {
        StaticStack<doubleLinkedList> stack = getProgramsByChannel(channel);

        // Get the current linked list
        // Obtener la lista enlazada actual
        doubleLinkedList list = stack.isEmpty() ? new doubleLinkedList() : stack.top();

          // Insert program into the linked list of the corresponding channel
        // Insertar programa en la lista enlazada del canal correspondiente
        list.insert(program);

         // Add the linked list to the stack of linked lists of the channel
        // Agregar la lista enlazada a la pila de doubleLinkedList del canal
        if (stack.isEmpty()) {
            stack.push(list);
        }
    }

    /**
     * Method to retrieve the latest (top) linked list of programs for a specific channel.
     * Método para obtener la lista enlazada más reciente (tope) de programas para un canal específico.
     *
     * @param channel Channel name / Nombre del canal
     * @return Latest linked list of programs / Última lista enlazada de programas
     * @throws StackException If there is an issue with the stack / Si hay un problema con la pila
     * @throws IllegalArgumentException If channel is invalid / Si el canal no es válido
     */
    public doubleLinkedList getLatestProgramList(String channel) throws StackException {
        StaticStack<doubleLinkedList> stack = getProgramsByChannel(channel);
        if (stack.isEmpty()) {
            throw new IllegalArgumentException("No hay listas de programas para el canal: " + channel);
        }
        return stack.top();
    }

     /**
     * Method to move a program to the left within the linked list of a specific channel.
     * Método para mover un programa a la izquierda dentro de la lista enlazada de un canal específico.
     *
     * @param channel Channel name / Nombre del canal
     * @param program Program to move / Programa a mover
     * @throws StackException If there is an issue with the stack / Si hay un problema con la pila
     */ 
    public void moveProgramLeft(String channel, Programs program) throws StackException {
        doubleLinkedList list = getLatestProgramList(channel);
        list.moveLeft(program);
    }

    /**
     * Method to move a program to the right within the linked list of a specific channel.
     * Método para mover un programa a la derecha dentro de la lista enlazada de un canal específico.
     *
     * @param channel Channel name / Nombre del canal
     * @param program Program to move / Programa a mover
     * @throws StackException If there is an issue with the stack / Si hay un problema con la pila
     */
    public void moveProgramRight(String channel, Programs program) throws StackException {
        doubleLinkedList list = getLatestProgramList(channel);
        list.moveRight(program);
    }

     /**
     * Method to print programs of a specific channel.
     * Método para imprimir programas de un canal específico.
     *
     * @param channel Channel name / Nombre del canal
     * @throws StackException If there is an issue with the stack / Si hay un problema con la pila
     */
    public void printProgramsByChannel(String channel) throws StackException {
        doubleLinkedList list = getLatestProgramList(channel);
        System.out.println(list.toString());
    }

    
    /**
     * Method to get programs of a specific channel as a String.
     * Método para obtener los programas de un canal específico como String.
     *
     * @param channel Channel name / Nombre del canal
     * @return Programs as String / Programas como String
     * @throws StackException If there is an issue with the stack / Si hay un problema con la pila
     */
    public String getProgramsByChannelAsString(String channel) throws StackException {
        doubleLinkedList list = getLatestProgramList(channel.toLowerCase());
        return list.toString(); 
    }
}
