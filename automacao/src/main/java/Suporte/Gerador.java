package Suporte;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
public class Gerador {
    public static String dataHoraParaArquivo(){
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("yyyyMMddmmss").format(ts);

    }
}