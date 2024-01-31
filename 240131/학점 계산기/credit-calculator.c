#include <stdio.h>

int main() {
    //과목의 개수 n을 입력받습니다.
    int n;
    scanf("%d", &n);

    // 변수 선언
    double arr[5];
    double sum = 0;

	// 배열에 실수를 입력받아 저장합니다.
    for(int i = 0; i < n; i++) {
        scanf("%lf", &arr[i]);
    }
	
	// 배열에 있는 실수들의 합을 구합니다.
	for(int i = 0; i < n; i++) {
        sum += arr[i];
    }

    //평균 구하기
    double avg = sum / n;

    // 출력
    printf("%.1lf\n", avg);

    if(avg >= 4.0)
        printf("Perfect");
    else if(avg >= 3.0)
        printf("Good");
    else
        printf("Poor");

    return 0;
}