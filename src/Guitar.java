public class Guitar {
    private String color;
    private int stringCount = 6;
    private int[] tensions = new int[6];
    //private int settings;

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

        System.out.println(tensions[0]+5);
    }

    public void Play() {
        System.out.println(" Magic ");
        System.out.println(" Wide open");  //распечатываем 4 строки
        System.out.println(" Hey You");
        System.out.println(" Late Night");

        Unsettle(); // вызвал приватный метод Unsettle
    }
        private void Unsettle () {

            System.out.println(Math.random() * tensions[5]);
            //меняем значения полей массива tensions на случайное значение 

        }


}
