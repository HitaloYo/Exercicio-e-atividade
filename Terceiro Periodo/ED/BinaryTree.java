public class BinaryTree{
    private int value;
    private int leftChild;
    private int rightChild;

    

    BinaryTree(int value, int left, int right){
        this.value = value;
        this.leftChild = left;
        this.rightChild = right;
    }
    BinaryTree(int value, int left){
        this.value = value;
        this.leftChild = left;
    }
    BinaryTree(int value){
        this.value = value;
    }
    BinaryTree(){
    }



    public int getValue() {
        return value;
    }
    public int getLeftChild() {
        return leftChild;
    }
    public int getRightChild() {
        return rightChild;
    }



    public void setLeftChild(int leftChild) {
        this.leftChild = leftChild;
    }
    public void setRightChild(int rightChild) {
        this.rightChild = rightChild;
    }
    public void setValue(int value) {
        this.value = value;
    }

}