package de.tu_darmstadt.gdi1.tanks.objects;

//import de.tu_darmstadt.gdi1.tanks.ui.TanksGameplayState;

public class Object {
	int posX;
	int posY;
	int scale;
	Object[] allObjects = new Object[0];
	int counter = 0;
	
	public Object(int x,int y){
		posX = x;
		posY = y;
	}
	
	public void addNewObject(Object newObject){
		allObjects[counter] = newObject;
		counter++;
	}
	/**
	 * Setzt die X und Y Koordinate für das Objekt neu.
	 * Falls einer der beiden Parameter -1 ist, wird der Parameter nicht verändert. 
	 * 
	 * @param newX neue X Koordinate
	 * @param newY neue Y Koordinate
	 */
	public void setPos(int newX,int newY){
		if(newX == -1){}
		else posX = newX;
		
		if(newY == -1){}
		else posY = newY;
	}
	
	/**
	 * @return Aktuelle X Koordinate des Objects
	 */
	public int getX(){
		return posX;
	}
	
	/**
	 * @return Aktuelle Y Koordinate des Objects.
	 */
	public int getY(){
		return posY;
	}
	
	public int getScale(){
		return scale;
	}
	/**
	 * @return true falls sich mehrere Objekcts überlagern 
	 */
	public boolean Collision(){
	//TODO
		return false;
	}
	
	public static void main(String[]args){
		Object Wall = new Object(1,2);
		System.out.println(Wall.getX() +" "+ Wall.getY());
		Wall.setPos(4,-1);
		System.out.println(Wall.getX() +" "+ Wall.getY());
		Wall.setPos(4,10);
		System.out.println(Wall.getX() +" "+ Wall.getY());
		Wall.setPos(-1,-1);
		System.out.println(Wall.getX() +" "+ Wall.getY());
	}
}
