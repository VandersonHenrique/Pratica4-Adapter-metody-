public class BuracoRedondo {
    PinoRedondo pino;
    public BuracoRedondo(AdaptadorPinoQuadrado _pino){
        pino = _pino;
    }
    
    public void VerificaEncaixe(){
        if (pino.getRaio() > 0){
            System.out.println("Encaixou!");
        }
        else{
            System.out.println("Não encaixou!");
        }
    }
}
