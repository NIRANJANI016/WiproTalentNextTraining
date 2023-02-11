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

public Result findOriginalFirstAndSum(int[] input1,int input2){

// Read only region end
//Write code here...

int sum=input1[input1.length-1];

for(int i=input1.length-2;i>=0;i--){

input1[i]=input1[i]-input1[i+1];

sum+=input1[i];

}

Result r=new Result(input1[0],sum);

return r;

}

}
