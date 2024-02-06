#include <stdio.h>

int main() {
    // 변수 선언
    int arr[10];
    int sum2 = 0;
    int sum3 = 0;
    int cnt = 0;

    // 10개의 정수를 배열에 입력받아 저장합니다.
    for(int i = 0; i < 10; i++)
        scanf("%d", &arr[i]);

    // 짝수 번째 인덱스에 들어있는 수들의 합과 3의 배수 번째 인덱스에 들어있는 수들의 평균을 구합니다.
    for(int i = 0; i < 10; i++) {
        if((i + 1) % 2 == 0)
            sum2 += arr[i];
        if((i + 1) % 3 == 0) {
            sum3 += arr[i];
            cnt++;
        }
    }

    // 3의 배수 번째 인덱스에 들어있는 수들의 평균 구하기
    double avg3 = (double)sum3 / cnt;

    // 출력
    printf("%d %.1lf", sum2, avg3);

    return 0;
}