package data_structures_app;

class QueueNode
{
    protected int data;
    protected QueueNode link;


    public QueueNode()
    {
        link = null;
        data = 0;
    }

    public QueueNode(int d, QueueNode n)
    {
        data = d;
        link = n;
    }

    public void setLink(QueueNode n)
    {
        link = n;
    }

    //  Function to set data to current QueueNode
    public void setData(int d)
    {
        data = d;
    }

    //  Function to get link to next node
    public QueueNode getLink()
    {
        return link;
    }

    //  Function to get data from current QueueNode
    public int getData()
    {
        return data;
    }
}
