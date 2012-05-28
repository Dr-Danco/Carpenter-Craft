package net.minecraft.src;

import java.util.Random;

import net.minecraft.src.forge.ITextureProvider;

public class ContractSlabs extends Block implements ITextureProvider {

protected ContractSlabs(int i, int j)
{
super(i, j, Material.wood);
                setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
                setLightOpacity(255);
}

        public boolean isOpaqueCube()
        {
                return false;
        }

        public int quantityDropped(Random random)
        {
                return 1;
        }

        public boolean renderAsNormalBlock()
        {
                return false;
        }

        public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
        {
                if (this != Block.stairSingle)
                {
                        super.shouldSideBeRendered(iblockaccess, i, j, k, l);
                }
                if (l == 1)
                {
                        return true;
                }
                if (!super.shouldSideBeRendered(iblockaccess, i, j, k, l))
                {
                        return false;
                }
                if (l == 0)
                {
                        return true;
                }
                else
                {
                        return iblockaccess.getBlockId(i, j, k) != blockID;
                }
        }
	    public String getTextureFile()
	    {
	        return "/carpentercraft/terrain.png";
	            
	    }


}