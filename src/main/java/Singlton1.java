// Раннее создание экземпляра
//При таком подходе мы доверяем JVM создание уникального экземпляра Singleton при загрузке класса. JVM гарантирует, что экземпляр будет создан до того, как какой-либо поток
  //      сможет обратиться к статической переменной uniqueInstance.

public class Singlton1 {
    private static Singlton1 uniqueSinglton1=new Singlton1();
    private Singlton1(){};
    public  static Singlton1 getInstance(){
        return uniqueSinglton1;
    }
}
