public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            int myInt = Integer.parseInt("eee");
            System.out.println("aftererfsflj");
        }
        catch (NumberFormatException | NullPointerException nfe){ //this code will catch both exceptions
            System.out.println("Hey dude! That is wrong!");
        }
        finally {
            System.out.println("in the finally block");
        }
        System.out.println("End here");
    }


}
