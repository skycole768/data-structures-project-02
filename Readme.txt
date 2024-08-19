***my method getNode has a for loop that could loop n times

    code for reverseList

         NodeType temp = head
        NodeType  temp2 = null

        for(int i = 0 and i ... < length) { //interating for  potentially n times
            temp2 = temp.back      // constants
            temp.back = temp.next
            temp.next = temp2
            temp = temp.back

        }
        head = temp2.back; // constant


        return this;

    O(n) for my reverseList function is n.

code for swapAlternates

            NodeType temp = head;
        NodeType right = null;
        NodeType left = null;

        for (int i = 0; i < length; i++) { //interating for  potentially n times

            temp = getNode(i); // getNode() interating for  potentially n times
            if(i%2 == 1) { // the rest of my operations are constant

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
     O(n) = n * n
    O(n) for my swapAlternates function is n^2


code for my deleteSubsection

    parameters = T lowerBound, T upperBound

        for (int i = 0, i ...  < getLength())  { // interating for  potentially n times

            if (getNode(i).info >= lowerBound 0 &&
            getNode(i).info <= upperBound) { // getNode() interating for  potentially n times
                delete getNode(i).info // getNode() interating for  potentially n times
                i--;
            }

        }
    }

O(n) = n * 3n
    O(n) = n^2;
    O(n) for my deleteSubsection = n^2
