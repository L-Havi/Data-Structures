package App;

import java.util.Random;

public class AssignRandomArray {

    //Täyttää taulukon satunnaisilla arvoilla arvon väliltä 0 - 30 000 000
    public int[] randomArray(int length){

        Random rand = new Random();
        int[] random = new int[length];

        for(int i = 0; i < length; i++){
            random[i] = rand.nextInt(30000000);
        }

        return random;
    }

}
