package com.mycompany.aula05;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Caleb Wacht
 */
public class Conta {

    public double numConta;

    protected EnumTipoConta tipoConta;

    private String dono;

    private BigDecimal saldo;

    private EnumStatusConta status;

    private static List<Conta> listaContas;

    public Conta(String nome, EnumTipoConta tipoConta) { // método construtor
        Random random = new Random();
        int numeroConta = random.nextInt(10);

        this.setDono(nome);
        this.setTipoConta(tipoConta);
        this.setNumConta(numeroConta);
        if (tipoConta.equals(EnumTipoConta.CC)) {
            this.setSaldo(BigDecimal.valueOf(50));
        } else {
            this.setSaldo(BigDecimal.valueOf(150));
        }
        this.setStatus(EnumStatusConta.ABERTO);
    }

    public double getNumConta() {
        return numConta;
    }

    public void setNumConta(double numConta) {
        this.numConta = numConta;
    }

    public EnumTipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(EnumTipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public EnumStatusConta getStatus() {
        return status;
    }

    public void setStatus(EnumStatusConta status) {
        this.status = status;
    }

    public static List<Conta> getListaContas() {
        return listaContas;
    }

    public Conta abrirConta(String nome, EnumTipoConta tipoConta) throws Exception {

        List<Conta> contas = Conta.getListaContas();

        for (Conta c : contas) {
            if (c.getDono().equals(nome) && c.getTipoConta().equals(tipoConta)) {
                throw new Exception("Já existe uma conta desse tipo para a pessoa solicitada");
            }
        }

        Conta novaConta = new Conta(nome, tipoConta);

        return novaConta;
    }

    public Conta fecharConta(String numero, EnumTipoConta tipoConta) throws Exception {
        List<Conta> contas = Conta.getListaContas();

        for (Conta c : contas) {
            if (numero.equals(c.getNumConta()) && tipoConta.equals(c.getTipoConta())) {

                if ((c.getSaldo().compareTo(BigDecimal.ZERO)) == 0) {
                    c.setStatus(EnumStatusConta.FECHADO);
                    return c;
                } else {
                    throw new Exception("Sua conta possui um saldo de " + c.getSaldo() + ", para fecha-la deverá ter o saldo zerado!");
                }
            }
        }
        return null;
    }

    public Conta depositar(String numero, EnumTipoConta tipoConta, BigDecimal valor) throws Exception {
        List<Conta> contas = Conta.getListaContas();
        Conta conta = null;

        for (Conta c : contas) {
            if (numero.equals(c.getNumConta()) && tipoConta.equals(c.getTipoConta())) {
                conta = c;
            }
        }

        if (conta != null) {
            if (conta.getStatus().equals(EnumStatusConta.ABERTO)) {
                BigDecimal saldo = conta.getSaldo();
                conta.setSaldo(saldo.add(valor));
                return conta;
            } else {
                throw new Exception("A conta está fechada, deverá abri-la para realizar um depósito!");
            }
        } else {
            throw new Exception("Conta não encontrada!");
        }
    }

    public Conta sacar(String numero, EnumTipoConta tipoConta, BigDecimal valor) throws Exception {
        List<Conta> contas = Conta.getListaContas();
        Conta conta = null;

        for (Conta c : contas) {
            if (numero.equals(c.getNumConta()) && tipoConta.equals(c.getTipoConta())) {
                conta = c;
            }
        }

        if (conta != null) {
            if (conta.getStatus().equals(EnumStatusConta.ABERTO)) {
                if (conta.getSaldo().compareTo(BigDecimal.ZERO) > 0) {
                    
                    BigDecimal saldo = conta.getSaldo();
                    conta.setSaldo(saldo.subtract(valor));
                    return conta;
                } else {
                    throw new Exception("Saldo insuficiente!");
                }
            } else {
                throw new Exception("A conta está fechada, deverá abri-la para realizar um saque!");
            }
        } else {
            throw new Exception("Conta não encontrada!");
        }
    }

    public Conta pagarMensal(String numero, EnumTipoConta tipoConta) throws Exception {
        List<Conta> contas = Conta.getListaContas();
        Conta conta = null;

        for (Conta c : contas) {
            if (numero.equals(c.getNumConta()) && tipoConta.equals(c.getTipoConta())) {
                conta = c;
            }
        }

        if (conta != null) {
            BigDecimal saldo = conta.getSaldo();
            if (conta.getTipoConta().equals(EnumTipoConta.CC)) {
                conta.setSaldo(saldo.subtract(BigDecimal.valueOf(12)));
            } else {
                conta.setSaldo(saldo.subtract(BigDecimal.valueOf(20)));
            }
            return conta;
        } else {
            throw new Exception("Conta não encontrada!");
        }
    }
}
