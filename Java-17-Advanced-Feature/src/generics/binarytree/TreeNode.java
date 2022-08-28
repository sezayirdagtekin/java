package generics.binarytree;

public interface TreeNode<T extends  Comparable<T>> {
    T getValue();
    TreeNode<T> getLeft();
    TreeNode<T> getRight();
}
