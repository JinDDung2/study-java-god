package practice.object;

import java.util.ArrayList;
import java.util.List;

public class Law {

    public static void main(String[] args) {
        Judger judger = new King("king");
        List<Witness> witnesses = new ArrayList<>();
        witnesses.add(new CapSeller("capSeller"));
        witnesses.add(new Allice("allice"));
        judger.justice(witnesses);
    }
}
