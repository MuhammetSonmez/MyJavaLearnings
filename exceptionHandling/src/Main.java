
public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[] {1,2,3};
        try{
        System.out.println(sayilar[5]);
        }
        catch (StringIndexOutOfBoundsException exception){
            System.out.println(exception);
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }
        finally{
            System.out.println(sayilar[1]);
        }
    }
}