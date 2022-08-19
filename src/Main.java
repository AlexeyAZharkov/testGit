public class Main {
    Test2 test2;

    public static void main(String[] args) {



        System.out.println("Hello world!");
    }

    class Test {
        private Test2 test2;


        public void test1() {
            String st = null;
//            try (String dd = test2.getTest();) {
//
//            }
        }
    }

    static class Test2 implements AutoCloseable {

        public String getTest() {
            return "ww";
        }

        @Override
        public void close() throws Exception {
            System.out.println("close");
        }
    }

}