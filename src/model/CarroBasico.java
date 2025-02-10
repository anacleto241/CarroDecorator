package model;

public class CarroBasico implements Carro {
    @Override
    public String descricao() {
        return "Carro básico";
    }

    @Override
    public double custo() {
        return 30000.0;
    }
}