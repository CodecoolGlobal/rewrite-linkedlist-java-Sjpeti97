# Project Rewrite - Linked list

## Story

> This kind of exercise is a classic: your task is to reimplement some basic,
> built-in features of a language or its standard library for pedagogical
> reasons, without using the feature itself or similar features.
> Caveat: do not use this kind of code in your commercial projects!

In computer science, a _linked list_ is a linear collection of data elements, with an order not dictated by their physical placement in memory. Instead, each element points to the next. It is a data structure that consists of a collection of nodes, which together represent a sequence. In its most basic form, each node contains some _data_, and a _reference_ (in other words, a _link_) to the next node in the sequence. This structure allows for efficient insertion or removal of elements from any position in the sequence during iteration. More complex variants add additional links, allowing more efficient insertion or removal of nodes at arbitrary positions. A drawback of linked lists is that access time is linear (and difficult to pipeline). Faster access, such as random access, is not feasible. Arrays have better cache locality compared to linked lists.

On the average, a well-implemented and properly used linked list has the following time complexity characteristics.

- _get_ a value by index: `O(n)`
- _insert/remove_ value at the end: `O(1)`
- _insert/remove_ value in the middle: `search time + O(1)`

There are different alternatives of linked list.

- Singly linked lists contain nodes which have a data field as well as a 'next' field, which points to the next node in a line of nodes.
- Doubly linked lists, where each node contains, besides the next-node link, a second link field pointing to the 'previous' node in the sequence.
- Multiply linked list, where each node contains two or more link fields, each field being used to connect the same set of data records in a different order of same set (for example, by name, by department, or by date of birth).
- Circular linked list, where the last pointer points to the first node. In the case of a circular doubly linked list, the first node also points to the last node of the list.

### Real life usage of linked list

A linked list can be used to implement a queue, another frequently used data structure. The canonical real life example is a line for a cashier.

A linked list can also be used for implementing a stack. The canonical real life example is one of those plate dispensers at a buffet restaurant where the top plate is pulled off from the top of the stack.

Now we will focus on Singly Linked List.

## What are you going to learn?

- Understand the linked list data structure.
- Work with generics.

## Tasks

1. Rewrite both `Link`, `SinglyLinkedList`, and a tiny part of `SinglyLinkedListTests` to work with any generic `T` types as values.
    - The linked list can be instantiated, and it works with generic `value` types.

2. Implement the `add()` method for appending elements at the end of the list.
    - In case of empty list, the `add()` method sets the given value as head and increases the size to 1.
    - The `add()` method appends the given value at the end of the list, while increasing its size accordingly. For example, the result of adding 42 to a list is the following `[0 -> 1 -> 4]` is `[0 -> 1 -> 4 -> 42]`

3. Implement the `insert()` method for inserting a value at an index into the list, shifting elements if necessary.
    - Indexing starts with zero, which means that inserting an element at index `0` makes it the first element in the list.
For example, the result of inserting 42 at index 0 into a list is the following.
`[0 -> 1 -> 2 -> 3 -> 4]` is
`[42 -> 0 -> 1 -> 2 -> 3 -> 4]`
    - The `insert()` method places the value as a last element if the index is equal to the size of the list.
For example, the result of inserting 42 at index 5 into a list is the following.
`[0 -> 1 -> 2 -> 3 -> 4]` is
`[0 -> 1 -> 2 -> 3 -> 4 -> 42]`
    - The `insert()` method places the value at first index and shifts all other elements back.
For example, the result of inserting 42 at index 3 into a list is the following.
`[0 -> 1 -> 2 -> 3 -> 4]` is
`[0 -> 1 -> 2 -> 42 -> 3 -> 4]`
    - In case of negative index, the method throws an `IndexOutOfBoundException` exception.
    - If the given index is bigger than the amount of elements in the list, it throws an `IndexOutOfBoundException` exception.

4. Implement the `get()` method for returning the value, based on its index. If the given index is bigger than the size of the list, signal it with an appropriate exception.
    - Indexing starts at zero, which means that getting the element at index `0` returns as the first element of the list.
For example, the result of getting the element at index 0 from the following list
`["ZERO" -> "one" -> "two" -> "three" -> "four"]` is "ZERO".
    - The `get()` method returns the value of an existing element in the linked list.
For example, the result of getting element at index 3 from the following list
`["zero", "one" -> "two" -> "THREE" -> "four" -> "five"]` is "THREE".
    - The `get()` method throws an `IndexOutOfBoundException` exception for a non-existing index.

5. Implement the `indexOf()` method for returning the index of a searched value.
If the given value cannot be found, return -1.
    - The `indexOf()` method returns the index of the value found in the list.
For example, the result of searching 42 in a list
`[0 -> 1 -> 2 -> 42 -> 3 -> 4]` is 3.
    - The `indexOf()` method returns -1 if the searched value cannot be found in the list.
For example, the result of searching 321 in a list
`[0 -> 1 -> 2 -> 42 -> 3 -> 4]` is -1.

6. Implement the `size()` method for returning the amount of elements stored in the list.
    - The `size()` method returns zero in case of an empty list.
    - The `size()` method returns the amount of inserted element in case of non-empty list.
For example the size of the list `[0 -> 1 -> 2 -> 42 -> 3 -> 4]` is 6

7. Override the `toString()` method for returning the string representation of the list content.
    - In case of an empty list, `toString()` returns "[]".
    - In case of a non-empty array, the `toString()` method returns the inserted elements in the following format. "[1, 5, 10, 654]"

## General requirements

- All test result is green.
- All code is pushed to the GitHub repository in atomic commits. The implementation-related commits are managed on separate feature branches, and merged in a pull request to the `master` branch.

## Hints

- You can see from the method signatures in the starter code that `LinkedList` expects integer type values. One of the tasks is to
  make it _generic_, that is, make it work with any `T` type as values, where `T` is fixed at instantiation. You can do this conversion step at any point, but we suggest starting with this exercise.
- Modify the unit tests as well accordingly if you make the linked list generic. Don't worry, all it means is a few characters.
- Draw inspiration from the already implemented `remove()` method.

## Background materials

- <i class="far fa-exclamation"></i> [What is a linked list?](https://en.wikipedia.org/wiki/Linked_list)
- <i class="far fa-exclamation"></i> [Generics and the diamond operator](project/curriculum/materials/competencies/java-data-structures/java-generics.md.html)
- <i class="far fa-exclamation"></i> [Generics in Java](https://www.geeksforgeeks.org/generics-in-java/)

