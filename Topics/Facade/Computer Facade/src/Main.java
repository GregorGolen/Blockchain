class ComputerFacadeTestDrive {
    public static void main(String[] args) {
        Processor processor = new Processor();
        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();

        ComputerFacade computerFacade = new ComputerFacade(processor, monitor, keyboard);

        computerFacade.turnOnComputer();
        computerFacade.turnOffComputer();
    }
}

class ComputerFacade {
    private Processor processor;
    private Monitor monitor;
    private Keyboard keyboard;

    public ComputerFacade(Processor processor, Monitor monitor, Keyboard keyboard){
       this.processor = processor;
       this.monitor = monitor;
       this.keyboard = keyboard;
    }

    public void turnOnComputer() {
        processor.on();
        monitor.on();
        keyboard.on();
        keyboard.turnOnBacklight();
    }

    public void turnOffComputer() {
        keyboard.off();
        keyboard.turnOffBacklight();
        monitor.off();
        processor.off();
    }
}

class Processor {
    /* Your subsystem description */

    public void on() {
        System.out.println("Processor on");
    }

    public void off() {
        System.out.println("Processor off");
    }
}

class Monitor {
    /* Your subsystem description */

    public void on() {
        System.out.println("Monitor on");
    }

    public void off() {
        System.out.println("Monitor off");
    }
}

class Keyboard {

    public void on() {
        System.out.println("Keyboard on");
    }

    public void off() {
        System.out.println("Keyboard off");
    }

    public void turnOnBacklight() {
        System.out.println("Backlight is turned on");
    }

    public void turnOffBacklight() {
        System.out.println("Backlight is turned off");
    }
}
