import java.io.IOException;
import java.util.ArrayList;

public class MushroomMain{
    MushroomArrayList mushAL;
    ArrayList<Mushroom> MushList;
    public MushroomMain() throws IOException {
        mushAL = new MushroomArrayList();
        MushList = mushAL.getMushroomList();
    }

    public static void main(String[] args) throws IOException {
        MushroomMain mm = new MushroomMain();
        System.out.println(mm.countCharacteristic(0,'e'));
    }

    public int countCharacteristic(int traitTypeIndex, char trait) {
        char traitCount = 0;
        for (int i = 0; i < MushList.size(); i++) {
            if (MushList.get(i).mush[traitTypeIndex] == trait) {
                traitCount++;
            }
        }
        return traitCount;
    }

    public void commonality(){
        for(int i = 0; i < MushList.size(); i++){
            if(MushList.get(i).mush[0] == 'e'){
                for(int j = 0; j < MushList.get(i).mush.length; j++){

                }
            }
        }
    }

}
