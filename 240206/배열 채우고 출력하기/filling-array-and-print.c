#include <stdio.h>

int main() {
    // 크기가 10인 배열을 구현합니다.
    char arr[10];
    for(int i=0; i<10; i++) {
        scanf(" %c",&arr[i]);
    }
    for(int i=9; i >=0; i--) {
        printf("%c",arr[i]);
    }
    
	
    return 0;
}