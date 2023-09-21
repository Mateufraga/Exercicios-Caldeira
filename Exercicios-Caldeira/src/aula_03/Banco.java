package aula_03;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
    public class Banco {
        String Nomedaconta;
       String CPF;
        int ID;
        String Nomebanco;
        String Endereco;
        double Saldo;
        LocalTime Hora;

        List<Transacao> transacaos;

        public Banco(String nomedaconta, String cpf, int id, String nomebanco, String endereco, double saldo, LocalTime hora) {

            this.Nomedaconta = nomedaconta;

            this.CPF = cpf;

            this.ID = id;

            this.Nomebanco = nomebanco;

            this.Endereco = endereco;

            this.Saldo = saldo;

            this.Hora = hora;

            this.transacaos = new ArrayList<>();
        }

        public Double SAQUE(Double Valorsaque) {
            LocalTime Hora = LocalTime.now();
            if (this.Saldo >= Valorsaque) {
                Transacao transacao = new Transacao(Valorsaque,Hora,"Saque");
                transacaos.add(transacao);
                return this.Saldo -= Valorsaque;
            } else {
                System.out.println("Saldo insuficiente, você tem. ");
                return this.Saldo;
            }
        }
        public Double DEPOSITO(Double Valordeposito) {
            LocalTime Hora = LocalTime.now();
            if (Valordeposito < 50) {
                System.out.println("Dépositos apenas acima de R$50,00 reais.");
                return this.Saldo;
            } else {
                Transacao transacao = new Transacao(Valordeposito,Hora,"Depósito");
                transacaos.add(transacao);
                return this.Saldo += Valordeposito;
            }
        }
    /*Qual é o horário do Pix noturno? Agora, a ferramenta permite que o cliente realize operações
     noturnas das 20h às 6h ou das 22h às 6h, com valores limitados a R$ 1 mil.6*/

        public Double PIX(Double ValorPIX, LocalTime Hora) {
            LocalTime Inicio = LocalTime.of(20,0);
            LocalTime Fim = LocalTime.of(06,0);
            if (ValorPIX > 1000 && (Hora.isAfter(Inicio) || Hora.isBefore(Fim))) {
                System.out.println("Não é permitido pix de valor maior que R$ 1.000,00 reais entre às 20:00 e 06:00 horas.");
                return ValorPIX;
            } else {
                if (ValorPIX > 0) {
                    Transacao transacao = new Transacao(ValorPIX,Hora,"PIX");
                    transacaos.add(transacao);
                    return this.Saldo += ValorPIX;
                } else {
                    System.out.println("Não é permitido transferir valores negativos!");
                    return this.Saldo;
                }
            }
        }
        public Double TRANSFERENCIA(Banco Contabancariadestino, Double ValorTransferencia, LocalTime Hora) {
            LocalTime Inicio = LocalTime.of(19,0);
            LocalTime Fim = LocalTime.of(8,0);
            if (this.Saldo < ValorTransferencia) {
                System.out.println("Você não tem saldo suficiente!");
                return this.Saldo;
            } else {
                if ((Hora.isAfter(Inicio) || Hora.isBefore(Fim))) {
                    System.out.println("Não é possível realizar transferências entre as 19 e 06 horas ");
                    return this.Saldo;
                } else {
                    if (ValorTransferencia > 0) {
                        Transacao transacao = new Transacao(ValorTransferencia,Hora,"Transferência");
                        transacaos.add(transacao);
                        this.Saldo -= ValorTransferencia;
                        Contabancariadestino.Saldo += ValorTransferencia; return this.Saldo;
                    }
                    System.out.println("Não é permitido transferir valores negativos!");
                    return this.Saldo;
                }
            }
        }
        public void VERIFICARSALDO() {
            System.out.println(this.Saldo);
        }
        public void VERIFICARHORA() {
            System.out.println(this.Hora);
        }
        public void VERIFICARINFORMACOES() {
            System.out.println("CPF "+this.CPF+"\n"+"Nome da conta "+this.Nomedaconta+"\n"+"Nome do banco "+this.Nomebanco
                    +"\nEndereço "+this.Endereco+"\nSaldo "+this.Saldo+"\nIdentificador "+this.ID+"\nHora atual "+this.Hora);
        }
        public boolean VERIFICARCPF(String CPF) {
            CPF = CPF.replaceAll("[^0-9]", "");
            if (CPF.length() != 11) {
                return false;
            }
            int[] Numeros = new int[11];
            for (int i = 0; i < 11; i++) {
                Numeros[i] = Integer.parseInt(CPF.substring(i,i+1));
            }
            int Soma1 = 0;
            int Soma2 = 0;
            for (int i = 0; i < 9; i++) {
                Soma1 += Numeros[i] * (10-i);
                Soma2 += Numeros[i] * (11-i);
            }
            int Digito1 = 11 - (Soma1%11);
            if (Digito1 >= 10) {
                Digito1 = 0;
            }
            Soma2 += Digito1 * 2;
            int Digito2 = 11 - (Soma2%11);
            if (Digito2 >= 10) {
                Digito2 = 0;
            }
            return Numeros[9] == Digito1 && Numeros[10] == Digito2;
        }
        public void RegistraTransacao(Transacao Transacao) {
            transacaos.add(Transacao);
        }
        public List<Transacao> BuscadorTransacao(){
            return transacaos;
        }
        public void PrintTransacao() {
            for (Transacao transacao : transacaos) {
                System.out.println("Tipo: "+ transacao.Gettipo());
                System.out.println("Hora: "+ transacao.Gethora());
                System.out.println("Valor: "+ transacao.Getvalor());
                System.out.println(".");
            }
        }
        public void TROCAENDERECO(String NovoEndereco) {
            this.Endereco = NovoEndereco;
        }

        public void TARIFAMENSAL(Double Tarifa) {
            LocalDate Data = LocalDate.now();
            if (Data.getDayOfMonth() == 1) {
                if (this.Saldo < Tarifa) {
                    System.out.println("Ligue para a sua sede, você não efetuou o pagamento da tarifa.");
                } else {
                    this.Saldo = this.Saldo - Tarifa;
                }
            }
        }

        public void CALCULARJUROS(double taxa) {
            LocalDate Data = LocalDate.now();
            if (this.Saldo > 0) {
                if (Data.getDayOfMonth() == 1) {
                    this.Saldo = this.Saldo + (this.Saldo * taxa);
                }
            }
        }
        public void FECHACONTA() {
            if (this.Saldo > 0) {
                System.out.println("Não é possível fechar a conta pois ainda há saldo.");
            } else { this.transacaos.clear();
                System.out.println("Sua conta foi fechada com sucesso");
            }
        }
    }

