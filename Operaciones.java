// PAOLA ANDREA CORNEJO 27671905 //

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Operaciones { 

    
    /**
     * Este método toma una lista de listas de Strings y devuelve el primer elemento (index 0) de la primer
     * lista de las listas pasadas como parametros
     **/
    public String firstElement(List<List<String>> listaDeListas) {
        
        // Completá aca
        String primerElemento = listaDeListas.get(0).get(0);
        // Si no podes resolverlo descomentá y deja solo la siguiente linea: .
        return primerElemento;

    }

    /**
     * Este método toma una lista de listas de Strings y devuelve el tamaño de la SEGUNDA lista (index 1)
     * de las listas pasadas como parametro
     **/
    public int listSize(List<List<String>> listaDeListas) {        
        
        int tam = listaDeListas.get(1).size();        
        return tam;

    }

    /**
     * Este método toma un mapa <String, String> como parámetro. Si el tamaño del mapa es igual o mayor a
     * 10, entonces debe eliminar todas las entradas (elementos) de ese mapa, de lo contrario no se debe
     * modificar el mapa.
     **/
    public void sizeAndDelete(Map<String, String> mapa) {
        
        if (mapa.size() >= 10)
        {
            mapa.clear();
        }

    }

    /**
     * Este método toma un mapa <Integer, String> como parámetro. Si el mapa no contiene TU DNI como llave,
     * entonces se debe agregar la entrada < TU DNI (Llave, Integer), Tu nombre (Valor, String) > Si el mapa
     * contiene tu DNI, entonces debes borrar esa entrada (llave, valor) del mapa.
     **/
    public void addAlumno(Map<Integer, String> mapa) {
        
        if (mapa.containsKey(27671905))
        {
            mapa.remove(27671905);
        }
        else
        {
            mapa.put(27671905, "Paola Cornejo");
        }       

    }


    /**
     * Este método tomará un LinkedHashMap <String, String> como parámetro y
     * devuelve una lista (ArrayList) conteniendo todas las llaves del mapa
     **/
    public List<String> llaves(Map<String, String> mapa) {        
        
         return new ArrayList<>(mapa.keySet());

    }

    /**
     * Este método toma un mapa <String, Double> como parámetro y devuelve la suma de todos los valores
     * contenidos en el mapa, o 0 si el mapa esta vacío
     **/
    public double sumarValores(Map<String, Double> mapa) {
        
        double suma = 0;
        for (double item : mapa.values()) {
            suma += item;
        }
        
         return suma;
    }

    /**
     * Este método toma la ruta de un archivo (String) y devuelve un objeto 
     * FileInputStream inicializado con
     * dicha ruta
     **/
    public FileInputStream inputStream(String ruta) throws FileNotFoundException {
        
        FileInputStream fis = null;
        try {
            File f = new File(ruta);
            fis = new FileInputStream(f);    
        } catch (Exception e) {
            throw e;
        }       

         return fis;
    }

    /**
     * Este método toma la ruta de un archivo (String) y devuelve un objeto FileWriter inicializado con
     * dicha ruta
     **/
    public FileWriter writer(String ruta) throws IOException {
        
        FileWriter fi = null;
        
        try {
            fi = new FileWriter(new File(ruta));
        } catch (Exception e) {
            throw e;
        }
        
         return fi;
    }

    /**
     * Este método toma la ruta de un archivo (String) y devuelve un valor True si el archivo existe o
     * False si el archivo no existe
     **/
    public boolean reader(String ruta) {

        File f = null;
        try {
            f = new File(ruta);            
        } catch (Exception e) {
            throw e;
        }        
        return f.exists();
    }

    /**
     * Este método toma la ruta de un archivo (String) guarda en el mismo la frase "Hola Mundo!"
     **/
    public void writeHelloWorld(String ruta) {

        FileWriter fw ;
        BufferedWriter bw ;
        try {
            fw = new FileWriter(ruta, true);    
            bw = new BufferedWriter(fw);
            bw.write("Hola Mundo!");                        
            bw.close();    
        } catch (IOException e) {
            return;
        }
    }

}
