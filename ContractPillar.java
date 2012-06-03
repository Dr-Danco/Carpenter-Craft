package net.minecraft.src;
import java.util.Random;

public class ContractPillar extends BlockContainer
{
private Class TestEntityClass;
protected ContractPillar(int i, Class tClass)
  {
        super(i,Material.wood);
        TestEntityClass = tClass;
  }
  
        public TileEntity getBlockEntity()
        {
                        try{
                           return (TileEntity)TestEntityClass.newInstance();
                        }
                        catch(Exception exception){
                                        throw new RuntimeException(exception);
                        }
        }
  
        public int idDropped(int i, Random random, int j)
        {
                return ContractAddItems.marblePillar.shiftedIndex;
        }
  
        public int quanityDropped(Random random)
        {
           return 1;
          			}
  
        public int getRenderType(){
        	return -1;
        }
  
        public boolean isOpaqueCube()
        {
                return false;
        }
  
        public boolean renderAsNormalBlock()
        {
                return false;
        }
}