import java.io.*;

import java.util.*;

// Read only region start

class UserMainCode

{

public int mostFrequentlyOccurringDigit(int[] input1,int input2){

// Read only region end

// Write code here...

int[] ar=new int[10];

int temp=0,max=0,num=0;

for(int i=0;i<input1.length;i++){

temp=input1[i];

while(temp>0){

ar[temp%10]+=1;

temp=temp/10;

}

}

for(int j=0;j<ar.length;j++){

if(ar[j]>max){

max=ar[j];

num=j;

}

if(ar[j]==max){

if(j>num){

num=j;

max=ar[j];

}

}

}

return num;

}

}
