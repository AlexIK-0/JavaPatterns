import java.util.List;
import java.util.ArrayList;
public class Camera implements Observed{
    public Camera(){
        for(int i = 0;i<10; i++){
            for(int j=0;j<10;j++){
                imageArray[i][j]=0;
            }
        }
    }
    int[][] imageArray = new int[10][10];
    ArrayList<int[]> movements = new ArrayList<>();
    List<Observer> observerList = new ArrayList<>();


    public void setImgMatrix(int[][] imageArray){
        this.imageArray = imageArray;
        movements = checkImgMoves(imageArray);
        notifyObserver();
    }
    public void printCamera(){
        for(int i = 0;i<10; i++){
            for(int j=0;j<10;j++){
                System.out.print(" "+ imageArray[i][j]);
            }
            System.out.println("");
        }
    }

    public ArrayList<int[]> checkImgMoves(int[][] imageArray){
        ArrayList<int[]> moves= new ArrayList<>();
        for(int i = 0;i<10; i++){
            for(int j=0;j<10;j++){
                if (imageArray[i][j] == 1){
                    moves.add(new int[]{i,j});
                }
            }
        }
        return moves;
    }


    @Override
    public void addObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);

    }

    @Override
    public void notifyObserver() {
        for(Observer o:observerList){
            o.handleEvent(movements);
        }
    }
}
