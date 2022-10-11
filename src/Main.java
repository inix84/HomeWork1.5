public class Main {
    public static void main(String[] args) {
        int [] ball = new int [12];
        ball[0]=33;
        ball[1]=66;
        ball[2]=99;
        System.out.println(ball[0]+" ,  " + ball[1]+"  ,  " + ball[2]);
        for (int i = 0; i < 3; i++) {
            if (ball[i]%2==1) {
                ball[i]+=1;
            }
        }
        System.out.println(ball[0]+" ,  " + ball[1]+"  ,  " + ball[2]);
    }
}