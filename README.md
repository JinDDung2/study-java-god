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

<summary><h2>Chapter 6. 제가 조건을 좀 따져요</h2></summary>

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

<details>

<summary><h2>Chapter 7. 여러 데이터를 하나에 넣을 수는 없을까요?</h2></summary>

배열은 무조건 선언할 때 크기가 지정되어야 함. 이러한 단점을 보완한 것이 Collections임

배열을 선언한 후 출력하면 “타입이름@고유번호”순으로 출력된다. toString()이라는 메소드를 만들어주면 배열의 값들 출력 가능

[Ljava.lang.String.@1304e18c]

- [L : 가장 앞으로 “[”는 배열을 의미하며, L은 해당 배열은 참조 자료형이라는 의미
- java.lang.String : 해당 배열이 어떤 타입의 배열인지를 알려줌
- @1304e18c : 해당 배열의 고유 번호

참조 자료형 배열의 각각의 값은 초기화하지 않으면 null이 된다.

</details>

<details>

<summary><h2>Chapter 8. 참조 자료형에 대해서 더 자세히 알아봅시다</h2></summary>

* 참조자료형과 기본자료형의 차이는?
  참조 자료형은 new를 사용해서 객체를 생성해야 한다.(String 제외)

"+" 연산은 참조 자료형 중에서 String 클래스만 사용 가능하고 나머지는 클래스에서 사용할 수 없다.
다른 참조형이 사용할 수 있는 연산자는 값을 할당하기 위한 등호 오직 "=" 뿐이다.

기본 생성자는 자바에서 자동으로 만들어 준다. 하지만 다른 파라미터를 포함한 생성자를 만들어 둘 경우 기본 생성자는 자동으로 만들어지지 않기 때문에, 명시적으로 만들어 두어야 한다.

* 생성자는 왜 필요할까?
  이름에서 알 수 있듯이 객체를 생성하여 사용하기 위해 꼭 필요한 것이다. 객체를 생성하는 곳은 객체를 설계느느 클래스 내부가 아닌 다른 메서드(main 같은)의 내부이기 때문이다.

생성자를 클래스 내에 만들 때, 다른 메소드 아래 두어도 상관은 없지만, 암묵적인 약속 하에 필드, 생성자, 메소드 순으로 정의한다.

* Dto를 만들면 무슨 장점이 있을까? (아키텍처 관점 말고 자바 관점에서 생각해보자)

자바의 메서드를 선언할 때, 리턴 타입은 최대 한가지 이다. 즉, 복합적인 데이터를 리턴하려면 두 가지 방식이 있다. 여러 개의 데이터를 넣은 배열(or Collections)과 참조 자료형(객체)이다.
복합적인 데이터가 각각 다른 타입이라면 선택지는 객체를 만드는 것밖에 없다. 이렇게 만든 객체(0000DTO)가 리턴타입이 된다.

<h3>메소드 overloading</h3>
클래스의 생성자는 파라미터들을 서로 다르게 하여 선언이 가능하며 이는 메서드 오버로딩의 대표적인 예시 이다.
메소드 오버로딩은 메서드 이름만 같도록 하고, 파라미터만 다르게 하는 것을 의미한다.
(단, 파라미터의 타입과 개수가 같지만 파라미터의 이만 다르다면 같은 메소드로 인식한다.)

* 왜 메소드 오버로딩을 사용할까?

같은 역할을 하는 메소드는 같은 메소드 이름을 가져야 하지만, 파라미터가 다를 수 있기 때문이다. 예를 들어, System.out.println()을 할 때, 소 괄호 안에 인자가 달라도 그대로 출력이 되는 것은
메소드 오버로딩이 되어 있기 때문이다.
만약, 오버로딩이 불가하다면 printlnInt(), printlnLong() 등 이렇게 표현해야 하기에 더 불편하다.

* 메서드를 정의할 때, 리턴 뒤에 다른 구문을 넣으면 어떻게 될까?

```java
    pubic String getName(){
        String name="heo";
        return name;
        name+="king";
        }
```

unreachable statement 에러가 발생한다. 즉, 리턴 문장 이후 어떤 문장도 있으면 안된다.

* if문 안에 리턴 문장이 있을 경우

if문 안에 리턴 문장이 있을 경우, if 밖에 혹은 else구문을 통해 리턴을 만들어 두어야 한다. 보통 전자가 깔끔하다.

```java
    public String getSocialLogin(String providerId){
        if(providerId=="kakao"){
        return"kakao";
        }
        return"naver";
        }
```

<h3>static 메서드와 일반 메소드의 차이

static 메서드 안에서 변수를 활용하려면 static을 선언한 변수여야 한다.
(static은 클래스 변수를 사용하기 때문.)

객체는 여러개 생성하지만, 한 번만 호출되어야 하는 코드가 있다면 "static 블록"을 사용한다.

<h3><Pass by value, Pass by reference></h3>

Pass by value : 값만 전달한다 -> 호출되기 전과 후에 데이터가 변경되지 않음
Pass by reference : 값이 아닌 객체의 참조를 전달한다-> 호출한 메소드의 데이터에도 영향을 줌

기본 자료형은 **무조건** **"Pass By value"** 로 데이터를 전달한다.
참조 자료형은 **"Pass By reference"** 로 데이터를 전달한다.

```java
public class Reference {
    public void callPassByValue() {
        int a = 100;
        String b = "b";
        System.out.println("before passByValue");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        passByValue(a, b);
        System.out.println("after passByValue");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public void passByValue(int a, String b) {
        a = 1000;
        b = "change";
        System.out.println("in passByValue");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public void callByReference() {
        MemberDto member = new MemberDto("wonrok", 20);
        System.out.println("before passByReference");
        System.out.println("member = " + member);
        passByReference(member);
        System.out.println("after passByReference");
        System.out.println("member = " + member);
    }

    public void passByReference(MemberDto member) {
        member.setName("rokwon");
        member.setAge(27);
    }

    public static void main(String[] args) {
        Reference reference = new Reference();
        reference.callPassByValue();
        /*
        before passByValue
        a = 100
        b = b
        in passByValue
        a = 1000
        b = change
        after passByValue
        a = 100
        b = b
        */
        reference.callByReference();
        /*
        before passByReference
        member = MemberDto{name='wonrok', age=20}
        after passByReference
        member = MemberDto{name='rokwon', age=27}
         */
    }
}

```

pass by value는 값을 전달하는 작업이고, 호출되기 전과 후에 데이터가 변경되지 않는다.
-> 모든 기본 자료형은 pass by value이다.
pass by reference는 값이 전달되면, 호출한 메소드의 데이터에도 영향이 있다.
-> 참조자료형은 값이 아닌 참조가 전달되는 pass by reference이다.

파라미터를 여러개 넣어 주는 신기한 방법

```java
public void getMemberName(String...names){...}
```

</details>

<details>

<summary><h2>Chapter 9. 자바를 배우면 패키지와 접근제어자는 꼭 알아야 해요</h2></summary>

### 패키지의 제약사항

- 소스의 가장 첫 줄에 있어야만 한다.
- 패키지 선언은 소스 하나에는 하나만 있어야 한다.
- 패키지 이름과 위치한 폴더 이름이 같아야 한다.
- 패키지 이름을 java로 시작해서는 안된다. → Prohibited package name 에러 메세지

### 패키지 이름을 지정할 때 유의점

- 패키지 이름은 모두 소문자로 지정해야 한닫는 약속
- 자바의 예약어를 사용해서는 안됨
  ex) int, static

### 접근 제어자

- public : 누구나 접근 가능
- protected : 같은 패키지 내 or 상속받은 경우 가능
- package-priavte(default) : 같은 패키지 내 접근 가능
- private : 해당 클래스만 접근 가능

</details>

<details>

<summary><h2>Chapter 10. 자바는 상속이라는 것이 있어요</h2></summary>

## 상속

자식 클래스의 생성자가 호출되면, 자동으로 부모 클래스의 매개 변수 없는 생성자가 실행됨

super()을 사용하면 부모 클래스의 생성자를 호출한다는 것을 의미한다.

자바는 부모의 매개변수가 없는 기본 생성자를 찾는 것이 기본이기에, 부머 클래스에 매개 변수가 있는 생성자만 있을 경우에는 super()을 이용해서 부모 생성자를 꼭 호출해야 한다.

## 메소드 오버라이딩(Overriding)

- 메소드 오버라이딩은 부모 클래스의 메소드와 동일한 시그니처를 갖는 자식 클래스의 메소드를 재정의할 때 사용함
- 자식 클래스 생성자는 부모 클래스의 디폴트 생성자를 찾지만, 오버라이딩 된 메소드는 재정의한 메소드만 호출함
- 오버라이딩 된 메소드는 부모 클래스와 동일한 리턴 타입을 가져야 함.
- 오버라이딩 된 메소드의 접근 제어자는 부모 클래스에 있는 메소드와 달라도 되지만, 접근 권한이 확장된 경우에만 허용되고, 축소될 경우 컴파일 에러가 발생함.
  (public > protect > packge-private > private, 오른쪽으로 갈수록 축소됨)

만약 자식 클래스에서 리턴 타입을 바꾼다면 “return type String is not compatible with void” 에러를 만난다. 부모클래는 void인데 자식클래스에서 String을 리턴했다고
알려주며 에러를 알려준다.

### 형 변환(casting)

참조 자료형은 자식 클래스의 타입을 부모 클래스의 타입으로 형 변환하면 부모 클래스에서 호출할 수 있는 메소드들은 자식 클래스에서도 호출할 수 있으므로 전혀 문제가 안되기에 형 변환을 명시적으로 해줄 필요가 없다.

자식 클래스를 부모 클래스로 형 변환은 보통 안되지만 예외사항이 1개 있다.

자식 타입으로 선언한 변수를 부모 타입으로 업캐스팅을 한 경우, 이 변수는 다시 자식 타입으로 다운캐스팅이 가능하다.

instancof를 활용하여 객체의 타입을 확인할 수 있으며, 조건절로 확인을 할 때는 가장 하위에 있는 자식 타입부터 확인해야 한다.(부모 타입도 true라는 결과를 제공하기 때문)

### 다형성

(형 변환을 하더라도, 실제 호출되는 것은 원래 객체에 있는 메소드가 호출된다)
<br></br>
하나의 인터페이스나 클래스를 여러 가지 타입으로 사용할 수 있는 능력을 의미합니다. 다형성을 이용하면 동일한 코드를 사용하여 다양한 객체를 처리할 수 있으며, 코드의 재사용성과 유연성을 높일 수 있습니다.

</details>

<details>

<summary><h2>Chapter 12. 모든 클래스의 부모는 Object에요</h2></summary>

아무런 상속을 받지 않는다면, Obejct 클래스를 상속받은 것이다.

자바는 다중 상속을 받을 수는 없지만, 여러 단계로 상속을 받을 수는 있다.

## 왜 Object를 상속하도록 했을까?

‘클래스라면 이정도의 메서드는 있어야지’ 인 것 같다.
ex) toString(), equals(), hasCode, getClass()

