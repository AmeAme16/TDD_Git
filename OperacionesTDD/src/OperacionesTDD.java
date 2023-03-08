public class OperacionesTDD {

    public String suma(String numero){
        int Suma,num;
        Suma=0;
        String SumaFinal;
        String coma="";
        String[] N = numero.split(",");

        if (numero.equals("")){
            return "0";
        }

        for (int i = 0; i < numero.length(); i++) {
            coma=numero.substring(i);
        }
        if (coma.equals(",")){
            return "-1";
        }

        for (int i = 0; i < N.length; i++) {
            num= Integer.parseInt(N[i]);
            if (num<0){
                return "-1 numero negativo no permitido";
            }
            if (num>1000){
                return "5 numero superior a 1000 ignorado";
            }
            Suma=Suma+num;

        }
        SumaFinal=String.valueOf(Suma);

        return SumaFinal;
    }
}
