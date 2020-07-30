
public class replace
{
    String s;
    public replace(String s)
    {
        this.s = s;
    }
    
    public void re()
    {
        s.replaceAll("\\", "/");
        System.out.println(s);
    }
}   