**equals() 메소드를 오버라이딩 할 때에는 hashCode() 메소드도 같이 오버라이딩 해야 한다는 것이다. equlas()를 통해 객체가 서로 같다고 이야기 할 수는 있지만, 그 값이 같다고 해서 그 객체의 메모리 주소값이 같지는 않다. 같은 hashCode() 메소드 결과를 갖도록 hashCode() 메소드도 재정의 해줘야 한다.**

hascode() 메소드는 기본적으로 객체의 메모리 주소를 16진수로 리턴한다.

만약 두 객체가 동일하다면 hashCode() 값은 무조건 동일해야 한다.

자바 API 문서에서는 hashCode() 메소드를 재정의할 때 다음과 같은 조건을 따라야 한다고 명시했다.

- 자바 애플리케이션이 수행되는 동안 어떤 객체에 대해 이 메소드가 호출될 때에는 항상 동일한 int 값을 리턴해 주어야 한다.(단, 자바를 실행할 때마다 같은 값일 필요는 없다.)
- 어떤 두 객체에 대하여 equlas() 메소드를 사용하여 비교한 결과 true라면, 두 객체의 hashCode() 메소드를 호출하면 동일한 int값을 리턴해야 한다.
- 두 객체를 equals() 메소드를 사용하여 비교한 결과 false를 리턴했다고 해서, hashCode() 메소드를 호출한 int 값이 무조건 다를 필요는 없다. 하지만, 이 경우에 서로 다른 int 값을 제공하면 hashtable의 성능을 향상시키는데 도움이 된다.

