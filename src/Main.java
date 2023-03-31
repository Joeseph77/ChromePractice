public class Main {
    public static void main(String[] args) {

        BasicStructure audi =new BasicStructure();
        audi.color="balck";
        audi.model="A3";
        audi.power="5000cc";

        Engine X =new Engine();
        X.cylinders="8";
        X.size="1234cc";
        X.weight="6453k";


        color col= new color();
        col.colorLights="True";
        col.colorTyre="false";
        col.colorWindows="True";

        lights neon =new lights();
        neon.color="red";
        neon.size="15cm";
        neon.intensity="7675lumin";

        JoeChrome j=new JoeChrome();
        j.isEv=false;
        j.topSpeed=180;


    }
}