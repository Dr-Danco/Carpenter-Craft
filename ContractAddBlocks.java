package net.minecraft.src;

public class ContractAddBlocks {


	/** Tile **/
	// Travertine //
	public static final Block travTile = new ContractTiles(149,
	0).setHardness(0.7F).setResistance(5F).setStepSound(Block.soundGlassFootstep)
	.setBlockName("travertineTile");
	// Satillo Pattern1 //
	public static final Block satilloOne = new ContractTiles(150,
	1).setHardness(0.7F).setResistance(5F).setStepSound(Block.soundGlassFootstep)
	.setBlockName("clayTile");
	// Satillo Pattern2 //
	public static final Block satilloTwo = new ContractTiles(151,
	2).setHardness(0.7F).setResistance(5F).setStepSound(Block.soundGlassFootstep)
	.setBlockName("clayTile");
	// Satillo Pattern3 //
	public static final Block satilloThree = new ContractTiles(152,
	3).setHardness(0.7F).setResistance(5F).setStepSound(Block.soundGlassFootstep)
	.setBlockName("clayTile");
	// Ceramic //
	public static final Block ceramicTile = new ContractTiles(153,
	4).setHardness(0.7F).setResistance(5F).setStepSound(Block.soundGlassFootstep)
	.setBlockName("ceramicTile");
	// Porcelain Pattern1 //
	public static final Block ceraTile2 = new ContractTiles(154,
	5).setHardness(0.7F).setResistance(5F).setStepSound(Block.soundGlassFootstep)
	.setBlockName("ceramicTile");
	// Porcelain Pattern2 //
	public static final Block ceraTile3 = new ContractTiles(155,
    6).setHardness(0.7F).setResistance(5F).setStepSound(Block.soundGlassFootstep)
	.setBlockName("ceramicTile");
	// Blue Marble //
	public static final Block marbleTile1 = new ContractTiles(156,
	7).setHardness(0.7F).setResistance(5F).setStepSound(Block.soundGlassFootstep)
	.setBlockName("marbleTile");
	// Black Marble //
	public static final Block marbleTile2 = new ContractTiles(157,
	8).setHardness(0.7F).setResistance(5F).setStepSound(Block.soundGlassFootstep)
	.setBlockName("marbleTile");
	// White Marble //
	public static final Block marbleTile3 = new ContractTiles(158,
	14).setHardness(0.7F).setResistance(5F).setStepSound(Block.soundGlassFootstep)
	.setBlockName("marbleTile");
	
	/** Lights **/
	public static final Block deskLamp = new ContractDeskLamp(159,
	9).setHardness(0.5F).setStepSound(Block.soundGlassFootstep).setLightValue(1.0F)
	.setBlockName("light");
	public static final Block deskLamp2 = new ContractDeskLamp(160,
	10).setHardness(0.5F).setStepSound(Block.soundGlassFootstep).setLightValue(1.0F)
	.setBlockName("light");
	public static final Block streetLamp = new ContractDeskLamp(161,
	11).setHardness(0.5F).setStepSound(Block.soundGlassFootstep).setLightValue(1.0F)
	.setBlockName("light");
	public static final Block streetLamp2 = new ContractDeskLamp(162,
	12).setHardness(0.5F).setStepSound(Block.soundGlassFootstep).setLightValue(1.0F)
    .setBlockName("light");
	
	/** Building Blocks **/
	public static final Block marbleBlock = new ContractBlock(165,
	16).setHardness(1.0F).setStepSound(Block.soundStoneFootstep)
	.setBlockName("marBlock");
	public static final Block travertineBlock = new ContractBlock(166,
	17).setHardness(1.1F).setStepSound(Block.soundStoneFootstep)
	.setBlockName("travertineBlock");
	
