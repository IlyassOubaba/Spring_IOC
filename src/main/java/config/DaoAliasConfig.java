package config;

import dao.DaoApi;
import dao.DaoFile;
import dao.IDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class DaoAliasConfig {
    // Alias "dao" -> renvoie DaoFile comme implémentation
    @Bean(name = "dao")
    public IDao daoFile(DaoApi target) {
        return target; // alias "dao" -> "daoApi"

    }
}