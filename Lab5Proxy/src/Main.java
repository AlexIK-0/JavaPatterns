public class Main {
    public static void main(String[] args) {

        Proxy admin = new Proxy(Proxy.accessRights.ADMIN);
        admin.access();

        System.out.println("");

        Proxy user = new Proxy(Proxy.accessRights.USER);
        user.access();

    }
}