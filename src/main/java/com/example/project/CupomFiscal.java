package com.example.project;

public class CupomFiscal {

	public static String NOME_LOJA = "Arcos Dourados Com. de Alimentos LTDA";
	public static String LOGRADOURO = "Av. Projetada Leste";
	public static int NUMERO = 500;
	public static String COMPLEMENTO = "EUC F32/33/34";
	public static String BAIRRO = "Br. Sta Genebra";
	public static String MUNICIPIO = "Campinas";
	public static String ESTADO = "SP";
	public static String CEP = "13080-395";
	public static String TELEFONE = "(19) 3756-7408";
	public static String OBSERVACAO = "Loja 1317 (PDP)";
	public static String CNPJ = "42.591.651/0797-34";
	public static String INSCRICAO_ESTADUAL = "244.898.500.113";

	public static String Spacer = System.lineSeparator();

	public static void main(final String[] args) {
		String typewriter = NOME_LOJA + Spacer;
		typewriter += LOGRADOURO + ", " + NUMERO + " " + COMPLEMENTO + Spacer;
		typewriter += BAIRRO +" - " + MUNICIPIO + " - " + ESTADO + Spacer;
		typewriter += "CEP:" + CEP + " Tel " + TELEFONE + Spacer;
		typewriter += OBSERVACAO + Spacer;
		typewriter += "CNPJ: " + CNPJ + Spacer;
		typewriter += "IE: " + INSCRICAO_ESTADUAL;	

		System.out.println(typewriter);
	} 

}
