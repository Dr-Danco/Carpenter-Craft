package net.minecraft.src;
import net.minecraft.src.forge.ITextureProvider;

public class ContractBlock extends Block implements ITextureProvider {
	public ContractBlock(int i, int j) {
		super(i, j, Material.rock);
	}
    public String getTextureFile()
    {
            return "/contractorcraft/terrain.png";
    }

}
