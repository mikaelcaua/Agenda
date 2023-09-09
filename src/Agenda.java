import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    ArrayList<Contato> allContacts = new ArrayList<>();

    //adicionar contato
    public void adicionarContato() {
        System.out.print("---------------------------------------------\n");
        Contato novo = new Contato();
        System.out.print("Nome: ");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        novo.setNome(nome);
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        novo.setEndereco(endereco);
        System.out.print("E-mail: ");
        String email = scanner.nextLine();
        novo.setEmail(email);
        System.out.print("É pessoa fisica?(responda com sim ou nao): ");
        String pessoaf = scanner.nextLine();
        if(pessoaf.equals("sim")){
            novo.setPessoaFisica(true);
            System.out.print("CPF: ");
            int CPF = scanner.nextInt();
            novo.setCPF(CPF);
            System.out.print("Dia de nascimento: ");
            int diaNasc = scanner.nextInt();
            novo.setDiaNascimento(diaNasc);
            System.out.print("Mes de nascimento: ");
            int mesNasc = scanner.nextInt();
            novo.setMesNascimento(mesNasc);
            System.out.print("Ano de nascimento: ");
            int anoNasc = scanner.nextInt();
            novo.setAnoNascimento(anoNasc);
            scanner.nextLine();//sem essa opção acontece um erro
            System.out.print("Estado civil: ");
            String estadoCiv = scanner.nextLine();
            novo.setEstadoCivil(estadoCiv);
            this.allContacts.add(novo);

        }
        else{
            if(pessoaf.equals("nao")) {
                System.out.print("CNPJ: ");
                int CNPJ = scanner.nextInt();
                novo.setCNPJ(CNPJ);
                System.out.print("Inscricao estudual: ");
                int inscricaoEst = scanner.nextInt();
                novo.setInscricaoEstadual(inscricaoEst);
                this.allContacts.add(novo);
            }

        }
        System.out.print("\n");
    }

    //remover contato
    public void removeContato(String nome){
        if(allContacts.size()>0) {
            for (Contato contato : allContacts) {
                if (contato.getNome().equals(nome)) {
                    allContacts.remove(contato);
                    break;
                }
            }
        }
        else{
            System.out.println("A agenda ainda não tem contatos");
        }
    }

    //ver todos os contatos
    public void showContatos(){

        for (Contato contato : allContacts) {
            System.out.println("\n\n------------------------------");
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Endereço: " + contato.getEndereco());
            System.out.println("E-mail: " + contato.getEmail());
            if (contato.isPessoaFisica() == true) {
                System.out.println("CPF: " + contato.getCPF());
                System.out.println("Data de nascimento: " + contato.getDiaNascimento() + "/" + contato.getMesNascimento() + "/" + contato.getAnoNascimento());
                System.out.println("Estado civil: " + contato.getEstadoCivil());
            } else {
                System.out.println("CNPJ: " + contato.getCNPJ());
                System.out.println("Inscrição Estadual: " + contato.getInscricaoEstadual());
            }
            System.out.println("------------------------------");
        }

    }

    public void iniciarAgenda(){
        Scanner scanner = new Scanner(System.in);

        boolean loop = true;
        while(loop){
            System.out.print("\n------------------------------------------------------------\n");
            System.out.println("1 - ADICIONAR CONTATO");
            System.out.println("2 - REMOVER CONTATO");
            System.out.println("3 - VER TODOS OS CONTATOS");
            System.out.println("4 - FECHAR AGENDA");
            System.out.print("------------------------------------------------------------\n");
            System.out.print("Escolha uma opção: ");
            int num = scanner.nextInt();
            if(num==1){
                this.adicionarContato();
            }

            if(num==2){
                if(allContacts.size()>0) {
                    System.out.print("Nome do contato que você deseja remover: ");
                    scanner.nextLine();
                    String remContato = scanner.nextLine();
                    this.removeContato(remContato);
                    System.out.print("\nContato removido");
                }
                else{
                    System.out.println("A agenda ainda não tem contatos");
                }
            }

            if(num==3){
                if(allContacts.size()>0) {
                    this.showContatos();
                }
                else{
                    System.out.println("A agenda ainda não tem contatos");
                }
            }

            if(num==4){
                loop = false;
            }

        }
    }


}
