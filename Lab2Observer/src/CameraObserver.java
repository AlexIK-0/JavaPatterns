import java.util.ArrayList;

public class CameraObserver implements Observer{
    public CameraObserver(Camera camera){
        camera.addObserver(this);
    }
    @Override
    public void handleEvent(ArrayList<int[]> movements) {
        System.out.println("Движение замечено в");
        for (int[] moves:movements){
            System.out.print("("+moves[0]+";"+moves[1]+")");
        }
    }
}
