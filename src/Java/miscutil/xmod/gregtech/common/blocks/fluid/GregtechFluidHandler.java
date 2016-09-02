package miscutil.xmod.gregtech.common.blocks.fluid;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_OreDictUnificator;
import ic2.core.Ic2Items;
import ic2.core.init.InternalName;
import ic2.core.item.resources.ItemCell;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

import miscutil.core.lib.LoadedMods;
import miscutil.core.util.Utils;
import miscutil.core.util.fluid.FluidUtils;
import miscutil.core.util.item.UtilsItems;
import miscutil.xmod.gregtech.api.enums.GregtechOrePrefixes.GT_Materials;
import miscutil.xmod.gregtech.common.Meta_GT_Proxy;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidStack;

public class GregtechFluidHandler {

	protected static int cellID = 0;

	public static void run(){
		start();
	}

	private static void start(){

		/*    Meta_GT_Proxy.addFluid("lubricant", "Lubricant", Materials.Lubricant, 1, 295, GT_OreDictUnificator.get(OrePrefixes.cell, Materials.Lubricant, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
        Meta_GT_Proxy.addFluid("creosote", "Creosote Oil", Materials.Creosote, 1, 295, GT_OreDictUnificator.get(OrePrefixes.cell, Materials.Creosote, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
        Meta_GT_Proxy.addFluid("seedoil", "Seed Oil", Materials.SeedOil, 1, 295, GT_OreDictUnificator.get(OrePrefixes.cell, Materials.SeedOil, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
        Meta_GT_Proxy.addFluid("fishoil", "Fish Oil", Materials.FishOil, 1, 295, GT_OreDictUnificator.get(OrePrefixes.cell, Materials.FishOil, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
        Meta_GT_Proxy.addFluid("oil", "Oil", Materials.Oil, 1, 295, GT_OreDictUnificator.get(OrePrefixes.cell, Materials.Oil, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
        Meta_GT_Proxy.addFluid("fuel", "Diesel", Materials.Fuel, 1, 295, GT_OreDictUnificator.get(OrePrefixes.cell, Materials.Fuel, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
        Meta_GT_Proxy.addFluid("for.honey", "Honey", Materials.Honey, 1, 295, GT_OreDictUnificator.get(OrePrefixes.cell, Materials.Honey, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
        Meta_GT_Proxy.addFluid("biomass", "Biomass", Materials.Biomass, 1, 295, GT_OreDictUnificator.get(OrePrefixes.cell, Materials.Biomass, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
        Meta_GT_Proxy.addFluid("bioethanol", "Bio Ethanol", Materials.Ethanol, 1, 295, GT_OreDictUnificator.get(OrePrefixes.cell, Materials.Ethanol, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
        Meta_GT_Proxy.addFluid("sulfuricacid", "Sulfuric Acid", Materials.SulfuricAcid, 1, 295, GT_OreDictUnificator.get(OrePrefixes.cell, Materials.SulfuricAcid, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
        Meta_GT_Proxy.addFluid("milk", "Milk", Materials.Milk, 1, 290, GT_OreDictUnificator.get(OrePrefixes.cell, Materials.Milk, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
        Meta_GT_Proxy.addFluid("mcguffium", "Mc Guffium 239", Materials.McGuffium239, 1, 295, GT_OreDictUnificator.get(OrePrefixes.cell, Materials.McGuffium239, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
        Meta_GT_Proxy.addFluid("glue", "Glue", Materials.Glue, 1, 295, GT_OreDictUnificator.get(OrePrefixes.cell, Materials.Glue, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
		 */

		if (!LoadedMods.ThermalFoundation){

			Utils.LOG_INFO("Adding in our own GT versions of Thermal Foundation Fluids");		
			Meta_GT_Proxy.addFluid("cryotheum", "Gelid Cryotheum", GT_Materials.Cryotheum, 4, -1200, GT_OreDictUnificator.get(OrePrefixes.cell, GT_Materials.Cryotheum, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
			Meta_GT_Proxy.addFluid("pyrotheum", "Blazing Pyrotheum", GT_Materials.Pyrotheum, 4, 4000, GT_OreDictUnificator.get(OrePrefixes.cell, GT_Materials.Pyrotheum, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
		}

		if (LoadedMods.IndustrialCraft2){
			Utils.LOG_INFO("Adding in GT Fluids for Molten Salt, Cooled Salt and Various other Nuclide related content.");	
			Meta_GT_Proxy.addFluid("hydrofluoricAcid", "Hydrofluoric Acid", GT_Materials.HydrofluoricAcid, 1, 120, GT_OreDictUnificator.get(OrePrefixes.cell, GT_Materials.HydrofluoricAcid, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
			generateIC2FluidCell("HydrofluoricAcid");

			Meta_GT_Proxy.addFluid("sulfurDioxide", "Sulfur Dioxide", GT_Materials.SulfurDioxide, 4, -100, GT_OreDictUnificator.get(OrePrefixes.cell, GT_Materials.SulfurDioxide, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
			generateIC2FluidCell("SulfurDioxide");

			Meta_GT_Proxy.addFluid("sulfurousAcid", "Sulfurous Acid", GT_Materials.SulfurousAcid, 4, 75, GT_OreDictUnificator.get(OrePrefixes.cell, GT_Materials.SulfurousAcid, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
			generateIC2FluidCell("SulfurousAcid");

			Meta_GT_Proxy.addFluid("sulfuricApatite", "Sulfuric Apatite", GT_Materials.SulfuricApatite, 4, 500, GT_OreDictUnificator.get(OrePrefixes.cell, GT_Materials.SulfuricApatite, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
			generateIC2FluidCell("SulfuricApatite");

			Meta_GT_Proxy.addFluid("uraniumHexafluoride", "Uranium Hexafluoride", GT_Materials.UraniumHexaFluoride, 4, 200, GT_OreDictUnificator.get(OrePrefixes.cell, GT_Materials.UraniumHexaFluoride, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
			generateIC2FluidCell("UraniumHexaFluoride");

			Meta_GT_Proxy.addFluid("uraniumTetrafluoride", "Uranium Tetrafluoride", GT_Materials.UraniumTetraFluoride, 4, 950, GT_OreDictUnificator.get(OrePrefixes.cell, GT_Materials.UraniumTetraFluoride, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
			generateIC2FluidCell("UraniumTetraFluoride");

			Meta_GT_Proxy.addFluid("thoriumTetrafluoride", "Thorium Tetrafluoride", GT_Materials.ThoriumTetraFluoride, 4, 1250, GT_OreDictUnificator.get(OrePrefixes.cell, GT_Materials.ThoriumTetraFluoride, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
			generateIC2FluidCell("ThoriumTetraFluoride");


			if (!LoadedMods.IHL || UtilsItems.getItemStackOfAmountFromOreDict("cellHydrogenChloride", 1) == null){

				if (FluidUtils.getFluidStack("hydrogenchloride", 1) == null){
					if (LoadedMods.IHL){
						Utils.LOG_INFO("IHL Loaded but hydrogen chloride could not be found for some reason. Adding our own.");
					}
					else {
						Utils.LOG_INFO("No Suitable versions of Hydrogen Chloride available, adding our own.");
					}
					Meta_GT_Proxy.addFluid("hydrogenChloride", "Hydrogen Chloride", GT_Materials.HydrogenChloride, 4, 75, GT_OreDictUnificator.get(OrePrefixes.cell, GT_Materials.HydrogenChloride, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
					generateIC2FluidCell("HydrogenChloride");
				}
			}

			GT_Values.RA.addChemicalRecipe(
					UtilsItems.getItemStackOfAmountFromOreDict("dustApatite", 16),
					null,
					FluidUtils.getFluidStack("sulfuricacid", 133*32), 
					FluidUtils.getFluidStack("sulfuricapatite", 133*4),
					UtilsItems.getItemStackOfAmountFromOreDict("dustSmallSulfur", 1), 
					20*20);

			GT_Values.RA.addMixerRecipe(UtilsItems.getItemStackOfAmountFromOreDict("dustSulfur", 1), null, null, null, FluidUtils.getFluidStack("oxygen", 266), FluidUtils.getFluidStack("sulfurdioxide", 399), null, 600, 60);
			GT_Values.RA.addMixerRecipe(UtilsItems.getItemStackOfAmountFromOreDict("dustUranium235", 1), UtilsItems.getItemStackOfAmountFromOreDict("dustUranium235", 1), null, null, FluidUtils.getFluidStack("hydrofluoricacid", 2000), FluidUtils.getFluidStack("uraniumtetrafluoride", 266), null, 3000, 500);
			GT_Values.RA.addMixerRecipe(UtilsItems.getItemStackOfAmountFromOreDict("cellFluorine", 1), UtilsItems.getItemStackOfAmountFromOreDict("cellFluorine", 1), null, null, FluidUtils.getFluidStack("uraniumtetrafluoride", 665), FluidUtils.getFluidStack("uraniumhexafluoride", 266), null, 5000, 2000);

			//Apatite Distillation
			/*
			 * so if you dissolve aparite in sulphuric acid
			 * you'll get a mixture of SO2, H2O, HF and HCl
			 */



			FluidStack[] apatiteOutput = {
					FluidUtils.getFluidStack("sulfurousacid", 3800),
					FluidUtils.getFluidStack("hydrogenchloride", 1000),
					FluidUtils.getFluidStack("hydrofluoricacid", 400)
			};
			GT_Values.RA.addDistillationTowerRecipe(
					FluidUtils.getFluidStack("sulfuricapatite", 5200),
					apatiteOutput,
					null,
					45*20,
					256);

			FluidStack[] sulfurousacidOutput = {
					FluidUtils.getFluidStack("sulfurdioxide", 500),
					FluidUtils.getFluidStack("water", 500)
			};
			GT_Values.RA.addDistillationTowerRecipe(
					FluidUtils.getFluidStack("sulfurousacid", 1000),
					sulfurousacidOutput,
					null,
					10*20,
					60);

			FluidStack[] sulfurdioxideOutput = {
					FluidUtils.getFluidStack("oxygen", 133*2)
			};
			GT_Values.RA.addDistillationTowerRecipe(
					FluidUtils.getFluidStack("sulfurdioxide", 133*3),
					sulfurdioxideOutput,
					UtilsItems.getItemStackOfAmountFromOreDict("dustSulfur", 1),
					5*20,
					30);















		}
	}


	private static void generateIC2FluidCell(String fluidNameWithCaps){
		Utils.LOG_INFO("Adding a Cell for "+fluidNameWithCaps);
		if (LoadedMods.IndustrialCraft2){
			Utils.createInternalNameAndFluidCell(fluidNameWithCaps);
		}
	}

	public static <T extends Enum<? >> T addEnum(Class<T> enumType, String enumName, Class<?>[] paramTypes, Object[] paramValues) {
		return null;
	}

	private static Map<Integer, InternalName> names = new HashMap<Integer, InternalName>();
	private static Map<Block, ItemStack> cells = new IdentityHashMap<Block, ItemStack>();

	public static boolean setUpNewFluidCell(int meta, String name){
		try {
			InternalName fluidName = EnumHelper.addEnum(InternalName.class, name, new Class[0], new Object[0]);
			//EnumHelper.addEnum(InternalName.class, "InternalName", name);
			if (fluidName.valueOf(name) != null){
				addRegisterCell(meta, fluidName);
				return true;
			}
			Utils.LOG_INFO("Secondary Cell Method failed.");
			return false;
		} catch (Throwable r) {
			Utils.LOG_INFO("Secondary Cell Method failed..");
			Utils.LOG_INFO("Reason: "+r.getMessage());
			Utils.LOG_INFO("Reason: "+r);
			r.printStackTrace();
			return false;
		}
	}

	private static ItemStack addCell(int meta, InternalName name){
		ItemCell itemCell = new ItemCell(InternalName.valueOf(name.name()));
		names.put(Integer.valueOf(meta), InternalName.valueOf(name.name()));
		ItemStack ret = new ItemStack(itemCell, 1, meta);
		cells.put(Blocks.air, ret);
		return ret;
	}

	private static ItemStack addRegisterCell(int meta, InternalName name){
		ItemStack ret = addCell(meta, name);
		FluidContainerRegistry.registerFluidContainer(FluidUtils.getFluidStack("air", 0), ret.copy(), Ic2Items.cell.copy());
		return ret;
	}

}
