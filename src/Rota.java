import javax.swing.*;

public class Rota {
    public void planejarDia() {

        //Variável de consumo do óleo diesel Km/litro.
        float kmLitro = 2.5f;

        //Variável para somar o total de litros de toda rota.
        float quantidadeTotalLitros = 0f;

        //Variável para somar o custo total de diesel.
        float valorCustoTotal = 0f;

        //Variável da soma de km de todas as rotas.
        float quantidadeTotalKm = 0f;

        //Variável para identificar cada ônibus.
        int onibus = 1;

        //Fazer a leitura da quantidade de rotas;
        int quantidadeRotas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de rotas do dia:"));

        //Array para salvar km de cada rota.
        float[] kmRotas = new float[quantidadeRotas];

        //Fazer a leitura de km de cada ônibus.
        for(int i = 0; i < quantidadeRotas; i++) {
            float kmOnibus = Float.parseFloat(JOptionPane.showInputDialog("Digite a km da rota do ônibus " + onibus + ":"));
            kmRotas[i] = kmOnibus;
            onibus++;
        }

        //Calcular a quantidade total de km.
        for(int i = 0; i < kmRotas.length; i++) {
            quantidadeTotalKm += kmRotas[i];
        }

        //Somar a quantidade de litros.
        quantidadeTotalLitros = quantidadeTotalKm / kmLitro;

        //Fazer a litura do valor do óleo diesel.
        float valorDiesel = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço do óleo diesel:"));

        //Somar o custo diário da empresa.
        valorCustoTotal = quantidadeTotalKm * valorDiesel;

        //Mostrar quantidade diária de km por rotas, gasto total de litros e valor do custo da empresa;
        System.out.println("A quantidade total de km do dia: " + quantidadeTotalKm + ".");
        System.out.println("A quantidade de combustível para demanda: " + quantidadeTotalLitros + "litros");
        System.out.println("A quantidade do valor gasto: " + valorCustoTotal + ".");
    }

}
