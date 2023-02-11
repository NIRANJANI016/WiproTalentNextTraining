import java.io.*; import java.util.*; import java.lang.Math.*; // Read only region start class UserMainCode

{

public int sumOfPowerOfDigits(int input1){

// Read only region end

// Write code here...

Integer sum=0,r=0,prev=0;

Double f1,f2;

while(input1>0){

r=Integer.valueOf(input1%10);

f1=Double.valueOf(r);

f2=Double.valueOf(prev);

f1=Math.pow(f1,f2);

sum+=f1.intValue();

prev=Integer.valueOf(r);

input1/=10;

}

return sum;

}

}
