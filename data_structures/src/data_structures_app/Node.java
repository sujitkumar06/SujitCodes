package data_structures_app;

class node
{
    protected int data;
    protected node link;

    public node()
    {
        link = null;
        data = 0;
    }

    public node(int d, node n)
    {
        data = d;
        link = n;
    }
    //  Function to set link to next node 
    public void setLink(node n)
    {
        link = n;
    }
    //  Function to set data to current node  
    public void setData(int d)
    {
        data = d;
    }
    //  Function to get link to next node  
    public node getLink()
    {
        return link;
    }
    //  Function to get data from current node  
    public int getData()
    {
        return data;
    }
}
