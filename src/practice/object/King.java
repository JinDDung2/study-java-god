package practice.object;

import java.util.List;

public class King implements Judger{

    private String name;

    public King() {}

    public King(String name) {
        this.name = name;
    }

    @Override
    public void justice(List<Witness> witnesses) {
        System.out.println("재판을 시작합니다");
        for (Witness witness : witnesses) {
            // 1. 입장 메시지 전송
            callEntering();
            // 2. 입장 요청 받은 객체 역할 수행
            witness.enter();
            // 3. 증언하라 메시지 전송
            callTestifying(witness);
            // 4. 증언하라 메시지 받은 객체 역할 수행
            witness.testifying();
        }
    }

    @Override
    public void callEntering() {
        System.out.println("증인 들어오세요!");
    }

    @Override
    public void callTestifying(Witness witness) {
        System.out.printf("%s 가 명한다. %s 증언하라!%n", this.name, witness.getWitnessName());
    }

    public String getName() {
        return this.getName();
    }

}
