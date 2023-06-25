# 목적

- 자바의 기본기를 다지자
- 자바의 신 책을 읽고 공부 내용 기록하기
- 읽고 나만의 언어로 정리하기

<details> 

<summary><h2> Chapter 1. 프로그래밍이란 무엇인가? </h2></summary>

- 클래스가 뭔가요?

클래스는 객체들의 정보를 갖고 있습니다. 클래스는 자바에서 가장 작은 단위로 상태와 행위를 보통 갖고 있습니다.

- 메소드가 뭔가요?

클래스 내에 행위를 정의하는 것입니다.

- 메소드의 매개 변수는 어디에 적어주나요?

메서드명 옆에 소괄호 안에 적어줍니다.

- 메소드 이름 앞에 꼭 적어 적어 줘야 하는 건 뭐죠?

반환 타입 입니다. int, String, 객체명 등이 있습니다.

- 클래스가 갖고 있어야 한다고 한 두가지가 뭐죠?

상태인 변수(들)과 행위인 메서드(들) 입니다.

- 메소드에서 결과를 돌려주려면 어떤 예약어를 사용해야 하나요?

return 변수명 혹은 식 을 통해 돌려줍니다. 다만 void일 경우 반환 값이 없는 것이기 때문에 return을 적지 않습니다.

</details>

<details>

<summary><h2>Chapter 2. HelloGodOfJava</h2></summary>

- main() 메소드의 메소드 이름 앞에는 어떤 예약어들이 들어 가나요? (순서대로 쓰세요)

public static void

- main() 메소드의 매개변수에는 어떤 값이 들어가나요?

(Strings[] args)

- 만약 여러분들이 만든 클래스에 main() 메소드가 없다면, java 명령어로 그 클래스를 수행할 수 있나요?

아니요

- System.out.println() 메소드는 어떤 용도로 사용하나요?

콘솔에 출력하기 위해 사용합니다.

- System.out.print() 메소드는 System.out.println() 메소드와 어떤 차이가 있나요?

println은 마지막에 \n 이 포함되어 있으며 println() 메서드가 여러개 enter누른것처럼 콘솔에 출력되지만, print()는 여러개가 있어도 콘솔에 한줄로 출력됩니다.

- // 는 무엇을 하는데 사용하는 기호인가요?

한줄 주석

- /* 로 시작하고, */로 끝나는 사이에 있는 소스들을 어떻게 되나요?

/*으로 시작하여 */으로 끝나는 주석은 블록 주석으로, 해당 블록 내의 모든 내용은 무시된다.

- 메소드를 선언할 때 반드시 꼭 있어야 하는 세가지는 무엇인가요?

리턴 타입, 메소드 이름, 메소드 내용

</details>

<details>

<summary><h2>Chapter 3. 자바를 제대로 알려면 객체가 무엇인지를 알아야해요</h2></summary>
- 클래스와 객체의 차이점을 말해 주세요

클래스는 청사진으로 자바에서 가장 작은 단위입니다. 이 클래스를 new 생성자를 통해 생성한 것을 객체라고 합니다.

- 객체를 생성하기 위해서 꼭 사용해야 하는 예약어는 뭐라고 했죠?

new 생성자

- 객체를 생성하기 위해서 사용하는 메소드 같이 생긴 클래스 이름에 소괄호가 있는 것을 뭐라고 하나요?

기본 생성자

- 메소드를 사용하기 위해서는 어떤 것을 만들어야 하나요?

객체

- 객체를 만드려면 어떤 예약어를 사용하고, 클래스의 무엇을 사용해야 하나요?

객체를 만들려면 new 생성자를 사용해야하고, 클래스에서 생성자 함수를 만들어야 합니다.
</details>

<details>

<summary><h2>Chapter 4. 정보를 어디에 넣고 싶은데</h2></summary>

<h3> 변수의 종류</h3>

- 지역 변수 → 메소드 내의 변수들(중괄호 내의 변수) → 지역 변수를 선언한 중괄호 내에서만 유효함
- 매개 변수 → 파라미터, 메소드에 넘겨주는 변수들(소괄호 내의 변수)
- 인스턴스 변수 → 클래스 내에 있지만 메소드 밖에 있는 변수들. (단 static이 없어야함)
- 클래스 변수 → 인스턴수 변수 앞에 static이 붙으면 클래스 변수

<h3>변수 명을 왜 나눌까?</h3>

위 네 개의 변수의 사용 용도가 다르고, 생명 주기가 다름

<h3>기본자료형</h3>

- 슷자형
    - 정수형 - byte(1), short(2), int(4), long(8), **char**
    - 소수형 - float(4), double(8)
- boolean

byte 타입은 왜 만들었을까요? → 데이터를 저장할 때, byte 값들을 조합해서 적은 공간에 보다 많은 내용을 저장하기 위해

byte : -128~127

정수형 이진법의 맨 앞은 양수와 음수를 나누기 위해 사용

맨 앞이 0이면 양수, 1이면 음수

