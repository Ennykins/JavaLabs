
// TASK 1

class Item //Class is given
{
    char val;
    public Item(char c) {val=c;}
    public char value() {return val;}
}

// STACK


class Stack
{
    Item[] items;   //Array of items
    int top_stack;  //point to the top of the stack
    int max_size;   //Size of stack

    public Stack(int max_items)
    {

        items = new Item[max_items];
        max_size = max_items;
        top_stack = -1;
    }




// 	PUSH

    void push(Item item)
    {
        // item = new Item(item);

        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(-1);
        }

        items[++top_stack] = item;
    }


// 	POP

    Item pop()
    {
        // check for stack underflow


        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }

        return items[top_stack--];

    }




// 	TOP

    Item top()
    {

        if (!isEmpty()) {
            return items[top_stack];
        }
        else {
            System.exit(-1);
        }

        // return -1;
        return new Item('x');
    }



    boolean isEmpty()
    {
        return top_stack == -1;
    }


    boolean isFull(){
        return top_stack == max_size - 1;
    }
}



// TASK 2


public class Lab3
{
    static Stack stack;
    public static void main(String[] args)
    {
        // stack=new Stack(100);
        String rightlyFormed="public static void main(String[] args){}";
        String wronglyFormed="public static void main(String[] args){}";
        System.out.println(testBrackets(rightlyFormed));
        System.out.println(testBrackets(wronglyFormed));
    }

    static public boolean testBrackets(String s)
    {
        // Stack stack = new Stack(10);
        Stack stack = new Stack(20);
        Item c;

        for (int i = 0; i < s.length(); i++) {
            c = new Item(s.charAt(i));
            if (c == new Item('(') || c == new Item('{')){
                stack.push(c);
            }
            else if (stack.isEmpty()){
                return false;
            }
            else if (c == new Item(')')) {
                if (stack.pop() != new Item('('))
                    return false;
            } else if (c == new Item('}')) {
                if (stack.pop() != new Item('{'))
                    return false;
            }
        }
        return stack.isEmpty();
    }

}

// Data structure for a list of employees coded here:
