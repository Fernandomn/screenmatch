package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public double converterDolarParaReal(double valorEmReal) {
        return valorEmReal * 5.16; // valor em 28/05/2024
    }
}
