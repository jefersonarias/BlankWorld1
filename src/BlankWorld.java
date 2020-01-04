import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;



public class BlankWorld {
    
    public static void main(String[] args)
{
    	 // Create application frame.
         framable();
          	
}//Fin metodo principal
    	 
     //metodo que ejecuta el frame principal  	 
    public static void framable ()
{//INICIO FRAMABLE---------------------------
    	 	//declariacion de variables
    	
    	
    	//declaracion de variables
   		
   		//variables hud
   		JPanel hud = new JPanel();
   		int pobla = 1;
   		int recur = 0;
   		int inves = 0;
   		
   		
   		String pobt= String.valueOf(pobla);
   		JLabel pobj= new JLabel(pobt);
   		
   		String recut= String.valueOf(recur);
   		JLabel recuj= new JLabel(recut);
   		
   		String invet= String.valueOf(inves);
   		JLabel invej= new JLabel(invet);
   		
   		
   		//variables framable
    	JButton btndispa= new JButton ("Continuar");
    	String txtselec[] = {"Hola, bienvenido a tu mundo... estas en akk35... cual es tu primer accion?","Ay Caray, creo que tenemos problemas en esta ocasión, pero no desesperes... que piensas hacer?","que bien, parece que lo vamos a lograr rapido... que quieres hacer?","ahi vamos, no desfallezcas"};
    	JLabel txt = new JLabel (txtselec[0]);
    	 
    	 
        // Create application frame.
        BlankWorldFrame frame2 = new BlankWorldFrame();
        frame2.setSize(900, 500);
      	frame2.setResizable(false);
        frame2.setLayout(null);
        frame2.setLocationRelativeTo(null);
      
    	
       
       
        
        //configuracion y contenido del frame
        //ubicacion y dimensiones
        btndispa.setBounds(400,300,200,50);
        txt.setBounds(170,80,600,200);
        hud.setBounds(100,20,240,80);
        hud.setLayout(new BoxLayout(hud, BoxLayout.X_AXIS));
        
        //add item!!!
          //add to hud
        hud.add(pobj);
        hud.add(recuj);
        hud.add(invej);
        
        //add to frame
        frame2.add(hud);
     	frame2.add(txt); 
        frame2.add(btndispa);
        
         //setvisible
        txt.setVisible(true);
        btndispa.setVisible(true);
        
        
        //invocador de evento al azar
         Timer timer = new Timer  (10000,new ActionListener() {
          public  void actionPerformed(ActionEvent e)
          	{
          	//codigo aqui
          	azarevent ();
          	} } );
        
          // Show frame
        frame2.setVisible(true);
        timer.start();
              	
 /*--->*/ btndispa.addActionListener(new ActionListener() {
          public  void actionPerformed(ActionEvent arg0) {
   
        String a,b,c,que;
         	
    	 
    	que= new String ("esta es la primer accion, que piensa hacer??");
    	
    	a= new String ("buscar gente");
    	b= new String ("buscar recursos");
    	c= new String ("investigar");
    	
    	String   botonpan []  =  {a,b,c};
    	
    	String txtarg = new String ();
        String conteo = new String ("0");
        String pobbb = new String (pobt);
         String arrayf []  = new String [] {txtarg,conteo,pobbb};
     	
     	
    		 //ejecucion del cuadro de dialogo
   int selec = JOptionPane.showOptionDialog(null,que, "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, botonpan,null);
               
   
              
    if (selec == 0 )
   {
   		
   	 conteo = ("0");
   
    seleccion (arrayf,arrayf[0],arrayf[1],arrayf[2]);
    
  
   	System.out.print("Este es el pobla:"+arrayf[2]+"fiiiiiin......");
   	
   	 	
   }//if 0	
   else
   {
   	if(selec == 1)
   	{

   	}//if 1
   	else
   	{
   	if(selec == 2)
   	{
  
   	}//if
   	}
   }//Final if-else 
   //Ejecucion succesful
	 
     JOptionPane.showMessageDialog(null,arrayf[selec]);
          }
          });
              	
}// Fin framable
    
    //metodo que ejecuta el joptionpane
    public static String []  seleccion (String [] todojunto,String a,String b,String c)
    {
   	 int swth = Integer.parseInt (b);
   	 int poblanue = Integer.parseInt (c);
   	 String txtar = new String ();
   	
   	 	
   
	//Menjsajes para investigacion		
     String meni[] = {"cucho, encontramos que esta mierda es re toxica weon","no se que paso, creo que fallamos","encontramos una forma de establecer una base"};
   	  	Random r = new Random();
   	  	 //Menjsajes para recursos		
     String menr[] = {"gonorrea, encontramos oro","estabamos buscando recursos y estalló una mina verde... nos infectamos","no encontramos nada, pero estamos a salvo"};
	//mensajes para gente
	 String meng[] = {"encontramos pobladores","se perdio alguien en la expedición","no pasó nada"};
   	  	
 //ejecutor de mensajes
if(swth==0&&meng[swth]=="encontramos pobladores")
{
	
	int cont = r.nextInt(3);
	int contp = r.nextInt(4);
	poblanue = poblanue + contp;
	c = Integer.toString(poblanue);
	txtar = meng[cont];
	a = txtar;
	todojunto [0] = a;
	todojunto [1] = b;
	todojunto [2] = c;
	System.out.print("Este es el contador de pobla:"+contp);
	
	
	
		
}
else
{
if(swth==1)
{

}
else
{


}	
}
	
/*----->mensaje ready*/return todojunto;
    }//Fin seleccion ()
    
    //metodo contenedor de eventos ramdom
    public static void azarevent () 
    	{
    	
    	
    	String textos00 = new String ("hola pendejos, esta es la viva prueba de que esto cambia jajaaj y vine con todo: ovnis, inclusive.");
    
    	//textos
  
    	// Peticion 1
    	
        }//Fin variantesText
        
        	    
}//Fin clase!!!!
