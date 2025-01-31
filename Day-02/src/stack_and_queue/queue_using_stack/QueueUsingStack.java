package stack_and_queue.queue_using_stack;
import java.util.Stack;
public class QueueUsingStack {
    private Stack<Integer>StackIn;
    private Stack<Integer>StackOut;

    public QueueUsingStack(){
        StackIn=new Stack<>();
        StackOut=new Stack<>();
    }

    public void Enqueue(int x){
        StackIn.push(x);
    }

    public int Dequeue(){
        if (StackOut.isEmpty()){
            if(StackIn.isEmpty()){
                System.out.println("Queue is Empty!");
            }
            while(!StackIn.isEmpty()){
                StackOut.push(StackIn.pop());
            }
        }
        return StackOut.pop();
    }
    public int peek(){
        if(StackOut.isEmpty()) {
            if (StackIn.isEmpty()) {
                System.out.println("Queue is Empty");
            }

            while (!StackIn.isEmpty()) {
                StackOut.push(StackIn.pop());
            }
        }
        return StackOut.peek();
    }

    public boolean isEmpty(){
        return StackOut.isEmpty() && StackIn.isEmpty();
    }
    public static void main(String[] args){
        QueueUsingStack queue=new QueueUsingStack();
        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);

        System.out.println(queue.Dequeue());
        System.out.println(queue.Dequeue());
        System.out.println(queue.Dequeue());
        System.out.println(queue.isEmpty());
    }
}
