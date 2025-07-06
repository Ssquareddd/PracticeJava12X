package ex_27_Collection_Framework.list.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class LabArrayDeque {
    public static void main(String[] args) {

        Deque<Integer> deck = new ArrayDeque<>();
        deck.push(10);
        deck.push(2);
        System.out.println(deck);
    }
}
