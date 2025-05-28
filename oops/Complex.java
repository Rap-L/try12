//add 2 complex numbers
class Complex{
	double real,imag;
	Complex(double real,double imag){
		this.real=real;
		this.imag=imag;
	}
	Complex add(Complex c){
		return new Complex(this.real+c.real,this.imag+c.imag);
	}
	void display(){
		System.out.println(this.real+"+ "+this.imag+"i");
		
	}
	public static void main(String args[]){
		Complex c1=new Complex(5,3);
		Complex c2=new Complex(2,7);
		Complex sum=c1.add(c2);
		
		System.out.print("Sum:");
		sum.display();
	}
}
		
