public class OperacionesTDD {

    public String suma(String numero){
        int Suma,num;
        Suma=0;
        String SumaFinal;
        String[] N = numero.split(",");

        if (numero==""){
            return "0";
        }

        for (int i = 0; i < N.length; i++) {
            num= Integer.parseInt(N[i]);
            Suma=Suma+num;
        }
        SumaFinal=String.valueOf(Suma);

        return SumaFinal;
    }
}
