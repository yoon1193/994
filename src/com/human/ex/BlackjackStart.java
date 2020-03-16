package com.human.ex;

import java.util.Arrays;
import java.util.Random;

public class BlackjackStart {

	public static void main(String[] args) {
		//0 1 2 3 4 5 6 7 8 9 10 11 12 =>�����̵�
		//13 14 15 16 17 18 19 20 21 22 23 24 25 =>Ŭ�ι�
		//26 27 28 29 30 31 32 33 34 35 36 37 38 =>���̾�
		//39 40 41 42 43 44 45 46 47 48 49 50 51 =>��Ʈ
	
		//ī�� ����
		int deck[]=new int[52];//52���� ī���(��)�������
		String cardShape[]= {"�����̵�","Ŭ�ι�","���̾�","��Ʈ"};//ī����
		String cardNum[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};//ī�����
		for(int i=0;i<deck.length;i++) {
			deck[i]=i;
		}
		
		//ī�带 �����
		Random rand=new Random();
		for(int i=0;i<10000;i++) {
			int randNum=rand.nextInt(52);
			int temp;
			temp=deck[0];
			deck[0]=deck[randNum];
			deck[randNum]=temp;
		}
		
//		����ī�� ��� ���(�������� Ȯ�ο�)
//		for(int i:deck) {
//			System.out.println(i+" ");
//			System.out.println("ī����:"+cardShape[i/cardNum.length]);//i/13
//			System.out.println("ī�� ����:"+cardNum[i%cardNum.length]);//i%13 
//		}
		
		//ī�带 1�徿 �̾Ƽ� �÷��̾�� �ִ� �۾�
		int deckIndex=0;
		int player1Deck[]= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};//ī�尡 ���ٴ°� ������ ǥ��
		int player2Deck[]= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};//0 �̻��� ���� ī����ڿ� ��ħ
		int player1Index=0;
		int player2Index=0;
		for(int i=0;i<3;i++) {
			player1Deck[player1Index]=deck[deckIndex];
			deckIndex++;
			player1Index++;
			player2Deck[player2Index]=deck[deckIndex];
			deckIndex++;
			player2Index++;
		}
		
		//player�� � ī�带 �޾Ҵ��� ���
		System.out.println("player1Card ");
		for(int i:player1Deck) {
			if(i!=-1) {
				//System.out.print(i+" ");////0~51�� �ī������
				System.out.println(cardShape[i/cardNum.length]);//ī����
				System.out.println(cardNum[i%cardNum.length]);//ī�����
			}
		}
		System.out.println(" ");
		System.out.println("player2Card ");
		for(int i=0;i<player2Index;i++) {
			//System.out.println(player2Deck[i]+" ");//0~51�� �ī������
			System.out.println(cardShape[player2Deck[i]/cardNum.length]);//ī����
			System.out.println(cardNum[player2Deck[i]%cardNum.length]);//ī�����
		}
		System.out.println(" ");
		
		//���� ���
		int score1=0;
		int score2=0;
		int score1Sum=0;
		int score2Sum=0;
		for(int i=0;i<player1Index;i++) {
			score1=player1Deck[i]%13+1;
			score2=player2Deck[i]%13+1;
			if(score1>10) {
				score1=10;
			}
			score1Sum+=score1;
			if(score2>10) {
				score2=10;
			}
			score2Sum+=score2;
		}
		//A�� 1 or 11 ?
		for(int i=0;i<player1Index;i++) {
			if(player1Deck[i]%13==0){//ī���� A�� ������
				if(score1Sum+10<=21) {//Aī��+2��ī��+10 �� 21���� �۰ų� ������ 10�� ������ A��11�� �Ǻ��Ѵ�
					score1Sum+=10;
				}		
			}
			if(player2Deck[i]%13==0){
				if(score2Sum+10<=21) {
					score2Sum+=10;
				}				
			}
		}
		System.out.println("player1�� ������="+score1Sum);
		System.out.println("player2�� ������="+score2Sum);
		//���а���
		String playState="���";
		if(score1Sum>21) {
			playState="player2�� �¸�";
		}
		//play2�� 21�� �Ѿ�� ��쵵 ������ ,	
		//play2�� ������ ī��ޱ��� play1�� ������ ī�带 �����޾� ���µǹǷ�
		//play1��ī�尡 21�� �Ѵ¼��� play2�ǽ¸� �� �ڵ�� 3���� �̸��޴� ���α׷��̶� ���عٶ�.
		else {
			if(score2Sum>21) {
				playState="player1�� �¸�";
			}
			else {
				if(score1Sum>score2Sum) {
					playState="player1�� �¸�";
				}
				else if(score1Sum==score2Sum) {
					playState="���º�";
				}
				else {
					playState="player2�� �¸�";
				}
			}
		}
		System.out.println(playState);
		//ī�����-ī�弯��-��������(�̿ϼ�)-����ī�� ���-ī���հ�-����
	}
	

}
