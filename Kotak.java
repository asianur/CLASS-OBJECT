
public class Kotak {

	private double Panjang, Lebar, Luas, Keliling;
		
	//ini method getter
	public double getPanjang()
	{
		return Panjang; 
	}
	
	public double getLebar()
	{
		return Lebar;
	}
	
	public double getLuas()
	{
		return Luas;
	}
	
	public double getKeliling()
	{
		return Keliling;
	}
		
			
	
	//ini method setter
	public void setPanjang(double Panjang) 
	{ 
		this.Panjang = Panjang;
	}
	
	public void setLebar(double Lebar)
	{
		this.Lebar = Lebar;
	}
	
	public void setLuas(double Luas)
	{
		this.Luas = Luas;
	}
	
	public void setKeliling(double Keliling)
	{
		this.Keliling = Keliling;
	}

//method
	void hitungLuas() {
	 Luas = Panjang * Lebar;
	}

	void hitungKeliling() {
		Keliling= 2*Panjang + 2*Lebar;
	}
}
