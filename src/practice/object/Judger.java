package practice.object;

import java.util.List;

public interface Judger {
    void justice(List<Witness> witnesses);
    void callEntering();
    void callTestifying(Witness witness);
}
