package generics.binarytree;

public class InnerNode<T extends Comparable<T>>  implements  TreeNode<T>{

    private final TreeNode<T> left;
    private final TreeNode<T> right;

    public InnerNode(TreeNode<T> left, TreeNode<T> right) {
        this.left = left;
        this.right = right;
    }


    @Override
    public T getValue() {
        T leftValue=left.getValue();
        T rightValue= right.getValue();
        int result=leftValue.compareTo(rightValue); // comes with <T extends Comparable<T>>
        return  result>=0 ?leftValue:rightValue;
    }

    @Override
    public TreeNode<T> getLeft() {
        return null;
    }

    @Override
    public TreeNode<T> getRight() {
        return null;
    }


    @Override
    public String toString() {
        return String.format("{%s,%s}",left,right);
    }

}
