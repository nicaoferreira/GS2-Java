package br.fiap.gs.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import java.util.Scanner;

@Profile("dev")
@Component
public class DevCliRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Modo DEV: pressione Enter para continuar o startup...");
            scanner.nextLine();
        } catch (Exception e) {
            System.err.println("Erro no CLI dev: " + e.getMessage());
        }
    }
}
