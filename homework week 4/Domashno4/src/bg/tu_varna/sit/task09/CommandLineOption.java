package bg.tu_varna.sit.task09;

public class CommandLineOption {
    private String[] options;

    public CommandLineOption() {
        this.options = new String[] {
                "transpose=",
                "crop="
        };
    }

    public void append(String arg) {
        String[] options = arg.split(" ");
        switch (options[0]) {
            case "crop":
                addCrop(options[1], options[2], options[1], options[2]);
            case "rotate":
                addRotate(options[1]);
        }
    }

    private void addRotate(String option) {
        this.options[1] = option;
    }

    private void addCrop(String outWith, String outHeight, String x, String y) {
        this.options[0] = outWith + outHeight + x + y;
    }

    public String build() {
        String result = "";
        for (int i = 0; i < this.options.length; i++) {
            result +=  this.options[i];
        }
        return result;
    }
}
