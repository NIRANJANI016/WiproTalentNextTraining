import java.io.*;

import java.util.*;

// Read only region start

class UserMainCode

{

public class Result{

public final int output1;

public final int output2;

public Result(int out1, int out2){

output1 = out1;

output2 = out2;

}

}

public Result decreasingSeq(int[] input1,int input2){

// Read only region end

//Write code here...

int[] ar=input1.clone();

Arrays.sort(ar);

if(Arrays.equals(ar,input1)) return new Result(0,0);

if(input1.length==1) return new Result(0,0);

int temp=0,subs=0,max=0,count=0;

for(int i=0;i<input1.length-1;i++){

if(input1[i]>input1[i+1]){

temp=i;

count=0;

while(temp<input1.length-1){

if(input1[temp]>input1[temp+1]){

temp++;

count++;

}

else {

subs+=1;

break;

}

}

i=temp+1;}

if(temp==input1.length-1) subs+=1;

if(max<count+1) max=count+1;

}

return new Result(subs,max);

}

}
