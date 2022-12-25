import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Camera a = new Camera();
        a.printCamera();
        Observer one = new CameraObserver(a);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                a.imageArray[i][j] = scanner.nextInt();
        a.printCamera();
        a.setImgMatrix(a.imageArray);

    }
}