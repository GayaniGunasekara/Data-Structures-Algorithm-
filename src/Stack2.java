import java.util.Stack;

public class Stack2 {
    public static void main(String[] args) {

        //creating the satck
        Stack<String> stackOfBooks = new Stack<>();

        //check if the stack is empty or not
        System.out.println(stackOfBooks.empty());

        stackOfBooks.push("newBook1");
        stackOfBooks.push("Ape gama");
        stackOfBooks.push("Viragaya");
        stackOfBooks.push("newBook 4");

        System.out.println(stackOfBooks.empty());
        System.out.println(stackOfBooks);

        stackOfBooks.pop();
        System.out.println(stackOfBooks);

        stackOfBooks.pop();
        System.out.println(stackOfBooks);

        stackOfBooks.pop();
        System.out.println(stackOfBooks);

        stackOfBooks.pop();
        System.out.println(stackOfBooks);

    }
}
