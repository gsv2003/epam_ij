package homework.lab2_6;

/**
 * Created by user on 12.08.16.
 */
/*
Разработайте класс АтомнаяЛодка, создайте внутренний класс – ДвигательДляАтомнойЛодки.
Создайте объект АтомнаяЛодка и “запустите его в плавание”.
 */
public class Main {
    public static void main(String[] args) {
        NuclearSubmarine.EngineForNuclearSubmarine sub = new NuclearSubmarine().new EngineForNuclearSubmarine();
        sub.startSailing();
    }
}
