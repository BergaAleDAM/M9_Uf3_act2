package m9_url;

import java.net.MalformedURLException;
import java.net.URL;

public class M9_URL {

    public static void main(String[] args) throws MalformedURLException {
        
        
        
        
        Actividad1 a1 = new Actividad1();
        
        //a1.hacerURL();
        URL url = new URL("http://www.elpais.com/");
       //a1.infoURLOpenStream(url);
        a1.comunicacionsURL(url);
        a1.imprimirPartesDeWeb(url, "<ul>");
        
    }

}
