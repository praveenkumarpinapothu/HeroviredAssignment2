package HVassignmentTwo;
class Node {
    int data;
    Node next;
    Node(int data){
      this.data = data;
      this.next = null;
    }
  }
class LinkedList {
    Node head;
    LinkedList(){
      this.head = null;
}
    void add(int data) {
      Node nodeNew = new Node(data);
      if (head == null) {
        head = nodeNew;
      } else {
        Node last = head;
        while (last.next != null) {
          last = last.next;
        }
        last.next = nodeNew;
      }
    }
    void printList() {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.println();
    }
  }
  public class secondQuestion {
    public static void main(String[] args) {
      LinkedList listOne = new LinkedList();
      listOne.add(25);
      listOne.add(35);
      listOne.add(12);
      listOne.add(4);
      listOne.add(36);
      listOne.add(48);
      LinkedList listTwo = new LinkedList();
      listTwo.add(8);
      listTwo.add(32);
      listTwo.add(22);
      listTwo.add(45);
      listTwo.add(63);
      listTwo.add(49);
      LinkedList mergedList = new LinkedList();
      Node head1 = listOne.head;
      Node head2 = listTwo.head;
      while (head1 != null && head2 != null) {
        if (head1.data < head2.data) {
          mergedList.add(head1.data);
          head1 = head1.next;
        } else {
          mergedList.add(head2.data);
          head2 = head2.next;
        }
      }
  
      while (head1 != null) {
        mergedList.add(head1.data);
        head1 = head1.next;
      }
  
      while (head2 != null) {
        mergedList.add(head2.data);
        head2 = head2.next;
      }
  
      System.out.println("Merged List: ");
      mergedList.printList();
      System.out.println("Sorted Merged List: ");
      sortList(mergedList);
      mergedList.printList();
    }
    static void sortList(LinkedList list) {
      Node n1 = list.head;
      Node index = null;
      int temp;
      if (list.head == null) {
        return;
      } else {
        while (n1 != null) {
          index = n1.next;
          while (index != null) {
            if (index.data < n1.data) {
              temp = n1.data;
              n1.data = index.data;
              index.data = temp;
            }
            index = index.next;
          }
          n1 = n1.next;
        }
      }
    }
  }
  
  