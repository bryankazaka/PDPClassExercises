class PreOrder
{
    public void preOrder(Node node)
    {

        System.out.println(node.value);
        if (node.hasLeft())
        {
            preOrder(node.left);
        }
        if (node.hasRight())
        {
            preOrder(node.left);
        }
    }
}