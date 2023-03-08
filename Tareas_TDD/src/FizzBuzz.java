public class FizzBuzz {
    public String Prueba(int numero){

        String n=Integer.toString(numero);

        if (numero%5==0 && numero%3==0){
            return "FizzBuzz";
        }else{
            if (numero%3==0){
                return "Fizz";
            }
            if (numero%5==0){
                return "Buzz";
            }
        }
        return n;
    }
}
