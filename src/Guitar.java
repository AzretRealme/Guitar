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

    public void tune(int tensions) {
        System.out.println(tensions);
        //this.stringCount -= settings / 1;
    }

    public void Play() {
        System.out.println("Guitar Play " + " Wide open" + " Hey You" + " Late Night" + " Magic");
    }

    public void Unsettle() {
        //tensions[0] = int[0];
        System.out.println(tensions[0]);
    }
}
