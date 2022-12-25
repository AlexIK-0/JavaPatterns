public class Food extends ProductTemplate {


    public Food(String name) {
        super(name);
    }

    @Override
    void getProductType() {
        System.out.println("Продукты питания");
    }

    @Override
    void getSize() {
        System.out.println("Маленький");
    }

    @Override
    void getLifeTime() {
        System.out.println("Да");
    }

    @Override
    void getPlacement() {
        System.out.println("Верхние полки");
    }
}
