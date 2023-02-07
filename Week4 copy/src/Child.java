
public class Child extends Parent
{
    private int data; // Try deleting this line

    public Child(int data)
    {
        super(1);
        this.data = data;
    }

    public String toString()
    {
        return "Child: " + this.data + " " + super.toString();
    }
}
