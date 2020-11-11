public class Main {

    public static void main(String[] args){
        Guitar Drake = new Guitar();
        Drake.setColor("black");
        Drake.setStringCount(5);


        Drake.tune(new int[5]); //  выставляет все значения массива tensions равным 5
        Drake.Play();  // также реализовывем приватный метод Unsettle


        System.out.println(Drake.getColor());
        System.out.println(Drake.getStringCount());




    }
}
