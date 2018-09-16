public class Computer {
    String Nazwa;
    Memory pamiec;
    Procesor proc;

    Computer(String N, Memory M, Procesor P){
        Nazwa = N;
        pamiec = M;
        proc = P;
    }

    void pokaz(){
        System.out.println(this.Nazwa + ", pamięć: " + this.pamiec.producent + " " + this.pamiec.model + ", procesor: " + this.proc.producent + " " + this.proc.model );
    }
}
