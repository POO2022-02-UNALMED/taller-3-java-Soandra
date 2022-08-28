package taller3.televisores;

public class Control {
    private TV tv;

    public Control(TV tv) {
        this.tv = tv;
    }

    public void turnOn(){

    }
    public void turnOff(){

    }

    public void canalUp(){

    }

    public void canalDown(){

    }

    public void volumenUp(){

    }

    public void volumenDown(){

    }

    public void setCanal(int i){

    }

    public void enlazar(TV tv){
        this.tv = tv;
        tv.setControl(this);
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }
}
