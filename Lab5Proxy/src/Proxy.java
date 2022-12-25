public class Proxy implements ObjectAccess{
    public enum accessRights{
        USER,
        ADMIN
    }
    private accessRights role;
    private SomeObjectAccess object = new SomeObjectAccess();


    public Proxy(accessRights role){
        this.role = role;
    }
    @Override
    public void access() {
        if (role == accessRights.ADMIN){
            System.out.println("Доступ получен.");
            object.access();
        }
        else{System.out.println("Недостаточный уровень доступа.\nОбъект недоступен");}
    }
}
