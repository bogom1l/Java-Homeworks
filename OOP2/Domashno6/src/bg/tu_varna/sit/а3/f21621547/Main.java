package bg.tu_varna.sit.а3.f21621547;

import sun.java2d.pipe.SpanShapeRenderer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        CompositeCommand commandsGroup = new CompositeCommand();
        commandsGroup.add(new SimpleCommand("ls"));
        commandsGroup.add(new SimpleCommand("pwd"));
        commandsGroup.add(new SimpleCommand("echo \"Hello, world!\""));

        try {
            commandsGroup.execute();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}