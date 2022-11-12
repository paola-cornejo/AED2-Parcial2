// PAOLA ANDREA CORNEJO 27671905 //

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

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
    public String leerLinea(int nroLinea) {
        
        //nro lineas menor a 0
        if (nroLinea< 0)
            return "error";
        
        //archivo existe
        File f = null;
        try {
            f = new File(ruta);    
            if(!f.exists())
                return "error";
        } catch (Exception e) {
            return "error";
        }      
        //busco la linea
        String res = "";
        try {
            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);
            String s;
            int lineaActual = 0;
            while ((s = br.readLine()) != null) {                
                // Lee líneas del archivo y los despliega en la pantalla.
                if (lineaActual == nroLinea){
                    res = s;
                    break;
                }
                lineaActual++;
            }        

            fr.close();
        } catch (Exception e) {            
            return "error";
        }

        if (res == ""){            
            return "error";
        }
        return res;
    }
    /*
    Programaremos un método público llamado leerLineas que tomará un array de enteros (int[])
    como parámetro y devolverá un Mapa con llaves de tipo Integer y valores de tipo String
    (Map<Integer, String>). El método leerá los números de líneas contenidas en el array y las
    almacenará en el mapa de modo que el número de línea es la llave y la línea leída es el valor.
    */
    public Map<Integer,String> leerLineas(int[] nroLineas){
        Map<Integer,String> mapa = new HashMap<>();

        for (int nroLinea : nroLineas) {
            String val = leerLinea(nroLinea);
            mapa.put(nroLinea, val);
        }
        
        return mapa;
    }
    
}