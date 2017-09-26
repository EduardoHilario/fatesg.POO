package model;

/**
 * Prova N2 - Programação Orientada a Objeto ADS 2º Período
 *
 * @author Eduardo Henrique Hilario Ribeiro
 *
 */
public class Cooperado {

    private String nome;
    private String profissao;
    private int horasTrabalhadas = 0;
    private double valorHora = 0.0;

    public Cooperado() {
    }

    public Cooperado(String nome, String profissao, int horasTrabalhadas, double valorHora) throws Exception {
        this.nome = nome;
        this.profissao = profissao;
        this.valorHora = valorHora;
        setHorasTrabalhadas(horasTrabalhadas);

    }

    public Cooperado(Cooperado obj) throws Exception {
        this.nome = obj.nome;
        this.profissao = obj.profissao;
        setHorasTrabalhadas(obj.horasTrabalhadas);
        this.valorHora = obj.horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) throws Exception {
        if (horasTrabalhadas < 160) {
            throw new Exception("Valor não pode ser inferior a 160 horas");
        }
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double calculeSalarioLiquido() throws Exception {
        return horasTrabalhadas * valorHora + calculeBonificacao();
    }

    public double calculeBonificacao() throws Exception {
        double bofinicacao = horasTrabalhadas * valorHora;
        switch (profissao) {
            case "advogado":
            case "engenheiro":
            case "medico":
                if (horasTrabalhadas > 500) {
                    return bofinicacao * 25 / 100;
                } else if (horasTrabalhadas >= 300) {
                    return bofinicacao * 20 / 100;
                } else {
                    return 0.0;
                }
            case "enfermeiro":
            case "dentista":
                if (horasTrabalhadas > 400) {
                    return bofinicacao * 23 / 100;
                } else if (horasTrabalhadas >= 250) {
                    return bofinicacao * 19 / 100;
                } else {
                    return 0.0;
                }
            default:
                throw new Exception("Não existe esta profissao");

        }
    }

    public double calculeContribuicaoDoCooperado() throws Exception, Exception {
        switch (profissao) {
            case "advogado":
                return calculeSalarioLiquido() * 10 / 100;
            case "engenheiro":
                return calculeSalarioLiquido() * 9 / 100;
            case "medico":
                return calculeSalarioLiquido() * 11 / 100;
            case "enfermeiro":
                return calculeSalarioLiquido() * 7 / 100;
            case "dentista":
                return calculeSalarioLiquido() * 8 / 100;
            default:
                throw new Exception("Não existe esta profissao");
        }
    }

    public double calculeSalarioFinal() throws Exception, Exception {
        return calculeSalarioLiquido() - calculeContribuicaoDoCooperado();
    }

}
