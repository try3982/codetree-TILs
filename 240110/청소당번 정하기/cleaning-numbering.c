#include <stdio.h>

int main() {
    // 변수 선언 및 입력
    int n;
    scanf("%d", &n);
    
    int cnt2 = 0, cnt3 = 0, cnt12 = 0;
    
    // 각 날짜마다 확인합니다.
    for(int i = 1; i <= n; i++) {
        // 주기가 가장 긴 12일부터 확인합니다.
        if(i % 12 == 0)
            cnt12++;
        // 12일 주기에 들어오지 않는다면, 3일 주기에 들어오는지 확인합니다.
        else if(i % 3 == 0)
            cnt3++;
        // 3일 주기에도 들어오지 않는다면, 2일 주기에 들어오는지 확인합니다.
        else if(i % 2 == 0)
            cnt2++;
    }
    
    printf("%d %d %d", cnt2, cnt3, cnt12);
    return 0;
}