package evo.fruitcraft.foods;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import evo.fruitcraft.FruitCraftCore;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class FCFOrangeWhole{
	public static Item FCFOrangeWhole;
	@EventHandler
	public void perInit(FMLPreInitializationEvent event) {
	FCFOrangeWhole =new ItemFood (4, 2.4F, false)
	.setCreativeTab(FruitCraftCore.FCTTabFruitCraft)
	.setTextureName("fruitcraft:whole_orange")
	.setUnlocalizedName("FCFOrangeWhole")
	.setPotionEffect(Potion. regeneration.id, 60, 0, 0.8F);
	GameRegistry.registerItem(FCFOrangeWhole, "FCFOrangeWhole");
	}

}
