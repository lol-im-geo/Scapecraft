package scapecraft.util;

import java.util.HashMap;
import java.util.List;

import cpw.mods.fml.common.event.FMLMissingMappingsEvent;
import cpw.mods.fml.common.event.FMLMissingMappingsEvent.MissingMapping;

public class UpdateHandler
{
	public static HashMap<Integer, String> mappings = new HashMap<Integer, String>()
	{
		private static final long serialVersionUID = -2629148658221606530L;
		{
			put(167, "blueCobble");
			put(178, "mithOre");
			put(179, "addyOre");
			put(180, "runeOre");
			put(189, "hardIce");
			put(194, "blackBlock");
			put(195, "whiteBlock");
			put(200, "magicLog");
			put(201, "magicLeaves");
			put(202, "magicSapling");
			put(203, "magicPlank");
			put(204, "cabbage");
			put(210, "yewLog");
			put(211, "yewLeaves");
			put(212, "yewSapling");
			put(213, "yewPlank");
			put(214, "magicStairs");
			put(215, "yewStairs");
			put(228, "serverNotice");
			put(230, "keyBlock");
			put(1257, "magicBow");
			put(1258, "yewBow");
			put(1606, "dragonLongsword");
			put(1607, "dragonPickaxe");
			put(1608, "dragonPickaxeg");
			put(1796, "mithPickaxe");
			put(1806, "mithSword");
			put(1816, "mithHoe");
			put(1826, "mithShovel");
			put(1836, "mithAxe");
			put(1846, "mithLump");
			put(1856, "mithIngot");
			put(1866, "addyPickaxe");
			put(1876, "addySword");
			put(1886, "addyHoe");
			put(1896, "addyShovel");
			put(1906, "addyAxe");
			put(1916, "addyLump");
			put(1926, "addyIngot");
			put(1936, "runePickaxe");
			put(1946, "runeSword");
			put(1956, "runeHoe");
			put(1966, "runeShovel");
			put(1976, "runeAxe");
			put(1986, "runeLump");
			put(1996, "runeIngot");
			put(2006, "blackSword");
			put(2016, "whiteSword");
			put(2292, "coffin");
			put(2302, "kosTele");
			put(2304, "blueCobbleCompressed");
			put(2305, "keyBlock2");
			put(2380, "scapecraftFire");
			put(2381, "stall");
			put(2500, "woolGate");
			put(2600, "mithOreSpawn");
			put(2601, "runeOreSpawn");
			put(2602, "addyOreSpawn");
			put(2603, "cobblestoneSpawn");
			put(2604, "coalOreSpawn");
			put(2605, "redstoneOreSpawn");
			put(2606, "diamondOreSpawn");
			put(2607, "blueCobbleSpawn");
			put(2608, "goldOreSpawn");
			put(2609, "emeraldOreSpawn");
			put(2610, "ironOreSpawn");
			put(2611, "sandSpawn");
			put(2612, "dirtSpawn");
			put(2613, "sandstoneSpawn");
			put(2614, "cabbageSpawn");
			put(2615, "gravelSpawn");
			put(2616, "unbreakableAnvil");
			put(2617, "oakTreeSpawn");
			put(2618, "yewTreeSpawn");
			put(2619, "wheatSpawn");
			put(3010, "agilityBlock");
			put(3011, "agilityBlock2");
			put(3012, "agilityBlock3");
			put(5257, "phatHelmet");
			put(5261, "mithHelmet");
			put(5262, "mithChestplate");
			put(5263, "mithLeggings");
			put(5264, "mithBoots");
			put(5265, "addyHelmet");
			put(5266, "addyChestplate");
			put(5267, "addyLeggings");
			put(5268, "addyBoots");
			put(5269, "runeHelmet");
			put(5270, "runeChestplate");
			put(5271, "runeLeggings");
			put(5272, "runeBoots");
			put(5273, "dragonHelmet");
			put(5274, "dragonChestplate");
			put(5275, "dragonLeggings");
			put(5276, "dragonBoots");
			put(5277, "blackHelmet");
			put(5278, "blackChestplate");
			put(5279, "blackLeggings");
			put(5280, "blackBoots");
			put(5281, "whiteHelmet");
			put(5282, "whiteChestplate");
			put(5283, "whiteLeggings");
			put(5284, "whiteBoots");
			put(5285, "bronzeHelmet");
			put(5286, "guardChestplate");
			put(5289, "wphatHelmet");
			put(5293, "yphatHelmet");
			put(5297, "gphatHelmet");
			put(5301, "rphatHelmet");
			put(5305, "pphatHelmet");
			put(5309, "santaHelmet");
			put(5313, "runegHelmet");
			put(5314, "runegChestplate");
			put(5315, "runegLeggings");
			put(5316, "runegBoots");
			put(5317, "blackgHelmet");
			put(5318, "blackgChestplate");
			put(5319, "blackgLeggings");
			put(5320, "blackgBoots");
			put(5321, "toragHelmet");
			put(5322, "toragChestplate");
			put(5323, "toragLeggings");
			put(5324, "toragBoots");
			put(5325, "veracHelmet");
			put(5326, "veracChestplate");
			put(5327, "veracLeggings");
			put(5328, "veracBoots");
			put(5329, "guthanHelmet");
			put(5330, "guthanChestplate");
			put(5331, "guthanLeggings");
			put(5332, "guthanBoots");
			put(5333, "dharokHelmet");
			put(5334, "dharokChestplate");
			put(5335, "dharokLeggings");
			put(5336, "dharokBoots");
			put(5337, "karilHelmet");
			put(5338, "karilChestplate");
			put(5339, "karilLeggings");
			put(5340, "karilBoots");
			put(5341, "ahrimHelmet");
			put(5342, "ahrimChestplate");
			put(5343, "ahrimLeggings");
			put(5344, "ahrimBoots");
			put(5345, "akrisaeHelmet");
			put(5346, "akrisaeChestplate");
			put(5347, "akrisaeLeggings");
			put(5348, "akrisaeBoots");
			put(6256, "greendHelmet");
			put(6257, "greendChestplate");
			put(6258, "greendLeggings");
			put(6259, "greendBoots");
			put(6260, "dragonlHelmet");
			put(6261, "dragonlChestplate");
			put(6262, "dragonlLeggings");
			put(6263, "dragonlBoots");
			put(7269, "graniteHelmet");
			put(7270, "graniteChestplate");
			put(7271, "graniteLeggings");
			put(7272, "graniteBoots");
			put(8260, "stoneHelmet");
			put(8261, "stoneChestplate");
			put(8262, "stoneLeggings");
			put(8263, "stoneBoots");
			put(8264, "dragonCHelmet");
			put(8265, "dragonCChestplate");
			put(8266, "dragonCLeggings");
			put(8267, "dragonCBoots");
			put(8269, "bandosHelmet");
			put(8270, "bandosChestplate");
			put(8271, "bandosLeggings");
			put(8272, "bandosBoots");
			put(9256, "blackdHelmet");
			put(9257, "blackdChestplate");
			put(9258, "blackdLeggings");
			put(9259, "blackdBoots");
			put(10256, "varrockTeletab");
			put(10257, "faladorTab");
			put(10258, "lumbridgeTab");
			put(10259, "tormentedDemonsTab");
			put(10260, "bandosTab");
			put(10261, "hubTab");
			put(10262, "cathTab");
			put(10263, "barrowsTab");
			put(10276, "crystalBow");
			put(10277, "karilBow");
			put(10278, "boltRack");
			put(10286, "graniteLump");
			put(11276, "darkBow");
			put(13636, "saraStaff");
			put(13646, "zammyStaff");
			put(13656, "guthixStaff");
			put(13657, "armaStaff");
			put(13661, "note1");
			put(13662, "note2");
			put(13664, "shard1");
			put(13665, "shard2");
			put(13666, "shard3");
			put(13667, "bandosHilt");
			put(13668, "armadylHilt");
			put(13669, "saradominHilt");
			put(13670, "zamorakHilt");
			put(13671, "hilt");
			put(13786, "dragonAxe");
			put(13787, "dragonScimmy");
			put(13788, "chicken");
			put(13789, "keris");
			put(14256, "whip");
			put(14356, "BGS");
			put(14357, "ZGS");
			put(14358, "AGS");
			put(14359, "SGS");
			put(14360, "ironHammer");
			put(14361, "mithHammer");
			put(14364, "addyHammer");
			put(14365, "runeHammer");
			put(14366, "saraSword");
			put(14367, "toragHammer");
			put(14368, "veracFlail");
			put(14369, "guthanSpear");
			put(14370, "dharokAxe");
			put(14371, "ahrimStaff");
			put(14372, "akrisaeMace");
			put(14373, "pitchFork");
			put(14374, "blackHalberd");
			put(14375, "chaoticMaul");
			put(15556, "korasis");
			put(17264, "cutCabbage");
			put(17265, "cabbagePie");
			put(17267, "fishPie");
			put(17268, "meatPie");
			put(17269, "applePie");
			put(17270, "cabbagePieUncooked");
			put(17271, "meatPieUncooked");
			put(17272, "applePieUncooked");
			put(17273, "fishPieUncooked");
			put(17274, "veracKey");
			put(17275, "toragKey");
			put(17276, "dharokKey");
			put(17277, "karilKey");
			put(17278, "ahrimKey");
			put(17279, "guthanKey");
			put(17280, "akrisaeKey");
			put(17281, "tombKey");
			put(17282, "doorKey");
			put(17286, "beer");
			put(17361, "magicFruit");
			put(17362, "magicStick");
			put(17363, "yewStick");
			put(17373, "magicBoat");
			put(18256, "cracker");
			put(19144, "stake");
			put(19145, "fremSword");
			put(19146, "fremSwordf");
			put(19147, "vestaSword");
			put(19148, "dragonCScimmy");
			put(19149, "cutlass");
			put(19150, "dryRapier");
			put(19151, "dryLong");
			put(19152, "dryMace");
			put(19153, "dragon2hSword");
			put(20256, "greenDHide");
			put(20257, "greenDLeather");
			put(20258, "ratTail");
			put(20259, "garlic");
			put(20261, "blackDHide");
			put(20262, "blackDLeather");
			put(20263, "invincibilityPotion");
			put(20267, "saraBrew");
			put(20268, "superRestore");
			put(20269, "superStr");
			put(20270, "superDef");
			put(20271, "specPot");
			put(20456, "DBA");
			put(20457, "DD");
			put(20458, "DDS");
			put(20556, "chaoticRapier");
			put(30255, "questPoint");
			put(30256, "questPoint1");
			put(30257, "questPoint2");
			put(30258, "questPoint3");
			//Items no longer existing
			/*
			put(162, "wizardSpawn");
			put(163, "darkWizardSpawn");
			put(164, "goblinSpawn");
			put(165, "scorpionSpawn");
			put(166, "abbyDemonSpawn");
			put(168, "kqSpawn");
			put(169, "kq2Spawn");
			put(176, "lesserSpawn");
			put(183, "greenDragonSpawn");
			put(184, "iceGiantSpawn");
			put(185, "botSpawn");
			put(186, "dwarfSpawn");
			put(188, "ironDragonSpawn");
			put(190, "highMageSpawn");
			put(191, "hellhoundSpawn");
			put(192, "blackKnightSpawn");
			put(193, "whiteKnightSpawn");
			put(196, "thiefSpawn");
			put(197, "guardSpawn");
			put(198, "lesserSpawn2");
			put(221, "heroKnightSpawn");
			put(222, "kingGuardSpawn");
			put(223, "kingSpawn");
			put(224, "bandosMinion1Spawn");
			put(225, "bandosMinion2Spawn");
			put(226, "bandosMinion3Spawn");
			put(227, "bandosBossSpawn");
			put(229, "eliteBlackKnightSpawn");
			put(232, "veracSpawn");
			put(233, "toragSpawn");
			put(234, "dharokSpawn");
			put(235, "karilSpawn");
			put(236, "ahrimSpawn");
			put(237, "akrisaeSpawn");
			put(238, "guthanSpawn");
			put(239, "farmerSpawn");
			put(2290, "barbarianSpawn");
			put(2291, "shopKeeperSpawn");
			put(2293, "coffin");
			put(2294, "doctorSpawn");
			put(2295, "manSpawn");
			put(2296, "morganSpawn");
			put(2297, "tdSpawn");
			put(2298, "ratSpawn");
			put(2299, "smallRatSpawn");
			put(2300, "fremGuardSpawn");
			put(2301, "kosSpawn");
			put(2303, "blackDragonSpawn");
			put(2306, "keyBlock2");
			put(2382, "stall");
			put(2620, "cguardSpawn");
			put(2621, "cbotSpawn");
			put(2700, "Mithores");
			put(2701, "Addyores");
			put(2702, "Runeores");
			put(2703, "cobblestones");
			put(2704, "oreGolds");
			put(2705, "oreIrons");
			put(2706, "oreCoals");
			put(2710, "muggerSpawn");
			put(2711, "banditSpawn");
			put(3000, "varzeSpawn");
			put(3001, "blackGuardSpawn");
			put(3002, "blackGuard2Spawn");
			put(3003, "hillGiantSpawn");
			put(3004, "fireGiantSpawn");
			put(3005, "mossGiantSpawn");
			put(3006, "caveCrawlerSpawn");
			put(3007, "ghostSpawn");
			put(3008, "blackDemonSpawn");
			put(3009, "cookSpawn");
			put(3013, "kkSpawn");
			put(5258, "phatChestplate");
			put(5259, "phatLeggings");
			put(5260, "phatBoots");
			put(5287, "guardLeggings");
			put(5288, "guardBoots");
			put(5290, "wphatChestplate");
			put(5291, "wphatLeggings");
			put(5292, "wphatBoots");
			put(5294, "yphatChestplate");
			put(5295, "yphatLeggings");
			put(5296, "yphatBoots");
			put(5298, "gphatChestplate");
			put(5299, "gphatLeggings");
			put(5300, "gphatBoots");
			put(5302, "rphatChestplate");
			put(5303, "rphatLeggings");
			put(5304, "rphatBoots");
			put(5306, "pphatChestplate");
			put(5307, "pphatLeggings");
			put(5308, "pphatBoots");
			put(5310, "santaChestplate");
			put(5311, "santaLeggings");
			put(5312, "santaBoots");
			put(11263, "LOL");
			put(13658, "contract");
			put(13659, "contract2");
			put(13660, "contract3");
			put(13663, "note3");
			put(13672, "contract4");
			put(15309, "santa2Helmet");
			put(15310, "santa2Chestplate");
			put(15311, "santa2Leggings");
			put(15312, "santa2Boots");
			put(17283, "rewardChest");
			put(17284, "Stats");
			put(20264, "XPORB");
			put(20265, "BXPORB");
			put(20266, "HAXORB");
			put(20286, "MXPORB");/**/
		}};

	public static void onMissingMapping(FMLMissingMappingsEvent event)
	{
		List<MissingMapping> missingMappings = event.getAll();
		System.out.println("Mappings: " + missingMappings);
		for(MissingMapping missingMapping : missingMappings)
		{
			System.out.println(missingMapping.id);
		}
	}
}
