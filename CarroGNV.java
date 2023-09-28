package exerciciosZero.exerciciosZero;

public class CarroGNV extends Carro {

    private String cor;
    private String modelo;
    private double velocidadeAtual;
    private double velocidadeMaxima;
    private int tanque;
    private double precoCusto;
    private int qtdeCilindros;
    private String autorizacaoINMETRO;
    private double precoVenda;
    private double percVenda;


    /**void liga() {
        System.out.println("Carro ligado!");
    }*/

    

    /**
     * @return String return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return String return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return double return the velocidadeAtual
     */
    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    /**
     * @param velocidadeAtual the velocidadeAtual to set
     */
    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    /**
     * @return double return the velocidadeMaxima
     */
    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    /**
     * @param velocidadeMaxima the velocidadeMaxima to set
     */
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    /**
     * @return int return the tanque
     */
    public int getTanque() {
        return tanque;
    }

    /**
     * @param tanque the tanque to set
     */
    public void setTanque(int tanque) {
        this.tanque = tanque;
    }

    /**
     * @return double return the precoCusto
     */
    public double getPrecoCusto() {
        return precoCusto;
    }

    /**
     * @param precoCusto the precoCusto to set
     */
    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    /**
     * @return int return the qtdeCilindros
     */
    public int getQtdeCilindros() {
        return qtdeCilindros;
    }

    /**
     * @param qtdeCilindros the qtdeCilindros to set
     */
    public void setQtdeCilindros(int qtdeCilindros) {
        this.qtdeCilindros = qtdeCilindros;
    }

    /**
     * @return String return the autorizacaoINMETRO
     */
    public String getAutorizacaoINMETRO() {
        return autorizacaoINMETRO;
    }

    /**
     * @param autorizacaoINMETRO the autorizacaoINMETRO to set
     */
    public void setAutorizacaoINMETRO(String autorizacaoINMETRO) {
        this.autorizacaoINMETRO = autorizacaoINMETRO;
    }


    /**
     * @return double return the precoVenda
     */
    public double getPrecoVenda() {
        return precoVenda;
    }

    /**
     * @param precoVenda the precoVenda to set
     */
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    /**
     * @return double return the percVenda
     */
    public double getPercVenda() {
        return percVenda;
    }

    /**
     * @param percVenda the percVenda to set
     */
    public void setPercVenda(double percVenda) {
        this.percVenda = percVenda;
    }

}
