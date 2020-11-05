#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<ctype.h>

#define NO_KEYWORDS 7
#define ID_LENGTH 12
typedef struct tokenType{
	int number;
	union{
		char id[ID_LENGTH];
		int num;
		
	} value;
} TokenType ;

enum tsymbol{tnull=-1, tnot, tnotequ, tmod, tmodAssign, tident, tnumber,
										/* 0 1 2 3 4 5 */
			tand, tlparen, trparen, tmul, tmulAssign, tplus, tinc, taddAssign, tcomma, tminus, tdec, tsubAssign, 
			tdiv, tdivAssign, tsemicolon, tless, tlesse, tassign, tequal, tgreat,
			tgreate, tlbracket, trbracket, teof, tconst, telse, tif, tint, treturn, tvoid, twhile, tlbrace, tor, trbrace
};
char *keyword[NO_KEYWORDS]= {
	"const","else","if","int","return","void","while"
};
enum tsymbol tnum[NO_KEYWORDS] ={
	tconst, telse , tif, tint, treturn, tvoid, twhile
};
TokenType scanner(void);
int superLetter(char );
int superLetterOrDigit(char );
void lexicalError(int );
int getIntNum(char );
int hexValue(char);
//void printToken(TokenType);
int main(void)
{
	printf("Å×½ºÆ®");
}


TokenType scanner(void)
{
	struct tokenType token;
	int i, index;
	char ch, id[ID_LENGTH];

	token.number = tnull;

	do {
		while(isspace(ch = getchar()))
		{
		}

		if(superLetter(ch))
		{
			i = 0;
			do {
				if(i < ID_LENGTH) id[i++] = ch;
				ch = getchar();
			} while(superLetterOrDigit(ch));
			
			if(i >= ID_LENGTH) lexicalError(1);
			
			id[i] = '\0';
			ungetc(ch, stdin);

			for(index = 0 ; index < NO_KEYWORDS ; index++)
			{
				if(!strcmp(id, keyword[index])) break;
			}	

			if(index < NO_KEYWORDS)
			{
				token.number = tnum[index];
				token.value.num = 0;
			}
			else
			{
				token.number = tident;
				strcpy(token.value.id, id);
			}
		}
		else if(isdigit(ch))
		{
			token.number = tnumber;
			token.value.num = getIntNum(ch);
		}
		else 
		{
			switch(ch)
			{
				case '/' :
					ch = getchar();
					if(ch == '*')
					{
						do{
							while(ch != '*')
							{
								ch = getchar();
							}
							ch = getchar();
						} while(ch != '/');
					}
					else if(ch == '/')
					{
						while(getchar() != '\n');
					}
					else if(ch == '=')
					{
						token.number = tdivAssign;
					}
					else
					{
						token.number = tdiv;
						ungetc(ch, stdin);
					}
				
					break;
				
				case '!' :
					ch = getchar();
					if(ch == '=')
					{
						token.number = tnotequ;
					}
					else
					{
						token.number = tnot;
						ungetc(ch, stdin);
					}
					break;

				case '%' :
					ch = getchar();
					if(ch == '=')
					{
						token.number = tmodAssign;
					}
					else
					{
						token.number = tmod;
						ungetc(ch, stdin);
					}
					break;

				case '&' :
					ch = getchar();
					if(ch == '&')
					{
						token.number = tand;
					}
					else
					{
						lexicalError(2);
						ungetc(ch, stdin);
					}
					break;

				case '*' :
					ch = getchar();
					if(ch == '=')
					{
						token.number = tmulAssign;
					}
					else
					{
						token.number = tmul;
						ungetc(ch, stdin);
					}
					break;

				case '+' :
					ch = getchar();
					if(ch == '+')
					{
						token.number = tinc;
					}
					else if(ch == '=')
					{
						token.number = taddAssign;
					}
					else
					{
						token.number = tplus;
						ungetc(ch, stdin);
					}
					break;

				case '-' :
					ch = getchar();
					if(ch == '-')
					{
						token.number = tdec;
					}
					else if(ch == '=')
					{
						token.number = tsubAssign;
					}
					else
					{
						token.number = tminus;
						ungetc(ch, stdin);
					}
					break;

				case '<' :
					ch = getchar();
					if(ch == '=')
					{
						token.number = tlesse;
					}
					else
					{
						token.number = tless;
						ungetc(ch, stdin);
					}
					break;

				case '=' :
					ch = getchar();
					if(ch == '=')
					{
						token.number = tequal;
					}
					else
					{
						token.number = tassign;
						ungetc(ch, stdin);
					}
					break;

				case '>' :
					ch = getchar();
					if(ch == '=')
					{
						token.number = tgreate;
					}
					else
					{
						token.number = tgreat;
						ungetc(ch, stdin);
					}
					break;

				case '|' :
					ch = getchar();
					if(ch == '|')
					{
						token.number = tor;
					}
					else
					{
						lexicalError(3);
						ungetc(ch, stdin);
					}
					break;

				case '(' : token.number = tlparen;		break;
				case ')' : token.number = trparen;		break;
				case ',' : token.number = tcomma;		break;
				case ';' : token.number = tsemicolon;	break;
				case '[' : token.number = tlbracket;	break;
				case ']' : token.number = trbracket;	break;
				case '{' : token.number = tlbrace;		break;
				case '}' : token.number = trbrace;		break;
				case EOF : token.number = teof;			break;

				default : {
					printf("Current character : %c", ch);
					lexicalError(4);
					break;
				}
			}
		}
	} while(token.number == tnull);

	return token;
}
int superLetter(char ch)
{
	if(isalpha(ch)||ch=='_') return 1;
	else return 0;
}
int superLetterOrDigit(char ch)
{
	if(isalnum(ch)|| ch=='_') return 1;
	else return 0;
}

void lexicalError(int n){
	printf("****Lexical Error : ");
	switch(n){
		case 1 : printf("an identifier length must be less than 12./n");
			break;
		case 2 : printf("next character must be &. \n");
			break;
		case 3 : printf("next character must be | .\n");
			break;
		case 4 : printf("invalid character!!!. \n");	
	}
}

 
