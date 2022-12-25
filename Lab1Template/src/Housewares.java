public class Housewares extends ProductTemplate{
    public Housewares(String name) {
        super(name);
    }

    @Override
    void getProductType() {
        System.out.println("Хозтовары");
    }

    @Override
    void getSize() {
        System.out.println("Небольшой");
    }

    @Override
    void getLifeTime() {
        System.out.println("Нет");
    }

    @Override
    void getPlacement() {
        System.out.println("Нижние полки");
    }
}
