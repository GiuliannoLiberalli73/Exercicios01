package exerciciosZero.exerciciosZero;

public class Programa {

    public static void main(String[] args) {

        Carro meuCarro;
        meuCarro = new Carro();
        meuCarro.setCor("Preto");
        meuCarro.setModelo("Fiesta");
        meuCarro.setVelocidadeAtual(20);
        meuCarro.setVelocidadeMaxima(80);
        meuCarro.setPrecoVenda(2000);
        meuCarro.setPrecoCusto(1500);

        meuCarro.liga();
        meuCarro.acelera(20);
        System.out.println("Minha atual velocidade e " + meuCarro.getVelocidadeAtual());

        meuCarro.retornaMarchaAtual();
        System.out.println("Minha marcha atual e " + meuCarro.retornaMarchaAtual());

        CarroGNV outCarroGNV = new CarroGNV();
        outCarroGNV.setCor("Azul");
        outCarroGNV.setModelo("Honda");
        outCarroGNV.setVelocidadeAtual(50);
        outCarroGNV.setVelocidadeMaxima(150);
        outCarroGNV.setPrecoCusto(2000);
        outCarroGNV.setPrecoVenda(3200);

        outCarroGNV.liga();
        outCarroGNV.acelera(40);
        System.out.println("Minha atual velocidade e " + outCarroGNV.getVelocidadeAtual());

        meuCarro.venda(30);
        outCarroGNV.venda(20);


    }

}
