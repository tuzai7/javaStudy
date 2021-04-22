/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 张先生
 * Date: 2021-04-22
 * Time: 22:48
 */



    class Test {
        public static void hello() {
            System.out.println("hello");
        }
    }


    public class TextDemo {
            private String name = "Person";
            int age=0;
        }
        public class Child extends TextDemo{
            public String grade;
            public static void main(String[] args){
                TextDemo p = new Child();
                System.out.println(p.name);
            }
/*        static boolean Paddy;
        public static void main(String args[]){
            System.out.println(Paddy);
        }*/
    }


     /*   public int aMethod(){
            static int i = 0;
            i++;
            return i;
        }
    */
  /*      public static void main3(String args[]){
            Test test = new Test();
            test.aMethod();
            int j = test.aMethod();
            System.out.println(j);
        }
*/
/*
        public static void main2(String[] args){

            String s;

            System.out.println("s="+s);

        }

        public static void main1(String[] args) {
            // TODO Auto-generated method stub
            Test test = null;
            test.hello();
        }
    }
*/


