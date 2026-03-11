package metier;


import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("metier")

public class MetierImpl implements IMetier {

    @PostConstruct
    private void init() {
        System.out.println("[TRACE] DAO injecté = " + dao.getClass().getSimpleName());
    }

    @Autowired

    private IDao dao;

    @Override
    public double calculate() {
        return dao.getValue() * 2;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}