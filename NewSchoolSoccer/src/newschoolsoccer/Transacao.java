/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschoolsoccer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Antônio Henrique Passamai Penizollo 
 * @author Braulio Silva Mendes Lucas 
 * @author João Victor Dutra Balboa 
 * @author Marcus Vinícius Vasconcelos de A. Cunha
 */
public class Transacao {
    
    int tipo;  ///0 = credito , 1 = debito
    float valor;
    Calendar data;

    public Transacao(int tipo, float valor) {
        this.tipo = tipo;
        this.valor = valor;

        this.data = Calendar.getInstance();
        
        
        
    }
    
    
    
    
    
}
