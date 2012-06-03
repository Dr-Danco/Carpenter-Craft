package net.minecraft.src;
import java.util.Random;
import net.minecraft.src.forge.ITextureProvider;

public class ContractTiles extends Block implements ITextureProvider {
	public ContractTiles(int i, int j) {
		super(i, j, Material.rock);
	}
    public int quantityDropped(Random par1Random)
    {
        return 0;
    }
    public String getTextureFile()
    {
            return "/carpentercraft/terrain.png";
    }

}
