package model;

/**
 *
 * @author eduardohilario
 */
public class Piramide extends Figura{
    
    private float base;
    private float altura;

    public float getBase() {
        return base;
    }

    public void setBase(float base) throws Exception {
        if(base < 0) throw new Exception();
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception {
        if(altura < 0) throw new Exception();
        this.altura = altura;
    }
    
    public float calculeVolume(){
        return (float)(1.0/3 * getBase() * getAltura());
    }
    
    @Override
    public String calculosToString(){
        return "Volume: " + calculeVolume();
                
    }
}
