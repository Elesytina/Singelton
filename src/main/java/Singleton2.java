// Метод синхронизирован. Это решает проблему многопоточности, но очень затратно по ресурсам(замедляет
// работу метода в 100 раз).синхронизация актуальна только при первом вызове этого метода.
//Иначе говоря, после того, как переменной uniqueInstance
//будет присвоен экземпляр синглетного класса, необходимость в дальнейшей синхронизации этого метода отпадает.
//После первого выполнения синхронизация только приводит к лишним затратам ресурсов!

public class Singleton2 {
        private static Singleton2 uniqueInstance;
        // Другие переменные экземпляра
        private Singleton2() {}
        public static synchronized Singleton2 getInstance() {
            if (uniqueInstance == null) {
                uniqueInstance = new Singleton2();
            }
            return uniqueInstance;
        }
        // Другие методы
    }

