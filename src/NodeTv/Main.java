/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NodeTv;

import NodeTv.Channel;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Yendry VR
 */
public class Main {

     public static void main(String[] args) {
        // Create programs
        LocalDateTime now = LocalDateTime.now();
        Programs p1 = new Programs("Doki", "A dog and his crazy adventures", 45, now, now.plusMinutes(45));
        Programs p2 = new Programs("News", "Daily news", 30, now.plusMinutes(60), now.plusMinutes(90));
        
        // Create program lists
        ArrayList<Programs> programming1 = new ArrayList<>();
        programming1.add(p1);
        ArrayList<Programs> programming2 = new ArrayList<>();
        programming2.add(p2);

        // Create channels
        Channel channel1 = new Channel(1, programming1, programming1.size());
        Channel channel2 = new Channel(2, programming2, programming2.size());

        // Create doubly linked list of channels
        ChannelDoublyLinkedList channelList = new ChannelDoublyLinkedList();
        channelList.addChannel(channel1);
        channelList.addChannel(channel2);

        // Show channels
        System.out.println("Show all channels:");
        channelList.showChannels();

        // Move through the list and show the current channel
        System.out.println("\nCurrent channel:");
        System.out.println("Channel: " + channelList.getCurrentChannel().getChannel());

        // Move to the right and show the current channel
        channelList.moveRight();
        System.out.println("\nAfter moving right:");
        System.out.println("Channel: " + channelList.getCurrentChannel().getChannel());

        // Move to the left and show the current channel
        channelList.moveLeft();
        System.out.println("\nAfter moving left:");
        System.out.println("Channel: " + channelList.getCurrentChannel().getChannel());
    }
}