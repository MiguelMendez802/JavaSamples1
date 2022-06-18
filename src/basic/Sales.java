package basic;

/**
 *
 * @author Miguel
 */
public class Sales {
   
    /*
    Escribe un algoritmo que determine el valor total con IVA (19%)
    de una venta, si esta es mayor a 150.000 aplicar un descuento
    del 5% (antes de aplicar el IVA)
    */
    
    public static double sellProduct( int productValue ){        
        final float IVA = 1.19f;
        
        if ( productValue > 150000 ){
            productValue *= 0.95;
        }
        
        double finalValue = productValue * IVA;
        return finalValue;
    }
    
}
