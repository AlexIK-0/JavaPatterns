public class productScanner {
    public static void main(String[] args) {
        ProductTemplate apple = new Food("Яблоко");
        ProductTemplate soap = new Housewares("Мыло");
        ProductTemplate coffeemachine = new Tech("Кофемашина");

        apple.Scan();
        soap.Scan();
        coffeemachine.Scan();



    }
}
