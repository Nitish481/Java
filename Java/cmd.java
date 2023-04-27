public class cmd{
    public static void main(String [] args)
    {
        System.out.println("The Number of Command line argument: "+args.length);
        System.out.println("The command line parameters: ");
        for(int i=0;i<args.length;i++)
        {
            System.out.println(args[i]);
        }
    }
}