public class MyNode extends Node<Integer> {

    public MyNode(Integer data) {
        super(data);
        // TODO Auto-generated constructor stub
    }

    // public void setData(Integer data) {
    // System.out.println("MyNode.setData");
    // super.setData(data);
    // }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }

    public Integer getData() {
        return super.getData();
    }

    // bridge method is generated by compiler
    // public void Object getData() {
        // return (Integer) super.getData();
    // }
}