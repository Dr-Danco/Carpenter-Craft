package net.minecraft.src;
import java.util.List;
import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.src.forge.MinecraftForgeClient;

public class mod_CarpenterCraft extends BaseMod {
			
			
public mod_CarpenterCraft() {
		
	}
public void load() {
	MinecraftForgeClient.preloadTexture("/contractorcraft/terrain.png");
	MinecraftForgeClient.preloadTexture("/contractorcraft/gui/items.png");
	ModLoader.setInGameHook(this, true, false);
	ModLoader.setInGUIHook(this, true, false);
	/**  BLOCKS  **/
	
	/* Tiles */
	
	// Travertine //
	ModLoader.registerBlock(ContractAddBlocks.travTile);
	ModLoader.addName(ContractAddBlocks.travTile, "Travertine Tile");
	ModLoader.addSmelting(ContractAddItems.travRock.shiftedIndex, new ItemStack(ContractAddBlocks.travTile, 1));
	
	// Satillo1 //
	ModLoader.registerBlock(ContractAddBlocks.satilloOne);
	ModLoader.addName(ContractAddBlocks.satilloOne, "Clay Tile");
    ModLoader.addRecipe(new ItemStack(ContractAddBlocks.satilloOne, 3),
    new Object [] {"   ", "## ", "## ", Character.valueOf('#'), ContractAddItems.rawTile});
	// Satillo2 //
	ModLoader.registerBlock(ContractAddBlocks.satilloTwo);
	ModLoader.addName(ContractAddBlocks.satilloTwo, "Clay Tile");
    ModLoader.addRecipe(new ItemStack(ContractAddBlocks.satilloTwo, 3),
    new Object [] {"   ", "## ", "## ", Character.valueOf('#'), ContractAddItems.rawTile2});
	// Satillo3 //
	ModLoader.registerBlock(ContractAddBlocks.satilloThree);
	ModLoader.addName(ContractAddBlocks.satilloThree, "Clay Tile");
    ModLoader.addRecipe(new ItemStack(ContractAddBlocks.satilloThree, 3),
    new Object [] {"   ", "#@ ", "@# ", Character.valueOf('#'), ContractAddItems.rawTile, Character.valueOf('@'), ContractAddItems.rawTile2});
	// Ceramic //
	ModLoader.registerBlock(ContractAddBlocks.ceramicTile);
	ModLoader.addName(ContractAddBlocks.ceramicTile, "Ceramic Tile");
    ModLoader.addRecipe(new ItemStack(ContractAddBlocks.ceramicTile, 3),
    new Object [] {"   ", "@@ ", "## ", Character.valueOf('#'), ContractAddItems.rawtTile, Character.valueOf('@'), ContractAddItems.rawtTile2});
	// Ceramic2 //
	ModLoader.registerBlock(ContractAddBlocks.ceraTile2);
	ModLoader.addName(ContractAddBlocks.ceraTile2, "Ceramic Tile");
    ModLoader.addRecipe(new ItemStack(ContractAddBlocks.ceraTile2, 3),
    new Object [] {"   ", "@@ ", "@@ ", Character.valueOf('@'), ContractAddItems.rawtTile2});
	// Ceramic3 //
	ModLoader.registerBlock(ContractAddBlocks.ceraTile3);
	ModLoader.addName(ContractAddBlocks.ceraTile3, "Ceramic Tile");
    ModLoader.addRecipe(new ItemStack(ContractAddBlocks.ceraTile3, 3),
    new Object [] {"   ", "#@ ", "#@ ", Character.valueOf('#'), ContractAddItems.rawtTile, Character.valueOf('@'), ContractAddItems.rawtTile2});
	// Marble //
	ModLoader.registerBlock(ContractAddBlocks.marbleTile1);
	ModLoader.addName(ContractAddBlocks.marbleTile1, "Marble Tile");
	ModLoader.addShapelessRecipe(new ItemStack(ContractAddBlocks.marbleTile1, 1),
    new Object[] {new ItemStack(ContractAddBlocks.marbleTile3, 1), new ItemStack(Item.dyePowder, 1, 4)});
	// Marble2 //
	ModLoader.registerBlock(ContractAddBlocks.marbleTile2);
	ModLoader.addName(ContractAddBlocks.marbleTile2, "Marble Tile");
    ModLoader.addShapelessRecipe(new ItemStack(ContractAddBlocks.marbleTile2, 1),
    new Object[] {new ItemStack(ContractAddBlocks.marbleTile3, 1), new ItemStack(Item.dyePowder, 1, 0)});
	// Marble3 //
	ModLoader.registerBlock(ContractAddBlocks.marbleTile3);
	ModLoader.addName(ContractAddBlocks.marbleTile3, "Marble Tile");
	ModLoader.addSmelting(ContractAddItems.marbleRock.shiftedIndex, new ItemStack(ContractAddBlocks.marbleTile3, 1));
    
	/* Lights */
	
    // Desk Lamp //
    ModLoader.registerBlock(ContractAddBlocks.deskLamp);
    ModLoader.addName(ContractAddBlocks.deskLamp, "Lamp");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.deskLamp, 1),
	new Object [] {"   ", " # ", " @ ", Character.valueOf('#'), Block.glowStone, Character.valueOf('@'), Item.stick});
	Item.itemsList[ContractAddBlocks.deskLamp.blockID].setMaxStackSize(1);

    // Desk Lamp 2 //
    ModLoader.registerBlock(ContractAddBlocks.deskLamp2);
    ModLoader.addName(ContractAddBlocks.deskLamp2, "Lamp");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.deskLamp2, 1),
	new Object [] {" # ", " @ ", " @ ", Character.valueOf('#'), Block.glowStone, Character.valueOf('@'), Item.stick});
	Item.itemsList[ContractAddBlocks.deskLamp2.blockID].setMaxStackSize(1);
	
    // Street Lamp //
    ModLoader.registerBlock(ContractAddBlocks.streetLamp);
    ModLoader.addName(ContractAddBlocks.streetLamp, "Lamp");
    ModLoader.addRecipe(new ItemStack(ContractAddBlocks.streetLamp, 1),
    new Object [] {"   ", "!#!", " @ ", Character.valueOf('#'), Block.glowStone, Character.valueOf('@'), Item.stick, Character.valueOf('!'), Block.glass});
	Item.itemsList[ContractAddBlocks.streetLamp.blockID].setMaxStackSize(1);
    
    // Street Lamp 2 //
    ModLoader.registerBlock(ContractAddBlocks.streetLamp2);
    ModLoader.addName(ContractAddBlocks.streetLamp2, "Lamp");
    ModLoader.addRecipe(new ItemStack(ContractAddBlocks.streetLamp2, 1),
    new Object [] {"!!!", "!#!", " @ ", Character.valueOf('#'), Block.glowStone, Character.valueOf('@'), Item.stick, Character.valueOf('!'), Block.glass});
	Item.itemsList[ContractAddBlocks.streetLamp2.blockID].setMaxStackSize(1);
    
    /* Building Blocks */
    
    // Marble Block //
    ModLoader.registerBlock(ContractAddBlocks.marbleBlock);
    ModLoader.addName(ContractAddBlocks.marbleBlock, "Marble Block");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.marbleBlock, 1),
	new Object [] {"###", "###", "###", Character.valueOf('#'), ContractAddItems.marbleRock});
    
    // Travertine Block //
    ModLoader.registerBlock(ContractAddBlocks.travertineBlock);
    ModLoader.addName(ContractAddBlocks.travertineBlock, "Travertine Block");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.travertineBlock, 1),
	new Object [] {"###", "###", "###", Character.valueOf('#'), ContractAddItems.travRock});
	
	/* STAIRS */
	// Marble //
	ModLoader.registerBlock(ContractAddBlocks.marbleStairs);
	ModLoader.addName(ContractAddBlocks.marbleStairs, "Marble Stairs");
    ModLoader.addRecipe(new ItemStack(ContractAddBlocks.marbleStairs, 4),
    new Object [] {"#  ", "## ", "###", Character.valueOf('#'), ContractAddBlocks.marbleBlock});
	// Travertine //
	ModLoader.registerBlock(ContractAddBlocks.travStairs);
	ModLoader.addName(ContractAddBlocks.travStairs, "Travertine Stairs");
    ModLoader.addRecipe(new ItemStack(ContractAddBlocks.travStairs, 4),
    new Object [] {"#  ", "## ", "###", Character.valueOf('#'), ContractAddBlocks.travertineBlock});
	// Endstone //
	ModLoader.registerBlock(ContractAddBlocks.endStairs);
	ModLoader.addName(ContractAddBlocks.endStairs, "Endstone Stairs");
    ModLoader.addRecipe(new ItemStack(ContractAddBlocks.endStairs, 4),
    new Object [] {"#  ", "## ", "###", Character.valueOf('#'), Block.whiteStone});
	// Gold //
	ModLoader.registerBlock(ContractAddBlocks.goldStairs);
	ModLoader.addName(ContractAddBlocks.goldStairs, "Gold Stairs");
    ModLoader.addRecipe(new ItemStack(ContractAddBlocks.goldStairs, 4),
    new Object [] {"#  ", "## ", "###", Character.valueOf('#'), Block.blockGold});
	// Iron //
	ModLoader.registerBlock(ContractAddBlocks.ironStairs);
	ModLoader.addName(ContractAddBlocks.ironStairs, "Iron Stairs");
    ModLoader.addRecipe(new ItemStack(ContractAddBlocks.ironStairs, 4),
    new Object [] {"#  ", "## ", "###", Character.valueOf('#'), Block.blockSteel});
    // Diamond //
	ModLoader.registerBlock(ContractAddBlocks.diamondStairs);
	ModLoader.addName(ContractAddBlocks.diamondStairs, "Diamond Stairs");
    ModLoader.addRecipe(new ItemStack(ContractAddBlocks.diamondStairs, 4),
    new Object [] {"#  ", "## ", "###", Character.valueOf('#'), Block.blockDiamond});
    
	// WOOL //
	// white //
	ModLoader.registerBlock(ContractAddBlocks.wwWoolStairs);
	ModLoader.addName(ContractAddBlocks.wwWoolStairs, "Wool Stairs");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.wwWoolStairs, 4),
	new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 0)});
	// light gray //
	ModLoader.registerBlock(ContractAddBlocks.wWoolStairs);
	ModLoader.addName(ContractAddBlocks.wWoolStairs, "Wool Stairs");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.wWoolStairs, 4),
	new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 8)});
	// gray //
	ModLoader.registerBlock(ContractAddBlocks.gWoolStairs);
	ModLoader.addName(ContractAddBlocks.gWoolStairs, "Wool Stairs");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.gWoolStairs, 4),
	new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 7)});
	// black //
	ModLoader.registerBlock(ContractAddBlocks.bWoolStairs);
	ModLoader.addName(ContractAddBlocks.bWoolStairs, "Wool Stairs");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.bWoolStairs, 4),
	new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 15)});
	// Red //
	ModLoader.registerBlock(ContractAddBlocks.rWoolStairs);
	ModLoader.addName(ContractAddBlocks.rWoolStairs, "Wool Stairs");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.rWoolStairs, 4),
	new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 14)});
	// orange //
	ModLoader.registerBlock(ContractAddBlocks.oWoolStairs);
	ModLoader.addName(ContractAddBlocks.oWoolStairs, "Wool Stairs");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.oWoolStairs, 4),
	new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 1)});
	// yellow //
	ModLoader.registerBlock(ContractAddBlocks.yWoolStairs);
	ModLoader.addName(ContractAddBlocks.yWoolStairs, "Wool Stairs");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.yWoolStairs, 4),
	new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 4)});
	// lime //
	ModLoader.registerBlock(ContractAddBlocks.lWoolStairs);
	ModLoader.addName(ContractAddBlocks.lWoolStairs, "Wool Stairs");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.lWoolStairs, 4),
	new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 5)});
	// green //
	ModLoader.registerBlock(ContractAddBlocks.gnWoolStairs);
	ModLoader.addName(ContractAddBlocks.gnWoolStairs, "Wool Stairs");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.gnWoolStairs, 4),
	new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 13)});
	// light blue //
	ModLoader.registerBlock(ContractAddBlocks.lbWoolStairs);
	ModLoader.addName(ContractAddBlocks.lbWoolStairs, "Wool Stairs");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.lbWoolStairs, 4),
	new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 3)});
	// cyan //
	ModLoader.registerBlock(ContractAddBlocks.cWoolStairs);
	ModLoader.addName(ContractAddBlocks.cWoolStairs, "Wool Stairs");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.cWoolStairs, 4),
	new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 9)});
	// pink //
	ModLoader.registerBlock(ContractAddBlocks.piWoolStairs);
	ModLoader.addName(ContractAddBlocks.piWoolStairs, "Wool Stairs");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.piWoolStairs, 4),
	new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 6)});
	// magenta //
	ModLoader.registerBlock(ContractAddBlocks.mWoolStairs);
	ModLoader.addName(ContractAddBlocks.mWoolStairs, "Wool Stairs");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.mWoolStairs, 4),
	new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 2)});
	// brown //
	ModLoader.registerBlock(ContractAddBlocks.brWoolStairs);
	ModLoader.addName(ContractAddBlocks.brWoolStairs, "Wool Stairs");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.brWoolStairs, 4),
	new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 12)});
	// purple //
	ModLoader.registerBlock(ContractAddBlocks.pWoolStairs);
	ModLoader.addName(ContractAddBlocks.pWoolStairs, "Wool Stairs");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.pWoolStairs, 4),
	new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 10)});
	// blue //
	ModLoader.registerBlock(ContractAddBlocks.blWoolStairs);
	ModLoader.addName(ContractAddBlocks.blWoolStairs, "Wool Stairs");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.blWoolStairs, 4),
	new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 11)});
	
	/* Slabs */
	// Marble //
	ModLoader.registerBlock(ContractAddBlocks.marbleSlab);
	ModLoader.addName(ContractAddBlocks.marbleSlab, "Marble Slab");
    ModLoader.addRecipe(new ItemStack(ContractAddBlocks.marbleSlab, 6),
    new Object [] {"   ", "   ", "###", Character.valueOf('#'), ContractAddBlocks.marbleBlock});
	// Travertine //
	ModLoader.registerBlock(ContractAddBlocks.travSlab);
	ModLoader.addName(ContractAddBlocks.travSlab, "Travertine Slab");
    ModLoader.addRecipe(new ItemStack(ContractAddBlocks.travSlab, 6),
    new Object [] {"   ", "   ", "###", Character.valueOf('#'), ContractAddBlocks.travertineBlock});
	// Endstone //
	ModLoader.registerBlock(ContractAddBlocks.endSlab);
	ModLoader.addName(ContractAddBlocks.endSlab, "Endstone Slab");
    ModLoader.addRecipe(new ItemStack(ContractAddBlocks.endSlab, 6),
    new Object [] {"   ", "   ", "###", Character.valueOf('#'), Block.whiteStone});
	// Gold //
	ModLoader.registerBlock(ContractAddBlocks.goldSlab);
	ModLoader.addName(ContractAddBlocks.goldSlab, "Gold Slab");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.goldSlab, 6),
	new Object [] {"   ", "   ", "###", Character.valueOf('#'), Block.blockGold});
	// Iron //
	ModLoader.registerBlock(ContractAddBlocks.ironSlab);
	ModLoader.addName(ContractAddBlocks.ironSlab, "Iron Slab");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.ironSlab, 6),
	new Object [] {"   ", "   ", "###", Character.valueOf('#'), Block.blockSteel});
	// Diamond //
	ModLoader.registerBlock(ContractAddBlocks.diamondSlab);
	ModLoader.addName(ContractAddBlocks.diamondSlab, "Diamond Slab");
    ModLoader.addRecipe(new ItemStack(ContractAddBlocks.diamondSlab, 6),
    new Object [] {"   ", "   ", "###", Character.valueOf('#'), Block.blockDiamond});
	/* Wool */
	// white //
	ModLoader.registerBlock(ContractAddBlocks.wwWoolSlab);
	ModLoader.addName(ContractAddBlocks.wwWoolSlab, "Wool Slab");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.wwWoolSlab, 6),
	new Object [] {"   ", "   ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 0)});
	// light gray //
	ModLoader.registerBlock(ContractAddBlocks.wWoolSlab);
	ModLoader.addName(ContractAddBlocks.wWoolSlab, "Wool Slab");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.wWoolSlab, 6),
	new Object [] {"   ", "   ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 8)});
	// gray //
	ModLoader.registerBlock(ContractAddBlocks.gWoolSlab);
	ModLoader.addName(ContractAddBlocks.gWoolSlab, "Wool Slab");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.gWoolSlab, 6),
	new Object [] {"   ", "   ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 7)});
	// black //
	ModLoader.registerBlock(ContractAddBlocks.bWoolSlab);
	ModLoader.addName(ContractAddBlocks.bWoolSlab, "Wool Slab");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.bWoolSlab, 6),
	new Object [] {"   ", "   ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 15)});
	// orange //
	ModLoader.registerBlock(ContractAddBlocks.oWoolSlab);
	ModLoader.addName(ContractAddBlocks.oWoolSlab, "Wool Slab");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.oWoolSlab, 6),
	new Object [] {"   ", "   ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 1)});
	// yellow //
	ModLoader.registerBlock(ContractAddBlocks.yWoolSlab);
	ModLoader.addName(ContractAddBlocks.yWoolSlab, "Wool Slab");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.yWoolSlab, 6),
	new Object [] {"   ", "   ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 4)});
	// lime //
	ModLoader.registerBlock(ContractAddBlocks.lWoolSlab);
	ModLoader.addName(ContractAddBlocks.lWoolSlab, "Wool Slab");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.lWoolSlab, 6),
	new Object [] {"   ", "   ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 5)});
	// green //
	ModLoader.registerBlock(ContractAddBlocks.gnWoolSlab);
	ModLoader.addName(ContractAddBlocks.gnWoolSlab, "Wool Slab");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.gnWoolSlab, 6),
	new Object [] {"   ", "   ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 13)});
	// light blue //
	ModLoader.registerBlock(ContractAddBlocks.lbWoolSlab);
	ModLoader.addName(ContractAddBlocks.lbWoolSlab, "Wool Slab");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.lbWoolSlab, 6),
	new Object [] {"   ", "   ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 3)});
	// cyan //
	ModLoader.registerBlock(ContractAddBlocks.cWoolSlab);
	ModLoader.addName(ContractAddBlocks.cWoolSlab, "Wool Slab");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.cWoolSlab, 6),
	new Object [] {"   ", "   ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 9)});
	// pink //
	ModLoader.registerBlock(ContractAddBlocks.piWoolSlab);
	ModLoader.addName(ContractAddBlocks.piWoolSlab, "Wool Slab");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.piWoolSlab, 6),
	new Object [] {"   ", "   ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 6)});
	// magenta //
	ModLoader.registerBlock(ContractAddBlocks.mWoolSlab);
	ModLoader.addName(ContractAddBlocks.mWoolSlab, "Wool Slab");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.mWoolSlab, 6),
	new Object [] {"   ", "   ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 2)});
	// brown //
	ModLoader.registerBlock(ContractAddBlocks.brWoolSlab);
	ModLoader.addName(ContractAddBlocks.brWoolSlab, "Wool Slab");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.brWoolSlab, 6),
	new Object [] {"   ", "   ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 12)});
	// purple //
	ModLoader.registerBlock(ContractAddBlocks.pWoolSlab);
	ModLoader.addName(ContractAddBlocks.pWoolSlab, "Wool Slab");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.pWoolSlab, 6),
	new Object [] {"   ", "   ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 10)});
	// blue //
	ModLoader.registerBlock(ContractAddBlocks.blWoolSlab);
	ModLoader.addName(ContractAddBlocks.blWoolSlab, "Wool Slab");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.blWoolSlab, 6),
	new Object [] {"   ", "   ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 11)});
	// red //
	ModLoader.registerBlock(ContractAddBlocks.rWoolSlab);
	ModLoader.addName(ContractAddBlocks.rWoolSlab, "Wool Slab");
	ModLoader.addRecipe(new ItemStack(ContractAddBlocks.rWoolSlab, 6),
	new Object [] {"   ", "   ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 14)});
	
	
	/* Other */
    
    // Travertine Ore Block //
    ModLoader.registerBlock(ContractAddBlocks.travertine);
    ModLoader.addName(ContractAddBlocks.travertine, "Travertine Rock");

    // Marble Ore Block //
    ModLoader.registerBlock(ContractAddBlocks.marble);
    ModLoader.addName(ContractAddBlocks.marble, "Marble Rock");

	/**  ITEMS  **/
    
    // Travertine //
    ModLoader.addName(ContractAddItems.travRock, "Travertine");
    ModLoader.addShapelessRecipe(new ItemStack(ContractAddItems.travRock, 7),
    new Object[] {new ItemStack(ContractAddBlocks.travertineBlock, 1)});
    
    // Marble //
    ModLoader.addName(ContractAddItems.marbleRock, "Marble");
    ModLoader.addShapelessRecipe(new ItemStack(ContractAddItems.marbleRock, 7),
    new Object[] {new ItemStack(ContractAddBlocks.marbleBlock, 1)});
    
    // Raw Clay Tile //
    ModLoader.addName(ContractAddItems.rawTile, "Tile");
	ModLoader.addRecipe(new ItemStack(ContractAddItems.rawTile, 1),
	new Object [] {"   ", "   ", "## ", Character.valueOf('#'), Item.clay});
	
    // Small Clay Tile //
    ModLoader.addName(ContractAddItems.rawTile2, "Tile");
    ModLoader.addShapelessRecipe(new ItemStack(ContractAddItems.rawTile2, 4),
    	    new Object[] {new ItemStack(ContractAddItems.rawTile, 1)});
    
    // Raw Trav Tile //
    ModLoader.addName(ContractAddItems.rawtTile, "Tile");
	ModLoader.addRecipe(new ItemStack(ContractAddItems.rawtTile, 1),
	new Object [] {"   ", "   ", "## ", Character.valueOf('#'), ContractAddItems.travRock});
	
    // Small Trav Tile//
    ModLoader.addName(ContractAddItems.rawtTile2, "Tile");
    ModLoader.addShapelessRecipe(new ItemStack(ContractAddItems.rawtTile2, 4),
    new Object[] {new ItemStack(ContractAddItems.rawtTile, 1)});
    
    //testballs//
    ModLoader.registerBlock(ContractAddBlocks.cornertest);
    ModLoader.addName(ContractAddBlocks.cornertest, "corner Test");

	

	}
/** Generate Ores **/
public void generateSurface(World world, Random random, int chunkX, int chunkZ)
{
        for(int i = 0; i < 20; i++)
        {
                int randPosX = chunkX + random.nextInt(16);
                int randPosY = random.nextInt(128);
                int randPosZ = chunkZ + random.nextInt(16);
                (new WorldGenMinable(ContractAddBlocks.travertine.blockID, 20)).generate(world, random, randPosX, randPosY, randPosZ);
        	}
		for(int i = 0; i < 18; i++)
        {
        			int randPosX = chunkX + random.nextInt(16);
                    int randPosY = random.nextInt(90);
                    int randPosZ = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(ContractAddBlocks.marble.blockID, 10)).generate(world, random, randPosX, randPosY, randPosZ);
              
            }
        }


public String getVersion() {

		return "v1.1 for Minecraft 1.2.5";
	}
public boolean onTickInGame(float f, Minecraft minecraft)
{
  if(minecraft.currentScreen == null)
  {
   creativeInventory = null;
  }
  return true;
}
public boolean onTickInGUI(float f, Minecraft minecraft, GuiScreen guiscreen)
{
  if((guiscreen instanceof GuiContainerCreative) && !(creativeInventory instanceof GuiContainerCreative) && !minecraft.theWorld.isRemote)
  {
   Container container = ((GuiContainer)guiscreen).inventorySlots;
   List list = ((ContainerCreative)container).itemList;
   int i = 0;
   list.add(new ItemStack(ContractAddBlocks.travTile, 1, i));
   list.add(new ItemStack(ContractAddBlocks.satilloOne, 1, i));
   list.add(new ItemStack(ContractAddBlocks.satilloTwo, 1, i));
   list.add(new ItemStack(ContractAddBlocks.satilloThree, 1, i));
   list.add(new ItemStack(ContractAddBlocks.ceramicTile, 1, i));
   list.add(new ItemStack(ContractAddBlocks.ceraTile2, 1, i));
   list.add(new ItemStack(ContractAddBlocks.ceraTile3, 1, i));
   list.add(new ItemStack(ContractAddBlocks.marbleTile1, 1, i));
   list.add(new ItemStack(ContractAddBlocks.marbleTile2, 1, i));
   list.add(new ItemStack(ContractAddBlocks.marbleTile3, 1, i));
   list.add(new ItemStack(ContractAddBlocks.deskLamp, 1, i));
   list.add(new ItemStack(ContractAddBlocks.deskLamp2, 1, i));
   list.add(new ItemStack(ContractAddBlocks.streetLamp, 1, i));
   list.add(new ItemStack(ContractAddBlocks.streetLamp2, 1, i));
   list.add(new ItemStack(ContractAddBlocks.marbleBlock, 1, i));
   list.add(new ItemStack(ContractAddBlocks.travertineBlock, 1, i));
   list.add(new ItemStack(ContractAddBlocks.marbleStairs, 1, i));
   list.add(new ItemStack(ContractAddBlocks.travStairs, 1, i));
   list.add(new ItemStack(ContractAddBlocks.endStairs, 1, i));
   list.add(new ItemStack(ContractAddBlocks.goldStairs, 1, i));
   list.add(new ItemStack(ContractAddBlocks.ironStairs, 1, i));
   list.add(new ItemStack(ContractAddBlocks.diamondStairs, 1, i));
   list.add(new ItemStack(ContractAddBlocks.wwWoolStairs, 1, i));
   list.add(new ItemStack(ContractAddBlocks.wWoolStairs, 1, i));
   list.add(new ItemStack(ContractAddBlocks.gWoolStairs, 1, i));
   list.add(new ItemStack(ContractAddBlocks.bWoolStairs, 1, i));
   list.add(new ItemStack(ContractAddBlocks.rWoolStairs, 1, i));
   list.add(new ItemStack(ContractAddBlocks.oWoolStairs, 1, i));
   list.add(new ItemStack(ContractAddBlocks.yWoolStairs, 1, i));
   list.add(new ItemStack(ContractAddBlocks.lWoolStairs, 1, i));
   list.add(new ItemStack(ContractAddBlocks.cWoolStairs, 1, i));
   list.add(new ItemStack(ContractAddBlocks.blWoolStairs, 1, i));
   list.add(new ItemStack(ContractAddBlocks.pWoolStairs, 1, i));
   list.add(new ItemStack(ContractAddBlocks.mWoolStairs, 1, i));
   list.add(new ItemStack(ContractAddBlocks.piWoolStairs, 1, i));
   list.add(new ItemStack(ContractAddBlocks.brWoolStairs, 1, i));
   list.add(new ItemStack(ContractAddBlocks.gnWoolStairs, 1, i));
   list.add(new ItemStack(ContractAddBlocks.lbWoolStairs, 1, i));
   list.add(new ItemStack(ContractAddBlocks.marbleSlab, 1, i));
   list.add(new ItemStack(ContractAddBlocks.travSlab, 1, i));
   list.add(new ItemStack(ContractAddBlocks.endSlab, 1, i));
   list.add(new ItemStack(ContractAddBlocks.goldSlab, 1, i));
   list.add(new ItemStack(ContractAddBlocks.ironSlab, 1, i));
   list.add(new ItemStack(ContractAddBlocks.diamondSlab, 1, i));
   list.add(new ItemStack(ContractAddBlocks.wwWoolSlab, 1, i));
   list.add(new ItemStack(ContractAddBlocks.wWoolSlab, 1, i));
   list.add(new ItemStack(ContractAddBlocks.gWoolSlab, 1, i));
   list.add(new ItemStack(ContractAddBlocks.bWoolSlab, 1, i));
   list.add(new ItemStack(ContractAddBlocks.rWoolSlab, 1, i));
   list.add(new ItemStack(ContractAddBlocks.oWoolSlab, 1, i));
   list.add(new ItemStack(ContractAddBlocks.yWoolSlab, 1, i));
   list.add(new ItemStack(ContractAddBlocks.lWoolSlab, 1, i));
   list.add(new ItemStack(ContractAddBlocks.cWoolSlab, 1, i));
   list.add(new ItemStack(ContractAddBlocks.blWoolSlab, 1, i));
   list.add(new ItemStack(ContractAddBlocks.pWoolSlab, 1, i));
   list.add(new ItemStack(ContractAddBlocks.mWoolSlab, 1, i));
   list.add(new ItemStack(ContractAddBlocks.piWoolSlab, 1, i));
   list.add(new ItemStack(ContractAddBlocks.brWoolSlab, 1, i));
   list.add(new ItemStack(ContractAddBlocks.gnWoolSlab, 1, i));
   list.add(new ItemStack(ContractAddBlocks.lbWoolSlab, 1, i));
   list.add(new ItemStack(ContractAddBlocks.cornertest, 1, i));


  }
  creativeInventory = guiscreen;
  return true;
}
private static GuiScreen creativeInventory;
}

