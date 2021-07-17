package data_structures_app;

import java.util.Scanner;

// Class linkedList 
class linkedList
{
    protected node start;
    protected node end;
    public int size;

    public linkedList()
    {
        start = null;
        end = null;
        size = 0;
    }
    //  Function to check if list is empty  
    public boolean isEmpty()
    {
        return start == null;
    }
    //  Function to get size of list  
    public int getSize()
    {
        return size;
    }
    //  Function to insert an element at begining  
    public void insertAtStart(int val)
    {
        node nptr = new node(val, null);
        size++;
        if (start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
            nptr.setLink(start);
            start = nptr;
        }
    }
    // Function to insert an element at end  
    public void insertAtEnd(int val)
    {
        node nptr = new node(val, null);
        size++;
        if (start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
            end.setLink(nptr);
            end = nptr;
        }
    }
    // Function to insert an element at position  
    public void insertAtPos(int val, int pos)
    {
        node nptr = new node(val, null);
        node ptr = start;
        pos = pos - 1;
        for (int i = 1; i < size; i++)
        {
            if (i == pos)
            {
                node tmp = ptr.getLink();
                ptr.setLink(nptr);
                nptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size++;
    }
    //  Function to delete an element at position  
    public void deleteAtPos(int pos)
    {
        if (pos == 1)
        {
            start = start.getLink();
            size--;
            return;
        }
        if (pos == size)
        {
            node s = start;
            node t = start;
            while (s != end)
            {
                t = s;
                s = s.getLink();
            }
            end = t;
            end.setLink(null);
            size--;
            return;
        }
        node ptr = start;
        pos = pos - 1;
        for (int i = 1; i < size - 1; i++)
        {
            if (i == pos)
            {
                node tmp = ptr.getLink();
                tmp = tmp.getLink();
                ptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size--;
    }
    //  Function to display elements  
    public void display()
    {
        System.out.print("\nSingly Linked List = ");
        if (size == 0)
        {
            System.out.print("empty\n");
            return;
        }
        if (start.getLink() == null)
        {
            System.out.println(start.getData());
            return;
        }
        node ptr = start;
        System.out.print(start.getData() + "->");
        ptr = start.getLink();
        while (ptr.getLink() != null)
        {
            System.out.print(ptr.getData() + "->");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData() + "\n");
    }
}