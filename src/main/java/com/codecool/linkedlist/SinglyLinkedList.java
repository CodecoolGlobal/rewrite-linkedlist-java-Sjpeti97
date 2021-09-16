package com.codecool.linkedlist;

public class SinglyLinkedList<T> {

    private int size;

    private class Link {

        private final T value;
        private Link next;

        Link(T value) {
            this.value = value;
        }

        T getValue() {
            return value;
        }

        Link getNext() {
            return next;
        }

        void setNext(Link next) {
            this.next = next;
        }
    }

    private Link head;

    public SinglyLinkedList() {
        this.size = 0;
        this.head = new Link(null);
    }


    /**
     * Add a new element to the list.
     * The new element is appended to the current last item.
     *
     * @param value value to be appended
     */
    public void add(T value) {
        if (size==0) {
            this.head = new Link(value);
        } else {
            if (head.getNext()==null) {
                head.setNext(new Link(value));
            } else {
                Link nextLink = head.getNext();
                for (int i = 1; i < size-1; i++) {
                    nextLink = nextLink.getNext();
                }
                nextLink.setNext(new Link(value));
            }
        }
//        this.myArray = Arrays.copyOf(myArray, size+1);
//        head = new Link(value);
//        if (size>0) {
//            myArray[size-1].setNext(head);
//        }
//        this.myArray[size] = head;
        this.size+=1;
    }

    /**
     * Get a value based on its index.
     *
     * @param index the position of requested value
     * @return value of element at index
     */
    public T get(int index) {
        if (index<size && index>=0) {
            if (index==0) {
                return head.getValue();
            } else {
                Link nextLink = head.getNext();
                for (int i = 1; i < index; i++) {
                    nextLink = nextLink.getNext();
                }
                return nextLink.getValue();
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Returns the zero-based index of the first occurrence of a value in the list.
     *
     * @param number value to be searched
     * @return Index of 'number' if it's in the list, otherwise -1;
     */
    public int indexOf(T number) {
//        int index = 0;
//        for (int i = 0; i < size; i++) {
//            if (myArray[i].getValue().equals(number)) {
//                index = i;
//                break;
//            } else {
//                index = -1;
//            }
//        }
        return 0;
    }

    /**
     * Inserts a value at an index into the array shifting elements if necessary.
     *
     * @param index  Position of the new element
     * @param number Value to be inserted.
     */
    public void insert(int index, T number) {
//        if (index==size) {
//            add(number);
//        } else {
//            Link[] copy = (Link[]) new Object[size+1];
//            if (index==0) {
//                copy[0] = new Link(number);
//                copy[0].setNext(myArray[0]);
//                System.arraycopy(myArray, 0, copy, 1, size);
//            } else {
//                System.arraycopy(myArray, 0, copy, 0, index);
//                Link newLink = new Link(number);
//                copy[index] = newLink;
//                copy[index-1].setNext(newLink);
//                newLink.setNext(myArray[index+1]);
//                System.arraycopy(myArray, index, copy, index+1, size-1);
//            }
//            this.myArray=copy;
//            this.head = new Link(number);
//            this.size+=1;
//        }
    }

    /**
     * Returns with the amount of inserted nodes.
     *
     * @return Size of list.
     */
    public int size() {
        return this.size;
    }

    /**
     * Removes the element at 'index' from the array.
     *
     * @param index Position of value to be deleted.
     */
    public void remove(int index) {
        if (index == 0) {
            if (head == null) {
                throw new IndexOutOfBoundsException();
            } else {
                head = head.getNext();
            }
            return;
        }
        Link elementBeforeIndex = head;
        while (index - 1 > 0) {
            elementBeforeIndex = elementBeforeIndex.getNext();
            index--;
            if (elementBeforeIndex == null) {
                throw new IndexOutOfBoundsException();
            }
        }
        Link elementAtIndex = elementBeforeIndex.getNext();
        if (elementAtIndex == null) {
            throw new IndexOutOfBoundsException();
        }
        elementBeforeIndex.setNext(elementAtIndex.getNext());
    }
}
