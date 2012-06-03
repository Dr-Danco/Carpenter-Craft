package net.minecraft.src;

public class ContractAddItems {

	/** Pillars **/
	public static final Item marblePillar = new ContractPillarItem(6000, ContractAddBlocks.marblePillar).setItemName("marblePillar");
	/** Misc. **/
	public static final Item travRock = new ContractGenItems(149).setIconIndex(0).setItemName("travRock");
	public static final Item marbleRock = new ContractGenItems(150).setIconIndex(1).setItemName("marbleRock");
	public static final Item rawTile = new ContractGenItems(151).setIconIndex(2).setItemName("rawTile");
	public static final Item rawTile2 = new ContractGenItems(152).setIconIndex(3).setItemName("rawTile");
	public static final Item rawtTile = new ContractGenItems(153).setIconIndex(4).setItemName("rawTile");
	public static final Item rawtTile2 = new ContractGenItems(154).setIconIndex(5).setItemName("rawTile");
}
