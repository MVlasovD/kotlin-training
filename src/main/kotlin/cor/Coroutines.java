package cor;//import kotlinx.coroutines.CoroutineScope;
//import kotlinx.coroutines.Dispatchers;
//import kotlinx.coroutines.launch;
//
//public class Coroutines {
//
//
//    public static void cor.cor.main(String[] args) {
//        // Создаем область корутин
//        CoroutineScope scope = CoroutineScope(Dispatchers.Default);
//        // Запускаем корутину
//        scope.launch(() -> {
//            // Код, выполняющийся в корутине
//            for (int i = 0; i < 5; i++) {
//                System.out.println("Корутина: " + i);
//                try {
//                    Thread.sleep(1000); // Имитация работы
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        // Код основного потока
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Основной поток: " + i);
//            try {
//                Thread.sleep(1000); // Имитация работы
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        // Ожидаем завершения всех корутин
//        scope.close();
//    }
//}

class Coroutines extends Thread{

    public static void main(String[] args) {

        startThread(100000);

    }

    public static void startThread(int numberOfThreads) {
        for (int i = 0; i < numberOfThreads; i++) {
            Coroutines thread = new Coroutines();
            thread.start();
        }
    }

    @Override
    public void run() {
        System.out.printf("%s \n", Thread.currentThread().getName());
    }
}
