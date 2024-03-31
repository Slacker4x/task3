public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel", "Core i5", 1200, 65);
        Motherboard motherboard = new Motherboard("ASUS", "Z370", 1151);
        RAM ram = new RAM(16, "DDR4");
        HDD hdd = new HDD(1000);
        PSU psu = new PSU(500);
        Videocard videocard = new Videocard("NVIDIA GTX 1660", 120);

        Computer computer = new Computer(processor, motherboard, ram, hdd, psu, videocard);

        if (computer.checkCompatibility()) {
            System.out.println("Комплектующие совместимы. Компьютер будет работать.");
        } else {
            System.out.println("Комплектующие несовместимы. Компьютер не будет работать.");
        }
    }
}