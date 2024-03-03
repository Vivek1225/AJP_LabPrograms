
import java.util.Scanner;

interface InnerStakcADT {
    public int peek();
    public void push(int a);
    public void pop();
    public boolean isEmpty();
    public void display();
    
}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

// Array implementaion of
class ArrayStack implements InnerStakcADT{
    int top = -1;
    int length = 10;
    ArrayStack(int length){
        this.length =  length;
    }
    ArrayStack(){

    }
    //max size = 10
    int[] array = new int[length];
    public int peek(){
        if (top == -1){
            return 0;
        }
        return array[top];
        // return 1;
    }
    public void push(int number){
        if(top == 9){
            System.out.println("Stack is full");
            return ;
        }
        top++;
        array[top] = number;
    }
    public void pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return ;
        }
        top--;
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
    public void display(){
        if(top == -1){
            System.out.println("Stack is empty");
            return ;
        }
        System.out.println("The elements of the stack are : ");
        for(int i = top;i>=0;i--){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}


//Liked list implemenation 


class LinkedStack implements InnerStakcADT{
    Node top = null;
    public int peek(){
        if(top == null){
            return 0;
        }
        return top.data;
    }
    public void push(int a){
        Node temp = new Node(a);
        if(top == null){
            
            top = temp;
            return ;
        }
        temp.next = top;
        top = temp;

    }
    public void pop(){
        if(top == null){
            System.out.println("Stack is empty");

        } else{
            top = top.next;
        }
        return ;
    }
    public boolean isEmpty(){
        if(top == null){
            return true;
        }
        return false;
    }
    public void display(){
        if(top == null){
            System.out.println("Stack is empty");
            return ;
        }
        Node temp = top;
        System.out.println("The elements in the stack are : ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}



public class Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayStack a = new ArrayStack();
        LinkedStack l = new LinkedStack();
        System.out.println("Note: Each operation is performed in both linked list and array implementation of stack");
        while(true){
            System.out.println("Choose your option:");
            System.out.println("1.Peek\n2.Push\n3.Pop\n4.IsEmpty\n5.Display\n6.Exit");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    a.peek();
                    l.peek();
                    break;
                case 2:
                    System.out.println("Enter data : ");
                    int data = sc.nextInt();
                    a.push(data);
                    l.push(data);
                    break;
                case 3:
                    a.pop();
                    l.pop();
                    break;
                case 4:
                    a.isEmpty();
                    l.isEmpty();
                    break;
                case 5:
                    a.display();
                    l.display();
                    break;
                case 6:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Please choose a valid option");
                    break;
            }
        }
            // a.push(10);
            // a.push(40);
            // a.pop();
            // System.out.println(a.isEmpty());
            // a.push(20);
            // a.push(30);
            // a.display();
            // System.out.println(a.peek());
            // a.pop();
            // a.pop();
            // a.pop();
            // a.pop();
            // System.out.println(a.isEmpty());
            // l.push(10);
            // l.push(40);
            // l.pop();
            // System.out.println(l.isEmpty());
            // l.push(20);
            // l.push(30);
            // l.display();
            // System.out.println(l.peek());
            // l.pop();
            // l.pop();
            // l.pop();
            // l.pop();
            // System.out.println(l.isEmpty());

    }
}