import java.io.*;

import java.util.*;

// Read only region start

class UserMainCode

{

public class Result{

public final String output1;

public final String output2;

public final String output3;

public Result(String out1, String out2, String out3){

output1 = out1;

output2 = out2;

output3 = out3;

}

}

public Result encodeThreeStrings(String input1,String input2,String input3){

// Read only region end

//Write code here...

String f1="",f2="",f3="",m1="",m2="",m3="",l1="",l2="",l3="";

String out1="",out2="",out3="";

int d=0;

//task1

//input1

if(input1.length()%3==0){

d=input1.length()/3;

f1=input1.substring(0,d);

m1=input1.substring(d,2*d);

l1=input1.substring(2*d);

}

else if(input1.length()%3==1){

d=input1.length()/3;

f1=input1.substring(0,d);

m1=input1.substring(d,2*d+1);

l1=input1.substring((2*d)+1);

}

else{

d=input1.length()/3;

f1=input1.substring(0,d+1);

m1=input1.substring(d+1,2*d+1);

l1=input1.substring(2*d+1);

}

//input2

if(input2.length()%3==0){

d=input2.length()/3;

f2=input2.substring(0,d);

m2=input2.substring(d,2*d);

l2=input2.substring(2*d);

}

else if(input2.length()%3==1){

d=input2.length()/3;

f2=input2.substring(0,d);

m2=input2.substring(d,2*d+1);

l2=input2.substring((2*d)+1);

}

else{

d=input2.length()/3;

f2=input2.substring(0,d+1);

m2=input2.substring(d+1,2*d+1);

l2=input2.substring(2*d+1);

}

//input3

if(input3.length()%3==0){

d=input3.length()/3;

f3=input3.substring(0,d);

m3=input3.substring(d,2*d);

l3=input3.substring(2*d);

}

else if(input3.length()%3==1){

d=input3.length()/3;

f3=input3.substring(0,d);

m3=input3.substring(d,2*d+1);

l3=input3.substring((2*d)+1);

}

else{

d=input3.length()/3;

f3=input3.substring(0,d+1);

m3=input3.substring(d+1,2*d+1);

l3=input3.substring(2*d+1);

}

out1=f1+f2+f3;

out2=m1+m2+m3;

out3=l1+l2+l3;

//task2

String out3_="";

for(int k=0;k<out3.length();k++){

if(Character.isUpperCase(out3.charAt(k))){

out3_=out3_+String.valueOf(Character.toLowerCase(out3.charAt(k)));

}

else{

out3_=out3_+String.valueOf(Character.toUpperCase(out3.charAt(k)));

}

}

return new Result(out1,out2,out3_);

}

}
