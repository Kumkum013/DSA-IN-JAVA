import java.util.ArrayList;
public class CreateTree {
    String data;
    ArrayList<CreateTree> children;

    public CreateTree(String data) {
        this.data = data;
        this.children = new ArrayList<CreateTree>();
    }
    public void addChild(CreateTree child) {
        this.children.add(child);
    }
public String print(int level)
{
  String ret;
  ret = " ".repeat(level) + data + "\n";
    for(CreateTree child : children)
    {
        ret += child.print(level + 1);
    }  
    return ret;
}
public static void main(String[] args) {
    CreateTree root = new CreateTree("Root");
    CreateTree child1 = new CreateTree("Child 1");
    CreateTree child2 = new CreateTree("Child 2");
    CreateTree grandchild1 = new CreateTree("Grandchild 1");
    CreateTree grandchild2 = new CreateTree("Grandchild 2");

    root.addChild(child1);
    root.addChild(child2);
    child1.addChild(grandchild1);
    child2.addChild(grandchild2);

    System.out.println(root.print(0));
}