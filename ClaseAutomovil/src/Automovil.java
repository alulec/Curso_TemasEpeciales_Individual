public class Automovil {
    private String modelo;
    private String anio;
    private String color;
    private String serieMotor;

    public Automovil(String modelo, String anio, String color, String serieMotor){
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.serieMotor = serieMotor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getSerieMotor() {
        return serieMotor;
    }

    public void setSerieMotor(String serieMotor) {
        this.serieMotor = serieMotor;
    }

    public void Encender(){
        System.out.println("El auto ya encendio");
    }
    public void Avanzar(int num){
        System.out.println("El automovil avanzo " + num + " km");
    }
}
