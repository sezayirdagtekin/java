package generics.binarytree;

class App {

    public static void main(String[] args) {


        TreeNode<Integer>  left= new LeafNode<Integer>(1);
        TreeNode<Integer>  right= new LeafNode<Integer>(5);

        TreeNode<Integer> tree=  new InnerNode<>(new LeafNode<>(2),new InnerNode<>(left,right));

        System.out.println(tree);

    }
}
