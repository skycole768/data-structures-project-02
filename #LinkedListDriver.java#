import java.io.*;
import java.util.Scanner;

public class LinkedListDriver {


    static  DoublyLinkedList<Integer>  intList = null;
    static  DoublyLinkedList<Double> doubleList = null;
    static  DoublyLinkedList<String> stringList = null;

    public static void main(String args[]) {


        System.out.print("Enter list type (i - int, d - double, s - string): ");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();


        boolean isInt, isDouble, isString;
        isInt = false;
        isDouble = false;
        isString = false;

        if (input.equals("i")) {
            intList = new DoublyLinkedList<Integer>();
            isInt = true;
        } else if (input.equals("d")) {
            isDouble = true;
            doubleList = new DoublyLinkedList<Double>();
        } else {
            isString = true;
            stringList =  new DoublyLinkedList<String>();
        }

        try {
            String fileName = args[0];
            File file = new File(fileName);

            Scanner fileReader = new Scanner(file);


            if(isInt) {

                int item = 0;

                while(fileReader.hasNextInt()) {

                    item = fileReader.nextInt();
                    intList.insertItem(item);
                }

            } else if(isDouble) {

                double item = 0;
                while(fileReader.hasNextDouble()) {
                    item = fileReader.nextDouble();
                    doubleList.insertItem(item);
                }
            } else {
                String item = null;
                while(fileReader.hasNext()) {
                    item = fileReader.next();
                    stringList.insertItem(item);
                }

            }

            fileReader.close();
        } catch (IOException | ArrayIndexOutOfBoundsException e) { //if file not found or some
                                                                   // other error
            System.out.println("File not found");
            return;
        }



        System.out.printf("Commands:%n(i) - Insert value%n(d) - Delete value)");
        System.out.printf("%n(p) - Print list%n(l) - Print length%n(t) - Print reverse%n");
        System.out.printf("(r) - Reverse list%n(b) - Delete Subsection%n(s) - Swap Alternate");
        System.out.printf("%n(q) - Quit program%n");

        boolean quit = false;
        boolean invalid = false;

        while(!quit) {

            if (!invalid) {
                System.out.println("");
                System.out.print("Enter a command: ");
            }

            input = keyboard.nextLine();

            switch(input) {
            case "i": // insert
                invalid = false;

                insert(isString, isDouble, isInt, keyboard);
                break;

            case "d": // delete
                invalid = false;
                delete(isString, isDouble, isInt, keyboard);
                break;

            case "s": //swapAlternates
                invalid = false;
                swapAlt(isString, isDouble, isInt);
                break;
            case "r": // revereList
                invalid = false;
                reverse(isString, isDouble, isInt);

                break;
            case "b": // delete subsection
                deleteSub(isString, isDouble, isInt, keyboard);
                invalid = false;

                break;
            case "t": // print reverse
                invalid = false;
                printReverse(isString, isDouble, isInt);
                break;
            case "p": // print
                invalid = false;
                print(isString, isDouble, isInt);
                //  System.out.println("s");
                break;
            case "l": // length
                invalid = false;
                length(isString, isDouble, isInt);
                break;
            case "q": // quit
                invalid = false;
                System.out.println("Exiting the program...");
                quit = true;
                break;
            default: // invalid command
                invalid = true;
                System.out.print("Invalid command, try again: ");
                break;
            }

        }

        keyboard.close();
        System.exit(0);
    }

    static void swapAlt(boolean isString,boolean isDouble, boolean isInt) {
        if(isString) {
            System.out.print("The original list: ");
            stringList.print();
            System.out.println("");
            stringList.swapAlternates();
            System.out.print("The modified list: ");
            stringList.print();
            System.out.println("");
            System.out.print("The reverse list: ");
            stringList.printReverse();


        } else if(isDouble) {
            System.out.print("The original list: ");
            doubleList.print();
            System.out.println("");
            doubleList.swapAlternates();
            System.out.print("The modified list: ");
            doubleList.print();
            System.out.println("");
            System.out.print("The reverse list: ");
            doubleList.printReverse();


        } else {
            System.out.print("The original list: ");
            intList.print();
            System.out.println("");
            intList.swapAlternates();
            System.out.print("The modified list: ");
            intList.print();
            System.out.println("");
            System.out.print("The reverse list: ");
            intList.printReverse();

        }

    }
    static void reverse(boolean isString,boolean isDouble, boolean isInt) {
        if(isString) {
            System.out.print("The original list: ");
            stringList.print();
            System.out.println("");
            stringList.reverseList();
            System.out.print("The reversed list: ");
            stringList.print();


        } else if(isDouble) {
            System.out.print("The original list: ");
            doubleList.print();
            System.out.println("");
            doubleList.reverseList();
            System.out.print("The reversed list: ");
            doubleList.print();


        } else {
            System.out.print("The original list: ");
            intList.print();
            System.out.println("");
            intList.reverseList();
            System.out.print("The reversed list: ");
            intList.print();
        }

    }

