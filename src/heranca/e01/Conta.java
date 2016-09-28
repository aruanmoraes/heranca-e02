/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca.e01;

/**
 *
 * @author a1552058
 */
public class Conta {
    
     protected double saldo;
    
    
    
    public void getSaldo(){
        System.out.println(saldo);
    }
    
    public void deposita(double x){
        System.out.println("Saldo anterior: R$"+saldo);
        saldo=saldo+x;
        System.out.println("Valor do depósito: R$"+x);
        System.out.println("Saldo Atual: R$"+saldo);
    }
    
    public void saca (double x){
        System.out.println("Saldo Anterior: R$"+saldo);
        System.out.println("Valor do saque: R$"+x);
        saldo=saldo-x;
        System.out.print("Saldo Atual :");
        getSaldo();
        
    }
    
    public void atualiza(double x){
        System.out.println("Porcentagem de Atualização: "+x+"%");
        saldo=((x/100)*saldo)+saldo;
    }
}
