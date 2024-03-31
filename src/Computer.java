public class Computer {
    Processor processor;
    Motherboard motherboard;
    RAM ram;
    HDD hdd;
    PSU psu;
    Videocard videocard;

    public Computer(Processor processor, Motherboard motherboard, RAM ram, HDD hdd, PSU psu, Videocard videocard) {
        this.processor = processor;
        this.motherboard = motherboard;
        this.ram = ram;
        this.hdd = hdd;
        this.psu = psu;
        this.videocard = videocard;
    }

    public boolean checkCompatibility() {
        return (processor.socket == motherboard.socket &&
                psu.powerWattage >= (processor.powerConsumption + videocard.powerConsumption));
    }
}
