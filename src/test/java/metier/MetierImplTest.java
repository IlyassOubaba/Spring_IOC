package metier;


import dao.IDao;
import org.junit.Assert;
import org.junit.Test;

public class MetierImplTest {

    @Test
    public void testCalcul() {

        // La création d'une implémentation fictive de IDao pour le test
        IDao dao = new IDao() {
            @Override
            public double getValue() {
                return 25.0;
            }
        };

        // Création de l'instance de MetierImpl et injection manuelle de la dépendance

        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);

        // Vérification que le calcul donne le résultat attendu

        double result = metier.calculate();
        Assert.assertEquals(30.0, result, 0.001);  // 10.0 * 2 = 30.0
    }
}