package serveletproject;
import java.util.*;
public class StackQueue {

	public static void main(String[] args) {               //LIFO
	Stack<Character> Stk= new Stack<>();
	Stk.push('w');
	Stk.push('d');
	Stk.push('r');
	Stk.push('k');
	System.out.println("Stack :"+Stk);
    System.out.println("Stack pop :"+Stk.pop());
    System.out.println("Stack peek :"+Stk.peek());
    System.out.println("Stack :"+Stk);

    PriorityQueue<Integer> Que= new PriorityQueue<>();     //FIFO
    Que.add(5);
    Que.add(8);
    Que.add(6);
    Que.add(10);
    Que.add(4);
    System.out.println("Queue :"+Que);
    System.out.println("Queue poll :"+Que.poll());
    System.out.println("Queue poll :"+Que.poll());
    System.out.println("Queue peek :"+Que.peek());
    System.out.println("Queue :"+Que);

	ArrayDeque<String> Dq= new ArrayDeque<>();            //LIFO & FIFO
	Dq.offer("Raja");
	Dq.offer("Vinoth");
	Dq.offer("Abi");
	Dq.offer("Vikash");
	Dq.offer("Ram");
	Dq.offer("Varun");
	System.out.println("Deque :"+Dq);
  	System.out.println("Deque poll :"+Dq.poll());
	System.out.println("Deque :"+Dq);
	System.out.println("Deque pollFirst :"+Dq.pollFirst());
	System.out.println("Deque :"+Dq);
	System.out.println("Deque pollLast :"+Dq.pollLast());
	System.out.println("Deque peek Fist :"+Dq.peekFirst());
	System.out.println("Deque peek Last :"+Dq.peekLast());
	System.out.println("Deque  :"+Dq);

	
	}

}
