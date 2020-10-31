#include<stdio.h>

#define BUFSIZE 1024
#define isspace(x) ((x)==' '||(x)=='\t'||(x)=='\n')
#define TRUE 1

int getIntNum(char );
int hexValue(char);


int main() 
{
	char ch;
	int number;

	while(TRUE){
		do{
			ch =getchar();
		}
		while(isspace(ch));
		if(ch!=-1){
		printf("Å×½ºÆ® %c\n",ch);
		printf("%d\n",getIntNum(ch));
		
		}else{
			break;
		}

	}

	
	
}

int getIntNum(char firstCharacter)
{
	int num = 0;
	int value;
	char ch;
	
	if(firstCharacter!='0')
	{
		ch = firstCharacter;
		do{
			num = 10*num +(int)(ch-'0');
			ch = getchar();
			
		}while(isdigit(ch));
			
	}else{
		ch= getchar();
		if((ch>='0')&&(ch<='7'))
		{
			do{
				num=8*num +(int)(ch-'0');
				ch = getchar();
			}while((ch>='0')&&(ch<='7'));
				
		}else if((ch=='X')||(ch=='x')){
			while((value=hexValue(ch=getchar()))!=-1){
				num =16*num +value;
			}
		
		}else num =0;

	}
			
		ungetc(ch,stdin);
		return num;
}

int hexValue(char ch)
{
	switch(ch){
		case '0': case '1': case'2':case '3':case'4':
			case'5':case'6':case'7': case'8': case'9':
			return(ch-'0');
			case'A':case'B':case'C':case'D':case'E':case'F':
				return(ch-'A'+10);
			case'a':case'b':case'c':case'd':case'e':case'f':
				return (ch-'a'+10);
				default: return -1;
	}

}
