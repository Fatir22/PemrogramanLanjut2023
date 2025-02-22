import bags.Bag;
import queue.QueueNode;
import stack.StackNode;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StackNode<String> result = new StackNode<>();
        result.push("Fathir");
        result.push("Nisa");
        result.push("Yayat");
        System.out.println(result.getSize());
        System.out.println(result.peek());
        System.out.println(result.isEmpty());
        result.displaystack();
        result.pop();
        result.displaystack();
    }
}