public class Guitar {
    private String color;
    private int stringCount = 6;
    int[] tensions = new int[6];

    public Guitar(){

    }
    public Guitar(String color, int stringCount){
        this.color = color;
        this.stringCount = stringCount;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setStringCount(int stringCount) {
        this.stringCount = stringCount;

    }

    public int getStringCount() {
        return this.stringCount;
    }

    public int[] getTensions() {
        return tensions;
    }

    public void tune(int[] tensions) {

        System.out.println(" Далее выставляем все значения массива tensions равным 5");
        tensions = new int[]{5, 5, 5, 5, 5, 5};

        /*for(int i =0; i <6; i++){
            System.out.println(tensions[i]);
        }*/


    }

    public void play() {
        System.out.println(" РАСПЕЧАТЫВАЕМ ВСЕ ПЕСНИ ---------------");
        String[] songs = new String[]
                {" Magic" + " Wide Open"
                        +" Hey You" +
                        " Late Night"};
        for(int i = 0; i < songs.length; i++) {
            System.out.println(songs[i]);
        }

        unsettle(); // вызвал приватный метод Unsettle
    }
        private void unsettle () {
            System.out.println(" Далее меняем значения полей массива tensions на случайное значение в районе 0-3");

            for(int i = 0; i < tensions.length; i++){
                tensions[i] = ((int)(Math.random() * 3));
                System.out.println(tensions[i]);
            }

            //System.out.println(Math.random() * tensions[0]);
            //меняем значения полей массива tensions на случайное значение

        }


}
