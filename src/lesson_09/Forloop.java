package lesson_09;

public class Forloop {
    public static void main(String[] args) {

  //      for (;инициализацияю ;блок проверок ;блок изменения счётчика> )
     // тело цикла

     int k = 0;
     while (k < 10){
       //  telo cikla
        //         4to to delat
         k++;
     }
        System.out.println(k);
      for (int i = 0; i < 10; i++) {
          // telo cikla
          System.out.println(i);
      }
       // System.out.println(i);// область видимости i только внутри тела цикла и блоков


  //    for (;;) {      //бесконечный цикл
 //         System.out.println("hello");
  //    }

        int j = 15;
        for (j= 0 ; j < 20; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("j за циклом: " + j);


   //     for (int i = 0; i >= 0; i +=10000 ) {
   //         System.out.println(i);
    //    }
        for (String  str = "Hello "; str.length() < 10; str += "$") {
            System.out.println(str);
        }
        //  мы можем инициализировать несколько переменных , проверять составные условия. проверять несколько переменных.



        int k1 = 0;
        // kod

        k1 = 15;

        for (int a = 0, f= 1 ; k >= 0 &&  f < 10 ; k1 --, a = ++a + k1 , f++){
            System.out.println(k1 + ":" + a + ":" + f);

        }



    }
}
