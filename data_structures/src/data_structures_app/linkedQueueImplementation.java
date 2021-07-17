package data_structures_app;

import java.util.Scanner;

public class linkedQueueImplementation 
{
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

        linkedQueue lq = new linkedQueue();

        System.out.println("Linked Queue Test\n");
        char ch;
        System.out.println("\nQueue Operations");
        System.out.println("1. Insert");
        System.out.println("2. Remove");
        System.out.println("3. Peek");
        System.out.println("4. Check empty");
        System.out.println("5. Size");
        do
        {
            System.out.print("Enter choice  : ");
            int choice = scan.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter integer element to insert : ");
                    lq.insert(scan.nextInt());
                    break;
                case 2:
                    try
                    {
                        System.out.println("Removed Element = " + lq.remove());
                    }
                    catch (Exception e)
                    {
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                case 3:
                    try
                    {
                        System.out.println("Peek Element = " + lq.peek());
                    }
                    catch (Exception e)
                    {
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Empty status = " + lq.isEmpty());
                    break;

                case 5:
                    System.out.println("Size = " + lq.getSize());
                    break;

                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            // display queue       
            lq.display();

            System.out.print("\nDo you want to continue (Type y or n) : ");
            ch = scan.next().charAt(0);
        }
        while (ch == 'Y' || ch == 'y');
    }
}
