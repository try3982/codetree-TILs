#include <stdio.h>

int main() {
    // 변수 선언
    int h, w;

	// 입력
	scanf("%d %d", &h, &w);
	
	// 키(cm)에서 키(m)로 단위 환산을 한 뒤 
	// 체질량지수 계산 식에 넣어야 함에 유의합니다.
	int bmi = w * 100 * 100 / (h * h);
    
    // 출력
	printf("%d\n", bmi);
	if(bmi >= 25)
		printf("Obesity");
    return 0;
}