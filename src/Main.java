public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

    }
    public static void task1(){
        System.out.println("Задание номер 1");
        int[] arrays = new int[3];
        arrays[0]=1;
        arrays[1]=2;
        arrays[2]=3;

        float[]arrays1={1.57f, 7.654f, 9.986f};

        int[] random = new int[4];
        random[0]=435;
        random[1]=5462;
        random[2]=1;
        random[3]=2483792;
    }
    public static void task2() {
        System.out.println("Задание номер 2");
        int[] arrays = new int[3];
        arrays[0] = 1;
        arrays[1] = 2;
        arrays[2] = 3;

        System.out.println(arrays[0]+", "+arrays[1]+", "+arrays[2]);

        float[] arrays1 = {1.57f, 7.654f, 9.986f};

        System.out.println(arrays1[0]+", "+arrays1[1]+", "+arrays1[2]);
    }
    public static void task3(){
        System.out.println("Задание номер 3");
        int[] arrays = new int[3];
        arrays[0]=1;
        arrays[1]=2;
        arrays[2]=3;

        System.out.println(arrays[2]+", "+arrays[1]+", "+arrays[0]);

        float[]arrays1={1.57f, 7.654f, 9.986f};

        System.out.println(arrays1[2]+", "+arrays1[1]+", "+arrays1[0]);

    }
    public static void task4(){
        System.out.println("Задание номер 4");
        int[] arrays = new int[3];
        arrays[0]=1;
        arrays[1]=2;
        arrays[2]=3;
        for(int i =0;i<arrays.length;i=i+1){
            if(arrays[i]%2 !=0){
                arrays[i]+=1;
                System.out.print(arrays[i]);
            }



        }

    }
}