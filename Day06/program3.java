import java.util.Scanner;

public class prob {

static String addString(String input1,String input2) {

int a,b,carry=0,sum=0,mark=0,j=0;

String ans="";

StringBuilder s1=new StringBuilder();

if(input1.length()>input2.length()){

mark=0;

j=input2.length()-1;

for(int i=input1.length()-1;i>=0;i--) {

a=input1.charAt(i)-48;

if(mark!=input2.length()) {

b=input2.charAt(j)-48;

j--;

mark++;

}

else b=0;

sum=a+b+carry;

if(sum>10) {

carry=sum/10;

sum=sum%10;

}

else{

carry=0;}

ans=ans+sum;

}

}

else {

mark=0;

j=input1.length()-1;

for(int i=input2.length()-1;i>=0;i--) {

a=input2.charAt(i)-48;

if(mark!=input1.length()) {

b=input1.charAt(j)-48;

j--;

mark++;

}

else b=0;

sum=a+b+carry;

if(sum>10) {

carry=sum/10;

sum=sum%10;

}

else{

carry=0;}

ans=ans+sum;

}

}

s1.append(ans);

s1=s1.reverse();

String s2="";

for(int i=0;i<s1.length();i++) {

if(s1.charAt(i)!='0') {

s2=s2+String.valueOf(s1.charAt(i));

}

}

return String.valueOf(s2);

}

}
