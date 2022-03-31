/*
Tem-se um conjunto de dados contendo a altura e o sexo (masculino=1 ou feminino=2) 
de 15 pessoas. Faça um algoritmo que calcule e mostre:

•A maior e a menor altura do grupo ok

•A média de altura das mulheres (somar a altura das mulheres e quantidade de mulheres) ok

•O número de homens ok

•O sexo da pessoa mais alta ok
 */
package altura_sexo;

/**
 *
 * @author Andressa
 */
public class Pessoa {
    private double altura,maiorAltura=0, menorAltura, somaAlturaMulheres=0;
    private int sexo, qtdHomens, qtdMulheres;
    private String sexoMaiorAltura;

    public String getSexoMaiorAltura() {
        return sexoMaiorAltura;
    }

    public void setSexoMaiorAltura(String sexoMaiorAltura) {
        this.sexoMaiorAltura = sexoMaiorAltura;
    }
    

    public double somarAlturaMulheres(){
        return this.somaAlturaMulheres=this.somaAlturaMulheres+this.altura;
    }
    public double calcularMediaAlturaMulheres(){
        return this.somarAlturaMulheres()/this.qtdMulheres;
    }
    public void verificarMaiorAltura(){
        /*if(this.altura > this.maiorAltura && (this.sexo==1 || this.sexo==2)){
            this.maiorAltura=this.altura;
            if(this.sexo==1){
                this.sexoMaiorAltura = "Masculino";
            }else{
                this.sexoMaiorAltura = "Feminino";
            }*/
            if(this.altura > this.maiorAltura && this.sexo==1){
                this.maiorAltura=this.altura;
                this.sexoMaiorAltura = "Masculino";
        }else if(this.altura > this.maiorAltura && this.sexo==2){
                this.maiorAltura=this.altura;
                this.sexoMaiorAltura = "Feminino";
        }
    }
    public void verificarMenorAltura(){
        if(this.altura < this.menorAltura && (this.sexo==1 || this.sexo==2)){
            this.menorAltura = this.altura;
        }
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getMaiorAltura() {
        return maiorAltura;
    }

    public void setMaiorAltura(double maiorAltura) {
        this.maiorAltura = maiorAltura;
    }

    public double getMenorAltura() {
        return menorAltura;
    }

    public void setMenorAltura(double menorAltura) {
        this.menorAltura = menorAltura;
    }

    public double getSomaAlturaMulheres() {
        return somaAlturaMulheres;
    }

    public void setSomaAlturaMulheres(double somaAlturaMulheres) {
        this.somaAlturaMulheres = somaAlturaMulheres;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getQtdHomens() {
        return qtdHomens;
    }

    public void setQtdHomens(int qtdHomens) {
        this.qtdHomens = qtdHomens;
    }

    public int getQtdMulheres() {
        return qtdMulheres;
    }

    public void setQtdMulheres(int qtdMulheres) {
        this.qtdMulheres = qtdMulheres;
    }
    
    
}
