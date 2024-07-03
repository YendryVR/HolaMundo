package NodoTV;

import Stack.StackException;
import Stack.StaticStack;
import java.util.HashMap;
import java.util.Map;

public class ProgramsManager {
    private Map<String, StaticStack<doubleLinkedList>> channelPrograms; // Mapa para almacenar pilas de doubleLinkedList por canal
    private int maxProgramsPerChannel; // Máximo programas por canal

    // Constructor para inicializar el gestor de programas con capacidad para varios canales
    public ProgramsManager(int maxProgramsPerChannel) {
        this.maxProgramsPerChannel = maxProgramsPerChannel;
        this.channelPrograms = new HashMap<>(); // Inicialización del mapa de pilas de doubleLinkedList

        // Añadir canales predefinidos
        String[] predefinedChannels = {
            "canal 1", "canal 2", "canal 3", "canal 4", "canal 5",
            "canal 6", "canal 7", "canal 8", "canal 9", "canal 10"
        };
        for (String channel : predefinedChannels) {
            addChannel(channel);
        }
    }

    // Método para agregar un nuevo canal con su pila de doubleLinkedList asociada
    public void addChannel(String channel) {
        if (!channelPrograms.containsKey(channel.toLowerCase())) {
            channelPrograms.put(channel.toLowerCase(), new StaticStack<>(10)); // Cambia 10 por el tamaño máximo deseado
        }
    }

    // Método privado para obtener la pila correspondiente a un canal dado
    private StaticStack<doubleLinkedList> getProgramsByChannel(String channel) {
        StaticStack<doubleLinkedList> stack = channelPrograms.get(channel.toLowerCase());
        if (stack == null) {
            throw new IllegalArgumentException("Canal no válido: " + channel);
        }
        return stack;
    }

    // Método para agregar un programa a la doubleLinkedList del canal correspondiente
    public void addProgram(String channel, Programs program) throws StackException {
        StaticStack<doubleLinkedList> stack = getProgramsByChannel(channel);

        // Obtener la lista enlazada actual
        doubleLinkedList list = stack.isEmpty() ? new doubleLinkedList() : stack.top();

        // Insertar programa en la lista enlazada del canal correspondiente
        list.insert(program);

        // Agregar la lista enlazada a la pila de doubleLinkedList del canal
        if (stack.isEmpty()) {
            stack.push(list);
        }
    }

    // Método para obtener la doubleLinkedList más reciente (última agregada) del canal
    public doubleLinkedList getLatestProgramList(String channel) throws StackException {
        StaticStack<doubleLinkedList> stack = getProgramsByChannel(channel);
        if (stack.isEmpty()) {
            throw new IllegalArgumentException("No hay listas de programas para el canal: " + channel);
        }
        return stack.top();
    }

    // Método para mover un programa a la izquierda en la doubleLinkedList de un canal específico
    public void moveProgramLeft(String channel, Programs program) throws StackException {
        doubleLinkedList list = getLatestProgramList(channel);
        list.moveLeft(program);
    }

    // Método para mover un programa a la derecha en la doubleLinkedList de un canal específico
    public void moveProgramRight(String channel, Programs program) throws StackException {
        doubleLinkedList list = getLatestProgramList(channel);
        list.moveRight(program);
    }

    // Método para imprimir los programas de un canal específico
    public void printProgramsByChannel(String channel) throws StackException {
        doubleLinkedList list = getLatestProgramList(channel);
        System.out.println(list.toString());
    }

    // Método para obtener los programas de un canal específico como String
    public String getProgramsByChannelAsString(String channel) throws StackException {
        doubleLinkedList list = getLatestProgramList(channel.toLowerCase());
        return list.toString(); // Suponiendo que tu doubleLinkedList tiene un método toString() adecuado
    }
}
