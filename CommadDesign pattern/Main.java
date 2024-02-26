public class Main {
    public static void main(String[] args) {
        
        Light light = new Light();

        // Commands
        Command turnOnCommand = new TurnOnCommand(light);
        Command turnOffCommand = new TurnOffCommand(light);

        // Remote Control
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.registerCommand(turnOnCommand);
        remoteControl.registerCommand(turnOffCommand);

       
        remoteControl.executeCommands();
    }
}