package ufjf.br;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private List<Professor> professores = new ArrayList<>();

    public void contratar(String nomeProfessor, String nomeCidade, String uf) {
        Cidade cidade = CidadeFactory.getCidade(nomeCidade, uf);
        Professor professor = new Professor(nomeProfessor, cidade);
        professores.add(professor);
    }

    public List<String> obterFuncionarios() {
        List<String> saida = new ArrayList<String>();
        for (Professor professor : this.professores) {
            saida.add(professor.obterProfessor());
        }
        return saida;
    }
}
