package evo.fruitcraft.Recipes;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import evo.fruitcraft.Items.FCIDustOrange;
import evo.fruitcraft.Items.FCIIngotOrange;
import evo.fruitcraft.Tools.FCTOrangeIngotAxe;
import evo.fruitcraft.Tools.FCTOrangeIngotPickaxe;
import evo.fruitcraft.Tools.FCTOrangeIngotSpade;
import evo.fruitcraft.Tools.FCTOrangeIngotSword;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class FCROrangeIngot{
	@EventHandler
	public void Init(FMLInitializationEvent event){
		   //Recipe for making orange ingot:no more using Grate-Hammer or Orange-Ore-gravel block.
		GameRegistry.addSmelting(FCIDustOrange.FCIDustOrange, new ItemStack(FCIIngotOrange.FCIIngotOrange), 0.8F);
	    //Recipe for OrangeIngot tools(OreDictionary)
		GameRegistry.addRecipe(
				new ShapedOreRecipe(
					new ItemStack(FCTOrangeIngotSword.FCTOrangeIngotSword, 1),
						new Object[]
						{
							"X", "X", "Y",
							'X', "ingotOrange",
							'Y', Items.stick
						}));
		GameRegistry.addRecipe(
				new ShapedOreRecipe(
					new ItemStack(FCTOrangeIngotPickaxe.FCTOrangeIngotPickaxe, 1),
						new Object[]
						{
							"XXX", " Y ", " Y ",
							'X', "ingotOrange",
							'Y', Items.stick
						}));
		GameRegistry.addRecipe(
				new ShapedOreRecipe(
					new ItemStack(FCTOrangeIngotAxe.FCTOrangeIngotAxe, 1),
						new Object[]
						{
							"XX", "XY", " Y",
							'X', "ingotOrange",
							'Y', Items.stick
						}));
		GameRegistry.addRecipe(
				new ShapedOreRecipe(
					new ItemStack(FCTOrangeIngotSpade.FCTOrangeIngotSpade, 1),
						new Object[]
						{
							"X", "Y", "Y",
							'X', "ingotOrange",
							'Y', Items.stick
						}));
	}

}