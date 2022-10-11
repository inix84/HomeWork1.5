public class Main {
    public static void main(String[] args) {
        int [] weight = new int [12];
        weight[0]=1;
        weight[1]=2;
        weight[2]=3;
        System.out.println("1 элемент массива = " + weight[0]+" , 2 элемент массива = " + weight[1]+"  , 3 элемент массива = " + weight[2]);

        float [] weight2 = {1.57f, 7.654f, 9.986f};
        System.out.println("1 элемент массива = " + weight2[0]+" , 2 элемент массива = " + weight2[1]+"  , 3 элемент массива = " + weight2[2]);

        boolean [] weight3 = {true, true, false};
        System.out.println("1 элемент массива = " + weight3[0]+" , 2 элемент массива = " + weight3[1]+"  , 3 элемент массива = " + weight3[2]);
    }
}