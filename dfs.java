import java.util.*;

class Program {
  // Do not edit the class below except
  // for the depthFirstSearch method.
  // Feel free to add new properties
  // and methods to the class.
  static class Node {
    String name;
    List<Node> children = new ArrayList<Node>();

    public Node(String name) {
      this.name = name;
    }

    public List<String> depthFirstSearch(List<String> array) {
      return depthFirstSearchHelper(array,this);
    }

    public List<String> depthFirstSearchHelper(List<String> array, Node node) {
      // how to check if it has children or not
      if(node == null) return array;
      array.add(node.name);
      for(Node child: node.children){
        depthFirstSearchHelper(array,child);
      }
      return array;
    }

    public Node addChild(String name) {
      Node child = new Node(name);
      children.add(child);
      return this;
    }
  }
}
