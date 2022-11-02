package bg.tu_varna.sit.task07;

public class BitShifter {
    private String rotations[];

    public BitShifter(String[] rotations) {
        this.rotations = rotations;
    }

    public byte shift(byte number) {
        for (int i = 0; i < rotations.length; i++) {
            String direction = rotations[i];
            if (direction == "right") {
                int rightMostBit = number & 1;
                number >>= 1;
                number |= rightMostBit << 6;
            } else if (direction == "left") {
                int leftMostBit = (number >> 6) & 1;
                number <<= 1;
                number |= leftMostBit;
            }
        }
        return number;
    }
}
