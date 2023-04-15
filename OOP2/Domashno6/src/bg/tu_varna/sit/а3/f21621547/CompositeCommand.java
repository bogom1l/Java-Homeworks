package bg.tu_varna.sit.а3.f21621547;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class CompositeCommand implements SystemCommand {
    private List<SystemCommand> commands = new ArrayList<SystemCommand>();
    public void add(SystemCommand command) {
        commands.add(command);
    }

    public void remove(SystemCommand command) {
        commands.remove(command);
    }
    public void execute() throws IOException, InterruptedException {
        for (SystemCommand command : commands) {
            command.execute();
        }
    }
}