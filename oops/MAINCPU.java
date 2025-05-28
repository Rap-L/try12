
class CPU {
int price; 

CPU(int price) {
this.price = price; 
}

class Processor {
int cores; 
String manufacturer;

Processor(int cores, String manufacturer) {
this.cores = cores; 
this.manufacturer = manufacturer; 
}

void displayProcessorInfo(){
System.out.println("Processor Cores: " + cores);
System.out.println("Processor Manufacturer: " + manufacturer);

}
}


static class RAM {
int memory; 
String manufacturer;


RAM(int memory, String manufacturer) {
this.memory = memory; 
this.manufacturer = manufacturer; 

}
void displayRAMInfo(){
System.out.println("RAM Memory: " + memory + "GB");
System.out.println("RAM Manufacturer: " + manufacturer);
}
}
}


public class MAINCPU {
public static void main(String[] args) {

CPU cpu = new CPU(30000);

 
CPU.Processor processor = cpu.new Processor(8, "Intel");


CPU.RAM ram = new CPU.RAM(16, "Samsung");


System.out.println("CPU Price: " + cpu.price);


processor.displayProcessorInfo();


ram.displayRAMInfo();
}
}
