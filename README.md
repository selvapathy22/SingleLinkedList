Singly Linked List Operations in Java

This Java project demonstrates various operations on a Singly Linked List implemented using Object-Oriented Programming (OOP) principles. The SinglyLinkedList class includes functionality to insert, delete, traverse, reverse, and clone the linked list, all while using a modular class-based structure.
Features

    Insertion at:

        Beginning

        Middle

        End

    Deletion from:

        Beginning

        Middle

        End

    Traversal: Print the entire linked list

    Count the total number of elements in the list

    Reverse the linked list

    Clone the linked list (create a deep copy)

Project Structure

    Node Class: Represents a single node of the linked list, storing the node’s data and a reference (link) to the next node.

    Method Class: Contains all the linked list operations like insertion, deletion, traversal, and others.

    SinglyLinkedList Class: The main class with the main method to execute the linked list operations interactively.

Classes and Methods
Node Class

This class represents a single node in the linked list.

    Data Members:

        int data: Holds the data of the node.

        Node link: Points to the next node in the list.

Method Class

This class contains all the methods for linked list operations.

    Methods:

        Node createNode(int data): Creates a new node with the given data.

        Node traverseSinglyLinkedList(): Traverses the linked list and returns the last node.

        int countElementsSll(): Returns the total number of elements in the linked list.

        void insertAtBegin(int data): Inserts a node at the beginning of the list.

        void insertAtMiddle(int data, int position): Inserts a node at a specific position in the list.

        void insertAtEnd(int data): Inserts a node at the end of the list.

        void deleteAtBegin(): Deletes the node at the beginning of the list.

        void deleteAtEnd(): Deletes the node at the end of the list.

        void deleteAtMiddle(int position): Deletes a node at a specific position in the list.

        Node reverseSll(Node head): Reverses the linked list and returns the new head.

        Node cloneSll(Node head): Creates and returns a deep copy (clone) of the linked list.

        void printSinglyLinkedList(Node head): Prints all elements in the linked list.

SinglyLinkedList Class

The main class that handles user input and displays the menu to interact with the linked list.
How to Run

    Clone the repository:

git clone https://github.com/yourusername/your-repository.git

Navigate to the project directory:

cd your-repository

Compile the Java files:

javac SinglyLinkedList.java

Run the program:

    java SinglyLinkedList

Example Usage
Insertions:

    At the Beginning:

sll.insertAtBegin(10);

At the Middle:

sll.insertAtMiddle(15, 2); // Inserts 15 at the 2nd position

At the End:

    sll.insertAtEnd(20);

Deletions:

    From the Beginning:

sll.deleteAtBegin();

From the Middle:

sll.deleteAtMiddle(2); // Deletes node at position 2

From the End:

    sll.deleteAtEnd();

Traversal:

    Print the List:

    sll.printSinglyLinkedList(sll.head);

Reversal:

    Reverse the Linked List:

    Node newHead = sll.reverseSll(sll.head);
    sll.printSinglyLinkedList(newHead);

Cloning:

    Clone the List:

    Node clonedList = sll.cloneSll(sll.head);
    sll.printSinglyLinkedList(clonedList);

Example Menu

When you run the program, you will see the following menu and be able to interact with it:

Insert: 1, Delete: 2, Print: 3, Clone: 4, Reverse: 5, Exit: 6
Enter Your Choice: 

The program will then prompt you to choose an option for insertion, deletion, printing, cloning, reversal, or exiting the program.
