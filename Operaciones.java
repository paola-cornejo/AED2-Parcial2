// *** Nombre, apellido y DNI *** //

//package p2; // Modifica por el nombre que corresponda, o copiá todo lo que sigue en una clase que hayas creado en tu IDE

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/*  BORRAR
 * Abrir la clase Operaciones,java o copiar el código en tu IDE y completar donde se indica. 
 * Los requerimientos de cada método se encuentran en comentario antes de la declaración de cada
    método. Modificar solamente donde se pide.
 * 
 */



public class Operaciones {
    public static void main (String [ ] args) { 
        
        Operaciones o = new Operaciones();

        /*
        //firstElement
        List<String> padres = new ArrayList<>();
        
        padres.add("Rodrigo");        
        padres.add("Paola");

        List<String> hijos = new ArrayList<>();
        hijos.add("Teo");
        hijos.add("Gonzalo");        

        List<List<String>> listaDeListas = new ArrayList<>();
        
        listaDeListas.add(padres);        
        listaDeListas.add(hijos);
        
        System.out.println(o.firstElement(listaDeListas));
        */

        /*
        //listSize
        List<String> padres = new ArrayList<>();
        
        padres.add("Rodrigo");        
        padres.add("Paola");

        List<String> hijos = new ArrayList<>();
        hijos.add("Teo");
        hijos.add("Gonzalo");        
        hijos.add("Thiago");     

        List<List<String>> listaDeListas = new ArrayList<>();
        listaDeListas.add(hijos);
        listaDeListas.add(padres);
        
        System.out.println(o.listSize(listaDeListas));
        */

        
        // sizeAndDelete
        /*
        Map<String, String> mapa = new HashMap<>();
        mapa.put("1","cba");
        mapa.put("2","bs");
        mapa.put("3","mendoza");
        mapa.put("4","la rioja");
        System.out.println(mapa.size());
        o.sizeAndDelete(mapa);
        System.out.println(mapa.size());
        */

         // sizeAndDelete
        /* 
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1,"cba");
        mapa.put(2,"bs");
        mapa.put(3,"mendoza");
        mapa.put(4,"la rioja");
        */
        
        //o.inputStream("c:\\a.txt");
        //System.out.println(o.firstElement(listaDeListas));
        


    }

    
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
        
        // Completá aca
        int tam = listaDeListas.get(1).size();
        // Si no podes resolverlo descomentá y deja solo la siguiente linea: 
         return tam;

    }

    /**
     * Este método toma un mapa <String, String> como parámetro. Si el tamaño del mapa es igual o mayor a
     * 10, entonces debe eliminar todas las entradas (elementos) de ese mapa, de lo contrario no se debe
     * modificar el mapa.
     **/
    public void sizeAndDelete(Map<String, String> mapa) {

        // Completá aca
        if (mapa.size() >= 10)
        {
            mapa.clear();
        }
        // Si no podes resolverlo dejá el método vacio

    }

    /**
     * Este método toma un mapa <Integer, String> como parámetro. Si el mapa no contiene TU DNI como llave,
     * entonces se debe agregar la entrada < TU DNI (Llave, Integer), Tu nombre (Valor, String) > Si el mapa
     * contiene tu DNI, entonces debes borrar esa entrada (llave, valor) del mapa.
     **/
    public void addAlumno(Map<Integer, String> mapa) {

        // Completá aca
        if (mapa.containsKey(27671905))
        {
            mapa.remove(27671905);
        }
        else
        {
            mapa.put(27671905, "Paola Cornejo");
        }
        // Si no podes resolverlo dejá el método vacio

    }


    /**
     * Este método tomará un LinkedHashMap <String, String> como parámetro y
     * devuelve una lista (ArrayList) conteniendo todas las llaves del mapa
     **/
    public List<String> llaves(Map<String, String> mapa) {
        
        // Completá aca        
         return new ArrayList<>(mapa.keySet());

    }

    /**
     * Este método toma un mapa <String, Double> como parámetro y devuelve la suma de todos los valores
     * contenidos en el mapa, o 0 si el mapa esta vacío
     **/
    public double sumarValores(Map<String, Double> mapa) {

        // Completá aca
        double suma = 0;
        for (double item : mapa.values()) {
            suma += item;
        }
        // Si no podes resolverlo descomentá y deja solo la siguiente linea: 
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

        // Completá aca
         return fis;
    }

    /**
     * Este método toma la ruta de un archivo (String) y devuelve un objeto FileWriter inicializado con
     * dicha ruta
     **/
    public FileWriter writer(String ruta) throws IOException {
        
        FileWriter fi = null;
        // Completá aca
        try {
            fi = new FileWriter(new File(ruta));
        } catch (Exception e) {
            throw e;
        }

        // Si no podes resolverlo descomentá y deja solo la siguiente linea: 
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

        // Completá aca

        // Si no podes resolverlo dejá el método vacio

    }

}
