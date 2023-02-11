import java.io.*;

import java.util.*;

// Read only region start
class UserMainCode

{

public int findStringCode(String input1){
// Read only region end
// Write code here...
int sum=0,sum1=0;
char c1,c2;
int i1,i2,i,j;
String small=new String("abcdefghijklmnopqrstuvwxyz");

String cap=new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

String s[]=input1.split(" ");

String res=new String("");

for(i=0;i<s.length;i++)

System.out.println(s[i]);

for(i=0;i<s.length;i++)
{
System.out.println(s[i]);

if(s[i].length()%2==0)

{

for(j=0;j<s[i].length()/2;j++)
{

c1=s[i].charAt(j);

c2=s[i].charAt(s[i].length()-j-1);

System.out.println(c1+" "+c2);

if(Character.isLowerCase(c1))

i1=small.indexOf(c1)+1;

else

i1=cap.indexOf(c1)+1;

System.out.println(i1);

if(Character.isLowerCase(c2))

i2=small.indexOf(c2)+1;

else

i2=cap.indexOf(c2)+1;

System.out.println(i2);

sum=i1-i2;

sum1+=Math.abs(sum);

}

}

else

{

for(j=0;j<s[i].length()/2;j++)

{

c1=s[i].charAt(j);
c2=s[i].charAt(s[i].length()-j-1);

//System.out.println(c1+" "+c2);

if(Character.isLowerCase(c1))

i1=small.indexOf(c1)+1;

else

i1=cap.indexOf(c1)+1;

if(Character.isLowerCase(c2))

i2=small.indexOf(c2)+1;

else

i2=cap.indexOf(c2)+1;

System.out.println(i2);

sum=i1-i2;

sum1+=Math.abs(sum);

}

char c3=s[i].charAt(s[i].length()/2);
//System.out.println(c3);

if(Character.isLowerCase(c3))

sum1+=small.indexOf(c3)+1;

else

sum1+=cap.indexOf(c3)+1;


System.out.println(sum1);


sum1=0;

}

System.out.println(res);

int r=Integer.parseInt(res);

return r;

}

}
