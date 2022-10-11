public class Main {
    public static void main(String[] args) {
        int [] weight = new int [12];
        weight[0]=1;
        weight[1]=2;
        weight[2]=3;
        System.out.println(weight[2]+" ,  " + weight[1]+"  ,  " + weight[0]);

        float [] weight2 = {1.57f, 7.654f, 9.986f};
        System.out.println( weight2[2]+" ,  " + weight2[1]+"  ,  " + weight2[0]);

        boolean [] weight3 = {true, true, false};
        System.out.println( weight3[2]+" , " + weight3[1]+"  ,  " + weight3[0]);
    }
}