package br.unip.model.sorters;

public class MergeSorter implements Sorter{

    @Override
    public void sort(Comparable[] items, boolean isReverse) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMethodName() {
	return "Método Merge";
    }

    @Override
    public String getMethodBrief() {
	return "O Merge Sort realiza a operação de ordenação separando os dados"
		+ " originais em pares, ordenando-os, depois junta os pares em "
		+ "estruturas de 4 elementos, e ordena-os novamente, e assim su"
		+ "cessivamente até a estrutura toda estar ordenada";
    }
    
}