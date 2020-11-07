public class Main {

    public static void main(String[] args){
        Guitar Drake = new Guitar();
        Drake.setColor("black");
        Drake.setStringCount(5);
        
        Drake.tune(5);
        Drake.Play();
        
        System.out.println(Drake.getColor());
        System.out.println(Drake.getStringCount());
        
        Drake.Unsettle();


    }
}
