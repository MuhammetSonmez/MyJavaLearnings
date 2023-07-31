public class ProductManager {

    public void add(Product product){
        
        if (ProductValidator.isValid(product)){
            System.out.println("added. ");
        }
        else {
            System.out.println("null");
        }
        
    }
    public static class InnerClass{
        public static void funct(){

        }
    }
    
}
