
#include <stdio.h>
#include <ctype.h>


void ToUpper(char*);//���ڿ��� �빮�ڷ� �����ϴ� �Լ��Դϴ�.
int IsPalindrome(char*);//ȸ�� ���θ� �����ϴ� �Լ��Դϴ�.
//int main(void)
//{
//
//	char string[100]="";
//	printf("���ڿ��� �Է��ϼ���: ");
//    gets_s(string,100);
//	printf("%s \n", string); 
//	
//    
//    ToUpper(string);
//
//    printf("���ڿ� Ȯ��: %s \n", string);
//
//    if (IsPalindrome(string)) 
//    {
//        printf("\nȸ�� �Դϴ�.");
//
//    }
//    else
//    {
//
//        printf("\nȸ���� �ƴմϴ�.");
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

    for (size = 0; string[size]; size++);//strlen�� ������� �ʰ� ���ڿ� ũ�⸦ ���ϱ� ���� ���� �ݺ��� �Դϴ�.

    printf("size: %d\n", size);

    size -= 1;//�迭 �ִ밪�� �°� ������
    int i = 0;
    for (i = 0; string[i]; i++)
    {
        printf("�� ���ڿ�: %c,%c, %d \n", string[i], string[size],size);

        if (string[i] != string[size]) 
        {
            IsPalindrome = 0;
            break;
        }
        size--;

    }

    return IsPalindrome;
}