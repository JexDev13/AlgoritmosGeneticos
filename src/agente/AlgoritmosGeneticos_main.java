package agente;

/**
 *
 * @author Isma2
 */
public class AlgoritmosGeneticos_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Genetica gen = new Genetica();
        int poblacion = 5;
        int longCrom = 12;
        int iteraccion = 5;
        int evoluciones = 10;
        gen.evolucionar(gen.get_Poblacion(gen.configuracionAG(poblacion, longCrom)), evoluciones, iteraccion);
    }
    
}
