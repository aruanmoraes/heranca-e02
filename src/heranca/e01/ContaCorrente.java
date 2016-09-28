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
public class ContaCorrente extends Conta{
    
public void atualiza(double x){
        System.out.println("Porcentagem de Atualização: "+(x*2)+"%");
        saldo=(((x/100)*saldo)*2)+saldo;
    }   

public void deposita(double x){
        System.out.println("Saldo anterior: R$"+saldo);
        saldo=saldo+x;
        System.out.println("Valor do depósito: R$"+x);
        System.out.println("Taxa de depósito: - R$0,10");
        saldo=saldo-0.1;
        System.out.print("Saldo Atual: R$");
        getSaldo();
    }
    

}
