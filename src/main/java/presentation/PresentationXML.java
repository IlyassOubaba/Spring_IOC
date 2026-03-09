package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationXML {
    public static void main(String[] args) {

        // Chargement du contexte Spring à partir du fichier XML
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // La récupération du bean metier
        IMetier metier = (IMetier) context.getBean("metier");

        // L'exéution et l'affichage du résultat

        System.out.println(" Result (XML) = " + metier.calculate());
    }
}