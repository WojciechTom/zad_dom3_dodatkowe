public class ComputerAssembly {

    Computer assembly(String nazwa, String producentProc, String modelProc, int taktProc, String producentPam, String modelPam, int iloscPam, int taktPam){
        Memory pamiec = new Memory(producentPam, modelPam, iloscPam, taktPam);
        Procesor proc = new Procesor(producentProc, modelProc, taktProc);
        Computer komp = new Computer(nazwa, pamiec, proc);
        return komp;
    }
}
