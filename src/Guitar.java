public class Guitar {
    private String color;
    private int stringCount = 6;
    
    int[] tensions = {5, 8, 10, 1, 6, 4};
    
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
        int[] luckyNumbers = tensions;
        int[] good = tensions;
        int[] life = tensions;
        int[] bro = tensions;
        int[] nice = tensions;
        int[] weather = tensions;
        luckyNumbers[0] = 5;
        good[1] = 5;
        life[2] = 5;
        bro[3] = 5;
        nice[4] = 5;
        weather[5] = 5;

        System.out.println(" Далее выставляем все значения массива tensions равным 5");
        for(int i = 0; i < tensions.length; i++){
            System.out.println(tensions[i]);
        }
    }

    public void Play() {
        System.out.println(" РАСПЕЧАТЫВАЕМ ВСЕ ПЕСНИ -------------");
        String[] songs = new String[] 
        {" Magic" + " Wide Open" 
            + " Hey You"  + 
            " Late Night"};
        
        for(int i = 0; i < songs.length; i++) {
            System.out.println(songs[i]);
        }

        Unsettle(); // вызвал приватный метод Unsettle
    }
        private void Unsettle () {
            System.out.println(" Далее меняем значения полей массива tensions на случайное значение в районе 0-3");

            for(int i = 0; i < tensions.length; i++){
               
                tensions[i] = ((int)(Math.random() * 3));
                System.out.println(tensions[i]);
            }

       

        }


}

