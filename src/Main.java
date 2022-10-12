public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int [] weight = new int [3];
        weight [0] = 1;
        weight [1] = 2;
        weight [2] = 3;
        //for(int i=0;i<weight.length;i++){
        //System.out.println(weight[i]);
        //}

        System.out.println("");
        System.out.println("Задача 2");

        int [] weight1 = new int [3];
        weight1 [0] = 1;
        weight1 [1] = 2;
        weight1 [2] = 3;
        for(int i=0;i<weight1.length;i++){
        System.out.print(weight1[i]);
            if(i<weight1.length-1){
                System.out.print(",");
            }
        }
        System.out.println("");

        float [] weight2 = {1.57f, 7.654f, 9.986f};
        for(int i=0;i<weight2.length;i++){
            System.out.print(weight2[i]);
            if(i<weight2.length-1){
                System.out.print(",");
            }
        }
        System.out.println("");

        boolean [] weight3 = {true, true, false};
            for(int i=0;i<weight3.length;i++){
                System.out.print(weight3[i]);
                if(i<weight3.length-1){
                    System.out.print(",");
                }
            }
        System.out.println("");

        System.out.println("");
        System.out.println("Задача 3");

        int [] weight4 = new int [3];
        weight4 [0] = 1;
        weight4 [1] = 2;
        weight4 [2] = 3;
        for(int i=weight4.length-1;i>-1;i--){
            System.out.print(weight4[i]);
            if(i>0){
                System.out.print(",");
            }
        }
        System.out.println("");

        float [] weight5 = {1.57f, 7.654f, 9.986f};
        for(int i=weight5.length-1;i>-1;i--){
            System.out.print(weight5[i]);
            if(i>0){
                System.out.print(",");
            }
        }

        System.out.println("");

        boolean [] weight6 = {true, true, false};
        for(int i=weight6.length-1;i>-1;i--){
            System.out.print(weight6[i]);
            if(i>0){
                System.out.print(",");
            }
        }
        System.out.println("");

        System.out.println("");
        System.out.println("Задача 4");

        int [] ball = new int [3];
        ball[0]=33;
        ball[1]=66;
        ball[2]=99;
        System.out.print("был массив   ");
        for(int i=0;i<ball.length;i++){
            System.out.print(ball[i]);
            if(i<ball.length-1){
                System.out.print(",");
            }
        }
        for (int i = 0; i < 3; i++) {
            if (ball[i]%2==1) {
                ball[i]+=1;
            }
        }
        System.out.println("");
        System.out.print("стал массив   ");
        for(int i=0;i<ball.length;i++){
            System.out.print(ball[i]);
            if(i<ball.length-1){
                System.out.print(",");
            }
        }
    }
}