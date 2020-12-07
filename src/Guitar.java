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
        /*
        for(int i =0; i <6; i++){
            System.out.println(tensions[i]);
        }

         */
    }
