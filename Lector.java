public class Lector{

    private String ruta;
    private int dni = 27671905;
    
    public String getRuta(){
        return ruta;
    }

    public void setRuta(String _ruta){
        ruta = _ruta;
    }

    public int getDni(){
        return dni;
    }

    public void setDni(int _dni){
        dni  = _dni;
    }
 
    public Lector(String pRuta){
        ruta = pRuta;
    }

    /*Programaremos un método público llamado leerLinea que tomará un valor entero (int) como
    parámetro y devolverá un String. Este método abrirá el archivo que se encuentra en la ruta
    almacenada en la variable ruta y devolverá la línea de texto en el número pasado como
    parámetro. Ejemplo: si se pide la línea número 0, se devolverá la primera línea del archivo. Si
    se pide la línea 3 se devolverá la 4ta línea del archivo - contamos desde el 0 -. */
    public String leerLinea(int p){
        return "";

    }

    public static void main (String [ ] args) {         
        //Aquí las instrucciones del método
        System.out.println("Probar aca");
    }
}