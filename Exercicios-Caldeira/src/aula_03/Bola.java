package aula_03;
public class Bola {

    double raio;
    double circunferencia;
    double diametro;
    double area;
    double x;
    double y;

    public Bola(double Raio){

        if(Raio > 0){
            this.raio = Raio;
            this.x = 0;
            this.y = 0;
        }else{
            System.out.println("Nao foi possivel criar bola negativa");
        }
    }


    //sobrecarga de contrutor pro cartesiano

    public Bola(double Raio, double X, double Y){

        if (raio > 0) {
            this.x = X;
            this.y = Y;
            this.raio = Raio;
        } else {
            System.out.println("Não foi possível criar bola com raio negativo");
        }

    }

    public void CalculaCircu(){

        double c = 2 * 3.1416 * raio;

        System.out.println("A circunferencia da bola é "+ c);

        this.circunferencia = c;

    }

    public void CalculaArea(){


        double a = 3.1416 * (this.raio * this.raio);

        System.out.println("A area da sua bola é "+ a);
        this.area = a;

    }

    public void CalculaDiame(){
        double d = 2 * this.raio;
        System.out.println("Diametro da bola é "+ d);
        this.diametro = d;
    }

    public void definirRaio(double novoRaio){
        if(novoRaio > 0){
            this.raio = novoRaio;

            //atualiza proporções

            this.CalculaArea();
            this.CalculaCircu();
            this.CalculaDiame();

        }else{
            System.out.println("Nao é possivel bola negativa");
        }
    }

    public String toString() {
        String resultado = "Raio: " + this.raio + "\n";
        resultado += "Área: " + this.area + "\n";
        resultado += "Circunferência: " + this.circunferencia + "\n";
        return resultado;
    }

    public boolean EhIgual(Bola bolinha){
        if(this.raio == bolinha.raio){
            System.out.println("E igaul");
            return true;
        }else{
            System.out.println("Ne igual nao");
            return false;
        }
    }

    public void CalculaDasSOmbras(Bola bolao){
        if(this.raio > bolao.raio){
            double areaMaior = 3.1416 * this.raio * this.raio;
            double areaMenor = 3.1416 * bolao.raio * bolao.raio;
            System.out.println("A area sombreada é "+ (areaMaior - areaMenor));
        }else{
            System.out.println("A bola tem q ter um raio menor do q a outra pra ter sombra");
        }
    }
}
