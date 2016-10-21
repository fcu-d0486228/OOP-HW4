package fcu.iecs.oop.tiida;

public class NissanTiida {
	private int times;
	
	public void setTimes(int times){
		this.times = times;
	}
	
	public void tiida(){
		System.out.println();
		for(int i=0; i<this.times; i++){
			for(int j=0; j<this.times; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
