package net.minecraft.src;

import java.util.ArrayList;

import net.minecraft.src.forge.ITextureProvider;

public class ContractStairs extends Block implements ITextureProvider
{
        public ContractStairs(int i, int j)
        {
                super(i, j, Material.wood);
        }
        
        public void getCollidingBoundingBoxes(World world, int i, int j, int k, AxisAlignedBB axisalignedbb, ArrayList arraylist)
        {
                int l = world.getBlockMetadata(i, j, k);
                if (l == 0)
                {
                        setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 1.0F);
                        super.getCollidingBoundingBoxes(world, i, j, k, axisalignedbb, arraylist);
                        setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
                        super.getCollidingBoundingBoxes(world, i, j, k, axisalignedbb, arraylist);
                }
                else if (l == 1)
                {
                        setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
                        super.getCollidingBoundingBoxes(world, i, j, k, axisalignedbb, arraylist);
                        setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
                        super.getCollidingBoundingBoxes(world, i, j, k, axisalignedbb, arraylist);
                }
                else if (l == 2)
                {
                        setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
                        super.getCollidingBoundingBoxes(world, i, j, k, axisalignedbb, arraylist);
                        setBlockBounds(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
                        super.getCollidingBoundingBoxes(world, i, j, k, axisalignedbb, arraylist);
                }
                else if (l == 3)
                {
                        setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
                        super.getCollidingBoundingBoxes(world, i, j, k, axisalignedbb, arraylist);
                        setBlockBounds(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
                        super.getCollidingBoundingBoxes(world, i, j, k, axisalignedbb, arraylist);
                }
                setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }

        public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityliving)
        {
                int l = MathHelper.floor_double((double)((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
                if (l == 0)
                {
                        world.setBlockMetadataWithNotify(i, j, k, 2);
                }
                if (l == 1)
                {
                        world.setBlockMetadataWithNotify(i, j, k, 1);
                }
                if (l == 2)
                {
                        world.setBlockMetadataWithNotify(i, j, k, 3);
                }
                if (l == 3)
                {
                        world.setBlockMetadataWithNotify(i, j, k, 0);
                }
        }
        

        public void setBlockBoundsBasedOnState(IBlockAccess iblockaccess, int i, int j, int k)
        {
                setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
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
                return 10;
        }
	    public String getTextureFile()
	    {
	        return "/carpentercraft/terrain.png";
	            
	    }

}