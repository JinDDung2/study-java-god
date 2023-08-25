package practice.design.strategy;

public class Attacker {
    // 전략 패턴
    public void runContextV1(Strategy strategy) {
        System.out.println("무기 장착 완료");
        strategy.runStrategy();
        System.out.println("전투 종료");
    }

    // 템플릿 콜백 패턴
    public void runContextV2(String weaponSound) {
        System.out.println("무기 장착 완료");
        executeWeapon(weaponSound).runStrategy();
        System.out.println("전투 종료");
    }

    private Strategy executeWeapon(final String weaponSound) {
        return new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println(weaponSound);
            }
        };
    }
}