[equlas()와 hashCode()](https://velog.io/@wlsgur1533/equals%EC%99%80-hashCode)

</details>

<details>

<summary><h2>Chapter 13. 인터페이스와 추상클래스, enum</h2></summary>

방법론

- 분석
- 설계
- 개발 및 테스트
- 시스템 릴리즈

## 인터페이스와 추상클래스

인터페이스와 abstract 클래스를 사용하는 이유

- 설계시 선언해 두면 개발할 때 기능 구현에만 집줄할 수 있음
- 개발자의 역량에 따른 메소드의 이름과 매개 변수 선언의 격차를 줄일 수 있음
- 공통적인 인터페이스와 abstract 클래스를 선언해 놓으면, 선언과 구현을 분리할 수 있음.

설계 단계에서 인터페이스만 만들어 놓고, 개발 단계에서 실제 작업을 수행하는 메소드를 만들면 설계 단계의 산출물과 개발 단계의 산출물이 보다 효율적으로 관리됨.

abstact 클래스는 내부에 abstac로 선언된 메소드가 0개 이상 있으면 된다.

abstact로 선언된 메소드가 1개 이상이라면 클래스명 앞에 abstact를 선언해줘야 한다.

### final

final의 역할은 두 가지 있음

- final 변수 : 더 이상 바꿀 수 없다.
- final 메소드 : 더 이상 오버라이딩 할 수 없다.
- 클래스 :  더 이상 상속받을 수 없다. (ex. String)

인터페이스 내부에 final 메소드 선언은 불가함.

## enum 클래스라는 상수의 집합

enum을 선언하면 ‘이 객체는 상수의 집합이라는 것을 명시적으로 나타내는 것’
(상수는 대문자를 사용하고 띄어쓰기를 ‘_’로 사용)

enum 클래스의 부모는  java.lang.Enum이다.

protect Enum(String name, int ordinal) 라는 부모 생성자가 있으며, name은 상수 이름, ordinal은 상수가 선언된 순서로 0부터 증가한다.

enum 클래스는 개발자들이 Object 클래스 중 4개의 메소드를 오버라이딩 하지 못하게 했다.

그 중 equlas()와 hashCode()는 사용해도 되지만, clone()과 finalize() 메소드는 사용하면 안된다.

toString() 메소드만 유일하게 final이 선언되지 않아 오버라이딩이 가능하다. 부모 클래스인 Enum 클래스에 선언되어 있는 메소드 중 compartTO(E e)는 순서(ordinal) 차이를 리턴한다.

## 정리

인터페이스와 abstract 클래스는 클래스의 골격을 잡아주고, 메소드를 선언해 놓을 때 매우 유용하게 사용할 수 있다.

### 추상클래스와 인터페이스 차이

목적과 사용법 : 추상클래스는 공통의 특성을 가진 클래스들의 베이스로 사용되며 abstract가 선언된 메서드만 자식이 재정의 하면 된다. 인터페이스는 클래스들이 어떤 동작을 수행 할지를 설계 단계에서 정의하고, 클래스가 해당 인터페이스를 구현한다면 인터페이스가 정의한 메서드를 재정의하도록 강제합니다.

상속 : 추상 클래스는 다중 상속이 불가하지만, 인터페이스는 다중 구현이 가능합니다.

정의 : 추상클래스는 abstract가 붙지 않은 메소드를 정의할 수 있지만, 인터페이스는 메서드 정의를 할 수 없습니다.

마지막으로 추상클래스는 final 메소드를 선언할 수 있지만, 인터페이스는 final 메소드를 선언할 수 없습니다.

</details>

<details>

<summary><h2>Chapter 14. 다 배운 것 같지만 중요한 것이 있어요</h2></summary>

자바에서 예외는 “우리가 예상한, 혹은 예상치도 못한 일이 발생하는 것을 미리 예견하고 안전장치를 하는 것”

## try-catch

예외가 발생하지 않는 경우 → try 내에 모든 문장이 실행되고 try-cacth 이후 내용이 실행됨

예외가 발생하는 경우 → try내에서 예외가 발생한 지점 이후부터 실행이 안되고, cacth 내용이 실행된 후에 try-cacth 이후 내용이 실행

try 내부에서 변수를 선언하였는데, 에러가 터질 경우 → ‘cannot found symbol’ 에러 호출

catch는 여러개 사용 가능

### finally

try-catch 구문에서 예외가 터지든 안터지든 finally 구문은 무조건 실행 됨

모든 예외의 부모 클래스는 java.lang.Exception 클래스다.

모든 예외의 할아버지는 java.lang.Throwable 클래스다.

그래서 Excetpion으로 catch하는 것은 catch중 마지막에 두어야 한다.

## 예외의 종류

- checked exception
- error
  - 자바 프로그램 밖에서 발생한 예외
  - 서버의 디스크 고장
  - 메인보드가 맛이 감
  - 자바 프로그램이 제대로 동작하지 못하는 경우
- runtime exception
  - 미리 감지하지 못했을 때 발생
  - RuntimException을 확장한 예외들 (ex. NPE)
  - 컴파일에 체크를 하지 않기 때문에 unchecked exception 이라고도 부름

### Error와 Exception의 차이

- 프로그램 안에서 발생하면 exception, 밖에서 발생하면 error
- 프로그램이 멈추면 error, 계속 실행할 수 있으면 excetpion
- 프로세스에 영항을 주면 error, 쓰레드에 영향을 주면 exception

## Throwable 클래스

### 생성자

- Throwable()
- Throwable(String message)
- Throwable(String message, Throwable cause)
- Throwable(Throwable cause)

### 자주 사용하는 메소드

- getMessage()
  - 예외 메시지를 String 형태로 받음
  - 예외가 출력되었을 때, 어떤 예외가 발생되었는지 확인하기에 유용함
  - 메시지를 활용하여 별도의 예외 메시지를 사용자에게 보여주기 좋음
  - ex) null
