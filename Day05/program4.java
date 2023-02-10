int totalHillWeight(int input1,int input2,int input3)

{

// Read only region end
// Write code here
int sum=0,i,j;

for(i=0;i<input1;i++)

{

for(j=0;j<=i;j++)

sum+=input2;

input2=input2+input3;

//weight=input2+input3;

}

return sum;

}

26.Return second word in Uppercase https://tests.mettl.com/authenticateKey/4a72723f

wipro technologies bangalore

o/p:TECHNOLOGIES

public class UserMainCode

{

public string secondWordUpperCase(string input1)

{

String s[]=input1.split(" ");

if(s.length==1)

return "LESS";

String s1=s[1];

s1=s1.toUpperCase();

return s1;

}

} 
