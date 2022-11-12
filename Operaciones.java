// *** Nombre, apellido y DNI *** //

//package p2; // Modifica por el nombre que corresponda, o copiá todo lo que sigue en una clase que hayas creado en tu IDE

import java.io.*;
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

        // Si no podes resolverlo descomentá y deja solo la siguiente linea: 
        // return "";

    }

    /**
     * Este método toma una lista de listas de Strings y devuelve el tamaño de la SEGUNDA lista (index 1)
     * de las listas pasadas como parametro
     **/
    public int listSize(List<List<String>> listaDeListas) {
        
        // Completá aca

        // Si no podes resolverlo descomentá y deja solo la siguiente linea: 
        // return -1;

    }

    /**
     * Este método toma un mapa <String, String> como parámetro. Si el tamaño del mapa es igual o mayor a
     * 10, entonces debe eliminar todas las entradas (elementos) de ese mapa, de lo contrario no se debe
     * modificar el mapa.
     **/
    public void sizeAndDelete(Map<String, String> mapa) {

        // Completá aca

        // Si no podes resolverlo dejá el método vacio

    }

    /**
     * Este método toma un mapa <Integer, String> como parámetro. Si el mapa no contiene TU DNI como llave,
     * entonces se debe agregar la entrada < TU DNI (Llave, Integer), Tu nombre (Valor, String) > Si el mapa
     * contiene tu DNI, entonces debes borrar esa entrada (llave, valor) del mapa.
     **/
    public void addAlumno(Map<Integer, String> mapa) {

        // Completá aca

        // Si no podes resolverlo dejá el método vacio

    }


    /**
     * Este método tomará un LinkedHashMap <String, String> como parámetro y
     * devuelve una lista (ArrayList) conteniendo todas las llaves del mapa
     **/
    public List<String> llaves(Map<String, String> mapa) {
        
        // Completá aca

        // Si no podes resolverlo descomentá y deja solo la siguiente linea: 
        // return new ArrayList<>();

    }

    /**
     * Este método toma un mapa <String, Double> como parámetro y devuelve la suma de todos los valores
     * contenidos en el mapa, o 0 si el mapa esta vacío
     **/
    public double sumarValores(Map<String, Double> mapa) {

        // Completá aca

        // Si no podes resolverlo descomentá y deja solo la siguiente linea: 
        // return -1.0;

    }

    /**
     * Este método toma la ruta de un archivo (String) y devuelve un objeto FileInputStream inicializado con
     * dicha ruta
     **/
    public FileInputStream inputStream(String ruta) throws FileNotFoundException {
        
        // Completá aca

        // Si no podes resolverlo descomentá y deja solo la siguiente linea: 
        // return null;
    }

    /**
     * Este método toma la ruta de un archivo (String) y devuelve un objeto FileWriter inicializado con
     * dicha ruta
     **/
    public FileWriter writer(String ruta) throws IOException {
        
        // Completá aca

        // Si no podes resolverlo descomentá y deja solo la siguiente linea: 
        // return null;
    }

    /**
     * Este método toma la ruta de un archivo (String) y devuelve un valor True si el archivo existe o
     * False si el archivo no existe
     **/
    public boolean reader(String ruta) {

        // Completá aca

        // Si no podes resolverlo descomentá y deja solo la siguiente linea: 
        // return true;

    }

    /**
     * Este método toma la ruta de un archivo (String) guarda en el mismo la frase "Hola Mundo!"
     **/
    public void writeHelloWorld(String ruta) {

        // Completá aca

        // Si no podes resolverlo dejá el método vacio

    }

}
