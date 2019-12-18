package com.miscellaneous;

public class Get_Min_From_Stack_In_O_1 {
	
	int[] stack = new int[10];
	int[] supportingStack = new int[stack.length];
	int top = 0;
	int sTop = 0;
	
	public void push(int data)
	{
		
		if(top == 10)
		{
			System.out.println("stack is full");
		}
		else{
			stack[top] = data;
			if(sTop == 0){
				supportingStack[sTop] = data;
				sTop++;
			}
			else{
				getMinimumIfPush();
			}
			System.out.println("push " + top);
			top++;
		}
	}
	
	public void pushSupportingStack(int data)
	{
		
		if(sTop == 10)
		{
			System.out.println(" Supporting stack is full");
		}
		else{
			supportingStack[sTop] = data;
			System.out.println("push Supporting stack : " + sTop);
			sTop++;
		}
	}
	
	public int pop()
	{
		int data = 0;
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else 
		{
			top--;
			data = stack[top];
			getMinimumIfPop();
			stack[top] = 0;
		}
		return data;
	}
	
	public int popSupportigStack()
	{
		int data = 0;
		if(isSupportingStackEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else 
		{
			sTop--;
			data = supportingStack[sTop];
			supportingStack[sTop] = 0;
		}
		return data;
	}
	
	public boolean isEmpty()
	{
		return top<=0;
	}
	public boolean isSupportingStackEmpty()
	{
		return sTop<=0;
	}
	public void getMinimumIfPush()
	{
		if(stack[top] < supportingStack[sTop-1]){
			pushSupportingStack(stack[top]);
		}
	}
	public void getMinimumIfPop()
	{
		if(stack[top] == supportingStack[sTop-1]){
			popSupportigStack();
		}
	}
	public int peekMinimum()
	{
		int data;
		data = supportingStack[sTop-1];
		return data;
	}
	
	public void showStack()
	{
		System.out.println("Stack : ");
		for(int n : stack)
		{
			System.out.print(n+" ");
		}
		System.out.println();
	}
	public void showSupportingStack()
	{
		System.out.println("Supporting Stack having minimum : ");
		for(int n : supportingStack)
		{
			System.out.print(n+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Get_Min_From_Stack_In_O_1 minStack = new Get_Min_From_Stack_In_O_1();
		minStack.push(12);
		minStack.push(23);
		minStack.push(3);
		minStack.push(45);
		minStack.showStack();
		minStack.showSupportingStack();
		System.out.println(" Minimum in the stack is : "+minStack.peekMinimum());
		minStack.pop();
		minStack.showSupportingStack();
		System.out.println(" Minimum in the stack is : "+minStack.peekMinimum());
		minStack.pop();
//		minStack.showSupportingStack();
		System.out.println(" Minimum in the stack is : "+minStack.peekMinimum());
		minStack.showSupportingStack();
//		minStack.pop();
//		System.out.println(" Minimum in the stack is : "+minStack.peekMinimum());
//		minStack.pop();
//		System.out.println(" Minimum in the stack is : "+minStack.peekMinimum());
	}

}
