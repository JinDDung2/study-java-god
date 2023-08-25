package practice.design.strategy;

public class Client {
    public static void main(String[] args) {
        Strategy strategy;
        Attacker attacker = new Attacker();

        // 군인 만들기
        strategy = new StrategyGun();
        attacker.runContextV1(strategy);
        System.out.println();
        // 창병 만들기
        strategy = new StrategySpear();
        attacker.runContextV1(strategy);
        System.out.println("---------");
        System.out.println("템플릿 콜백 패턴 시작");
        attacker.runContextV2("미사일 푸슉푸슉");
        System.out.println();
        attacker.runContextV2("오펜하이머가 만든 원자폭탄 ...");
        System.out.println();
        attacker.runContextV2("탱크 펑펑펑");

    }
}
