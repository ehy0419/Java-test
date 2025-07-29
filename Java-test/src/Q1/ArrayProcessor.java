package Q1;

public class ArrayProcessor {

    public int sumEvenNumbers(int[] numbers) {
        // TODO: 이 메서드를 완성하세요.
        // 1. 합계를 저장할 변수를 선언하세요.
        int sum = 0;
        // 2. 반복문을 사용해 배열의 모든 요소를 확인하세요.
        // 3. 현재 요소가 짝수인지 확인하는 조건문을 작성하세요.
        // 4. 짝수라면 합계 변수에 더하세요.
        // 5. 반복문이 끝나면 최종 합계를 반환하세요.

        ///  일반 for 문으로 하면.
//        for (초기값; 종료조건; 증감조건) {
//             반복할 작업
//        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }


        ///  향상된 for 문으로 하면.
//        for (타입 변수이름 : 배열) {
//             반복할 작업
//        }

        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }


        return sum; // 임시 반환 값
    }

    public static void main(String[] args) {
        ArrayProcessor processor = new ArrayProcessor();
        int[] numbers = {10, 3, 22, 5, 17, 8};
        int result = processor.sumEvenNumbers(numbers);
        System.out.println("짝수들의 합: " + result); // 예상 결과: 40
    }
}


/// 문제 : 정수 배열을 받아 짝수만 골라내어 그 합계를 반환하는 `sumEvenNumbers` 메서드를 완성하세요.
// 입력 : int[] numbers = {10, 3, 22, 5, 17, 8};
// 출력 : 정수이면서 짝수들의 합

/// 사고 흐름 분석하기
// 1. 합계를 저장할 변수 선언
// 짝수와 홀수의 상관없이 정수들의 합 int sum
// 변수 선언과 메모리에 값을 할당하면 int sum = 0;

// 2. 반복문을 사용하고, 배열의 모든 요소를 확인한다.
// for 문 이나 향상된 for 문 으로 하나씩 꺼내기.

// 3. 짝수 홀수 확인하려면 나머지 연산자 % 사용하고, 조건문 if 사용
// if ( num % 2 == 0 )

// 4. 짝수 조건에 맞으면 변수 선언과 할당한 sum에 더하면
// sum += num;

// 5. 반복문 끝나면 return 으로 sum 값으로 반환
// return sum;

// 6. 결과 기대 값은
// 짝수 인 10, 22, 8을 골라서 합 8을 만들려고 한다.

///  문제를 보면서 꺼낼만한 질문
// 결과를 저장할 공간을 만들어야 하는가?
// 데이터를 반복해야 하나
// 어떤 조건으로 추출해야 하나
// 조건을 충족하면 추후 과정은 어떻게 해야 하나
// 궁극적으로 무슨 값을 활용하고 싶은건가

/// 순서도에 활용할 만한 질문
// 배열 안에 숫자가 있다 - 정수인가 소수인가
// 하나씩 꺼내야 한다 - 반복문
// 짝수만 고른다 - 나머지 연산자 %
// 누적해서 더한다  +=
// 최종 합계를 돌려주려면 return

/// 떠올리지 못한 부분
// int[] numbers = {10, 3, 22, 5, 17, 8};
// sum += num;
// int sum = 0;   // 처음엔 0부터 시작
// int num = 10;  // 배열에서 꺼낸 값이 10이면
// sum += num;    // sum = sum + num;
//               // sum = 0 + 10;
//               // sum = 10;

// 다음 짝수 인 22가 다음에 오는 숫자라면?
// num = 22;
// sum += num;    // sum = sum + num;
//                // sum = 10 + 22;
//                // sum = 32;