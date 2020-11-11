public class Main {

    public static void main(String[] args){
        Guitar Drake = new Guitar();
        Drake.setColor("black");
        Drake.setStringCount(5);


        Drake.tune(new int[6]); //  выставляет все значения массива tensions равным 5
        Drake.Play();  // также реализовывем приватный метод Unsettle

        System.out.println(" Цвет Гитары");
        System.out.println(Drake.getColor());
        System.out.println(" Количество Струн");
        System.out.println(Drake.getStringCount());




    }
}
