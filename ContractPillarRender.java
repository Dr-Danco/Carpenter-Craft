package net.minecraft.src;
import org.lwjgl.opengl.GL11;
public class ContractPillarRender extends TileEntitySpecialRenderer
{
        public ContractPillarRender()
        {
                pillarModel = new ContractPillarModel();
        }

        public void renderAModelAt(ContractTileEntity tileentity1, double d, double d1, double d2, float f)
        {  
                GL11.glPushMatrix();
                GL11.glTranslatef((float)d + 0.5F, (float)d1 - 0.5F, (float)d2 + 0.5F);
                bindTextureByName("/carpentercraft/sb/pillar.png");
                GL11.glPushMatrix();
                pillarModel.renderModel(0.0625F);
                GL11.glPopMatrix();     
                GL11.glPopMatrix();                                     
        }
        public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2,
                        float f)
        {
                renderAModelAt((ContractTileEntity)tileentity, d, d1, d2, f);
        }
        private ContractPillarModel pillarModel;
}