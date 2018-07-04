import java.awt.*;

public abstract class GameObject
{
    protected int x, int y;
    protected ID id;
    protected int velX, velY;

    public GameObject(int x, int y, ID id)
    {
        this.x = x;
        this.y = y;
        this.id = ID;
    }

    public abstract void tick();
    public abstract void render(Graphics g);

    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y = y;
    }

    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }

    public void setID(ID id)
    {
        this.id = id;
    }
}