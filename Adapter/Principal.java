public class Principal {
    public static void main(String[] args){
        PinoQuadrado pino = new PinoQuadrado(2.5);
        AdaptadorPinoQuadrado adapta = new AdaptadorPinoQuadrado(pino);
        BuracoRedondo redondo = new BuracoRedondo(adapta);

        redondo.VerificaEncaixe();
        
    }
}
