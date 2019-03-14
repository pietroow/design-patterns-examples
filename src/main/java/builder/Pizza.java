package builder;

public class Pizza {
    private String sabor;
    private String tamanho;
    private Double preco;
    private String tempoDePreparo;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getTempoDePreparo() {
        return tempoDePreparo;
    }

    public void setTempoDePreparo(String tempoDePreparo) {
        this.tempoDePreparo = tempoDePreparo;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "sabor='" + sabor + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", preco=" + preco +
                ", tempoDePreparo='" + tempoDePreparo + '\'' +
                '}';
    }
}

