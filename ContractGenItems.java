package net.minecraft.src;
import net.minecraft.src.forge.ITextureProvider;

public class ContractGenItems extends Item implements ITextureProvider {
	 public ContractGenItems(int i)
     {
             super(i);            
     }

	public String getTextureFile() {
		
		return "/contractorcraft/gui/items.png";
	}

}
