//سؤال 2
public class GameEntry {
    public int score;
    public GameEntry(int score){
        this.score =score;
    }

    //***********************************************
    public static void main(String[] args){
        GameEntry[] A = new GameEntry[5];
        for (int i=0 ; i< A.length ; i++){
            A[i] = new GameEntry(i *100);}
        GameEntry[] B = A.clone();
        A[4].score=550;
        int scoreValue=B[4].score;

        System.out.println("Scorevalue refernced by B[4]:"+scoreValue);
    }
}



