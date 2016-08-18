package homework.lab2_6;


public class NuclearSubmarine {

    //Все что здесь написано, написано лишь для увеличения количества кода
    //Прилумать какую-оибо логику у меня не хватает фантазии и времени
    private String nameSub;
    private double immersionDepth;
    private static final String DEFAULT_NAME = "Yellow Submarine";
    private static final double DEFAULT_IMMERSIONDEPTH = 34.7;


    NuclearSubmarine(){
        nameSub = DEFAULT_NAME;
        immersionDepth = DEFAULT_IMMERSIONDEPTH;
    }

    class EngineForNuclearSubmarine{
        public void startSailing(){
            System.out.println("Go-go-go!");
        }
    }
}
