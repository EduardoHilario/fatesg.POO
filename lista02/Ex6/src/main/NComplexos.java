package main;

public class NComplexos {

    private int parteReal = 0;
    private int parteImag = 0;

    public NComplexos() {
    }

    public NComplexos(int parteReal, int parteImag) {
        this.parteReal = parteReal;
        this.parteImag = parteImag;
    }

    public NComplexos(NComplexos obj) {
        this.parteReal = obj.parteReal;
        this.parteImag = obj.parteImag;
    }

    public void setParteReal(int parteReal) {
        this.parteReal = parteReal;
    }

    public void setParteImag(int parteImag) {
        this.parteImag = parteImag;
    }
    
    

    public String get() {
        return this.parteReal + " + " + this.parteImag + "i";
    }

    public boolean isIguais(NComplexos obj) {
        return (obj.parteReal == this.parteReal) 
                && (obj.parteImag == this.parteImag);
    }

    public NComplexos somar(NComplexos obj) {
        return new NComplexos((this.parteReal + obj.parteReal),
                (this.parteImag + obj.parteImag));
    }

    public NComplexos subtratir(NComplexos obj) {
        return new NComplexos((this.parteReal - obj.parteReal),
                (this.parteImag - obj.parteImag));
    }
    
    public NComplexos multiplique(NComplexos obj){
        return new NComplexos((this.parteReal*obj.parteReal)-(this.parteImag*obj.parteImag),
                (this.parteReal*obj.parteImag)+(this.parteImag*obj.parteReal));
    }
    
    public NComplexos divide(NComplexos obj){
        
        return null;
    }
    

}
