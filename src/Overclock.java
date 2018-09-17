public class Overclock {

    void increaseCpuClock(Computer comp, int P){
     comp.proc.taktowanie = comp.proc.taktowanie + P;
    }


    void decreaseCpuClock(Computer comp, int P){
        comp.proc.taktowanie = comp.proc.taktowanie - P;
    }
}
