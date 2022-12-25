abstract class ProductTemplate {
      private String name;
      public ProductTemplate(String name){
            this.name = name;
      }
      public final void Scan(){
            System.out.println("==========================");
            System.out.println("Считываем товар...");
            System.out.print("Тип товара: ");
            getProductType();
            System.out.println("\nНазвание товара: ");
            System.out.println(name);
            System.out.println("\nИзмерение размера...");
            System.out.print("Размер:");
            getSize();
            System.out.println("\nСчитываем срок годности...");
            System.out.print("Скоропортящийся товар:");
            getLifeTime();
            System.out.println("\nРасположение...");
            System.out.print("Расположение:");
            getPlacement();
            System.out.println("\n==========================");
      }

      abstract void getProductType();
      abstract  void getSize();
      abstract void getLifeTime();
      abstract void getPlacement();

      public void getName(){
            System.out.println(name);
      };

}
