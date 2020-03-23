package com.human.ex;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class GameClass {
	//ī����� �Լ�
	public static int deck[]=new int[52];
	public static void createDeck() {
		for(int i=0;i<52;i++) {
			deck[i]=i;
		}
	}
	//ī�弯�� �Լ�
	public static void mixDeck() {
		Random rd=new Random();
		int temp;
		int randNum;
		for(int i=0;i<10000;i++) {
			randNum=rd.nextInt(52);
			temp=deck[0];
			deck[0]=deck[randNum];
			deck[randNum]=temp;
		}
	}
	//ī���ֱ� �Լ�
	public static int deckIndex=0;//���� ����� ī�� �ε���
	public static int []p1Deck=new int[10];//p1�� ī���ȣ
	public static int p1Index=0;//p1ī�� ��Ͽ� �ε���
	public static boolean p1Flag=true;//����ڰ� ī�带 ����������.
	public static int []p2Deck=new int[10];
	public static int p2Index=0;
	public static boolean p2Flag=true;
	public static Scanner sc=new Scanner(System.in);
	
	public static void getP1Card() {
		if(p1Flag) {
			System.out.println("p1 ī�带 �����ðڽ��ϱ�? 0=NO 1=YES");
			if(sc.nextLine().equals("0")) {
				p1Flag=false;
			}
			if(p1Flag) {//ī�� �޴� �۾�
				p1Deck[p1Index]=deck[deckIndex];
				deckIndex++;
				p1Index++;
			}
		}	
	}
	public static void getP2Card() {
		if(p2Flag) {
			System.out.println("p2 ī�带 �����ðڽ��ϱ�? 0=NO 1=YES");
			if(sc.nextLine().equals("0")) {
				p2Flag=false;
			}
			if(p2Flag) {
				p2Deck[p2Index]=deck[deckIndex];
				deckIndex++;
				p2Index++;
			}
		}	
	}
	//ī����,����
//	public static void deckDIsplay() {
//		String cardShape[]= {"�����̵�","Ŭ�ι�","���̾�","��Ʈ"};
//		String cardNum[]= {"A","2","3","4","5","6","7","8","9","10","j","Q","k"};
//		System.out.print("p1=");
//		for(int i=0;i<p1Index;i++) {
//			int cardSIndex=p1Deck[i]/cardNum.length;
//			System.out.print(cardShape[cardSIndex]);
//			int cardNIndex=p1Deck[i]%cardNum.length;
//			System.out.print(cardNum[cardNIndex]+",");
//		}
//	}
//	public static void deckDIsplay(int deck[],int index) {
//		String cardShape[]= {"�����̵�","Ŭ�ι�","���̾�","��Ʈ"};
//		String cardNum[]= {"A","2","3","4","5","6","7","8","9","10","j","Q","k"};
//		//System.out.print("p1=");
//		for(int i=0;i<index;i++) {
//			int cardSIndex=deck[i]/cardNum.length;
//			System.out.print(cardShape[cardSIndex]);
//			int cardNIndex=deck[i]%cardNum.length;
//			System.out.print(cardNum[cardNIndex]+",");
//		}
//	}
	public static void deckDIsplay(int deck[],int index,String title) {
		String cardShape[]= {"�����̵�","Ŭ�ι�","���̾�","��Ʈ"};
		String cardNum[]= {"A","2","3","4","5","6","7","8","9","10","j","Q","k"};
		System.out.print(title+"=");
		for(int i=0;i<index;i++) {
			int cardSIndex=deck[i]/cardNum.length;
			System.out.print(cardShape[cardSIndex]);
			int cardNIndex=deck[i]%cardNum.length;
			System.out.print(cardNum[cardNIndex]+",");
		}
		System.out.println();
	}
	public static void gameDisplay() {
		System.out.println(">>ī�� ��Ȳ");
		deckDIsplay(p1Deck,p1Index,"p1");
		System.out.println("p1����>>"+getSum(p1Deck,p1Index));
		deckDIsplay(p2Deck,p2Index,"p2");
		System.out.println("p2����>>"+getSum(p2Deck,p2Index));
	}
	
	public static int getSum(int[]deck,int index) {
		int sum=0;
		for(int i=0;i<index;i++) {//A=1 J,Q,K=10
			int score=0;
			score=deck[i]%13+1;
			if(score>10) {
				score=10;
			}
			sum+=score;
		}
		//A�� 11�� ó�������� 21�̴�
		//A�� 11�� �ٲ����� 21�� �Ѿ�� �ٲ��� �ʴ´�
		//21�� �Ѿ�� ������ �ٲ۴�
		for(int i=0;i<index;i++) {
			if(deck[i]%13==0) {
				if((sum+10)<21) {
					sum+=10;
				}
			}
		}
		return sum;
	}
	public static String whoWin() {
		String playState="";
		int p1=getSum(p1Deck, p1Index);
		int p2=getSum(p2Deck, p2Index);
		if(p1>21) {//p1�� ���� ī������Ƿ� 
			playState="p2 �¸�";
		}
		else if(p2>21) {
			playState="p1 �¸�";
		}
		else if(p1>p2) {
			playState="p1 �¸�";
		}
		else if(p1==p2) {
			playState="���º�";
		}
		else {
			playState="p2 �¸�";
		}
		return playState;
	}
	public static void playGame() {
		createDeck();
		mixDeck();
		for(int i=0;i<10;i++) {
			getP1Card();
			if(getSum(p1Deck,p1Index)>21){
				break;	
			};
			getP2Card();
			if(getSum(p2Deck,p2Index)>21){
				break;	
			};
			if(p1Flag==false&&p2Flag==false) {
				System.out.println("�� �÷��̾ ī�� ������ ����.");
				break;
			}
			gameDisplay();
		}
		System.out.println("---------------------");
		gameDisplay();
		System.out.println(whoWin());
		
	}
	public static void main(String[] args) {
		playGame();

		
		
	}

}
