package ufjf.br;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FaculdadeTest {
    @Test
    void deveRetornarProfessores() {
        Faculdade faculdade = new Faculdade();
        faculdade.contratar("Graça", "Juiz de Fora", "MG");
        faculdade.contratar("Mercedes", "Juiz de Fora", "MG");
        faculdade.contratar("Leopolda", "São Paulo", "SP");

        List<String> saida = Arrays.asList(
                "Professor{nome='Graça', cidade='Juiz de Fora', uf='MG'}",
                "Professor{nome='Mercedes', cidade='Juiz de Fora', uf='MG'}",
                "Professor{nome='Leopolda', cidade='São Paulo', uf='SP'}");

        assertEquals(saida, faculdade.obterFuncionarios());
    }

    @Test
    void deveRetornarTotalCidades() {
        Faculdade faculdade = new Faculdade();
        faculdade.contratar("Graça", "Juiz de Fora", "MG");
        faculdade.contratar("Mercedes", "Juiz de Fora", "MG");
        faculdade.contratar("Leopolda", "Cabo Frio", "RJ");

        assertEquals(2, CidadeFactory.getTotalCidades());
    }

}