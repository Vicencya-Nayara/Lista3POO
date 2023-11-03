package PROGRAMA3;

class Casa {

    public String cor;
    public Porta porta1;
    public Porta porta2;
    public Porta porta3;

    public Casa(String cor) {
        this.cor = cor;
        this.porta1 = new Porta();
        this.porta2 = new Porta();
        this.porta3 = new Porta();
    }

    public void pinta(String cor) {
        this.cor = cor;
    }

    public void abrePorta1() {
        this.porta1.abre();
    }

    public void fechaPorta1() {
        this.porta1.fecha();
    }

    public void abrePorta2() {
        this.porta2.abre();
    }

    public void fechaPorta2() {
        this.porta2.fecha();
    }

    public void abrePorta3() {
        this.porta3.abre();
    }

    public void fechaPorta3() {
        this.porta3.fecha();
    }

    public int quantasPortasEstaoAbertas() {
        int portasAbertas = 0;
        if (this.porta1.estaAberta()) {
            portasAbertas++;
        }
        if (this.porta2.estaAberta()) {
            portasAbertas++;
        }
        if (this.porta3.estaAberta()) {
            portasAbertas++;
        }
        return portasAbertas;
    }
}
