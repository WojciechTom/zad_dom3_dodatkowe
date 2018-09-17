public class ComputerTest {
    public static void main(String[] args) {

        Memory pamiec1 = new Memory("Intel", "XYZ", 1500,8600);
        Memory pamiec2 = new Memory("Intel", "BBB", 2500,9600);
        Procesor proc1 = new Procesor("Intel", "WWW", 8900);
        Procesor proc2 = new Procesor("Intel", "ZZZ", 7900);

        Computer komp1 = new Computer("Laptop", pamiec1, proc2);
        Computer komp2 = new Computer("Stanjonarny", pamiec2, proc1);

        komp1.pokaz();
        komp2.pokaz();

        Overclock maszyna = new Overclock();

        maszyna.increaseCpuClock(komp1 , 4000);
        maszyna.decreaseCpuClock(komp2, 2000);

        komp1.pokaz();
        komp2.pokaz();





    }
}
