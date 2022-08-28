package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTv;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public void turnOn(){
        estado = true;
    }

    public void turnOff(){
        estado = false;
    }

    public boolean getEstado() {
        return estado;
    }

    public static int getNumTv() {
        return numTv;
    }

    public static void setNumTv(int numTv) {
        TV.numTv = numTv;
    }

    public void canalUp(){
        if (estado && canal >= 1 && canal < 120){
            canal++;
        }
    }

    public void canalDown() {
        if (estado && canal > 1 && canal <= 120) {
            canal--;
        }
    }

    public void volumenUp(){
        if (estado && volumen >= 0 && volumen < 7){
            volumen++;
        }
    }

    public void volumenDown(){
        if (estado && volumen > 0 && volumen <= 7){
            volumen--;
        }
    }
}