    static void deleteSub(boolean isString,boolean isDouble, boolean isInt, Scanner keyboard) {

        if(isString) {
            System.out.print("Enter the lower bound: ");
            String lowerBound = keyboard.next();
            System.out.print("Enter the upper bound: ");
            String upperBound = keyboard.next();

            System.out.print("The original list: ");
            stringList.print();
            System.out.println("");
            stringList.deleteSubsection(lowerBound, upperBound);
            System.out.print("The modified list: ");
            stringList.print();
            System.out.println("");
            System.out.print("The reverse list: ");
            stringList.printReverse();


        } else if(isDouble) {

            System.out.print("Enter the lower bound: ");
            double lowerBound = keyboard.nextDouble();
            System.out.print("Enter the upper bound: ");
            double upperBound = keyboard.nextDouble();

            System.out.print("The original list: ");
            doubleList.print();
            System.out.println("");
            doubleList.deleteSubsection(lowerBound, upperBound);
            System.out.print("The modified list: ");
            doubleList.print();
            System.out.println("");
            System.out.print("The reverse list: ");
            doubleList.printReverse();


        } else {
            System.out.print("Enter the lower bound: ");
            int lowerBound = keyboard.nextInt();
            System.out.print("Enter the upper bound: ");
            int upperBound = keyboard.nextInt();

            System.out.print("The original list: ");
            intList.print();
            System.out.println("");
            intList.deleteSubsection(lowerBound, upperBound);
            System.out.print("The modified list: ");
            intList.print();
            System.out.println("");
            System.out.print("The reverse list: ");
            intList.printReverse();

        }
        keyboard.nextLine();


    }

    static void printReverse(boolean isString,boolean isDouble, boolean isInt) {

        System.out.print("The reverse list: ");
        if(isString) {
            stringList.printReverse();
        } else if(isDouble) {
            doubleList.printReverse();
        } else {
//                    System.out.println("sd");
            intList.printReverse();
        }
    }

    static void print(boolean isString,boolean isDouble, boolean isInt) {

        System.out.print("The list is : ");
        if(isString) {
            stringList.print();
        } else if(isDouble) {
            doubleList.print();
        } else {
//                    System.out.println("sd");
            intList.print();
        }
    }

    static void length(boolean isString,boolean isDouble, boolean isInt) {
        System.out.print("The length of the list is ");

        if (isString) {
            System.out.println(stringList.getLength());
        } else if (isDouble){
            System.out.println(doubleList.getLength());
        } else {
            System.out.println(intList.getLength());
        }

    }

    static void delete(boolean isString,boolean isDouble, boolean isInt, Scanner keyboard) {
        if(isString) {
            System.out.print("Enter a string to delete: ");
            String string1 = keyboard.next();

            // stringList.deleteItem(string1);
            if(stringList.getLength() == 0){
                stringList.deleteItem(string1);
                keyboard.nextLine();
                return;
            } else {
                //keyboard.nextLine();
                 stringList.deleteItem(string1);
                System.out.print("The list is : ");
                stringList.print();
                System.out.println("");
                System.out.print("The reverse list: ");
                stringList.printReverse();

            }

        } else if(isDouble) {
            System.out.print("Enter a number to delete: ");
            double num = keyboard.nextDouble();

            //doubleList.deleteItem(num);

            if(doubleList.getLength() == 0){
                doubleList.deleteItem(num);
                keyboard.nextLine();
                return;
            } else {
                doubleList.deleteItem(num);
                System.out.print("The list is : ");
                doubleList.print();
                System.out.println("");
                System.out.print("The reverse list: ");
                doubleList.printReverse();

            }
        } else {
            System.out.print("Enter a number to delete: ");
            int num = keyboard.nextInt();

            if(intList.getLength() == 0){
                intList.deleteItem(num);
                keyboard.nextLine();
                return;
            } else {
                intList.deleteItem(num);
                System.out.print("The list is : ");
                intList.print();
                System.out.println("");
                System.out.print("The reverse list: ");
                intList.printReverse();
            }
        }
        keyboard.nextLine();

    }

    static void insert (boolean isString,boolean isDouble, boolean isInt, Scanner keyboard) {

        if(isString) {
                       System.out.print("The list is : ");
            stringList.print();
            System.out.println("");

            System.out.print("Enter a string to insert: ");
            String string1 = keyboard.next();

            stringList.insertItem(string1);

            System.out.print("The list is : ");
            stringList.print();
            System.out.println("");
            System.out.print("The reverse list: ");
            stringList.printReverse();


        } else if(isDouble) {
                       System.out.print("The list is : ");
            doubleList.print();
            System.out.println("");

            System.out.print("Enter a number to insert: ");
            double num = keyboard.nextDouble();

            doubleList.insertItem(num);
            System.out.print("The list is : ");
            doubleList.print();
            System.out.println("");
            System.out.print("The reverse list: ");
            doubleList.printReverse();


        } else {

                       System.out.print("The list is : ");
            intList.print();
            System.out.println("");

            System.out.print("Enter a number to insert: ");
            int num = keyboard.nextInt();

            intList.insertItem(num);
            System.out.print("The list is : ");
            intList.print();
            System.out.println("");
            System.out.print("The reverse list: ");
            intList.printReverse();

        }

        keyboard.nextLine();


    }
}
