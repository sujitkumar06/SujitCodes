package data_structures_app;

class Stack
{

    private int top;
    private int item[];

    Stack(int size)
    {
        top = -1;
        item = new int[size];
    }

    void pushItem(int data)
    {
        if (top == item.length - 1)
        {
            System.out.println("Stack is Full");
        }
        else
        {
            item[++top] = data;
            System.out.println("Pushed Item :" + item[top]);
        }
    }

    int popItem()
    {
        if (top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            System.out.println("Pop Item : " + item[top]);
            return item[top--];
        }
    }
    void displayAll()
    {
        for (int i = 0; item[i] != 0; i++)
        {
            System.out.print(item[i] + "\t");
        }

        System.out.println("");
    }
}

