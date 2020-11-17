%{
#include <stdio.h>
#include <stdlib.h>
enum tsymbol{tnull=-1,tend, tnot, tnotequ, tmod, tmodAssign, tident, tnumber,
										/* 0 1 2 3 4 5 */
			tand, tlparen, trparen, tmul, tmulAssign, tplus, tinc, taddAssign, tcomma, tminus, tdec, tsubAssign, 
			tdiv, tdivAssign, tsemicolon, tless, tlesse, tassign, tequal, tgreat,
			tgreate, tlbracket, trbracket, teof, tconst, telse, tif, tint, treturn, tvoid, twhile, tlbrace, tor, trbrace
};
%}
letter [a-zA-Z]
digit [0-9]
%%

"const" return (tconst);
"else"	return (telse);
"if"	return (tif);
"int"	return (tint);
"return"return (treturn);
"void"	return (tvoid);
"while" return (twhile);



"/=" return (tdivAssign);
"!=" return (tnotequ);
"!" return (tnot);
"%=" return (tmodAssign);
"%" return (tmod);
"&&" return (tand);
"*=" return (tmulAssign);
"*" return (tmul);
"++" return (tinc);
"+=" return (taddAssign);
"+" return (tplus);
"--" return (tdec);
"-=" return (tsubAssign);
"-" return (tminus);
"<=" return (tlesse);
"<" return (tless);
"==" return (tequal);
"=" return (tassign);
">=" return (tgreate);
">" return (tgreat);
"||" return (tor);
"(" return (tlparen);
")" return (trparen);
","	return (tcomma);
"[" return (tsemicolon);
"]" return (trbracket);
"{" return (tlbrace);
"}" return (trbrace);

{letter}({letter}|{digit})*	return(tident);
[1-][0-9]*|0([0-7]+|(x|X)[0-9A-Fa-f]*)?			return(tnumber);

"/*"([^*]|\*+[^*/])*\**"*/" ;
"//".* ;
" " ;
[\t\n] ;
. 		return(yytext[0]);
%%
void main()
{
	enum tsymbol tnumb;
	while((tnumb =yylex())!=tend)
	{
		printf("Token --> %s:(",yytext,tnumb);
		if(tnumb == tnot)
		{
			printf("(%d, )",0);
			
		}else{
			printf("%d, ", tnumb);
		}
		if(tnumb ==tident)
		{
			printf("%s)\n",yytext);
		}
		else if(tnumb==tnumber)
		{
			printf("%d)\n", atoi(yytext));
			
		}else
		{
		printf("%d)\n",0);
		}
	}
}
int yywrap()
{
	printf("End of Lex\n");
	return 1;
}