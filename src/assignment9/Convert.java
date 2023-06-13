package assignment9;
public class Convert
{
    public static int Convert(String str)
    {
        return Integer.parseInt(str);
    }
    public static void main(String args[])
    {
        String[] str1={"abd","12","12.3","123f"};
        for(int i=0;i<str1.length;i++)
        {
           try
            {
                System.out.println(str1[i]);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }

}
