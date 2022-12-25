public class Main {
    public static void main(String[] args) {
        Converter conv = new Converter();
        conv.Convert("\"C:\\Users\\User\\Downloads\\java.txt\"","C:\\Users\\User\\Desktop\\test", Converter.Format.txt);
    }
}