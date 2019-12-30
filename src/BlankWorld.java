import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;



public class BlankWorld {
    
    public static void main(String[] args)
    	 {
    	 	
    	 	 // Create application frame.
    	 	
        	JLabel txt = new JLabel ("Hola, bienvenido a tu mundo... estas en akk35... cual es tu primer accion?");
          framable(txt);
          
            	
    	 }
    	 
    	 
    	 
    	 public static void framable (JLabel txtarg)
    	 {
    	 
        // Create application frame.
        BlankWorldFrame frame2 = new BlankWorldFrame();
         frame2.setSize(900, 900);
      	frame2.setResizable(false);
       frame2.setLayout(null);
       frame2.setLocationRelativeTo(null);
       
       
        
        //configuracion y contenido del frame
        JButton btndispa= new JButton ("Continuar");
        btndispa.setBounds(100,100,100,100);
        txtarg.setBounds(170,80,600,200);
        frame2.add(txtarg); 
        frame2.add(btndispa);
 /*--->*/ btndispa.addActionListener(new ActionListener() {
          public  void actionPerformed(ActionEvent arg0) {
          seleccion ();
          
          }
          });
 
         // Show frame
        frame2.setVisible(true);
           	
    	 }
    
    //metodo que ejecuta el joptionpane
    public static void seleccion ()
    {	
    	//variables declaradas del cuadro
    	String a,b,c,que;
    	 
    	que= new String ("esta es la primer accion, que piensa hacer??");
    	
    	a= new String ("buscar gente");
    	b= new String ("buscar recursos");
    	c= new String ("investigar");
    	
    	String [] botonpan =  {a,b,c};
    	
    		 //ejecucion del cuadro de dialogo
   int selec = JOptionPane.showOptionDialog(null,que, "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, botonpan,null);
                	
                	
   if (selec == 0 )
   {
   	
   }	
   else
   {
   	if(selec == 1)
   	{
   		
   	}
   	else
   	{
   	if(selec == 2)
   	{
   	String men[] = {"cucho, encontramos que esta mierda es re toxica weon","no se que paso, creo que fallamos","encontramos una forma de establecer una base"};
   	  	Random r = new Random();
	int cont = r.nextInt(3);
	
   	JOptionPane.showMessageDialog(null,men[cont]);
   	
  
   	}
   	}
   }     	

    	
    }//Fin seleccion ()
    
    public static void variantestext () 
    	{
    	int rec=0;
    	JLabel txtgral;
    
    	//textos
    	
 		
    	
    	if (rec==1);
    	{
    
    	}
    	
    	// Peticion 1
    	
        }//Fin variantesTect
        
        public static void variantepane ()
        {
        	
        }
}
