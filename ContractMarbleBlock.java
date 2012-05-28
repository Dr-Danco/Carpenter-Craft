package net.minecraft.src;
import java.util.Random;
import net.minecraft.src.forge.ITextureProvider;

public class ContractMarbleBlock extends Block implements ITextureProvider {
	public ContractMarbleBlock(int i, int j) {
		super(i, j, Material.clay);
	}
    public String getTextureFile()
    {
            return "/contractorcraft/terrain.png";
    }
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return ContractAddItems.marbleRock.shiftedIndex;
    }
    public int quantityDropped(Random par1Random)
    {
        return 5;
    }


}
