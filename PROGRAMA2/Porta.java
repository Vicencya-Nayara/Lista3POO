package PROGRAMA2;

class Porta {
    private boolean aberta;
    String cor;
    int dimensaoX;
    int dimensaoY;
    int dimensaoZ;

    public Porta(boolean aberta, String cor, int dimensaoX, int dimensaoY, int dimensaoZ) {
        this.aberta = aberta;
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
    }

    public void abre() {
        this.aberta = true;
    }

    public void fecha() {
        this.aberta = false;
    }

    public void pinta(String cor) {
        this.cor = cor;
    }

    public boolean estaAberta() {
        return aberta;
    }
}