|  | 2^6 | 2^5 | 2^4 | 2^3 | 2^2 | 2^1 | 2^0 | 결과값 |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| byteMin | 1 | 0 | 0 | 0 | 0 | 0 | 0 | -128 |
| byteMax | 0 | 1 | 1 | 1 | 1 | 1 | 1 | 127 |

```java
Byte byteMin=-128;
        Byte byteMax=127;
        System.out.println("byteMin = "+byteMin); // - 128
        System.out.println("byteMax = "+byteMax); // 127

        byteMin--;
        byteMax++;
        System.out.println("byteMin = "+byteMin); // 127
        System.out.println("byteMax = "+byteMax); // -128
```

byteMin의 값을 2진수로 표현하면 1000_0000 에서 1을 뺀다면 0111_1111이 되고,

byteMax의 값을 2진수로 표현하면 0111_1111 에서 1을 더하면 1000_0000이 된다.

1 bit == 1자리

float(4byte) → 부호(1bit) + 지수(8bit) + 가수(23bit) = 32bit

double(8byte) → 부호(1bit) + 지수(11bit) + 가수(52bit) = 64bit

char 정의하는 방법 3가지 !! char는 unsigned이므로 음수를 저장하지 못함

- 알파벳 혹은 한글로 정의 → char case1 = ‘a’;
- 유니코드로 정의 → char case2 = ‘\u0097’
- 0~65535 안에서 숫자로 정의 → char case3 = ‘9100’

기본 자료형의 값을 할당하지 않으면? → 변수를 초기화할 때, 기본값으로 할당되어 있음. 단, 지역 변수로 사용할 경우 변수에 값을 할당하지 않으면 컴파일 되지 않음.
정수형의 기본값은 0임. 단 char는 \u0000 으로 빈칸임. boolean 기본값은 false

- 네가지 종류 변수는 어떻게 구분할 수 있나요?

변수 선언 위치에 지역 변수, 매개 변수, 인스턴스 변수를 구분하고, 인스턴스 변수 앞에 static을 선언하면 클래스 변수가 됩니다.

- int or long 자료형을 사용하면 되는데 byte 타입은 왜 만들었을까요?

byte 타입을 활용해서 동영상이나 이미지 저장을 할 때, 적은 공간에 보다 많은 내용을 저장할 수 있습니다.
</details>

<details>
<summary><h2>Chapter 5. 계산을 하고 싶어요</h2></summary>


소수형은 비트 연산이 불가능

A & B → 두 값이 모두 true여야 true 반환

A | B → 두 값이 모두 false여야 false 반환

A^B → 두 값이 달라야 true 반환

A조건 && B 조건이 있을 때, A조건이 false일 경우 B조건은 연산을 수행하지 않고 false 반환

모든 참조 자료형은 +연산만 가능. 해당 클래스에 있는 toString 메소드의 결과에 +연산을 하는 것

기본자료형 형 변환(casting)

* 작은 타입에서 큰 타입으로 형 변환할 때, 캐스팅해줄 필요가 없음
* 큰 타입에서 작은 타입으로 형 변환할 때, 명시적으로 캐스팅을 해주어야 함.
* 단, 큰 타입에서 작은 타입으로 형 변환할 때는 예상치 못한 값이 올 수도 있다.
  (ex. short shortValue = 256 → shortValue = (byte) 256 → shortValue의 값은 0이 나옴

❗️ 실제 돈을 계산하는 부분을 계산할 때에는 double이나 float을 절대 사용해서 안된다. 이런 중요한 계산이 필요할 때 BigDecimal이라는 클래스를 사용해야 한다.

</details>

<details>

<summary><h2>제가 조건을 좀 따져요</h2></summary>

switch 문장에서는 한번 조건을 만족시켜 줬다면, 그 다음 break가 올 때 까지, 어떤 case가 오든 상관 안하고 계속 무사 퉁과시킨다.

- 왜 이렇게 break를 쓰게 했을까?

비교 대상이 값에 범위에 있다면 if를 사용하겠지만, 특정 조건에 따른 처리를 해야 할 경우에는 switch문을 사용하면 좋다.

ex) 달력

```java
public class Calender {
    public void switchCalender(int month) {
        switch (month) {
            case 1:
            case 3:
            case
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + " has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + " has 01 days");
                break;
            case 2:
                System.out.println(month + " has 28 or 29 days");
                break;
            default
                ;
                System.out.println(month + " is not a month");
        }
    }
}
```

- 보통 default를 마지막에 두는데 꼭 마지막에 둬야 하나요?

문법상 정해진 것은 없지만, default를 중간에 둘 경우 원하지 않는 결과가 나올 수 있기에 마지막에 두는 것을 권장함.

switch를 통해 숫자를 비교할 때, 적은 숫자부터 증가시켜주는 것을 권장함.

반복문에서 continue와 break;

continue는 반복문 중괄호 시작으로 돌아감. 즉, 반복문 내에서 continue 하위의 부분을 생략

break는 반복문을 종료시킴 반복문의 마지막 중괄호 밖으로 나감.

</details>