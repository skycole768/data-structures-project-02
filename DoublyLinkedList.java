
class DoublyLinkedList<T extends Comparable<T>> {

    private NodeType<T> head;
    private int length;


    public DoublyLinkedList() {
        head = null;
        length = 0;
    }

    public int getLength(){
        return length;
    }
    public void insertItem(T item) {

        NodeType<T> newNode = new NodeType<T>();
        newNode.info = item;
        NodeType<T> temp = head;

        if( length == 0) {
            head = newNode;
            length++;
        } else if(head.info.compareTo(newNode.info) > 0) {
            newNode.next = head;
            head.back = newNode;
            head = newNode;
            length++;

        } else if(head.info.compareTo(newNode.info) == 0) {
            System.out.println("Item already exists");
            return;
        }
        else {

            int i = 0;
            for(i = 0; i < length - 1 && temp.next.info.compareTo(newNode.info) <= 0; i++){

                temp = temp.next;
                if (temp.info.compareTo(newNode.info) == 0) {
                    System.out.println("Item already exists");
                    return;
                }
            }
            if(i != length - 1) {
                newNode.next = temp.next;
                temp.next.back = newNode;
            }
            temp.next = newNode;
            newNode.back  = temp;
            length++;
        }

    }

    public void deleteItem(T item){
        NodeType<T> newNode = new NodeType<T>();
        newNode.info = item;
        NodeType<T> temp = head;


        if (length == 0) {

            System.out.print("You cannot delete from an empty list");
            return;
        }

        if (length == 1 && head.info.compareTo(newNode.info) == 0) {
            head = null;
            length = 0;
            return;
        }


        int i = 1;

        for(i = 1; i < length && temp.next.info.compareTo(newNode.info) < 0; i++) {
            temp = temp.next;

        }

        temp = temp.next;
        if(head.info.compareTo(newNode.info) == 0 ){
            head = head.next;
            head.back = null;

            length--;
        } else if (temp == null || temp.info.compareTo(newNode.info) > 0) {

            System.out.println("The item is not present in the list");

        }  else if (temp.info.compareTo(newNode.info) == 0 && i == length - 1)   {

            temp.back.next = null;
            length--;
        } else {
            temp.next.back = temp.back;
            temp.back.next = temp.next;
            length--;
        }
    }

    public void print() {
        NodeType<T> temp = head;

        for(int i = 0; i < length; i++) {
            System.out.print(temp.info);
            System.out.print(" ");
            temp = temp.next;
        }
    }

    public void printReverse() {
        NodeType<T> temp = head;
        NodeType<T> tail = null;

        for(int i = 0; i < length - 1; i++) {
            temp = temp.next;
        }
        tail = temp;

        for(int i = 0; i < length; i++) {
            System.out.print(tail.info);
            System.out.print(" ");
            tail = tail.back;
        }
    }

    public DoublyLinkedList<T> reverseList() {
        NodeType<T> temp = head;
        NodeType<T> temp2 = null;

        if(length == 1 || length == 0) {
            return this;
        }

        for(int i = 0; i < length; i++) {
            temp2 = temp.back;
            temp.back = temp.next;
            temp.next = temp2;
            temp = temp.back;

        }
        head = temp2.back;


        return this;
    }

    public void swapAlternates() {
        NodeType<T> temp = head;
        NodeType<T> right = null;
        NodeType<T> left = null;

        for (int i = 0; i < length; i++) {

            temp = getNode(i);
            if(i%2 == 1) {

                right = temp;
                left = temp.back;

                if(i == 1) {
                    head = right;
                } else {
                    left.back.next = right;
                }
                if (right.next != null) {
                    right.next.back = left;

                }

                left.next =right.next;
                right.back = left.back;
                right.next = left;
                left.back = right;
            }
        }

    }

    public void deleteSubsection(T lowerBound, T upperBound) {

        for (int i = 0; i < getLength(); i++)  {

            if (getNode(i).info.compareTo(lowerBound) >= 0 &&
            getNode(i).info.compareTo(upperBound) <= 0) {
                deleteItem(getNode(i).info);
                i--;
            }

        }
    }

    /**
     * Functionn that returns node at location specified by int position in the current linkedlist.
     */
    public NodeType<T> getNode(int position) {
        NodeType<T> tempNode = head;

        if (getLength() > 0 && position < getLength()) {

            for (int i = 0; i < position; i++) {
                tempNode = tempNode.next;
            }
        }
        return tempNode;
    }

};
