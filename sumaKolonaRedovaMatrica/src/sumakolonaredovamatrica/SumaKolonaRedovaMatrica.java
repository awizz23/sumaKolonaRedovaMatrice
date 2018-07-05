package sumakolonaredovamatrica;

public class SumaKolonaRedovaMatrica {

    public static void main(String[] args) {
        int num[][] = {
                        {1,2,3,4,5},
                        {1,2,3,4,5},
                        {1,2,3,4,5},
                        {1,2,3,4,5},
                        {1,2,3,4,5}
                       };
        int koloneZbir = 0;
        
        for (int i = 0; i<num.length; i++){
            koloneZbir += num[i][0];
        }
        System.out.println(koloneZbir); //Prikazuje zbir kolone "0".
        
        int redZbir = 0;
        
        for (int i = 0; i<num.length; i++){
            redZbir += num[0][i];
        }
        System.out.println(redZbir); //Prikazuje zbir reda "0".
    }
       
}
