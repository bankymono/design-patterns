package command;

public class RemoteLoader {
    public static void main(String[] args) {
//        RemoteControl remoteControl = new RemoteControl();
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");
//        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
//        GarageDoor garageDoor = new GarageDoor("Garage");
//        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
//        remoteControl.setCommand(0, ()-> livingRoomLight.on(), ()-> livingRoomLight.off());

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
//        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
//
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
//
//        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
//        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
//
//        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
//        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

//        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
//        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
//        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

//        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();


        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

//        remoteControl.onButtonWasPushed(3);
//        remoteControl.offButtonWasPushed(3);
    }
}
