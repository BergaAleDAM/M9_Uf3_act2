package m9_url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Actividad1 {

    public void ejemploURL() {
        try {
            URL url = new URL("http://www.google.es");

            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String linea;
            //System.out.println(url.getHost());
            //System.out.println(url.getPath());
            System.out.println(url.getRef());
            //while ((linea = in.readLine()) != null) {
            //   System.out.println(linea);
            //}
        } catch (MalformedURLException mue) {
            System.out.println("URL no válida");
        } catch (IOException ioe) {
            System.out.println("Error en la comunicasion");
        }

    }

    public void hacerURL() {

        try {
            URL ejemplo = new URL("http://www.elcountry.es:80/jandepore?cosa=0&coso=2/paella.pdf");
            System.out.println("La informacion de la url : " + ejemplo);
            infoURL(ejemplo);

        } catch (MalformedURLException ex) {
            Logger.getLogger(Actividad1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void infoURL(URL ejemplo) {

        System.out.println("Protocolo ->" + ejemplo.getProtocol());
        System.out.println("Autoridad ->" + ejemplo.getAuthority());
        System.out.println("Host ->" + ejemplo.getHost());
        System.out.println("Port ->" + ejemplo.getPort());
        System.out.println("Path ->" + ejemplo.getPath());
        System.out.println("Query ->" + ejemplo.getQuery());
        System.out.println("Filename ->" + ejemplo.getFile());
        System.out.println("Refencia ->" + ejemplo.getRef());
    }

    public void infoURLOpenStream(URL url) {

        BufferedReader in;
        try {
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);

            }
            in.close();
        } catch (IOException ex) {
            Logger.getLogger(Actividad1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void comunicacionsURL(URL url) {

        
            try {
               URLConnection myURLConnection = url.openConnection();
               myURLConnection.connect();
            } catch (IOException ex) {
                Logger.getLogger(Actividad1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
       

    }
    
    public void imprimirPartesDeWeb(URL url , String etiqueta){
        
        comunicacionsURL(url);
        
        
       BufferedReader in;
        try {
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            while (((inputLine = in.readLine()) != null) && inputLine.contains(etiqueta)) {
                System.out.println(inputLine);

            }
            in.close();
        } catch (IOException ex) {
            Logger.getLogger(Actividad1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }

}
