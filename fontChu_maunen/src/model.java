import java.awt.Color;
public class model
{
    private Color foreground;
    private Color background;
    private boolean opaque;

    public model()
    {
    }
    public model(Color foreColor, Color background, boolean opaque)
    {
        this.foreground = foreColor;
        this.background = background;
        this.opaque = opaque;
    }
     
    public Color getforeColor()
       {
        return this.foreground;
       }
    public Color getbackground()
    {
        return this.background;
    }
    public boolean getOpaque()
    {
        return this.opaque;
    }
    public void setforeground(Color x)
    {
        this.foreground = x;
    }
    public void setBackground(Color x)
    {
        this.background = x;
    }
    public void setOpaque(boolean x)
    {
        this.opaque = x;
    }
}