package br.fiap.gs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        try {
            SpringApplication.run(Application.class, args);
            log.info("Aplicação iniciada com sucesso.");
        } catch (Exception ex) {
            log.error("Erro ao iniciar a aplicação: ", ex);
        }
    }
}
