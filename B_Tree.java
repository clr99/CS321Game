
package pkg321_project;

public class B_Tree {
    
   Node current; // the root of the binary tree #1
   
   //constructor
   B_Tree(){
       current=null;
   }
   
  public B_Tree(int data, String story){
       
      current = new Node(data, story);
   }
 
}


