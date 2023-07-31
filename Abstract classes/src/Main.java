public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator =  new WomanGameCalculator();
        KidsGameCalculator kidsGameCalculator = new KidsGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();
        kidsGameCalculator.hesapla();
        kidsGameCalculator.gameOver();
        

    }
}