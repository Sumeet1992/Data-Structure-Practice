package com.miscellaneous;

public class TwoStackInOneArray {

	int stack[] = new int[10];
	int top1 = 0;
	int top2 = 9;
	
	public void push1(int data)
	{
		
		if(top1 + 1 == top2)
		{
			System.out.println("stack is full");
		}
		else{
			stack[top1] = data;
			System.out.println("push1 " + top1);
			top1++;
		}
	}
	public void push2(int data)
	{
		
		if(top1 + 1 == top2)
		{
			System.out.println("stack is full");
		}
		else{
			stack[top2] = data;
			System.out.println("push2 " + top2);
			top2--;
		}
	}
	public int pop1()
	{
		int data = 0;
		if(top1<=0)
		{
			System.out.println("Stack 1 is Empty");
		}
		else 
		{
			top1--;
			data = stack[top1];
			stack[top1] = 0;
		}
		return data;
	}
	public int pop2()
	{
		int data = 0;
		if(top2>=9)
		{
			System.out.println("Stack 2 is Empty");
		}
		else 
		{
			top2--;
			data = stack[top2];
			stack[top2] = 0;
		}
		return data;
	}
	
	public int peek1()
	{
		int data;
		data = stack[top1-1];
		return data;
	}
	public int peek2()
	{
		int data;
		data = stack[top2+1];
		return data;
	}
	public void show()
	{
		for(int n : stack)
		{
			System.out.print(n+" ");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStackInOneArray oneArray = new TwoStackInOneArray();
		oneArray.push1(12);
		oneArray.push2(55);
		oneArray.push2(44);
		oneArray.push2(11);
		oneArray.push2(231);
		oneArray.push2(3);
		oneArray.push2(2);
		oneArray.push2(32);
		oneArray.push1(7);
		oneArray.show();

	}

}
