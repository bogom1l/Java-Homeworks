package bg.tu_varna.sit.а3.f21621547;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SimpleCommand implements SystemCommand {
    private String c;
    public SimpleCommand(String c) {
        this.c = c;
    }
    public void execute() throws IOException, InterruptedException {
        ProcessBuilder builder = new ProcessBuilder();
        builder.command("bash", "-c", c);
        Process process = builder.start();

        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        process.waitFor();
    }
}