	/** Stairs **/
	public static final Block marbleStairs = new ContractStairs(167,
	18).setHardness(3F).setResistance(4F).setBlockName("marbStairs");
	public static final Block travStairs = new ContractStairs(168,
	19).setHardness(3F).setResistance(4F).setBlockName("travStairs");
	public static final Block endStairs = new ContractStairs(169,
	20).setHardness(3F).setResistance(4F).setBlockName("endStairs");
	public static final Block goldStairs = new ContractStairs(170,
	21).setHardness(3F).setResistance(4F).setBlockName("goldStairs");
	public static final Block ironStairs = new ContractStairs(171,
	22).setHardness(3F).setResistance(4F).setBlockName("ironStairs");
	public static final Block diamondStairs = new ContractStairs(209,
	39).setHardness(3F).setResistance(10F).setBlockName("diamondStairs");
	// Wool //
	public static final Block wWoolStairs = new ContractStairs(172,
	23).setHardness(3F).setResistance(4F).setBlockName("woolStairs");
	public static final Block gWoolStairs = new ContractStairs(173,
	24).setHardness(3F).setResistance(4F).setBlockName("woolStairs");
	public static final Block bWoolStairs = new ContractStairs(174,
	25).setHardness(3F).setResistance(4F).setBlockName("woolStairs");
	public static final Block rWoolStairs = new ContractStairs(175,
	26).setHardness(3F).setResistance(4F).setBlockName("woolStairs");
	public static final Block oWoolStairs = new ContractStairs(176,
	27).setHardness(3F).setResistance(4F).setBlockName("woolStairs");
	public static final Block yWoolStairs = new ContractStairs(177,
	28).setHardness(3F).setResistance(4F).setBlockName("woolStairs");
	public static final Block lWoolStairs = new ContractStairs(178,
	29).setHardness(3F).setResistance(4F).setBlockName("woolStairs");
	public static final Block gnWoolStairs = new ContractStairs(179,
	30).setHardness(3F).setResistance(4F).setBlockName("woolStairs");
	public static final Block lbWoolStairs = new ContractStairs(180,
	31).setHardness(3F).setResistance(4F).setBlockName("woolStairs");
	public static final Block cWoolStairs = new ContractStairs(181,
	32).setHardness(3F).setResistance(4F).setBlockName("woolStairs");
	public static final Block blWoolStairs = new ContractStairs(182,
	33).setHardness(3F).setResistance(4F).setBlockName("woolStairs");
	public static final Block pWoolStairs = new ContractStairs(183,
	34).setHardness(3F).setResistance(4F).setBlockName("woolStairs");
	public static final Block mWoolStairs = new ContractStairs(184,
	35).setHardness(3F).setResistance(4F).setBlockName("woolStairs");
	public static final Block piWoolStairs = new ContractStairs(185,
	36).setHardness(3F).setResistance(4F).setBlockName("woolStairs");
	public static final Block brWoolStairs = new ContractStairs(186,
	37).setHardness(3F).setResistance(4F).setBlockName("woolStairs");
	public static final Block wwWoolStairs = new ContractStairs(208,
	38).setHardness(3F).setResistance(4F).setBlockName("woolStairs");
	// Corner stairs? //
	public static final Block cornertest = new ContractCornerStairs(211,
	38).setHardness(3F).setResistance(4F).setBlockName("cornerStairs");
	
	/** Slabs **/
	public static final Block marbleSlab = new ContractSlabs(187,
	18).setHardness(3F).setResistance(4F).setBlockName("marbleSlab");
	public static final Block travSlab = new ContractSlabs(188,
	19).setHardness(3F).setResistance(4F).setBlockName("travSlab");
	public static final Block endSlab = new ContractSlabs(189,
	20).setHardness(3F).setResistance(4F).setBlockName("endSlab");
	public static final Block goldSlab = new ContractSlabs(190,
	21).setHardness(3F).setResistance(4F).setBlockName("goldSlab");
	public static final Block ironSlab = new ContractSlabs(191,
	22).setHardness(3F).setResistance(4F).setBlockName("ironSlab");
	public static final Block diamondSlab = new ContractSlabs(210,
	39).setHardness(3F).setResistance(10F).setBlockName("diamondSlab");
	// Wool //
	public static final Block wWoolSlab = new ContractSlabs(192,
	23).setHardness(3F).setResistance(4F).setBlockName("woolSlab");
	public static final Block gWoolSlab = new ContractSlabs(193,
	24).setHardness(3F).setResistance(4F).setBlockName("woolSlab");
	public static final Block bWoolSlab = new ContractSlabs(194,
	25).setHardness(3F).setResistance(4F).setBlockName("woolSlab");
	public static final Block rWoolSlab = new ContractSlabs(195,
	26).setHardness(3F).setResistance(4F).setBlockName("woolSlab");
	public static final Block oWoolSlab = new ContractSlabs(196,
	27).setHardness(3F).setResistance(4F).setBlockName("woolSlab");
	public static final Block yWoolSlab = new ContractSlabs(197,
	28).setHardness(3F).setResistance(4F).setBlockName("woolSlab");
	public static final Block lWoolSlab = new ContractSlabs(198,
	29).setHardness(3F).setResistance(4F).setBlockName("woolSlab");
	public static final Block gnWoolSlab = new ContractSlabs(199,
	30).setHardness(3F).setResistance(4F).setBlockName("woolSlab");
	public static final Block lbWoolSlab = new ContractSlabs(200,
	31).setHardness(3F).setResistance(4F).setBlockName("woolSlab");
	public static final Block cWoolSlab = new ContractSlabs(201,
	32).setHardness(3F).setResistance(4F).setBlockName("woolSlab");
	public static final Block blWoolSlab = new ContractSlabs(202,
	33).setHardness(3F).setResistance(4F).setBlockName("woolSlab");
	public static final Block pWoolSlab = new ContractSlabs(203,
	34).setHardness(3F).setResistance(4F).setBlockName("woolSlab");
	public static final Block mWoolSlab = new ContractSlabs(204,
	35).setHardness(3F).setResistance(4F).setBlockName("woolSlab");
	public static final Block piWoolSlab = new ContractSlabs(205,
	36).setHardness(3F).setResistance(4F).setBlockName("woolSlab");
	public static final Block brWoolSlab = new ContractSlabs(206,
	37).setHardness(3F).setResistance(4F).setBlockName("woolSlab");
	public static final Block wwWoolSlab = new ContractSlabs(207,
	38).setHardness(3F).setResistance(4F).setBlockName("woolSlab");
	

	/** Other Blocks **/
	public static final Block travertine = new ContractTravBlock(163,
	13).setHardness(1.0F).setResistance(5F).setStepSound(Block.soundStoneFootstep)
	.setBlockName("travOreBlock");
	public static final Block marble = new ContractMarbleBlock(164,
	15).setHardness(1.2F).setResistance(5F).setStepSound(Block.soundStoneFootstep)
	.setBlockName("marbleOreBlock");
	
	
	
}
