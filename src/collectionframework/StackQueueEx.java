package collectionframework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        System.out.println(q.peek());

        Stack<Integer> s = new Stack<>();
        System.out.println(s.peek());
    }
}
