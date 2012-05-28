package net.minecraft.src;
import java.util.Random;
import net.minecraft.src.forge.ITextureProvider;

public class ContractTravBlock extends Block implements ITextureProvider {
	public ContractTravBlock(int i, int j) {
		super(i, j, Material.clay);
	}
    public String getTextureFile()
    {
            return "/carpentercraft/terrain.png";
    }
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return ContractAddItems.travRock.shiftedIndex;
    }
    public int quantityDropped(Random par1Random)
    {
        return 5;
    }


}
