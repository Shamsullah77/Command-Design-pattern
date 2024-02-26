import java.util.ArrayList;
import java.util.List;

// Command interface
interface Command {
    void execute();
}

// Receiver class
class Light {
    void turnOn() {
        System.out.println("Light is ON");
    }

    void turnOff() {
        System.out.println("Light is OFF");
    }
}

// Concrete Command classes
class TurnOnCommand implements Command {
    private final Light light;

    TurnOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}

class TurnOffCommand implements Command {
    private final Light light;

    TurnOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }
}

class RemoteControl {
    private final List<Command> commands = new ArrayList<>();

    void registerCommand(Command command) {
        commands.add(command);
    }

    void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
