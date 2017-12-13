public class ExceptionExam08 {
    static void method(boolean b){
        try{
            System.out.println(1);
            if(b) throw new ArithmeticException(); /*runtime임*/
            System.out.println(2);
        }catch (RuntimeException e){
            System.out.println(3);
            return;
        }catch(Exception e){
            System.out.println(4);
            return;
        }finally {
            System.out.println(5);
        }
        System.out.println(6);
    }

    public static void main(String[] args) {
        method(true);
        method(false);
    }
}