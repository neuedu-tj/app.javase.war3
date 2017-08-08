package com.role;

public class Hero {
	
	public String name;
	public double normalAttack; //普通攻击
	public int attackSpeed;  // 普通攻击速度
	public double magicAttack;
	public double manaCost; //100 
	public int cd; 
	public double hp;
	public double mp; // 400
	public double defense; // 防御
	public double dodge; //闪避
	
	//攻击
	public void attack(Hero hero) {
		System.out.println("向 " + hero.name + " 发起攻击 ..  ");
		double result = normalAttack- hero.defense;
		underAttack(result, this); //通知被攻击
		try {
			Thread.sleep((long) this.attackSpeed);
		} catch (Exception e) {
			
		}
	}
	
	//挨揍
	public void underAttack(double result , Hero hero) {
		
		hp -= result;
		System.out.println("遭受到 " + hero.name + " 的攻击 , 被伤害了 : " + result +" 点 . HP 剩余 : " + hp );
	}
	
	
	

}
