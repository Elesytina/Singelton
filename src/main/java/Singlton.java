// Синхронизация выполняется только при первом вызове getInstance(); это позволяет экономить
// ресурсы и при этом потокобезопасно. Метод называется условной блокировкой

public class Singlton {
    private static volatile Singlton uniqueObject;
    private Singlton(){};
    public static Singlton getInstance(){
        if(uniqueObject==null){
            synchronized (Singlton.class){
                if(uniqueObject==null)
                    uniqueObject=new Singlton();
            }
        }
        return uniqueObject;
    }

}
