package com.role;

public class Hero {
	
	public String name;
	public double normalAttack; //��ͨ����
	public int attackSpeed;  // ��ͨ�����ٶ�
	public double magicAttack;
	public double manaCost; //100 
	public int cd; 
	public double hp;
	public double mp; // 400
	public double defense; // ����
	public double dodge; //����
	
	//����
	public void attack(Hero hero) {
		System.out.println("�� " + hero.name + " ���𹥻� ..  ");
		double result = normalAttack- hero.defense;
		underAttack(result, this); //֪ͨ������
		try {
			Thread.sleep((long) this.attackSpeed);
		} catch (Exception e) {
			
		}
	}
	
	//����
	public void underAttack(double result , Hero hero) {
		
		hp -= result;
		System.out.println("���ܵ� " + hero.name + " �Ĺ��� , ���˺��� : " + result +" �� . HP ʣ�� : " + hp );
	}
	
	
	

}
