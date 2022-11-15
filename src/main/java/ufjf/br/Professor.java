package ufjf.br;

public class Professor {

    private String nome;
    private Cidade cidadeResidencia;

    public Professor(String nome, Cidade cidadeResidencia) {
        this.nome = nome;
        this.cidadeResidencia = cidadeResidencia;
    }

    public String obterProfessor() {
        return "Professor{" +
                "nome='" + this.nome + '\'' +
                ", cidade='" + cidadeResidencia.getNome() + '\'' +
                ", uf='" + cidadeResidencia.getUf() + '\'' +
                '}';
    }
}
