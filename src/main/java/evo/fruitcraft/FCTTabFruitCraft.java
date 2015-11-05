package evo.fruitcraft;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import evo.fruitcraft.foods.FCFOrangeWhole;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FCTTabFruitCraft
  extends CreativeTabs
{
  public FCTTabFruitCraft(String label)
  {
    super(label);
  }
@Override
@SideOnly(Side.CLIENT)
public Item getTabIconItem() {
	return FCFOrangeWhole.FCFOrangeWhole;
}
}
