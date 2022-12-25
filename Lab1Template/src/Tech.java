public class Tech extends ProductTemplate {
    public Tech(String name) {
        super(name);
    }

    @Override
    void getProductType() {
        System.out.println("Техника");
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
        System.out.println("Раздел с техникой");
    }
}