- toString()
  - 예외 메시지를 String 형태로 제공 받음
  - getMessage() 메소드보다는 약간 더 자세하게, 예외 클래스 이름도 같이 제공
  - ex)null \n java.lang.NullPointerExcetpion
- printstackTrace()
  - 가장 첫 줄에는 예외 메시지를 출력
  - 두 번째 줄부터는 예외가 발생하게 된 메소드들의 호출 관계(스택 트레이스)를 출력
  - ex)null \n java.lang.NullPointerExcetpion \n ~~~~~(많음)

## throws

내부 메소드에서 throws를 했다면 외부 메소드에서도 throws를 해야함.

혹은 내부 메소드를 try~catch로 잡아도 상관없음

[Java Excetpion Strategey](https://stackify.com/best-practices-exceptions-java/)

</details>

<details>

<summary><h2>Chapter 15. String</h2></summary>

> public final class String extends Object implements Serializable, Comparable<String>, CharSequence
>

final이 선언되어 있는 것을 보니 더이상 확장할 수 없음을 알 수 있다.

- Serializable 인터페이스는 구현해야 하는 메소드가 하나도 없다. 🤔? 인터페이스를 구현한다고 선언해 놓으면, 해당 객체를 파일로 저장하거나 다른 서버에 전송 가능한 상태가 된다.
- Comparable 인터페이스는 compareTo()라는 메소드 하나만 선언되어 있다. 이 메소드는 equals() 메소드와 다른 점은 리턴 타입이 int다. 객체의 순서를 처리할 때 유용하게 사용된다.
- CharSequence 인터페이스는 해당 클래스가 문자열을 다루기 위한 클래스라는 것을 명시적으로 나타내는 것이다. (StringBuilder와 StringBuffer 클래스도 이 인터페이스를 구현해 두었다.)

## String 생성자

String(byte[] bytes)

String(byes[] bytes, String charsetName)

글자가 깨지는 현상을 방지하기 위해 byte 배열로 생성할 때 사용한 캐릭터 셋을 문자열로 다시 전활할 때에도 동일하게 사용해야 한다.

null = 객체에 초기화가 되어 있지 않을 때 발생

null을 체크하는 습관 필요

## 메소드

- lenght() → 길이
- isEmpty() → 값이 비어있는지
- equlasIgnoreCase(String another) → 대소문자 구분하지 않고 두 개의 값이 같은지 확인
- startsWith(String prefix) → 파라미터 값으로 시작하는지 확인
- endWith(String suffix) → 파라미터 값으로 끝나는지 확인
- matches(String regex)
- conatins(CharSquence c)
- indexOf(~~) → 가장 왼쪽부터 문자열이나 char를 찾음 (못찾으면 -1 리턴)
- lastIndexOf(~~) → 가장 오른쪽부터 문자열이나 char를 찾음
- subString(int beginIndex, int endIndex) → beginIndex이상 endIndex미만 문자열을 잘라 리턴함
- split(String regex) → 정규표현식에 맞추어 문자열을 잘라 String 배열로 리턴
- trim() → 문자열 맨 앞과 맨 뒤의 공백 제거 후 문자열 리턴
- replace(CharSequence target, CharSequence replacement) → 해당 문자열에 있는 target과 같은 값을 replacement 값으로 대체
- replaceAll(String regex, String replacement) → 해당 문자열 내용 중 regex에 포현된 정규표현식에 포함되는 모든 애용을 replacement로 대체
- toLowerCase()
- toUpperCase()

자바에는 Constant Pool 존재 → String의 경우 동일한 값을 갖는 객체가 있으면, 이미 만든 객체를 재사용함

String은 불변임 → +로 다른 스트링을 더해줄 경우 기존 String 객체는 버려지고 연산이 수행된 새로운 객체가 만들어 지는 것임 → 이를 보완하는 것이 StringBuffer와 StringBuilder임

StringBuffer은 Thread-safe하지만, StringBuilder는 Thread-safe하지 않음

</details>

<details>

<summary><h2>Chapter 17.어노테이션이라는 것도 알아야 한다</h2></summary>

## 어노테이션을 위한 메타 어노테이션

### @Target

어노테이션을 어떤 것에 적용할 것인가?
FIELD, METHOD, TYPE

### @Retention

얼마나 오래 어노테이션의 정보를 유지할 것인가?
SOURCE : 컴파일 시 사라짐
CLASS : 컴파일러에 의해 참조 가능. 하지만, 가상 머신에서 사라짐
RUNTIME : 가상 머신에 의해 참조 가능

### @Documented

Javadocs API 문서에 포함되어 있다는 뜻

### @Inherited

모든 자식 클래스에서 부모 클래스의 어노테이션을 사용 가능하다는 뜻

## 어노테이션은 왜만들어 졌을까?

어노테이션이 만들어지기 전까지는 모든 자바 애플리케이션의 설정을 xml이나 properties 라는 파일에 저장했는데 이로 인해, 복잡해지고 설정이 어디에 쓰이는지 이해하려면 오랜 시간이 소요되었다. 어노테이션은 이러한 문제를 일부 해결해 주었다.

</details>