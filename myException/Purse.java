package myException;

/**
   Un borsellino calcola il valore totale di una raccolta di monete.
*/

public class Purse
{  
   
  /**
     Costruttore: costruisce un borsellino vuoto.
  */
 
   public Purse()
   {  
     nickels   = 0;
     dimes     = 0;
     quarters  = 0;     
   
   }

  /**
     Metodo: aggiunge dei nickel al borsellino
     @param count il numero di nickel da aggiungere
  */
 
   public void addNickels(int count)
   {  
    
     nickels   = nickels + count;
    
   }

   /**
     Metodo: aggiunge dei dime al borsellino
     @param count il numero di dime da aggiungere
  */
 
   public void addDimes(int count)
   {  
    
    dimes   = dimes + count;
    
   }
   
   /**
     Metodo: aggiunge dei quarter al borsellino
     @param count il numero di quarter da aggiungere
  */
 
   public void addQuarters(int count)
   {  
    
     quarters   = quarters + count;
    
   }


     /**
     Metodo: calcola il totale delle monete nel borsellino�
     @return la somma dei valori di tutte le monete
    */
 
   public double getTotal()
   {  
    
    return nickels * NICKEL_VALUE + dimes * DIME_VALUE + quarters * QUARTER_VALUE;    
  
   }
 
   private static final double NICKEL_VALUE  = 0.05;
   private static final double DIME_VALUE    = 0.1;
   private static final double QUARTER_VALUE = 0.25;

   private int nickels;
   private int dimes;
   private int quarters;
 
}
