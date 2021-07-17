package data_structures_app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Stack using Array
class StackDemo
{

    public static void main(String[] args) throws IOException
    {
        Stack stk = new Stack(5);
        boolean yes = true;
        int choice;
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("1).Push\n2).Pop\n3).Display\n4).Exit\n");
        do
        {
            System.out.print("\nEnter Choice : ");

            choice = Integer.parseInt(is.readLine());

            switch (choice)
            {
                case 1:
                    System.out.print("Enter Push Item :");
                    stk.pushItem(Integer.parseInt(is.readLine()));
                    break;
                case 2:
                    stk.popItem();
                    break;
                case 3:
                    stk.displayAll();
                    break;
                case 4:
                    yes = false;
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
        while (yes == true);

    }
}