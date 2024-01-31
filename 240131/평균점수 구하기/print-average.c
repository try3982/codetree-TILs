#include <stdio.h>

int main() {
    // 실수 배열 선언
    double arr[8];

    // 변수 선언
    double sum = 0;

	// 8개의 실수를 배열에 입력받아 저장합니다.
    for(int i = 0; i < 8; i++){
        scanf("%lf", &arr[i]);
    }
	
	// 배열에 저장된 원소들의 합을 구합니다.
	for(int i = 0; i < 8; i++){
        sum += arr[i];
    }

    // 평균을 구하여 출력합니다.
    printf("%.1lf", sum / 8);

    return 0;
}