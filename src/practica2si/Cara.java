package practica2si;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Clase cara. Representa un ejemplo para el aprendizaje.
 * @author dviejo
 */
public class Cara {
	private int []data;
	private int tipo;
        
        //PEPE
        private double peso;
        
        public void setpeso(double peso){
            this.peso = peso;
        }
        public double getpeso(){
            return peso;
        }
	
        /**
         * Lee la información de una imagen desde un fichero. Le asigna el tipo
         * que se recibe como parametro
         * @param fcara fichero de entrada
         * @param tipo 1 = cara; -1 = nocara
         */
        public Cara(File fcara, int tipo)
	{
		int mask = 0x000000FF;
		int cont;
		BufferedImage bimage;
		try
		{
			bimage = ImageIO.read(fcara);
			data = bimage.getRGB(0, 0, bimage.getWidth(), bimage.getHeight(), null, 0, bimage.getWidth());
			//Asumiendo que la imagen ya está en escala de grises pero en formato color, 
			//convertimos ARGB en un único valor
			for(cont=0;cont<data.length;cont++)
				data[cont] = data[cont] & mask; 
			this.tipo = tipo;
                        this.peso = 0;//Al inicio todas las imagenes tienen el mismo peso
		} catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public int []getData()
	{
		return data;
	}
	
	public int getTipo()
	{
		return tipo;
	}
	
	public void setTipo(int newtipo)
	{
		tipo = newtipo;
	}
        
        //PEPE
        public int getValor(int index){
            return data[index];
        }
}
