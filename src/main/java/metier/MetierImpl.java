package metier;


import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    @Autowired
    @Qualifier("dao2")  // Pour spécifier quel implémentation du IDao on va utiliser
    private IDao dao;

    @Override
    public double calculate() {
        return dao.getValue() * 3;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}