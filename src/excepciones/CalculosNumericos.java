package excepciones;

public class CalculosNumericos {
	
    public static double calcularRaizCuadrada(double valor) throws ArithmeticException {
        if(valor < 0) {
            throw new ArithmeticException("No es posible calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(valor);
    }
    
    public double calcularPendienteRecta(double x1, double y1, double x2, double y2) {
    	if(x1 == x2) throw new ArithmeticException("x1 y x2 no pueden ser iguales ya que producen una division por cero.");
    	return (y2 - y1)/(x2 - x1);
    }
    
    
    public double calcularPuntoMedioRecta(double x1, double y1, double x2, double y2) throws IllegalArgumentException{
    	try {
    		if (x1 == x2 && y1 == y2) {
    			throw new IllegalArgumentException("no es posible calcular el punto medio ya que los puntos dados son iguales.");
    		}
    		return ((x1 + x2)/2) +  ((y1 + y2)/2);
    	}catch (IllegalArgumentException e){
    		throw new IllegalArgumentException("Ha ocurrido un error al calcular el punto medio de la recta." + e);
    	}
    }
    
    public double[] calcularRaicesEcuacionCuadratica(double a, double b, double c) throws ArithmeticException{
    	try {
        	double discriminante = (b*b) - (4*a*c); 
        	if(discriminante < 0) throw new ArithmeticException("La ecuación no tiene soluciones reales.");
        	if(a == 0) throw new ArithmeticException("'a' no puede ser cero, no es posible realizar la divición por cero.");
            
        	double x1 = (-b + Math.sqrt(discriminante)) / (2*a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2*a);
            double[] raices = {x1, x2};
            
            return raices;
    	}catch(ArithmeticException e) {
    		System.out.println("Error: " + e.getMessage());
    	}
		return null;

    }
    
 
    public String cambiarBase(int numero, int base) {
        if (numero == 0) {
            return "";
        }
        if (base < 2) {
            throw new IllegalArgumentException("La base debe ser mayor o igual a 2");
        }
    	String resultado = "";
    	int residuo = numero % base;
    	
        resultado = cambiarBase(numero / base, base); //llamado recursivo
        
        if (residuo < 10) {
        	resultado += residuo;
        } else {
        	resultado += (char) (residuo + 55); //transforma el número a ASCII y luego a carácter
        }
        return resultado;
    }  
    
}
