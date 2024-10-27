public class AdaptadorPinoQuadrado implements PinoRedondo {
    PinoQuadrado pinoquadrado;
    public AdaptadorPinoQuadrado(PinoQuadrado _pinoquadrado){
        pinoquadrado = _pinoquadrado;
    }
    
    @Override
    public double getRaio(){
        return (pinoquadrado.getLargura() * Math.sqrt(2))/2;
    }
}
