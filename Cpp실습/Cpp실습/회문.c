
#include <stdio.h>
#include <ctype.h>


void ToUpper(char*);//문자열을 대문자로 변경하는 함수입니다.
int IsPalindrome(char*);//회문 여부를 구분하는 함수입니다.
//int main(void)
//{
//
//	char string[100]="";
//	printf("문자열을 입력하세요: ");
//    gets_s(string,100);
//	printf("%s \n", string); 
//	
//    
//    ToUpper(string);
//
//    printf("문자열 확인: %s \n", string);
//
//    if (IsPalindrome(string)) 
//    {
//        printf("\n회문 입니다.");
//
//    }
//    else
//    {
//
//        printf("\n회문이 아닙니다.");
//    }
//
//	return 0;
//}



void ToUpper(char* string) 
{
    int size = 0;
    for (size = 0; string[size]; size++)
    {
        if (islower(string[size]))
        {
            string[size] = toupper(string[size]);
        }
    }

}
int IsPalindrome(char* string) 
{
    int size = 0;
    int IsPalindrome = 1;

    for (size = 0; string[size]; size++);//strlen을 사용하지 않고 문자열 크기를 구하기 위해 사용된 반복문 입니다.

    printf("size: %d\n", size);

    size -= 1;//배열 최대값에 맞게 맞춰줌
    int i = 0;
    for (i = 0; string[i]; i++)
    {
        printf("비교 문자열: %c,%c, %d \n", string[i], string[size],size);

        if (string[i] != string[size]) 
        {
            IsPalindrome = 0;
            break;
        }
        size--;

    }

    return IsPalindrome;
}