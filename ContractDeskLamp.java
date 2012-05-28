package net.minecraft.src;
import net.minecraft.src.forge.ITextureProvider;

public class ContractDeskLamp extends Block implements ITextureProvider {

	public ContractDeskLamp(int i, int j) {
		super(i, j, Material.glass);

	}
		public boolean isOpaqueCube()
	    {
	        return false;
	    }
	    public boolean renderAsNormalBlock()
	    {
	        return false;
	    }
	    public int getRenderType()
	    {
	        return 1;
	    }
	    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
	    {
	            return super.canPlaceBlockAt(par1World, par2, par3, par4) && this.canThisPlantGrowOnThisBlockID(par1World.getBlockId(par2, par3 - 1, par4));
	    }
	    protected boolean canThisPlantGrowOnThisBlockID(int par1)
	    {
	            return par1 == Block.grass.blockID || par1 == Block.dirt.blockID || par1 == Block.wood.blockID ||
	            	   par1 == Block.planks.blockID || par1 == Block.stoneBrick.blockID || par1 == Block.sandStone.blockID ||
	            	   par1 == Block.fence.blockID || par1 == Block.netherrack.blockID  || par1 == Block.cloth.blockID ||
	            	   par1 == Block.netherFence.blockID || par1 == Block.netherBrick.blockID  || par1 == Block.whiteStone.blockID ||
	            	   par1 == ContractAddBlocks.travTile.blockID || par1 == ContractAddBlocks.satilloOne.blockID || 
	            	   par1 == ContractAddBlocks.satilloTwo.blockID || par1 == ContractAddBlocks.satilloThree.blockID ||
	            	   par1 == ContractAddBlocks.ceramicTile.blockID || par1 == ContractAddBlocks.ceraTile2.blockID ||
	            	   par1 == ContractAddBlocks.ceraTile3.blockID || par1 == ContractAddBlocks.marbleTile1.blockID ||
	            	   par1 == ContractAddBlocks.marbleTile2.blockID;
	            	   
	        
	    }
	    public String getTextureFile()
	    {
	        return "/contractorcraft/terrain.png";
	            
	    }



}
