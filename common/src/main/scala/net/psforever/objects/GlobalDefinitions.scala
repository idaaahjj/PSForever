// Copyright (c) 2017 PSForever
package net.psforever.objects

import net.psforever.objects.definition._
import net.psforever.objects.definition.converter._
import net.psforever.objects.serverobject.doors.DoorDefinition
import net.psforever.objects.equipment.CItem.DeployedItem
import net.psforever.objects.equipment._
import net.psforever.objects.inventory.InventoryTile
import net.psforever.objects.serverobject.locks.IFFLockDefinition
import net.psforever.objects.serverobject.terminals._
import net.psforever.objects.vehicles.SeatArmorRestriction
import net.psforever.types.PlanetSideEmpire

object GlobalDefinitions {
  /**
    * Given a faction, provide the standard assault melee weapon.
    * @param faction the faction
    * @return the `ToolDefinition` for the melee weapon
    */
  def StandardMelee(faction : PlanetSideEmpire.Value) : ToolDefinition = {
    faction match {
      case PlanetSideEmpire.TR => chainblade
      case PlanetSideEmpire.NC => magcutter
      case PlanetSideEmpire.VS => forceblade
      case PlanetSideEmpire.NEUTRAL => chainblade //do NOT hand out the katana
    }
  }

  /**
    * Given a faction, provide the satndard assault pistol.
    * @param faction the faction
    * @return the `ToolDefinition` for the pistol
    */
  def StandardPistol(faction : PlanetSideEmpire.Value) : ToolDefinition = {
    faction match {
      case PlanetSideEmpire.TR => repeater
      case PlanetSideEmpire.NC => isp
      case PlanetSideEmpire.VS => beamer
      case PlanetSideEmpire.NEUTRAL => ilc9
    }
  }

  /**
    * For a given faction, provide the ammunition for the standard assault pistol.
    * The ammunition value here must work with the result of obtaining the pistol using the faction.
    * @param faction the faction
    * @return thr `AmmoBoxDefinition` for the pistol's ammo
    * @see `GlobalDefinitions.StandardPistol`
    */
  def StandardPistolAmmo(faction : PlanetSideEmpire.Value) : AmmoBoxDefinition = {
    faction match {
      case PlanetSideEmpire.TR => bullet_9mm
      case PlanetSideEmpire.NC => shotgun_shell
      case PlanetSideEmpire.VS => energy_cell
      case PlanetSideEmpire.NEUTRAL => bullet_9mm
    }
  }

  /**
    * For a given faction, provide the medium assault pistol.
    * The medium assault pistols all use the same ammunition so there is no point for a separate selection function.
    * @param faction the faction
    * @return the `ToolDefinition` for the pistol
    */
  def MediumPistol(faction : PlanetSideEmpire.Value) : ToolDefinition = {
    faction match {
      case PlanetSideEmpire.TR => anniversary_guna
      case PlanetSideEmpire.NC => anniversary_gun
      case PlanetSideEmpire.VS => anniversary_gunb
      case PlanetSideEmpire.NEUTRAL => ilc9 //do not hand out the spiker
    }
  }

  /**
    * For a given faction, provide the medium assault rifle.
    * For `Neutral` or `Black Ops`, just return a Suppressor.
    * @param faction the faction
    * @return the `ToolDefinition` for the rifle
    */
  def MediumRifle(faction : PlanetSideEmpire.Value) : ToolDefinition = {
    faction match {
      case PlanetSideEmpire.TR => cycler
      case PlanetSideEmpire.NC => gauss
      case PlanetSideEmpire.VS => pulsar
      case PlanetSideEmpire.NEUTRAL => suppressor //the Punisher would be messy to have to code for
    }
  }

  /**
    * For a given faction, provide the ammunition for the medium assault rifle.
    * The ammunition value here must work with the result of obtaining the rifle using the faction.
    * @param faction the faction
    * @return thr `AmmoBoxDefinition` for the rifle's ammo
    * @see `GlobalDefinitions.MediumRifle`
    */
  def MediumRifleAmmo(faction : PlanetSideEmpire.Value) : AmmoBoxDefinition = {
    faction match {
      case PlanetSideEmpire.TR => bullet_9mm
      case PlanetSideEmpire.NC => bullet_9mm
      case PlanetSideEmpire.VS => energy_cell
      case PlanetSideEmpire.NEUTRAL => bullet_9mm
    }
  }

  /**
    * For a given faction, provide the heavy assault rifle.
    * For `Neutral` or `Black Ops`, just return a Suppressor.
    * @param faction the faction
    * @return the `ToolDefinition` for the rifle
    */
  def HeavyRifle(faction : PlanetSideEmpire.Value) : ToolDefinition = {
    faction match {
      case PlanetSideEmpire.TR => mini_chaingun
      case PlanetSideEmpire.NC => r_shotgun
      case PlanetSideEmpire.VS => lasher
      case PlanetSideEmpire.NEUTRAL => suppressor //do not hand out the maelstrom
    }
  }

  /**
    * For a given faction, provide the ammunition for the heavy assault rifle.
    * The ammunition value here must work with the result of obtaining the rifle using the faction.
    * @param faction the faction
    * @return thr `AmmoBoxDefinition` for the rifle's ammo
    * @see `GlobalDefinitions.HeavyRifle`
    */
  def HeavyRifleAmmo(faction : PlanetSideEmpire.Value) : AmmoBoxDefinition = {
    faction match {
      case PlanetSideEmpire.TR => bullet_9mm
      case PlanetSideEmpire.NC => shotgun_shell
      case PlanetSideEmpire.VS => energy_cell
      case PlanetSideEmpire.NEUTRAL => bullet_9mm
    }
  }

  /**
    * For a given faction, provide the anti-vehicular launcher.
    * @param faction the faction
    * @return the `ToolDefinition` for the launcher
    */
  def AntiVehicular(faction : PlanetSideEmpire.Value) : ToolDefinition = {
    faction match {
      case PlanetSideEmpire.TR => striker
      case PlanetSideEmpire.NC => hunterseeker
      case PlanetSideEmpire.VS => lancer
      case PlanetSideEmpire.NEUTRAL => phoenix
    }
  }

  /**
    * For a given faction, provide the ammunition for the anti-vehicular launcher.
    * The ammunition value here must work with the result of obtaining the anti-vehicular launcher using the faction.
    * @param faction the faction
    * @return thr `AmmoBoxDefinition` for the launcher's ammo
    * @see `GlobalDefinitions.AntiVehicular`
    */
  def AntiVehicularAmmo(faction : PlanetSideEmpire.Value) : AmmoBoxDefinition = {
    faction match {
      case PlanetSideEmpire.TR => striker_missile_ammo
      case PlanetSideEmpire.NC => hunter_seeker_missile
      case PlanetSideEmpire.VS => lancer_cartridge
      case PlanetSideEmpire.NEUTRAL => phoenix_missile //careful - does not exist as an AmmoBox normally
    }
  }

  def AIMAX(faction : PlanetSideEmpire.Value) : ToolDefinition = {
    faction match {
      case PlanetSideEmpire.TR => trhev_dualcycler
      case PlanetSideEmpire.NC => nchev_scattercannon
      case PlanetSideEmpire.VS => vshev_quasar
      case PlanetSideEmpire.NEUTRAL => suppressor //there is no common pool MAX arms
    }
  }

  def AVMAX(faction : PlanetSideEmpire.Value) : ToolDefinition = {
    faction match {
      case PlanetSideEmpire.TR => trhev_pounder
      case PlanetSideEmpire.NC => nchev_falcon
      case PlanetSideEmpire.VS => vshev_comet
      case PlanetSideEmpire.NEUTRAL => suppressor //there is no common pool MAX arms
    }
  }

  def AAMAX(faction : PlanetSideEmpire.Value) : ToolDefinition = {
    faction match {
      case PlanetSideEmpire.TR => trhev_burster
      case PlanetSideEmpire.NC => nchev_sparrow
      case PlanetSideEmpire.VS => vshev_starfire
      case PlanetSideEmpire.NEUTRAL => suppressor //there is no common pool MAX arms
    }
  }

  /**
    * Using the definition for a piece of `Equipment` determine if it is a grenade-type weapon.
    * Only the normal grenades count; the grenade packs are excluded.
    * @param edef the `EquipmentDefinition` of the item
    * @return `true`, if it is a grenade-type weapon; `false`, otherwise
    */
  def isGrenade(edef : EquipmentDefinition) : Boolean = {
    edef match {
      case `frag_grenade` | `jammer_grenade` | `plasma_grenade` =>
        true
      case _ =>
        false
    }
  }

  /**
    * Using the definition for a piece of `Equipment` determine if it is a grenade-type weapon.
    * Only the grenade packs count; the normal grenades are excluded.
    * @param edef the `EquipmentDefinition` of the item
    * @return `true`, if it is a grenade-type weapon; `false`, otherwise
    */
  def isGrenadePack(edef : EquipmentDefinition) : Boolean = {
    edef match {
      case `frag_cartridge` | `jammer_cartridge` | `plasma_cartridge` =>
        true
      case _ =>
        false
    }
  }

  /**
    * Using the definition for a piece of `Equipment` determine with which faction it aligns if it is a weapon.
    * Only checks `Tool` objects.
    * Useful for determining if some item has to be dropped during an activity like `Loadout` switching.
    * @param edef the `EquipmentDefinition` of the item
    * @return the faction alignment, or `Neutral`
    */
  def isFactionWeapon(edef : EquipmentDefinition) : PlanetSideEmpire.Value = {
    edef match {
      case `chainblade` | `repeater` | `anniversary_guna` | `cycler` | `mini_chaingun` | `striker` | `trhev_dualcycler` | `trhev_pounder` | `trhev_burster` =>
        PlanetSideEmpire.TR
      case `magcutter` | `isp` | `anniversary_gun` | `gauss` | `r_shotgun` | `hunterseeker` | `nchev_scattercannon` | `nchev_falcon` | `nchev_sparrow` =>
        PlanetSideEmpire.NC
      case `forceblade` | `beamer` | `anniversary_gunb` | `pulsar` | `lasher` | `lancer` | `vshev_quasar` | `vshev_comet` | `vshev_starfire` =>
        PlanetSideEmpire.VS
      case _ =>
        PlanetSideEmpire.NEUTRAL
    }
  }

  /**
    * Using the definition for a piece of `Equipment` determine with which faction it aligns.
    * Checks both `Tool` objects and unique `AmmoBox` objects.
    * @param edef the `EquipmentDefinition` of the item
    * @return the faction alignment, or `Neutral`
    */
  def isFactionEquipment(edef : EquipmentDefinition) : PlanetSideEmpire.Value = {
    edef match {
      case `chainblade` | `repeater` | `anniversary_guna` | `cycler` | `mini_chaingun` | `striker` | `striker_missile_ammo` | `trhev_dualcycler` | `trhev_pounder` | `trhev_burster` =>
        PlanetSideEmpire.TR
      case `magcutter` | `isp` | `anniversary_gun` | `gauss` | `r_shotgun` | `hunterseeker` | `hunter_seeker_missile` | `nchev_scattercannon` | `nchev_falcon` | `nchev_sparrow` =>
        PlanetSideEmpire.NC
      case `forceblade` | `beamer` | `anniversary_gunb` | `pulsar` | `lasher` | `lancer` | `energy_cell` | `lancer_cartridge` | `vshev_quasar` | `vshev_comet` | `vshev_starfire` =>
        PlanetSideEmpire.VS
      case _ =>
        PlanetSideEmpire.NEUTRAL
    }
  }

  /**
    * Using the definition for a piece of `Equipment` determine whether it is a "cavern weapon."
    * Useful for determining if some item has to be dropped during an activity like `Loadout` switching.
    * @param edef the `EquipmentDefinition` of the item
    * @return `true`, if it is; otherwise, `false`
    */
  def isCavernWeapon(edef : EquipmentDefinition) : Boolean = {
    edef match {
      case `spiker` | `maelstrom` | `radiator` => true
      case _ => false
    }
  }

  /**
    * Using the definition for a piece of `Equipment` determine whether it is "cavern equipment."
    * @param edef the `EquipmentDefinition` of the item
    * @return `true`, if it is; otherwise, `false`
    */
  def isCavernEquipment(edef : EquipmentDefinition) : Boolean = {
    edef match {
      case `spiker` | `maelstrom` | `radiator` | `ancient_ammo_combo` | `maelstrom_ammo` => true
      case _ => false
    }
  }

  /**
    *  Using the definition for a piece of `Equipment` determine whether it is "special."
    * "Special equipment" is any non-standard `Equipment` that, while it can be obtained from a `Terminal`, has artificial prerequisites.
    * For example, the Kits are unlocked as rewards for holiday events and require possessing a specific `MeritCommendation`.
    * @param edef the `EquipmentDefinition` of the item
    * @return `true`, if it is; otherwise, `false`
    */
  def isSpecialEquipment(edef : EquipmentDefinition) : Boolean = {
    edef match {
      case `super_medkit` | `super_armorkit` | `super_staminakit` | `katana` =>
        true
      case _ =>
        false
    }
  }

  /*
  Implants
   */
  val
  advanced_regen = ImplantDefinition(0)

  val
  targeting = ImplantDefinition(1)

  val
  audio_amplifier = ImplantDefinition(2)

  val
  darklight_vision = ImplantDefinition(3)

  val
  melee_booster = ImplantDefinition(4)

  val
  personal_shield = ImplantDefinition(5)

  val
  range_magnifier = ImplantDefinition(6)

  val
  second_wind = ImplantDefinition(7)

  val
  silent_run = ImplantDefinition(8)

  val
  surge = ImplantDefinition(9)

  /*
  Equipment (locker_container, kits, ammunition, weapons)
   */
  import net.psforever.packet.game.objectcreate.ObjectClass
  val
  locker_container = new EquipmentDefinition(456) {
    Name = "locker container"
    Size = EquipmentSize.Inventory
    Packet = new LockerContainerConverter()
  }

  val
  medkit = KitDefinition(Kits.medkit)

  val
  super_medkit = KitDefinition(Kits.super_medkit)

  val
  super_armorkit = KitDefinition(Kits.super_armorkit)

  val
  super_staminakit = KitDefinition(Kits.super_staminakit) //super stimpak

  val
  melee_ammo = AmmoBoxDefinition(Ammo.melee_ammo)

  val
  frag_grenade_ammo = AmmoBoxDefinition(Ammo.frag_grenade_ammo)

  val
  plasma_grenade_ammo = AmmoBoxDefinition(Ammo.plasma_grenade_ammo)

  val
  jammer_grenade_ammo = AmmoBoxDefinition(Ammo.jammer_grenade_ammo)

  val
  bullet_9mm = AmmoBoxDefinition(Ammo.bullet_9mm)
  bullet_9mm.Capacity = 50
  bullet_9mm.Tile = InventoryTile.Tile33

  val
  bullet_9mm_AP = AmmoBoxDefinition(Ammo.bullet_9mm_AP)
  bullet_9mm_AP.Capacity = 50
  bullet_9mm_AP.Tile = InventoryTile.Tile33

  val
  shotgun_shell = AmmoBoxDefinition(Ammo.shotgun_shell)
  shotgun_shell.Capacity = 32
  shotgun_shell.Tile = InventoryTile.Tile33

  val
  shotgun_shell_AP = AmmoBoxDefinition(Ammo.shotgun_shell_AP)
  shotgun_shell_AP.Capacity = 32
  shotgun_shell_AP.Tile = InventoryTile.Tile33

  val
  energy_cell = AmmoBoxDefinition(Ammo.energy_cell)
  energy_cell.Capacity = 50
  energy_cell.Tile = InventoryTile.Tile33

  val
  anniversary_ammo = AmmoBoxDefinition(Ammo.anniversary_ammo) //10mm multi-phase
  anniversary_ammo.Capacity = 30
  anniversary_ammo.Tile = InventoryTile.Tile33

  val
  ancient_ammo_combo = AmmoBoxDefinition(Ammo.ancient_ammo_combo)
  ancient_ammo_combo.Capacity = 30
  ancient_ammo_combo.Tile = InventoryTile.Tile33

  val
  maelstrom_ammo = AmmoBoxDefinition(Ammo.maelstrom_ammo)
  maelstrom_ammo.Capacity = 50
  maelstrom_ammo.Tile = InventoryTile.Tile33

  val
  phoenix_missile = AmmoBoxDefinition(Ammo.phoenix_missile) //decimator missile

  val
  striker_missile_ammo = AmmoBoxDefinition(Ammo.striker_missile_ammo)
  striker_missile_ammo.Capacity = 15
  striker_missile_ammo.Tile = InventoryTile.Tile44

  val
  hunter_seeker_missile = AmmoBoxDefinition(Ammo.hunter_seeker_missile) //phoenix missile
  hunter_seeker_missile.Capacity = 9
  hunter_seeker_missile.Tile = InventoryTile.Tile44

  val
  lancer_cartridge = AmmoBoxDefinition(Ammo.lancer_cartridge)
  lancer_cartridge.Capacity = 18
  lancer_cartridge.Tile = InventoryTile.Tile44

  val
  rocket = AmmoBoxDefinition(Ammo.rocket)
  rocket.Capacity = 15
  rocket.Tile = InventoryTile.Tile33

  val
  frag_cartridge = AmmoBoxDefinition(Ammo.frag_cartridge)
  frag_cartridge.Capacity = 12
  frag_cartridge.Tile = InventoryTile.Tile33

  val
  plasma_cartridge = AmmoBoxDefinition(Ammo.plasma_cartridge)
  plasma_cartridge.Capacity = 12
  plasma_cartridge.Tile = InventoryTile.Tile33

  val
  jammer_cartridge = AmmoBoxDefinition(Ammo.jammer_cartridge)
  jammer_cartridge.Capacity = 12
  jammer_cartridge.Tile = InventoryTile.Tile33

  val
  bolt = AmmoBoxDefinition(Ammo.bolt)
  bolt.Capacity = 10
  bolt.Tile = InventoryTile.Tile33

  val
  oicw_ammo = AmmoBoxDefinition(Ammo.oicw_ammo) //scorpion missile
  oicw_ammo.Capacity = 10
  oicw_ammo.Tile = InventoryTile.Tile44

  val
  flamethrower_ammo = AmmoBoxDefinition(Ammo.flamethrower_ammo)
  flamethrower_ammo.Capacity = 100
  flamethrower_ammo.Tile = InventoryTile.Tile44

  val
  health_canister = AmmoBoxDefinition(Ammo.health_canister)
  health_canister.Capacity = 100
  health_canister.Tile = InventoryTile.Tile33

  val
  armor_canister = AmmoBoxDefinition(Ammo.armor_canister)
  armor_canister.Capacity = 100
  armor_canister.Tile = InventoryTile.Tile33

  val
  upgrade_canister = AmmoBoxDefinition(Ammo.upgrade_canister)
  upgrade_canister.Capacity = 100
  upgrade_canister.Tile = InventoryTile.Tile33

  val
  trek_ammo = AmmoBoxDefinition(Ammo.trek_ammo)
//
  val
  bullet_35mm = AmmoBoxDefinition(Ammo.bullet_35mm) //liberator nosegun
  bullet_35mm.Capacity = 100
  bullet_35mm.Tile = InventoryTile.Tile44

  val ancient_ammo_vehicle = AmmoBoxDefinition(Ammo.ancient_ammo_vehicle)
//

  val
  aphelion_laser_ammo = AmmoBoxDefinition(Ammo.aphelion_laser_ammo)
  aphelion_laser_ammo.Capacity = 165
  aphelion_laser_ammo.Tile = InventoryTile.Tile44

  val
  aphelion_immolation_cannon_ammo = AmmoBoxDefinition(Ammo.aphelion_immolation_cannon_ammo)
  aphelion_immolation_cannon_ammo.Capacity = 100
  aphelion_immolation_cannon_ammo.Tile = InventoryTile.Tile55

  val
  aphelion_plasma_rocket_ammo = AmmoBoxDefinition(Ammo.aphelion_plasma_rocket_ammo)
  aphelion_plasma_rocket_ammo.Capacity = 195
  aphelion_plasma_rocket_ammo.Tile = InventoryTile.Tile55

  val
  aphelion_ppa_ammo = AmmoBoxDefinition(Ammo.aphelion_ppa_ammo)
  aphelion_ppa_ammo.Capacity = 110
  aphelion_ppa_ammo.Tile = InventoryTile.Tile44

  val
  aphelion_starfire_ammo = AmmoBoxDefinition(Ammo.aphelion_starfire_ammo)
  aphelion_starfire_ammo.Capacity = 132
  aphelion_starfire_ammo.Tile = InventoryTile.Tile44

  val
  skyguard_flak_cannon_ammo = AmmoBoxDefinition(Ammo.skyguard_flak_cannon_ammo)
  skyguard_flak_cannon_ammo.Capacity = 200
  skyguard_flak_cannon_ammo.Tile = InventoryTile.Tile44

  val
  firebird_missile = AmmoBoxDefinition(ObjectClass.firebird_missile)
  firebird_missile.Capacity = 50
  firebird_missile.Tile = InventoryTile.Tile44

  val
  flux_cannon_thresher_battery = AmmoBoxDefinition(Ammo.flux_cannon_thresher_battery)
  flux_cannon_thresher_battery.Capacity = 150
  flux_cannon_thresher_battery.Tile = InventoryTile.Tile44

  val
  fluxpod_ammo = AmmoBoxDefinition(Ammo.fluxpod_ammo)
  fluxpod_ammo.Capacity = 80
  fluxpod_ammo.Tile = InventoryTile.Tile44

  val
  hellfire_ammo = AmmoBoxDefinition(Ammo.hellfire_ammo)
  hellfire_ammo.Capacity = 24
  hellfire_ammo.Tile = InventoryTile.Tile44

  val
  liberator_bomb = AmmoBoxDefinition(Ammo.liberator_bomb)
  liberator_bomb.Capacity = 20
  liberator_bomb.Tile = InventoryTile.Tile44

  val
  bullet_25mm = AmmoBoxDefinition(Ammo.bullet_25mm) //liberator tailgun
  bullet_25mm.Capacity = 150
  bullet_25mm.Tile = InventoryTile.Tile44

  val
  bullet_75mm = AmmoBoxDefinition(Ammo.bullet_75mm) //lightning shell
  bullet_75mm.Capacity = 100
  bullet_75mm.Tile = InventoryTile.Tile44

  val
  heavy_grenade_mortar = AmmoBoxDefinition(Ammo.heavy_grenade_mortar) //marauder and gal gunship
  heavy_grenade_mortar.Capacity = 100
  heavy_grenade_mortar.Tile = InventoryTile.Tile44

  val
  pulse_battery = AmmoBoxDefinition(Ammo.pulse_battery)
  pulse_battery.Capacity = 100
  pulse_battery.Tile = InventoryTile.Tile44

  val
  heavy_rail_beam_battery = AmmoBoxDefinition(Ammo.heavy_rail_beam_battery)
  heavy_rail_beam_battery.Capacity = 100
  heavy_rail_beam_battery.Tile = InventoryTile.Tile44

  val
  reaver_rocket = AmmoBoxDefinition(Ammo.reaver_rocket)
  reaver_rocket.Capacity = 12
  reaver_rocket.Tile = InventoryTile.Tile44

  val
  bullet_20mm = AmmoBoxDefinition(Ammo.bullet_20mm) //reaver nosegun
  bullet_20mm.Capacity = 200
  bullet_20mm.Tile = InventoryTile.Tile44

  val
  bullet_12mm = AmmoBoxDefinition(Ammo.bullet_12mm) //common
  bullet_12mm.Capacity = 200
  bullet_12mm.Tile = InventoryTile.Tile44

  val
  wasp_rocket_ammo = AmmoBoxDefinition(Ammo.wasp_rocket_ammo)
  wasp_rocket_ammo.Capacity = 6
  wasp_rocket_ammo.Tile = InventoryTile.Tile44

  val
  wasp_gun_ammo = AmmoBoxDefinition(Ammo.wasp_gun_ammo) //wasp nosegun
  wasp_gun_ammo.Capacity = 150
  wasp_gun_ammo.Tile = InventoryTile.Tile44

  val
  bullet_15mm = AmmoBoxDefinition(Ammo.bullet_15mm)
  bullet_15mm.Capacity = 360
  bullet_15mm.Tile = InventoryTile.Tile44

  val
  colossus_100mm_cannon_ammo = AmmoBoxDefinition(Ammo.colossus_100mm_cannon_ammo)
  colossus_100mm_cannon_ammo.Capacity = 90
  colossus_100mm_cannon_ammo.Tile = InventoryTile.Tile55

  val
  colossus_burster_ammo = AmmoBoxDefinition(Ammo.colossus_burster_ammo)
  colossus_burster_ammo.Capacity = 235
  colossus_burster_ammo.Tile = InventoryTile.Tile44

  val
  colossus_cluster_bomb_ammo = AmmoBoxDefinition(Ammo.colossus_cluster_bomb_ammo) //colossus mortar launcher shells
  colossus_cluster_bomb_ammo.Capacity = 150
  colossus_cluster_bomb_ammo.Tile = InventoryTile.Tile55

  val
  colossus_chaingun_ammo = AmmoBoxDefinition(Ammo.colossus_chaingun_ammo)
  colossus_chaingun_ammo.Capacity = 600
  colossus_chaingun_ammo.Tile = InventoryTile.Tile44

  val
  colossus_tank_cannon_ammo = AmmoBoxDefinition(Ammo.colossus_tank_cannon_ammo)
  colossus_tank_cannon_ammo.Capacity = 110
  colossus_tank_cannon_ammo.Tile = InventoryTile.Tile44

  val
  bullet_105mm = AmmoBoxDefinition(Ammo.bullet_105mm) //prowler 100mm cannon shell
  bullet_105mm.Capacity = 100
  bullet_105mm.Tile = InventoryTile.Tile44

  val
  gauss_cannon_ammo = AmmoBoxDefinition(Ammo.gauss_cannon_ammo)
  gauss_cannon_ammo.Capacity = 15
  gauss_cannon_ammo.Tile = InventoryTile.Tile44

  val
  peregrine_dual_machine_gun_ammo = AmmoBoxDefinition(Ammo.peregrine_dual_machine_gun_ammo)
  peregrine_dual_machine_gun_ammo.Capacity = 240
  peregrine_dual_machine_gun_ammo.Tile = InventoryTile.Tile44

  val
  peregrine_mechhammer_ammo = AmmoBoxDefinition(Ammo.peregrine_mechhammer_ammo)
  peregrine_mechhammer_ammo.Capacity = 30
  peregrine_mechhammer_ammo.Tile = InventoryTile.Tile44

  val
  peregrine_particle_cannon_ammo = AmmoBoxDefinition(Ammo.peregrine_particle_cannon_ammo)
  peregrine_particle_cannon_ammo.Capacity = 40
  peregrine_particle_cannon_ammo.Tile = InventoryTile.Tile55

  val
  peregrine_rocket_pod_ammo = AmmoBoxDefinition(Ammo.peregrine_rocket_pod_ammo)
  peregrine_rocket_pod_ammo.Capacity = 275
  peregrine_rocket_pod_ammo.Tile = InventoryTile.Tile55

  val
  peregrine_sparrow_ammo = AmmoBoxDefinition(Ammo.peregrine_sparrow_ammo)
  peregrine_sparrow_ammo.Capacity = 150
  peregrine_sparrow_ammo.Tile = InventoryTile.Tile44

  val
  bullet_150mm = AmmoBoxDefinition(Ammo.bullet_150mm)
  bullet_150mm.Capacity = 50
  bullet_150mm.Tile = InventoryTile.Tile44

  val
  chainblade = ToolDefinition(ObjectClass.chainblade)
  chainblade.Size = EquipmentSize.Melee
  chainblade.AmmoTypes += melee_ammo
  chainblade.FireModes += new FireModeDefinition
  chainblade.FireModes.head.AmmoTypeIndices += 0
  chainblade.FireModes.head.AmmoSlotIndex = 0
  chainblade.FireModes.head.Magazine = 1
  chainblade.FireModes += new FireModeDefinition
  chainblade.FireModes(1).AmmoTypeIndices += 0
  chainblade.FireModes(1).AmmoSlotIndex = 0
  chainblade.FireModes(1).Magazine = 1

  val
  magcutter = ToolDefinition(ObjectClass.magcutter)
  magcutter.Size = EquipmentSize.Melee
  magcutter.AmmoTypes += melee_ammo
  magcutter.FireModes += new FireModeDefinition
  magcutter.FireModes.head.AmmoTypeIndices += 0
  magcutter.FireModes.head.AmmoSlotIndex = 0
  magcutter.FireModes.head.Magazine = 1
  magcutter.FireModes += new FireModeDefinition
  magcutter.FireModes(1).AmmoTypeIndices += 0
  magcutter.FireModes(1).AmmoSlotIndex = 0
  magcutter.FireModes(1).Magazine = 1

  val
  forceblade = ToolDefinition(ObjectClass.forceblade)
  forceblade.Size = EquipmentSize.Melee
  forceblade.AmmoTypes += melee_ammo
  forceblade.FireModes += new FireModeDefinition
  forceblade.FireModes.head.AmmoTypeIndices += 0
  forceblade.FireModes.head.AmmoSlotIndex = 0
  forceblade.FireModes.head.Magazine = 1
  forceblade.FireModes.head.Chamber = 0
  forceblade.FireModes += new FireModeDefinition
  forceblade.FireModes(1).AmmoTypeIndices += 0
  forceblade.FireModes(1).AmmoSlotIndex = 0
  forceblade.FireModes(1).Magazine = 1
  forceblade.FireModes(1).Chamber = 0

  val
  katana = ToolDefinition(ObjectClass.katana)
  katana.Size = EquipmentSize.Melee
  katana.AmmoTypes += melee_ammo
  katana.FireModes += new FireModeDefinition
  katana.FireModes.head.AmmoTypeIndices += 0
  katana.FireModes.head.AmmoSlotIndex = 0
  katana.FireModes.head.Magazine = 1
  katana.FireModes.head.Chamber = 0
  katana.FireModes += new FireModeDefinition
  katana.FireModes(1).AmmoTypeIndices += 0
  katana.FireModes(1).AmmoSlotIndex = 0
  katana.FireModes(1).Magazine = 1
  katana.FireModes(1).Chamber = 0

  val
  frag_grenade = ToolDefinition(ObjectClass.frag_grenade)
  frag_grenade.Size = EquipmentSize.Pistol
  frag_grenade.AmmoTypes += frag_grenade_ammo
  frag_grenade.FireModes += new FireModeDefinition
  frag_grenade.FireModes.head.AmmoTypeIndices += 0
  frag_grenade.FireModes.head.AmmoSlotIndex = 0
  frag_grenade.FireModes.head.Magazine = 3
  frag_grenade.FireModes += new FireModeDefinition
  frag_grenade.FireModes(1).AmmoTypeIndices += 0
  frag_grenade.FireModes(1).AmmoSlotIndex = 0
  frag_grenade.FireModes(1).Magazine = 3
  frag_grenade.Tile = InventoryTile.Tile22

  val
  plasma_grenade = ToolDefinition(ObjectClass.plasma_grenade)
  plasma_grenade.Size = EquipmentSize.Pistol
  plasma_grenade.AmmoTypes += plasma_grenade_ammo
  plasma_grenade.FireModes += new FireModeDefinition
  plasma_grenade.FireModes.head.AmmoTypeIndices += 0
  plasma_grenade.FireModes.head.AmmoSlotIndex = 0
  plasma_grenade.FireModes.head.Magazine = 3
  plasma_grenade.FireModes += new FireModeDefinition
  plasma_grenade.FireModes(1).AmmoTypeIndices += 0
  plasma_grenade.FireModes(1).AmmoSlotIndex = 0
  plasma_grenade.FireModes(1).Magazine = 3
  plasma_grenade.Tile = InventoryTile.Tile22

  val
  jammer_grenade = ToolDefinition(ObjectClass.jammer_grenade)
  jammer_grenade.Size = EquipmentSize.Pistol
  jammer_grenade.AmmoTypes += jammer_grenade_ammo
  jammer_grenade.FireModes += new FireModeDefinition
  jammer_grenade.FireModes.head.AmmoTypeIndices += 0
  jammer_grenade.FireModes.head.AmmoSlotIndex = 0
  jammer_grenade.FireModes.head.Magazine = 3
  jammer_grenade.FireModes += new FireModeDefinition
  jammer_grenade.FireModes(1).AmmoTypeIndices += 0
  jammer_grenade.FireModes(1).AmmoSlotIndex = 0
  jammer_grenade.FireModes(1).Magazine = 3
  jammer_grenade.Tile = InventoryTile.Tile22

  val
  repeater = ToolDefinition(ObjectClass.repeater)
  repeater.Size = EquipmentSize.Pistol
  repeater.AmmoTypes += bullet_9mm
  repeater.AmmoTypes += bullet_9mm_AP
  repeater.FireModes += new FireModeDefinition
  repeater.FireModes.head.AmmoTypeIndices += 0
  repeater.FireModes.head.AmmoTypeIndices += 1
  repeater.FireModes.head.AmmoSlotIndex = 0
  repeater.FireModes.head.Magazine = 20
  repeater.Tile = InventoryTile.Tile33

  val
  isp = ToolDefinition(ObjectClass.isp) //mag-scatter
  isp.Size = EquipmentSize.Pistol
  isp.AmmoTypes += shotgun_shell
  isp.AmmoTypes += shotgun_shell_AP
  isp.FireModes += new FireModeDefinition
  isp.FireModes.head.AmmoTypeIndices += 0
  isp.FireModes.head.AmmoTypeIndices += 1
  isp.FireModes.head.AmmoSlotIndex = 0
  isp.FireModes.head.Magazine = 8
  isp.Tile = InventoryTile.Tile33

  val
  beamer = ToolDefinition(ObjectClass.beamer)
  beamer.Size = EquipmentSize.Pistol
  beamer.AmmoTypes += energy_cell
  beamer.FireModes += new FireModeDefinition
  beamer.FireModes.head.AmmoTypeIndices += 0
  beamer.FireModes.head.AmmoSlotIndex = 0
  beamer.FireModes.head.Magazine = 16
  beamer.FireModes += new FireModeDefinition
  beamer.FireModes(1).AmmoTypeIndices += 0
  beamer.FireModes(1).AmmoSlotIndex = 0
  beamer.FireModes(1).Magazine = 16
  beamer.Tile = InventoryTile.Tile33

  val
  ilc9 = ToolDefinition(ObjectClass.ilc9) //amp
  ilc9.Size = EquipmentSize.Pistol
  ilc9.AmmoTypes += bullet_9mm
  ilc9.AmmoTypes += bullet_9mm_AP
  ilc9.FireModes += new FireModeDefinition
  ilc9.FireModes.head.AmmoTypeIndices += 0
  ilc9.FireModes.head.AmmoTypeIndices += 1
  ilc9.FireModes.head.AmmoSlotIndex = 0
  ilc9.FireModes.head.Magazine = 30
  ilc9.Tile = InventoryTile.Tile33

  val
  suppressor = ToolDefinition(ObjectClass.suppressor)
  suppressor.Size = EquipmentSize.Rifle
  suppressor.AmmoTypes += bullet_9mm
  suppressor.AmmoTypes += bullet_9mm_AP
  suppressor.FireModes += new FireModeDefinition
  suppressor.FireModes.head.AmmoTypeIndices += 0
  suppressor.FireModes.head.AmmoTypeIndices += 1
  suppressor.FireModes.head.AmmoSlotIndex = 0
  suppressor.FireModes.head.Magazine = 25
  suppressor.Tile = InventoryTile.Tile63

  val
  punisher = ToolDefinition(ObjectClass.punisher)
  punisher.Size = EquipmentSize.Rifle
  punisher.AmmoTypes += bullet_9mm
  punisher.AmmoTypes += bullet_9mm_AP
  punisher.AmmoTypes += rocket
  punisher.AmmoTypes += frag_cartridge
  punisher.AmmoTypes += jammer_cartridge
  punisher.AmmoTypes += plasma_cartridge
  punisher.FireModes += new FireModeDefinition
  punisher.FireModes.head.AmmoTypeIndices += 0
  punisher.FireModes.head.AmmoTypeIndices += 1
  punisher.FireModes.head.AmmoSlotIndex = 0
  punisher.FireModes.head.Magazine = 30
  punisher.FireModes += new FireModeDefinition
  punisher.FireModes(1).AmmoTypeIndices += 2
  punisher.FireModes(1).AmmoTypeIndices += 3
  punisher.FireModes(1).AmmoTypeIndices += 4
  punisher.FireModes(1).AmmoTypeIndices += 5
  punisher.FireModes(1).AmmoSlotIndex = 1
  punisher.FireModes(1).Magazine = 1
  punisher.Tile = InventoryTile.Tile63

  val
  flechette = ToolDefinition(ObjectClass.flechette) //sweeper
  flechette.Size = EquipmentSize.Rifle
  flechette.AmmoTypes += shotgun_shell
  flechette.AmmoTypes += shotgun_shell_AP
  flechette.FireModes += new FireModeDefinition
  flechette.FireModes.head.AmmoTypeIndices += 0
  flechette.FireModes.head.AmmoTypeIndices += 1
  flechette.FireModes.head.AmmoSlotIndex = 0
  flechette.FireModes.head.Magazine = 12 //12 shells * 8 pellets = 96
  flechette.Tile = InventoryTile.Tile63

  val
  cycler = ToolDefinition(ObjectClass.cycler)
  cycler.Size = EquipmentSize.Rifle
  cycler.AmmoTypes += bullet_9mm
  cycler.AmmoTypes += bullet_9mm_AP
  cycler.FireModes += new FireModeDefinition
  cycler.FireModes.head.AmmoTypeIndices += 0
  cycler.FireModes.head.AmmoTypeIndices += 1
  cycler.FireModes.head.AmmoSlotIndex = 0
  cycler.FireModes.head.Magazine = 50
  cycler.Tile = InventoryTile.Tile63

  val
  gauss = ToolDefinition(ObjectClass.gauss)
  gauss.Size = EquipmentSize.Rifle
  gauss.AmmoTypes += bullet_9mm
  gauss.AmmoTypes += bullet_9mm_AP
  gauss.FireModes += new FireModeDefinition
  gauss.FireModes.head.AmmoTypeIndices += 0
  gauss.FireModes.head.AmmoTypeIndices += 1
  gauss.FireModes.head.AmmoSlotIndex = 0
  gauss.FireModes.head.Magazine = 30
  gauss.Tile = InventoryTile.Tile63

  val
  pulsar = ToolDefinition(ObjectClass.pulsar)
  pulsar.Size = EquipmentSize.Rifle
  pulsar.AmmoTypes += energy_cell
  pulsar.FireModes += new FireModeDefinition
  pulsar.FireModes.head.AmmoTypeIndices += 0
  pulsar.FireModes.head.AmmoSlotIndex = 0
  pulsar.FireModes.head.Magazine = 40
  pulsar.FireModes += new FireModeDefinition
  pulsar.FireModes(1).AmmoTypeIndices += 0
  pulsar.FireModes(1).AmmoSlotIndex = 0
  pulsar.FireModes(1).Magazine = 40
  pulsar.Tile = InventoryTile.Tile63

  val
  anniversary_guna = ToolDefinition(ObjectClass.anniversary_guna) //tr stinger
  anniversary_guna.Size = EquipmentSize.Pistol
  anniversary_guna.AmmoTypes += anniversary_ammo
  anniversary_guna.FireModes += new FireModeDefinition
  anniversary_guna.FireModes.head.AmmoTypeIndices += 0
  anniversary_guna.FireModes.head.AmmoSlotIndex = 0
  anniversary_guna.FireModes.head.Magazine = 6
  anniversary_guna.FireModes += new FireModeDefinition
  anniversary_guna.FireModes(1).AmmoTypeIndices += 0
  anniversary_guna.FireModes(1).AmmoSlotIndex = 0
  anniversary_guna.FireModes(1).Magazine = 6
  anniversary_guna.FireModes(1).Chamber = 6
  anniversary_guna.Tile = InventoryTile.Tile33

  val
  anniversary_gun = ToolDefinition(ObjectClass.anniversary_gun) //nc spear
  anniversary_gun.Size = EquipmentSize.Pistol
  anniversary_gun.AmmoTypes += anniversary_ammo
  anniversary_gun.FireModes += new FireModeDefinition
  anniversary_gun.FireModes.head.AmmoTypeIndices += 0
  anniversary_gun.FireModes.head.AmmoSlotIndex = 0
  anniversary_gun.FireModes.head.Magazine = 6
  anniversary_gun.FireModes += new FireModeDefinition
  anniversary_gun.FireModes(1).AmmoTypeIndices += 0
  anniversary_gun.FireModes(1).AmmoSlotIndex = 0
  anniversary_gun.FireModes(1).Magazine = 6
  anniversary_gun.FireModes(1).Chamber = 6
  anniversary_gun.Tile = InventoryTile.Tile33

  val
  anniversary_gunb = ToolDefinition(ObjectClass.anniversary_gunb) //vs eraser
  anniversary_gunb.Size = EquipmentSize.Pistol
  anniversary_gunb.AmmoTypes += anniversary_ammo
  anniversary_gunb.FireModes += new FireModeDefinition
  anniversary_gunb.FireModes.head.AmmoTypeIndices += 0
  anniversary_gunb.FireModes.head.AmmoSlotIndex = 0
  anniversary_gunb.FireModes.head.Magazine = 6
  anniversary_gunb.FireModes += new FireModeDefinition
  anniversary_gunb.FireModes(1).AmmoTypeIndices += 0
  anniversary_gunb.FireModes(1).AmmoSlotIndex = 0
  anniversary_gunb.FireModes(1).Magazine = 6
  anniversary_gunb.FireModes(1).Chamber = 6
  anniversary_gunb.Tile = InventoryTile.Tile33

  val
  spiker = ToolDefinition(ObjectClass.spiker)
  spiker.Size = EquipmentSize.Pistol
  spiker.AmmoTypes += ancient_ammo_combo
  spiker.FireModes += new FireModeDefinition
  spiker.FireModes.head.AmmoTypeIndices += 0
  spiker.FireModes.head.AmmoSlotIndex = 0
  spiker.FireModes.head.Magazine = 25
  spiker.Tile = InventoryTile.Tile33

  val
  mini_chaingun = ToolDefinition(ObjectClass.mini_chaingun)
  mini_chaingun.Size = EquipmentSize.Rifle
  mini_chaingun.AmmoTypes += bullet_9mm
  mini_chaingun.AmmoTypes += bullet_9mm_AP
  mini_chaingun.FireModes += new FireModeDefinition
  mini_chaingun.FireModes.head.AmmoTypeIndices += 0
  mini_chaingun.FireModes.head.AmmoTypeIndices += 1
  mini_chaingun.FireModes.head.AmmoSlotIndex = 0
  mini_chaingun.FireModes.head.Magazine = 100
  mini_chaingun.Tile = InventoryTile.Tile93

  val
  r_shotgun = ToolDefinition(ObjectClass.r_shotgun) //jackhammer
  r_shotgun.Size = EquipmentSize.Rifle
  r_shotgun.AmmoTypes += shotgun_shell
  r_shotgun.AmmoTypes += shotgun_shell_AP
  r_shotgun.FireModes += new FireModeDefinition
  r_shotgun.FireModes.head.AmmoTypeIndices += 0
  r_shotgun.FireModes.head.AmmoTypeIndices += 1
  r_shotgun.FireModes.head.AmmoSlotIndex = 0
  r_shotgun.FireModes.head.Magazine = 16 //16 shells * 8 pellets = 128
  r_shotgun.FireModes += new FireModeDefinition
  r_shotgun.FireModes(1).AmmoTypeIndices += 0
  r_shotgun.FireModes(1).AmmoTypeIndices += 1
  r_shotgun.FireModes(1).AmmoSlotIndex = 0
  r_shotgun.FireModes(1).Magazine = 16 //16 shells * 8 pellets = 128
  r_shotgun.FireModes(1).Chamber = 3
  r_shotgun.Tile = InventoryTile.Tile93

  val
  lasher = ToolDefinition(ObjectClass.lasher)
  lasher.Size = EquipmentSize.Rifle
  lasher.AmmoTypes += energy_cell
  lasher.FireModes += new FireModeDefinition
  lasher.FireModes.head.AmmoTypeIndices += 0
  lasher.FireModes.head.AmmoSlotIndex = 0
  lasher.FireModes.head.Magazine = 35
  lasher.FireModes += new FireModeDefinition
  lasher.FireModes(1).AmmoTypeIndices += 0
  lasher.FireModes(1).AmmoSlotIndex = 0
  lasher.FireModes(1).Magazine = 35
  lasher.Tile = InventoryTile.Tile93

  val
  maelstrom = ToolDefinition(ObjectClass.maelstrom)
  maelstrom.Size = EquipmentSize.Rifle
  maelstrom.AmmoTypes += maelstrom_ammo
  maelstrom.FireModes += new FireModeDefinition
  maelstrom.FireModes.head.AmmoTypeIndices += 0
  maelstrom.FireModes.head.AmmoSlotIndex = 0
  maelstrom.FireModes.head.Magazine = 150
  maelstrom.FireModes += new FireModeDefinition
  maelstrom.FireModes(1).AmmoTypeIndices += 0
  maelstrom.FireModes(1).AmmoSlotIndex = 0
  maelstrom.FireModes(1).Magazine = 150
  maelstrom.FireModes += new FireModeDefinition
  maelstrom.FireModes(2).AmmoTypeIndices += 0
  maelstrom.FireModes(2).AmmoSlotIndex = 0
  maelstrom.FireModes(2).Magazine = 150
  maelstrom.Tile = InventoryTile.Tile93

  val
  phoenix = ToolDefinition(ObjectClass.phoenix) //decimator
  phoenix.Size = EquipmentSize.Rifle
  phoenix.AmmoTypes += phoenix_missile
  phoenix.FireModes += new FireModeDefinition
  phoenix.FireModes.head.AmmoTypeIndices += 0
  phoenix.FireModes.head.AmmoSlotIndex = 0
  phoenix.FireModes.head.Magazine = 3
  phoenix.FireModes += new FireModeDefinition
  phoenix.FireModes(1).AmmoTypeIndices += 0
  phoenix.FireModes(1).AmmoSlotIndex = 0
  phoenix.FireModes(1).Magazine = 3
  phoenix.Tile = InventoryTile.Tile93

  val
  striker = ToolDefinition(ObjectClass.striker)
  striker.Size = EquipmentSize.Rifle
  striker.AmmoTypes += striker_missile_ammo
  striker.FireModes += new FireModeDefinition
  striker.FireModes.head.AmmoTypeIndices += 0
  striker.FireModes.head.AmmoSlotIndex = 0
  striker.FireModes.head.Magazine = 5
  striker.FireModes += new FireModeDefinition
  striker.FireModes(1).AmmoTypeIndices += 0
  striker.FireModes(1).AmmoSlotIndex = 0
  striker.FireModes(1).Magazine = 5
  striker.Tile = InventoryTile.Tile93

  val
  hunterseeker = ToolDefinition(ObjectClass.hunterseeker) //phoenix
  hunterseeker.Size = EquipmentSize.Rifle
  hunterseeker.AmmoTypes += hunter_seeker_missile
  hunterseeker.FireModes += new FireModeDefinition
  hunterseeker.FireModes.head.AmmoTypeIndices += 0
  hunterseeker.FireModes.head.AmmoSlotIndex = 0
  hunterseeker.FireModes.head.Magazine = 1
  hunterseeker.FireModes += new FireModeDefinition
  hunterseeker.FireModes(1).AmmoTypeIndices += 0
  hunterseeker.FireModes(1).AmmoSlotIndex = 0
  hunterseeker.FireModes(1).Magazine = 1
  hunterseeker.Tile = InventoryTile.Tile93

  val
  lancer = ToolDefinition(ObjectClass.lancer)
  lancer.Size = EquipmentSize.Rifle
  lancer.AmmoTypes += lancer_cartridge
  lancer.FireModes += new FireModeDefinition
  lancer.FireModes.head.AmmoTypeIndices += 0
  lancer.FireModes.head.AmmoSlotIndex = 0
  lancer.FireModes.head.Magazine = 6
  lancer.Tile = InventoryTile.Tile93

  val
  rocklet = ToolDefinition(ObjectClass.rocklet)
  rocklet.Size = EquipmentSize.Rifle
  rocklet.AmmoTypes += rocket
  rocklet.AmmoTypes += frag_cartridge
  rocklet.FireModes += new FireModeDefinition
  rocklet.FireModes.head.AmmoTypeIndices += 0
  rocklet.FireModes.head.AmmoTypeIndices += 1
  rocklet.FireModes.head.AmmoSlotIndex = 0
  rocklet.FireModes.head.Magazine = 6
  rocklet.FireModes += new FireModeDefinition
  rocklet.FireModes(1).AmmoTypeIndices += 0
  rocklet.FireModes(1).AmmoTypeIndices += 1
  rocklet.FireModes(1).AmmoSlotIndex = 0
  rocklet.FireModes(1).Magazine = 6
  rocklet.FireModes(1).Chamber = 6
  rocklet.Tile = InventoryTile.Tile63

  val
  thumper = ToolDefinition(ObjectClass.thumper)
  thumper.Size = EquipmentSize.Rifle
  thumper.AmmoTypes += frag_cartridge
  thumper.AmmoTypes += plasma_cartridge
  thumper.AmmoTypes += jammer_cartridge
  thumper.FireModes += new FireModeDefinition
  thumper.FireModes.head.AmmoTypeIndices += 0
  thumper.FireModes.head.AmmoTypeIndices += 1
  thumper.FireModes.head.AmmoTypeIndices += 2
  thumper.FireModes.head.AmmoSlotIndex = 0
  thumper.FireModes.head.Magazine = 6
  thumper.FireModes += new FireModeDefinition
  thumper.FireModes(1).AmmoTypeIndices += 0
  thumper.FireModes(1).AmmoTypeIndices += 1
  thumper.FireModes(1).AmmoTypeIndices += 2
  thumper.FireModes(1).AmmoSlotIndex = 0
  thumper.FireModes(1).Magazine = 6
  thumper.Tile = InventoryTile.Tile63

  val
  radiator = ToolDefinition(ObjectClass.radiator)
  radiator.Size = EquipmentSize.Rifle
  radiator.AmmoTypes += ancient_ammo_combo
  radiator.FireModes += new FireModeDefinition
  radiator.FireModes.head.AmmoTypeIndices += 0
  radiator.FireModes.head.AmmoSlotIndex = 0
  radiator.FireModes.head.Magazine = 25
  radiator.FireModes += new FireModeDefinition
  radiator.FireModes(1).AmmoTypeIndices += 0
  radiator.FireModes(1).AmmoSlotIndex = 0
  radiator.FireModes(1).Magazine = 25
  radiator.Tile = InventoryTile.Tile63

  val
  heavy_sniper = ToolDefinition(ObjectClass.heavy_sniper) //hsr
  heavy_sniper.Size = EquipmentSize.Rifle
  heavy_sniper.AmmoTypes += bolt
  heavy_sniper.FireModes += new FireModeDefinition
  heavy_sniper.FireModes.head.AmmoTypeIndices += 0
  heavy_sniper.FireModes.head.AmmoSlotIndex = 0
  heavy_sniper.FireModes.head.Magazine = 10
  heavy_sniper.Tile = InventoryTile.Tile93

  val
  bolt_driver = ToolDefinition(ObjectClass.bolt_driver)
  bolt_driver.Size = EquipmentSize.Rifle
  bolt_driver.AmmoTypes += bolt
  bolt_driver.FireModes += new FireModeDefinition
  bolt_driver.FireModes.head.AmmoTypeIndices += 0
  bolt_driver.FireModes.head.AmmoSlotIndex = 0
  bolt_driver.FireModes.head.Magazine = 1
  bolt_driver.Tile = InventoryTile.Tile93

  val
  oicw = ToolDefinition(ObjectClass.oicw) //scorpion
  oicw.Size = EquipmentSize.Rifle
  oicw.AmmoTypes += oicw_ammo
  oicw.FireModes += new FireModeDefinition
  oicw.FireModes.head.AmmoTypeIndices += 0
  oicw.FireModes.head.AmmoSlotIndex = 0
  oicw.FireModes.head.Magazine = 1
  oicw.FireModes += new FireModeDefinition
  oicw.FireModes(1).AmmoTypeIndices += 0
  oicw.FireModes(1).AmmoSlotIndex = 0
  oicw.FireModes(1).Magazine = 1
  oicw.Tile = InventoryTile.Tile93

  val
  flamethrower = ToolDefinition(ObjectClass.flamethrower)
  flamethrower.Size = EquipmentSize.Rifle
  flamethrower.AmmoTypes += flamethrower_ammo
  flamethrower.FireModes += new FireModeDefinition
  flamethrower.FireModes.head.AmmoTypeIndices += 0
  flamethrower.FireModes.head.AmmoSlotIndex = 0
  flamethrower.FireModes.head.Magazine = 100
  flamethrower.FireModes.head.Chamber = 5
  flamethrower.FireModes += new FireModeDefinition
  flamethrower.FireModes(1).AmmoTypeIndices += 0
  flamethrower.FireModes(1).AmmoSlotIndex = 0
  flamethrower.FireModes(1).Magazine = 100
  flamethrower.FireModes(1).Chamber = 50
  flamethrower.Tile = InventoryTile.Tile63

  val
  trhev_dualcycler = ToolDefinition(ObjectClass.trhev_dualcycler)

  val
  trhev_pounder = ToolDefinition(ObjectClass.trhev_pounder)

  val
  trhev_burster = ToolDefinition(ObjectClass.trhev_burster)

  val
  nchev_scattercannon = ToolDefinition(ObjectClass.nchev_scattercannon)

  val
  nchev_falcon = ToolDefinition(ObjectClass.nchev_falcon)

  val
  nchev_sparrow = ToolDefinition(ObjectClass.nchev_sparrow)

  val
  vshev_quasar = ToolDefinition(ObjectClass.vshev_quasar)

  val
  vshev_comet = ToolDefinition(ObjectClass.vshev_comet)

  val
  vshev_starfire = ToolDefinition(ObjectClass.vshev_starfire)

  val
  medicalapplicator = ToolDefinition(ObjectClass.medicalapplicator)
  medicalapplicator.Size = EquipmentSize.Pistol
  medicalapplicator.AmmoTypes += health_canister
  medicalapplicator.FireModes += new FireModeDefinition
  medicalapplicator.FireModes.head.AmmoTypeIndices += 0
  medicalapplicator.FireModes.head.AmmoSlotIndex = 0
  medicalapplicator.FireModes.head.Magazine = 100
  medicalapplicator.FireModes += new FireModeDefinition
  medicalapplicator.FireModes(1).AmmoTypeIndices += 0
  medicalapplicator.FireModes(1).AmmoSlotIndex = 0
  medicalapplicator.FireModes(1).Magazine = 100
  medicalapplicator.Tile = InventoryTile.Tile33

  val
  nano_dispenser = ToolDefinition(ObjectClass.nano_dispenser)
  nano_dispenser.Size = EquipmentSize.Rifle
  nano_dispenser.AmmoTypes += armor_canister
  nano_dispenser.AmmoTypes += upgrade_canister
  nano_dispenser.FireModes += new FireModeDefinition
  nano_dispenser.FireModes.head.AmmoTypeIndices += 0
  nano_dispenser.FireModes.head.AmmoTypeIndices += 1
  nano_dispenser.FireModes.head.AmmoSlotIndex = 0
  nano_dispenser.FireModes.head.Magazine = 100
  nano_dispenser.Tile = InventoryTile.Tile63

  val
  bank = ToolDefinition(ObjectClass.bank)
  bank.Size = EquipmentSize.Pistol
  bank.AmmoTypes += armor_canister
  bank.FireModes += new FireModeDefinition
  bank.FireModes.head.AmmoTypeIndices += 0
  bank.FireModes.head.AmmoSlotIndex = 0
  bank.FireModes.head.Magazine = 100
  bank.FireModes += new FireModeDefinition
  bank.FireModes(1).AmmoTypeIndices += 0
  bank.FireModes(1).AmmoSlotIndex = 0
  bank.FireModes(1).Magazine = 100
  bank.Tile = InventoryTile.Tile33

  val
  remote_electronics_kit = SimpleItemDefinition(SItem.remote_electronics_kit)
  remote_electronics_kit.Packet = new REKConverter
  remote_electronics_kit.Tile = InventoryTile.Tile33

  val
  trek = ToolDefinition(ObjectClass.trek)
  trek.Size = EquipmentSize.Pistol
  trek.AmmoTypes += trek_ammo
  trek.FireModes += new FireModeDefinition
  trek.FireModes.head.AmmoTypeIndices += 0
  trek.FireModes.head.AmmoSlotIndex = 0
  trek.FireModes.head.Magazine = 4
  trek.FireModes += new FireModeDefinition
  trek.FireModes(1).AmmoTypeIndices += 0
  trek.FireModes(1).AmmoSlotIndex = 0
  trek.FireModes(1).Magazine = 0
  trek.Tile = InventoryTile.Tile33

  val
  flail_targeting_laser = SimpleItemDefinition(SItem.flail_targeting_laser)
  flail_targeting_laser.Packet = new CommandDetonaterConverter
  flail_targeting_laser.Tile = InventoryTile.Tile33

  val
  command_detonater = SimpleItemDefinition(SItem.command_detonater)
  command_detonater.Packet = new CommandDetonaterConverter
  command_detonater.Tile = InventoryTile.Tile33

  val
  ace = ConstructionItemDefinition(CItem.Unit.ace)
  ace.Modes += DeployedItem.boomer
  ace.Modes += DeployedItem.he_mine
  ace.Modes += DeployedItem.jammer_mine
  ace.Modes += DeployedItem.spitfire_turret
  ace.Modes += DeployedItem.spitfire_cloaked
  ace.Modes += DeployedItem.spitfire_aa
  ace.Modes += DeployedItem.motionalarmsensor
  ace.Modes += DeployedItem.sensor_shield
  ace.Tile = InventoryTile.Tile33

  val
  advanced_ace = ConstructionItemDefinition(CItem.Unit.advanced_ace)
  advanced_ace.Modes += DeployedItem.tank_traps
  advanced_ace.Modes += DeployedItem.portable_manned_turret
  advanced_ace.Modes += DeployedItem.deployable_shield_generator
  advanced_ace.Tile = InventoryTile.Tile63

  val
  fury_weapon_systema = ToolDefinition(ObjectClass.fury_weapon_systema)
  fury_weapon_systema.Size = EquipmentSize.VehicleWeapon
  fury_weapon_systema.AmmoTypes += hellfire_ammo
  fury_weapon_systema.FireModes += new FireModeDefinition
  fury_weapon_systema.FireModes.head.AmmoTypeIndices += 0
  fury_weapon_systema.FireModes.head.AmmoSlotIndex = 0
  fury_weapon_systema.FireModes.head.Magazine = 2

  val
  quadassault_weapon_system = ToolDefinition(ObjectClass.quadassault_weapon_system)
  quadassault_weapon_system.Size = EquipmentSize.VehicleWeapon
  quadassault_weapon_system.AmmoTypes += bullet_12mm
  quadassault_weapon_system.FireModes += new FireModeDefinition
  quadassault_weapon_system.FireModes.head.AmmoTypeIndices += 0
  quadassault_weapon_system.FireModes.head.AmmoSlotIndex = 0
  quadassault_weapon_system.FireModes.head.Magazine = 150

  val
  scythe = ToolDefinition(ObjectClass.scythe) //TODO resolve ammo slot/pool discrepancy
  scythe.Size = EquipmentSize.VehicleWeapon
  scythe.AmmoTypes += ancient_ammo_vehicle
  scythe.AmmoTypes += ancient_ammo_vehicle
  scythe.FireModes += new FireModeDefinition
  scythe.FireModes.head.AmmoTypeIndices += 0
  scythe.FireModes.head.AmmoSlotIndex = 0
  scythe.FireModes.head.Magazine = 250
  scythe.FireModes += new FireModeDefinition
  scythe.FireModes(1).AmmoTypeIndices += 0
  scythe.FireModes(1).AmmoSlotIndex = 1 //note: the scythe has two magazines using a single pool; however, it can not ammo-switch or mode-switch
  scythe.FireModes(1).Magazine = 250

  val
  chaingun_p = ToolDefinition(ObjectClass.chaingun_p)
  chaingun_p.Size = EquipmentSize.VehicleWeapon
  chaingun_p.AmmoTypes += bullet_12mm
  chaingun_p.FireModes += new FireModeDefinition
  chaingun_p.FireModes.head.AmmoTypeIndices += 0
  chaingun_p.FireModes.head.AmmoSlotIndex = 0
  chaingun_p.FireModes.head.Magazine = 150

  val
  skyguard_weapon_system = ToolDefinition(ObjectClass.skyguard_weapon_system)
  skyguard_weapon_system.Size = EquipmentSize.VehicleWeapon
  skyguard_weapon_system.AmmoTypes += skyguard_flak_cannon_ammo
  skyguard_weapon_system.AmmoTypes += bullet_12mm
  skyguard_weapon_system.FireModes += new FireModeDefinition
  skyguard_weapon_system.FireModes.head.AmmoTypeIndices += 0
  skyguard_weapon_system.FireModes.head.AmmoSlotIndex = 0
  skyguard_weapon_system.FireModes.head.Magazine = 40
  skyguard_weapon_system.FireModes += new FireModeDefinition
  skyguard_weapon_system.FireModes(1).AmmoTypeIndices += 1
  skyguard_weapon_system.FireModes(1).AmmoSlotIndex = 1
  skyguard_weapon_system.FireModes(1).Magazine = 1 //TODO check

  val
  grenade_launcher_marauder = ToolDefinition(ObjectClass.grenade_launcher_marauder)
  grenade_launcher_marauder.Size = EquipmentSize.VehicleWeapon
  grenade_launcher_marauder.AmmoTypes += heavy_grenade_mortar
  grenade_launcher_marauder.FireModes += new FireModeDefinition
  grenade_launcher_marauder.FireModes.head.AmmoTypeIndices += 0
  grenade_launcher_marauder.FireModes.head.AmmoSlotIndex = 0
  grenade_launcher_marauder.FireModes.head.Magazine = 50

  val
  advanced_missile_launcher_t = ToolDefinition(ObjectClass.advanced_missile_launcher_t)
  advanced_missile_launcher_t.Size = EquipmentSize.VehicleWeapon
  advanced_missile_launcher_t.AmmoTypes += firebird_missile
  advanced_missile_launcher_t.FireModes += new FireModeDefinition
  advanced_missile_launcher_t.FireModes.head.AmmoTypeIndices += 0
  advanced_missile_launcher_t.FireModes.head.AmmoSlotIndex = 0
  advanced_missile_launcher_t.FireModes.head.Magazine = 40

  val
  flux_cannon_thresher = ToolDefinition(ObjectClass.flux_cannon_thresher)
  flux_cannon_thresher.Size = EquipmentSize.VehicleWeapon
  flux_cannon_thresher.AmmoTypes += flux_cannon_thresher_battery
  flux_cannon_thresher.FireModes += new FireModeDefinition
  flux_cannon_thresher.FireModes.head.AmmoTypeIndices += 0
  flux_cannon_thresher.FireModes.head.AmmoSlotIndex = 0
  flux_cannon_thresher.FireModes.head.Magazine = 100

  val
  mediumtransport_weapon_systemA = ToolDefinition(ObjectClass.mediumtransport_weapon_systemA)
  mediumtransport_weapon_systemA.Size = EquipmentSize.VehicleWeapon
  mediumtransport_weapon_systemA.AmmoTypes += bullet_20mm
  mediumtransport_weapon_systemA.FireModes += new FireModeDefinition
  mediumtransport_weapon_systemA.FireModes.head.AmmoTypeIndices += 0
  mediumtransport_weapon_systemA.FireModes.head.AmmoSlotIndex = 0
  mediumtransport_weapon_systemA.FireModes.head.Magazine = 150

  val
  mediumtransport_weapon_systemB = ToolDefinition(ObjectClass.mediumtransport_weapon_systemB)
  mediumtransport_weapon_systemB.Size = EquipmentSize.VehicleWeapon
  mediumtransport_weapon_systemB.AmmoTypes += bullet_20mm
  mediumtransport_weapon_systemB.FireModes += new FireModeDefinition
  mediumtransport_weapon_systemB.FireModes.head.AmmoTypeIndices += 0
  mediumtransport_weapon_systemB.FireModes.head.AmmoSlotIndex = 0
  mediumtransport_weapon_systemB.FireModes.head.Magazine = 150

  val
  battlewagon_weapon_systema = ToolDefinition(ObjectClass.battlewagon_weapon_systema)
  battlewagon_weapon_systema.Size = EquipmentSize.VehicleWeapon
  battlewagon_weapon_systema.AmmoTypes += bullet_15mm
  battlewagon_weapon_systema.FireModes += new FireModeDefinition
  battlewagon_weapon_systema.FireModes.head.AmmoTypeIndices += 0
  battlewagon_weapon_systema.FireModes.head.AmmoSlotIndex = 0
  battlewagon_weapon_systema.FireModes.head.Magazine = 235

  val
  battlewagon_weapon_systemb = ToolDefinition(ObjectClass.battlewagon_weapon_systemb)
  battlewagon_weapon_systemb.Size = EquipmentSize.VehicleWeapon
  battlewagon_weapon_systemb.AmmoTypes += bullet_15mm
  battlewagon_weapon_systemb.FireModes += new FireModeDefinition
  battlewagon_weapon_systemb.FireModes.head.AmmoTypeIndices += 0
  battlewagon_weapon_systemb.FireModes.head.AmmoSlotIndex = 0
  battlewagon_weapon_systemb.FireModes.head.Magazine = 235

  val
  battlewagon_weapon_systemc = ToolDefinition(ObjectClass.battlewagon_weapon_systemc)
  battlewagon_weapon_systemc.Size = EquipmentSize.VehicleWeapon
  battlewagon_weapon_systemc.AmmoTypes += bullet_15mm
  battlewagon_weapon_systemc.FireModes += new FireModeDefinition
  battlewagon_weapon_systemc.FireModes.head.AmmoTypeIndices += 0
  battlewagon_weapon_systemc.FireModes.head.AmmoSlotIndex = 0
  battlewagon_weapon_systemc.FireModes.head.Magazine = 235

  val
  battlewagon_weapon_systemd = ToolDefinition(ObjectClass.battlewagon_weapon_systemd)
  battlewagon_weapon_systemd.Size = EquipmentSize.VehicleWeapon
  battlewagon_weapon_systemd.AmmoTypes += bullet_15mm
  battlewagon_weapon_systemd.FireModes += new FireModeDefinition
  battlewagon_weapon_systemd.FireModes.head.AmmoTypeIndices += 0
  battlewagon_weapon_systemd.FireModes.head.AmmoSlotIndex = 0
  battlewagon_weapon_systemd.FireModes.head.Magazine = 235

  val
  thunderer_weapon_systema = ToolDefinition(ObjectClass.thunderer_weapon_systema)
  thunderer_weapon_systema.Size = EquipmentSize.VehicleWeapon
  thunderer_weapon_systema.AmmoTypes += gauss_cannon_ammo
  thunderer_weapon_systema.FireModes += new FireModeDefinition
  thunderer_weapon_systema.FireModes.head.AmmoTypeIndices += 0
  thunderer_weapon_systema.FireModes.head.AmmoSlotIndex = 0
  thunderer_weapon_systema.FireModes.head.Magazine = 15

  val
  thunderer_weapon_systemb = ToolDefinition(ObjectClass.thunderer_weapon_systemb)
  thunderer_weapon_systemb.Size = EquipmentSize.VehicleWeapon
  thunderer_weapon_systemb.AmmoTypes += gauss_cannon_ammo
  thunderer_weapon_systemb.FireModes += new FireModeDefinition
  thunderer_weapon_systemb.FireModes.head.AmmoTypeIndices += 0
  thunderer_weapon_systemb.FireModes.head.AmmoSlotIndex = 0
  thunderer_weapon_systemb.FireModes.head.Magazine = 15

  val
  aurora_weapon_systema = ToolDefinition(ObjectClass.aurora_weapon_systema)
  aurora_weapon_systema.Size = EquipmentSize.VehicleWeapon
  aurora_weapon_systema.AmmoTypes += fluxpod_ammo
  aurora_weapon_systema.FireModes += new FireModeDefinition
  aurora_weapon_systema.FireModes.head.AmmoTypeIndices += 0
  aurora_weapon_systema.FireModes.head.AmmoSlotIndex = 0
  aurora_weapon_systema.FireModes.head.Magazine = 12
  aurora_weapon_systema.FireModes += new FireModeDefinition
  aurora_weapon_systema.FireModes(1).AmmoTypeIndices += 0
  aurora_weapon_systema.FireModes(1).AmmoSlotIndex = 1
  aurora_weapon_systema.FireModes(1).Magazine = 12

  val
  aurora_weapon_systemb = ToolDefinition(ObjectClass.aurora_weapon_systemb)
  aurora_weapon_systemb.Size = EquipmentSize.VehicleWeapon
  aurora_weapon_systemb.AmmoTypes += fluxpod_ammo
  aurora_weapon_systemb.FireModes += new FireModeDefinition
  aurora_weapon_systemb.FireModes.head.AmmoTypeIndices += 0
  aurora_weapon_systemb.FireModes.head.AmmoSlotIndex = 0
  aurora_weapon_systemb.FireModes.head.Magazine = 12
  aurora_weapon_systemb.FireModes += new FireModeDefinition
  aurora_weapon_systemb.FireModes(1).AmmoTypeIndices += 0
  aurora_weapon_systemb.FireModes(1).AmmoSlotIndex = 1
  aurora_weapon_systemb.FireModes(1).Magazine = 12

  val
  apc_weapon_systema = ToolDefinition(ObjectClass.apc_weapon_systema)
  apc_weapon_systema.Size = EquipmentSize.VehicleWeapon
  apc_weapon_systema.AmmoTypes += bullet_75mm
  apc_weapon_systema.FireModes += new FireModeDefinition
  apc_weapon_systema.FireModes.head.AmmoTypeIndices += 0
  apc_weapon_systema.FireModes.head.AmmoSlotIndex = 0
  apc_weapon_systema.FireModes.head.Magazine = 50

  val
  apc_weapon_systemb = ToolDefinition(ObjectClass.apc_weapon_systemb)
  apc_weapon_systemb.Size = EquipmentSize.VehicleWeapon
  apc_weapon_systemb.AmmoTypes += bullet_75mm
  apc_weapon_systemb.FireModes += new FireModeDefinition
  apc_weapon_systemb.FireModes.head.AmmoTypeIndices += 0
  apc_weapon_systemb.FireModes.head.AmmoSlotIndex = 0
  apc_weapon_systemb.FireModes.head.Magazine = 50

  val
  apc_ballgun_r = ToolDefinition(ObjectClass.apc_ballgun_r)
  apc_ballgun_r.Size = EquipmentSize.VehicleWeapon
  apc_ballgun_r.AmmoTypes += bullet_12mm
  apc_ballgun_r.FireModes += new FireModeDefinition
  apc_ballgun_r.FireModes.head.AmmoTypeIndices += 0
  apc_ballgun_r.FireModes.head.AmmoSlotIndex = 0
  apc_ballgun_r.FireModes.head.Magazine = 150

  val
  apc_ballgun_l = ToolDefinition(ObjectClass.apc_ballgun_l)
  apc_ballgun_l.Size = EquipmentSize.VehicleWeapon
  apc_ballgun_l.AmmoTypes += bullet_12mm
  apc_ballgun_l.FireModes += new FireModeDefinition
  apc_ballgun_l.FireModes.head.AmmoTypeIndices += 0
  apc_ballgun_l.FireModes.head.AmmoSlotIndex = 0
  apc_ballgun_l.FireModes.head.Magazine = 150

  val
  apc_weapon_systemc_tr = ToolDefinition(ObjectClass.apc_weapon_systemc_tr)
  apc_weapon_systemc_tr.Size = EquipmentSize.VehicleWeapon
  apc_weapon_systemc_tr.AmmoTypes += bullet_15mm
  apc_weapon_systemc_tr.FireModes += new FireModeDefinition
  apc_weapon_systemc_tr.FireModes.head.AmmoTypeIndices += 0
  apc_weapon_systemc_tr.FireModes.head.AmmoSlotIndex = 0
  apc_weapon_systemc_tr.FireModes.head.Magazine = 150

  val
  apc_weapon_systemd_tr = ToolDefinition(ObjectClass.apc_weapon_systemd_tr)
  apc_weapon_systemd_tr.Size = EquipmentSize.VehicleWeapon
  apc_weapon_systemd_tr.AmmoTypes += bullet_15mm
  apc_weapon_systemd_tr.FireModes += new FireModeDefinition
  apc_weapon_systemd_tr.FireModes.head.AmmoTypeIndices += 0
  apc_weapon_systemd_tr.FireModes.head.AmmoSlotIndex = 0
  apc_weapon_systemd_tr.FireModes.head.Magazine = 150

  val
  apc_weapon_systemc_nc = ToolDefinition(ObjectClass.apc_weapon_systemc_nc)
  apc_weapon_systemc_nc.Size = EquipmentSize.VehicleWeapon
  apc_weapon_systemc_nc.AmmoTypes += bullet_20mm
  apc_weapon_systemc_nc.FireModes += new FireModeDefinition
  apc_weapon_systemc_nc.FireModes.head.AmmoTypeIndices += 0
  apc_weapon_systemc_nc.FireModes.head.AmmoSlotIndex = 0
  apc_weapon_systemc_nc.FireModes.head.Magazine = 150

  val
  apc_weapon_systemd_nc = ToolDefinition(ObjectClass.apc_weapon_systemd_nc)
  apc_weapon_systemd_nc.Size = EquipmentSize.VehicleWeapon
  apc_weapon_systemd_nc.AmmoTypes += bullet_20mm
  apc_weapon_systemd_nc.FireModes += new FireModeDefinition
  apc_weapon_systemd_nc.FireModes.head.AmmoTypeIndices += 0
  apc_weapon_systemd_nc.FireModes.head.AmmoSlotIndex = 0
  apc_weapon_systemd_nc.FireModes.head.Magazine = 150

  val
  apc_weapon_systemc_vs = ToolDefinition(ObjectClass.apc_weapon_systemc_vs)
  apc_weapon_systemc_vs.Size = EquipmentSize.VehicleWeapon
  apc_weapon_systemc_vs.AmmoTypes += flux_cannon_thresher_battery
  apc_weapon_systemc_vs.FireModes += new FireModeDefinition
  apc_weapon_systemc_vs.FireModes.head.AmmoTypeIndices += 0
  apc_weapon_systemc_vs.FireModes.head.AmmoSlotIndex = 0
  apc_weapon_systemc_vs.FireModes.head.Magazine = 100

  val
  apc_weapon_systemd_vs = ToolDefinition(ObjectClass.apc_weapon_systemd_vs)
  apc_weapon_systemd_vs.Size = EquipmentSize.VehicleWeapon
  apc_weapon_systemd_vs.AmmoTypes += flux_cannon_thresher_battery
  apc_weapon_systemd_vs.FireModes += new FireModeDefinition
  apc_weapon_systemd_vs.FireModes.head.AmmoTypeIndices += 0
  apc_weapon_systemd_vs.FireModes.head.AmmoSlotIndex = 0
  apc_weapon_systemd_vs.FireModes.head.Magazine = 100

  val
  lightning_weapon_system = ToolDefinition(ObjectClass.lightning_weapon_system)
  lightning_weapon_system.Size = EquipmentSize.VehicleWeapon
  lightning_weapon_system.AmmoTypes += bullet_75mm
  lightning_weapon_system.AmmoTypes += bullet_25mm
  lightning_weapon_system.FireModes += new FireModeDefinition
  lightning_weapon_system.FireModes.head.AmmoTypeIndices += 0
  lightning_weapon_system.FireModes.head.AmmoSlotIndex = 0
  lightning_weapon_system.FireModes.head.Magazine = 20
  lightning_weapon_system.FireModes += new FireModeDefinition
  lightning_weapon_system.FireModes(1).AmmoTypeIndices += 1
  lightning_weapon_system.FireModes(1).AmmoSlotIndex = 1
  lightning_weapon_system.FireModes(1).Magazine = 1 //TODO check

  val
  prowler_weapon_systemA = ToolDefinition(ObjectClass.prowler_weapon_systemA)
  prowler_weapon_systemA.Size = EquipmentSize.VehicleWeapon
  prowler_weapon_systemA.AmmoTypes += bullet_105mm
  prowler_weapon_systemA.FireModes += new FireModeDefinition
  prowler_weapon_systemA.FireModes.head.AmmoTypeIndices += 0
  prowler_weapon_systemA.FireModes.head.AmmoSlotIndex = 0
  prowler_weapon_systemA.FireModes.head.Magazine = 20

  val
  prowler_weapon_systemB = ToolDefinition(ObjectClass.prowler_weapon_systemB)
  prowler_weapon_systemB.Size = EquipmentSize.VehicleWeapon
  prowler_weapon_systemB.AmmoTypes += bullet_15mm
  prowler_weapon_systemB.FireModes += new FireModeDefinition
  prowler_weapon_systemB.FireModes.head.AmmoTypeIndices += 0
  prowler_weapon_systemB.FireModes.head.AmmoSlotIndex = 0
  prowler_weapon_systemB.FireModes.head.Magazine = 235

  val
  vanguard_weapon_system = ToolDefinition(ObjectClass.vanguard_weapon_system)
  vanguard_weapon_system.Size = EquipmentSize.VehicleWeapon
  vanguard_weapon_system.AmmoTypes += bullet_150mm
  vanguard_weapon_system.AmmoTypes += bullet_20mm
  vanguard_weapon_system.FireModes += new FireModeDefinition
  vanguard_weapon_system.FireModes.head.AmmoTypeIndices += 0
  vanguard_weapon_system.FireModes.head.AmmoSlotIndex = 0
  vanguard_weapon_system.FireModes.head.Magazine = 10
  vanguard_weapon_system.FireModes += new FireModeDefinition
  vanguard_weapon_system.FireModes(1).AmmoTypeIndices += 1
  vanguard_weapon_system.FireModes(1).AmmoSlotIndex = 1
  vanguard_weapon_system.FireModes(1).Magazine = 1 //TODO check

  val
  particle_beam_magrider = ToolDefinition(ObjectClass.particle_beam_magrider)
  particle_beam_magrider.Size = EquipmentSize.VehicleWeapon
  particle_beam_magrider.AmmoTypes += pulse_battery
  particle_beam_magrider.FireModes += new FireModeDefinition
  particle_beam_magrider.FireModes.head.AmmoTypeIndices += 0
  particle_beam_magrider.FireModes.head.AmmoSlotIndex = 0
  particle_beam_magrider.FireModes.head.Magazine = 150

  val
  heavy_rail_beam_magrider = ToolDefinition(ObjectClass.heavy_rail_beam_magrider)
  heavy_rail_beam_magrider.Size = EquipmentSize.VehicleWeapon
  heavy_rail_beam_magrider.AmmoTypes += heavy_rail_beam_battery
  heavy_rail_beam_magrider.FireModes += new FireModeDefinition
  heavy_rail_beam_magrider.FireModes.head.AmmoTypeIndices += 0
  heavy_rail_beam_magrider.FireModes.head.AmmoSlotIndex = 0
  heavy_rail_beam_magrider.FireModes.head.Magazine = 25

  val
  flail_weapon = ToolDefinition(ObjectClass.flail_weapon)
  flail_weapon.Size = EquipmentSize.VehicleWeapon
  flail_weapon.AmmoTypes += ancient_ammo_vehicle
  flail_weapon.FireModes += new FireModeDefinition
  flail_weapon.FireModes.head.AmmoTypeIndices += 0
  flail_weapon.FireModes.head.AmmoSlotIndex = 0
  flail_weapon.FireModes.head.Magazine = 100

  val
  rotarychaingun_mosquito = ToolDefinition(ObjectClass.rotarychaingun_mosquito)
  rotarychaingun_mosquito.Size = EquipmentSize.VehicleWeapon
  rotarychaingun_mosquito.AmmoTypes += bullet_12mm
  rotarychaingun_mosquito.FireModes += new FireModeDefinition
  rotarychaingun_mosquito.FireModes.head.AmmoTypeIndices += 0
  rotarychaingun_mosquito.FireModes.head.AmmoSlotIndex = 0
  rotarychaingun_mosquito.FireModes.head.Magazine = 150

  val
  lightgunship_weapon_system = ToolDefinition(ObjectClass.lightgunship_weapon_system)
  lightgunship_weapon_system.Size = EquipmentSize.VehicleWeapon
  lightgunship_weapon_system.AmmoTypes += bullet_20mm
  lightgunship_weapon_system.AmmoTypes += reaver_rocket
  lightgunship_weapon_system.FireModes += new FireModeDefinition
  lightgunship_weapon_system.FireModes.head.AmmoTypeIndices += 0
  lightgunship_weapon_system.FireModes.head.AmmoSlotIndex = 0
  lightgunship_weapon_system.FireModes.head.Magazine = 150
  lightgunship_weapon_system.FireModes += new FireModeDefinition
  lightgunship_weapon_system.FireModes(1).AmmoTypeIndices += 1
  lightgunship_weapon_system.FireModes(1).AmmoSlotIndex = 1
  lightgunship_weapon_system.FireModes(1).Magazine = 1 //TODO check

  val
  wasp_weapon_system = ToolDefinition(ObjectClass.wasp_weapon_system)
  wasp_weapon_system.Size = EquipmentSize.VehicleWeapon
  wasp_weapon_system.AmmoTypes += wasp_gun_ammo
  wasp_weapon_system.AmmoTypes += wasp_rocket_ammo
  wasp_weapon_system.FireModes += new FireModeDefinition
  wasp_weapon_system.FireModes.head.AmmoTypeIndices += 0
  wasp_weapon_system.FireModes.head.AmmoSlotIndex = 0
  wasp_weapon_system.FireModes.head.Magazine = 30
  wasp_weapon_system.FireModes += new FireModeDefinition
  wasp_weapon_system.FireModes(1).AmmoTypeIndices += 1
  wasp_weapon_system.FireModes(1).AmmoSlotIndex = 1
  wasp_weapon_system.FireModes(1).Magazine = 1 //TODO check
  
  val
  liberator_weapon_system = ToolDefinition(ObjectClass.liberator_weapon_system)
  liberator_weapon_system.Size = EquipmentSize.VehicleWeapon
  liberator_weapon_system.AmmoTypes += bullet_35mm
  liberator_weapon_system.FireModes += new FireModeDefinition
  liberator_weapon_system.FireModes.head.AmmoTypeIndices += 0
  liberator_weapon_system.FireModes.head.AmmoSlotIndex = 0
  liberator_weapon_system.FireModes.head.Magazine = 100

  val
  liberator_bomb_bay = ToolDefinition(ObjectClass.liberator_bomb_bay)
  liberator_bomb_bay.Size = EquipmentSize.VehicleWeapon
  liberator_bomb_bay.AmmoTypes += liberator_bomb
  liberator_bomb_bay.FireModes += new FireModeDefinition
  liberator_bomb_bay.FireModes.head.AmmoTypeIndices += 0
  liberator_bomb_bay.FireModes.head.AmmoSlotIndex = 0
  liberator_bomb_bay.FireModes.head.Magazine = 10
  liberator_bomb_bay.FireModes += new FireModeDefinition
  liberator_bomb_bay.FireModes(1).AmmoTypeIndices += 0
  liberator_bomb_bay.FireModes(1).AmmoSlotIndex = 0
  liberator_bomb_bay.FireModes(1).Magazine = 10

  val
  liberator_25mm_cannon = ToolDefinition(ObjectClass.liberator_25mm_cannon)
  liberator_25mm_cannon.Size = EquipmentSize.VehicleWeapon
  liberator_25mm_cannon.AmmoTypes += bullet_25mm
  liberator_25mm_cannon.FireModes += new FireModeDefinition
  liberator_25mm_cannon.FireModes.head.AmmoTypeIndices += 0
  liberator_25mm_cannon.FireModes.head.AmmoSlotIndex = 0
  liberator_25mm_cannon.FireModes.head.Magazine = 150

  val
  vulture_nose_weapon_system = ToolDefinition(ObjectClass.vulture_nose_weapon_system)
  vulture_nose_weapon_system.Size = EquipmentSize.VehicleWeapon
  vulture_nose_weapon_system.AmmoTypes += bullet_35mm
  vulture_nose_weapon_system.FireModes += new FireModeDefinition
  vulture_nose_weapon_system.FireModes.head.AmmoTypeIndices += 0
  vulture_nose_weapon_system.FireModes.head.AmmoSlotIndex = 0
  vulture_nose_weapon_system.FireModes.head.Magazine = 75 //80?

  val
  vulture_bomb_bay = ToolDefinition(ObjectClass.vulture_bomb_bay)
  vulture_bomb_bay.Size = EquipmentSize.VehicleWeapon
  vulture_bomb_bay.AmmoTypes += liberator_bomb
  vulture_bomb_bay.FireModes += new FireModeDefinition
  vulture_bomb_bay.FireModes.head.AmmoTypeIndices += 0
  vulture_bomb_bay.FireModes.head.AmmoSlotIndex = 0
  vulture_bomb_bay.FireModes.head.Magazine = 10

  val
  vulture_tail_cannon = ToolDefinition(ObjectClass.vulture_tail_cannon)
  vulture_tail_cannon.Size = EquipmentSize.VehicleWeapon
  vulture_tail_cannon.AmmoTypes += bullet_25mm
  vulture_tail_cannon.FireModes += new FireModeDefinition
  vulture_tail_cannon.FireModes.head.AmmoTypeIndices += 0
  vulture_tail_cannon.FireModes.head.AmmoSlotIndex = 0
  vulture_tail_cannon.FireModes.head.Magazine = 100

  val
  cannon_dropship_20mm = ToolDefinition(ObjectClass.cannon_dropship_20mm)
  cannon_dropship_20mm.Size = EquipmentSize.VehicleWeapon
  cannon_dropship_20mm.AmmoTypes += bullet_20mm
  cannon_dropship_20mm.FireModes += new FireModeDefinition
  cannon_dropship_20mm.FireModes.head.AmmoTypeIndices += 0
  cannon_dropship_20mm.FireModes.head.AmmoSlotIndex = 0
  cannon_dropship_20mm.FireModes.head.Magazine = 250

  val
  dropship_rear_turret = ToolDefinition(ObjectClass.dropship_rear_turret)
  dropship_rear_turret.Size = EquipmentSize.VehicleWeapon
  dropship_rear_turret.AmmoTypes += bullet_20mm
  dropship_rear_turret.FireModes += new FireModeDefinition
  dropship_rear_turret.FireModes.head.AmmoTypeIndices += 0
  dropship_rear_turret.FireModes.head.AmmoSlotIndex = 0
  dropship_rear_turret.FireModes.head.Magazine = 250

  val
  galaxy_gunship_cannon = ToolDefinition(ObjectClass.galaxy_gunship_cannon)
  galaxy_gunship_cannon.Size = EquipmentSize.VehicleWeapon
  galaxy_gunship_cannon.AmmoTypes += heavy_grenade_mortar
  galaxy_gunship_cannon.FireModes += new FireModeDefinition
  galaxy_gunship_cannon.FireModes.head.AmmoTypeIndices += 0
  galaxy_gunship_cannon.FireModes.head.AmmoSlotIndex = 0
  galaxy_gunship_cannon.FireModes.head.Magazine = 50

  val
  galaxy_gunship_tailgun = ToolDefinition(ObjectClass.galaxy_gunship_tailgun)
  galaxy_gunship_tailgun.Size = EquipmentSize.VehicleWeapon
  galaxy_gunship_tailgun.AmmoTypes += bullet_35mm
  galaxy_gunship_tailgun.FireModes += new FireModeDefinition
  galaxy_gunship_tailgun.FireModes.head.AmmoTypeIndices += 0
  galaxy_gunship_tailgun.FireModes.head.AmmoSlotIndex = 0
  galaxy_gunship_tailgun.FireModes.head.Magazine = 200

  val
  galaxy_gunship_gun = ToolDefinition(ObjectClass.galaxy_gunship_gun)
  galaxy_gunship_gun.Size = EquipmentSize.VehicleWeapon
  galaxy_gunship_gun.AmmoTypes += bullet_35mm
  galaxy_gunship_gun.FireModes += new FireModeDefinition
  galaxy_gunship_gun.FireModes.head.AmmoTypeIndices += 0
  galaxy_gunship_gun.FireModes.head.AmmoSlotIndex = 0
  galaxy_gunship_gun.FireModes.head.Magazine = 200

  val
  fury = VehicleDefinition(ObjectClass.fury)
  fury.Seats += 0 -> new SeatDefinition()
  fury.Seats(0).Bailable = true
  fury.Seats(0).ControlledWeapon = 1
  fury.Weapons += 1 -> fury_weapon_systema
  fury.MountPoints += 1 -> 0
  fury.MountPoints += 2 -> 0
  fury.TrunkSize = InventoryTile.Tile1111
  fury.TrunkOffset = 30

  val
  quadassault = VehicleDefinition(ObjectClass.quadassault)
  quadassault.Seats += 0 -> new SeatDefinition()
  quadassault.Seats(0).Bailable = true
  quadassault.Seats(0).ControlledWeapon = 1
  quadassault.Weapons += 1 -> quadassault_weapon_system
  quadassault.MountPoints += 1 -> 0
  quadassault.MountPoints += 2 -> 0
  quadassault.TrunkSize = InventoryTile.Tile1111
  quadassault.TrunkOffset = 30

  val
  quadstealth = VehicleDefinition(ObjectClass.quadstealth)
  quadstealth.CanCloak = true
  quadstealth.Seats += 0 -> new SeatDefinition()
  quadstealth.Seats(0).Bailable = true
  quadstealth.CanCloak = true
  quadstealth.MountPoints += 1 -> 0
  quadstealth.MountPoints += 2 -> 0
  quadstealth.TrunkSize = InventoryTile.Tile1111
  quadstealth.TrunkOffset = 30

  val
  two_man_assault_buggy = VehicleDefinition(ObjectClass.two_man_assault_buggy)
  two_man_assault_buggy.Seats += 0 -> new SeatDefinition()
  two_man_assault_buggy.Seats(0).Bailable = true
  two_man_assault_buggy.Seats += 1 -> new SeatDefinition()
  two_man_assault_buggy.Seats(1).Bailable = true
  two_man_assault_buggy.Seats(1).ControlledWeapon = 2
  two_man_assault_buggy.Weapons += 2 -> chaingun_p
  two_man_assault_buggy.MountPoints += 1 -> 0
  two_man_assault_buggy.MountPoints += 2 -> 1
  two_man_assault_buggy.TrunkSize = InventoryTile.Tile1111
  two_man_assault_buggy.TrunkOffset = 30

  val
  skyguard = VehicleDefinition(ObjectClass.skyguard)
  skyguard.Seats += 0 -> new SeatDefinition()
  skyguard.Seats(0).Bailable = true
  skyguard.Seats += 1 -> new SeatDefinition()
  skyguard.Seats(1).Bailable = true
  skyguard.Seats(1).ControlledWeapon = 2
  skyguard.Weapons += 2 -> skyguard_weapon_system
  skyguard.MountPoints += 1 -> 0
  skyguard.MountPoints += 2 -> 0
  skyguard.MountPoints += 3 -> 1
  skyguard.TrunkSize = InventoryTile.Tile1511
  skyguard.TrunkOffset = 30

  val
  threemanheavybuggy = VehicleDefinition(ObjectClass.threemanheavybuggy)
  threemanheavybuggy.Seats += 0 -> new SeatDefinition()
  threemanheavybuggy.Seats(0).Bailable = true
  threemanheavybuggy.Seats += 1 -> new SeatDefinition()
  threemanheavybuggy.Seats(1).Bailable = true
  threemanheavybuggy.Seats(1).ControlledWeapon = 3
  threemanheavybuggy.Seats += 2 -> new SeatDefinition()
  threemanheavybuggy.Seats(2).Bailable = true
  threemanheavybuggy.Seats(2).ControlledWeapon = 4
  threemanheavybuggy.Weapons += 3 -> chaingun_p
  threemanheavybuggy.Weapons += 4 -> grenade_launcher_marauder
  threemanheavybuggy.MountPoints += 1 -> 0
  threemanheavybuggy.MountPoints += 2 -> 1
  threemanheavybuggy.MountPoints += 3 -> 2
  threemanheavybuggy.TrunkSize = InventoryTile.Tile1511
  threemanheavybuggy.TrunkOffset = 30

  val
  twomanheavybuggy = VehicleDefinition(ObjectClass.twomanheavybuggy)
  twomanheavybuggy.Seats += 0 -> new SeatDefinition()
  twomanheavybuggy.Seats(0).Bailable = true
  twomanheavybuggy.Seats += 1 -> new SeatDefinition()
  twomanheavybuggy.Seats(1).Bailable = true
  twomanheavybuggy.Seats(1).ControlledWeapon = 2
  twomanheavybuggy.Weapons += 2 -> advanced_missile_launcher_t
  twomanheavybuggy.MountPoints += 1 -> 0
  twomanheavybuggy.MountPoints += 2 -> 1
  twomanheavybuggy.TrunkSize = InventoryTile.Tile1511
  twomanheavybuggy.TrunkOffset = 30

  val
  twomanhoverbuggy = VehicleDefinition(ObjectClass.twomanhoverbuggy)
  twomanhoverbuggy.Seats += 0 -> new SeatDefinition()
  twomanhoverbuggy.Seats(0).Bailable = true
  twomanhoverbuggy.Seats += 1 -> new SeatDefinition()
  twomanhoverbuggy.Seats(1).Bailable = true
  twomanhoverbuggy.Seats(1).ControlledWeapon = 2
  twomanhoverbuggy.Weapons += 2 -> flux_cannon_thresher
  twomanhoverbuggy.MountPoints += 1 -> 0
  twomanhoverbuggy.MountPoints += 2 -> 1
  twomanhoverbuggy.TrunkSize = InventoryTile.Tile1511
  twomanhoverbuggy.TrunkOffset = 30

  val
  mediumtransport = VehicleDefinition(ObjectClass.mediumtransport)
  mediumtransport.Seats += 0 -> new SeatDefinition()
  mediumtransport.Seats(0).ArmorRestriction = SeatArmorRestriction.NoReinforcedOrMax
  mediumtransport.Seats += 1 -> new SeatDefinition()
  mediumtransport.Seats(1).ControlledWeapon = 5
  mediumtransport.Seats += 2 -> new SeatDefinition()
  mediumtransport.Seats(2).ControlledWeapon = 6
  mediumtransport.Seats += 3 -> new SeatDefinition()
  mediumtransport.Seats += 4 -> new SeatDefinition()
  mediumtransport.Weapons += 5 -> mediumtransport_weapon_systemA
  mediumtransport.Weapons += 6 -> mediumtransport_weapon_systemB
  mediumtransport.MountPoints += 1 -> 0
  mediumtransport.MountPoints += 2 -> 1
  mediumtransport.MountPoints += 3 -> 2
  mediumtransport.MountPoints += 4 -> 3
  mediumtransport.MountPoints += 5 -> 4
  mediumtransport.TrunkSize = InventoryTile.Tile1515
  mediumtransport.TrunkOffset = 30

  val
  battlewagon = VehicleDefinition(ObjectClass.battlewagon)
  battlewagon.Seats += 0 -> new SeatDefinition()
  battlewagon.Seats(0).ArmorRestriction = SeatArmorRestriction.NoReinforcedOrMax
  battlewagon.Seats += 1 -> new SeatDefinition()
  battlewagon.Seats(1).ControlledWeapon = 5
  battlewagon.Seats += 2 -> new SeatDefinition()
  battlewagon.Seats(2).ControlledWeapon = 6
  battlewagon.Seats += 3 -> new SeatDefinition()
  battlewagon.Seats(3).ControlledWeapon = 7
  battlewagon.Seats += 4 -> new SeatDefinition()
  battlewagon.Seats(4).ControlledWeapon = 8
  battlewagon.Weapons += 5 -> battlewagon_weapon_systema
  battlewagon.Weapons += 6 -> battlewagon_weapon_systemb
  battlewagon.Weapons += 7 -> battlewagon_weapon_systemc
  battlewagon.Weapons += 8 -> battlewagon_weapon_systemd
  battlewagon.MountPoints += 1 -> 0
  battlewagon.MountPoints += 2 -> 1
  battlewagon.MountPoints += 3 -> 2
  battlewagon.MountPoints += 4 -> 3
  battlewagon.MountPoints += 5 -> 4
  battlewagon.TrunkSize = InventoryTile.Tile1515
  battlewagon.TrunkOffset = 30

  val
  thunderer = VehicleDefinition(ObjectClass.thunderer)
  thunderer.Seats += 0 -> new SeatDefinition()
  thunderer.Seats(0).ArmorRestriction = SeatArmorRestriction.NoReinforcedOrMax
  thunderer.Seats += 1 -> new SeatDefinition()
  thunderer.Seats(1).ControlledWeapon = 5
  thunderer.Seats += 2 -> new SeatDefinition()
  thunderer.Seats(2).ControlledWeapon = 6
  thunderer.Seats += 3 -> new SeatDefinition()
  thunderer.Seats += 4 -> new SeatDefinition()
  thunderer.Weapons += 5 -> thunderer_weapon_systema
  thunderer.Weapons += 6 -> thunderer_weapon_systemb
  thunderer.MountPoints += 1 -> 0
  thunderer.MountPoints += 2 -> 1
  thunderer.MountPoints += 3 -> 2
  thunderer.MountPoints += 4 -> 3
  thunderer.MountPoints += 5 -> 4
  thunderer.TrunkSize = InventoryTile.Tile1515
  thunderer.TrunkOffset = 30

  val
  aurora = VehicleDefinition(ObjectClass.aurora)
  aurora.Seats += 0 -> new SeatDefinition()
  aurora.Seats(0).ArmorRestriction = SeatArmorRestriction.NoReinforcedOrMax
  aurora.Seats += 1 -> new SeatDefinition()
  aurora.Seats(1).ControlledWeapon = 5
  aurora.Seats += 2 -> new SeatDefinition()
  aurora.Seats(2).ControlledWeapon = 6
  aurora.Seats += 3 -> new SeatDefinition()
  aurora.Seats += 4 -> new SeatDefinition()
  aurora.Weapons += 5 -> aurora_weapon_systema
  aurora.Weapons += 6 -> aurora_weapon_systemb
  aurora.MountPoints += 1 -> 0
  aurora.MountPoints += 2 -> 1
  aurora.MountPoints += 3 -> 2
  aurora.MountPoints += 4 -> 3
  aurora.MountPoints += 5 -> 4
  aurora.TrunkSize = InventoryTile.Tile1515
  aurora.TrunkOffset = 30

  val
  apc_tr = VehicleDefinition(ObjectClass.apc_tr)
  apc_tr.Seats += 0 -> new SeatDefinition()
  apc_tr.Seats(0).ArmorRestriction = SeatArmorRestriction.NoReinforcedOrMax
  apc_tr.Seats += 1 -> new SeatDefinition()
  apc_tr.Seats(1).ControlledWeapon = 11
  apc_tr.Seats += 2 -> new SeatDefinition()
  apc_tr.Seats(2).ControlledWeapon = 12
  apc_tr.Seats += 3 -> new SeatDefinition()
  apc_tr.Seats += 4 -> new SeatDefinition()
  apc_tr.Seats += 5 -> new SeatDefinition()
  apc_tr.Seats(5).ControlledWeapon = 15
  apc_tr.Seats += 6 -> new SeatDefinition()
  apc_tr.Seats(6).ControlledWeapon = 16
  apc_tr.Seats += 7 -> new SeatDefinition()
  apc_tr.Seats(7).ControlledWeapon = 13
  apc_tr.Seats += 8 -> new SeatDefinition()
  apc_tr.Seats(8).ControlledWeapon = 14
  apc_tr.Seats += 9 -> new SeatDefinition()
  apc_tr.Seats(9).ArmorRestriction = SeatArmorRestriction.MaxOnly
  apc_tr.Seats += 10 -> new SeatDefinition()
  apc_tr.Seats(10).ArmorRestriction = SeatArmorRestriction.MaxOnly
  apc_tr.Weapons += 11 -> apc_weapon_systemc_tr
  apc_tr.Weapons += 12 -> apc_weapon_systemb
  apc_tr.Weapons += 13 -> apc_weapon_systema
  apc_tr.Weapons += 14 -> apc_weapon_systemd_tr
  apc_tr.Weapons += 15 -> apc_ballgun_r
  apc_tr.Weapons += 16 -> apc_ballgun_l
  apc_tr.MountPoints += 1 -> 0
  apc_tr.MountPoints += 2 -> 0
  apc_tr.MountPoints += 3 -> 1
  apc_tr.MountPoints += 4 -> 2
  apc_tr.MountPoints += 5 -> 3
  apc_tr.MountPoints += 6 -> 4
  apc_tr.MountPoints += 7 -> 5
  apc_tr.MountPoints += 8 -> 6
  apc_tr.MountPoints += 9 -> 7
  apc_tr.MountPoints += 10 -> 8
  apc_tr.MountPoints += 11 -> 9
  apc_tr.MountPoints += 12 -> 10
  apc_tr.TrunkSize = InventoryTile.Tile2016
  apc_tr.TrunkOffset = 30

  val
  apc_nc = VehicleDefinition(ObjectClass.apc_nc)
  apc_nc.Seats += 0 -> new SeatDefinition()
  apc_nc.Seats(0).ArmorRestriction = SeatArmorRestriction.NoReinforcedOrMax
  apc_nc.Seats += 1 -> new SeatDefinition()
  apc_nc.Seats(1).ControlledWeapon = 11
  apc_nc.Seats += 2 -> new SeatDefinition()
  apc_nc.Seats(2).ControlledWeapon = 12
  apc_nc.Seats += 3 -> new SeatDefinition()
  apc_nc.Seats += 4 -> new SeatDefinition()
  apc_nc.Seats += 5 -> new SeatDefinition()
  apc_nc.Seats(5).ControlledWeapon = 15
  apc_nc.Seats += 6 -> new SeatDefinition()
  apc_nc.Seats(6).ControlledWeapon = 16
  apc_nc.Seats += 7 -> new SeatDefinition()
  apc_nc.Seats(7).ControlledWeapon = 13
  apc_nc.Seats += 8 -> new SeatDefinition()
  apc_nc.Seats(8).ControlledWeapon = 14
  apc_nc.Seats += 9 -> new SeatDefinition()
  apc_nc.Seats(9).ArmorRestriction = SeatArmorRestriction.MaxOnly
  apc_nc.Seats += 10 -> new SeatDefinition()
  apc_nc.Seats(10).ArmorRestriction = SeatArmorRestriction.MaxOnly
  apc_nc.Weapons += 11 -> apc_weapon_systemc_nc
  apc_nc.Weapons += 12 -> apc_weapon_systemb
  apc_nc.Weapons += 13 -> apc_weapon_systema
  apc_nc.Weapons += 14 -> apc_weapon_systemd_nc
  apc_nc.Weapons += 15 -> apc_ballgun_r
  apc_nc.Weapons += 16 -> apc_ballgun_l
  apc_nc.MountPoints += 1 -> 0
  apc_nc.MountPoints += 2 -> 0
  apc_nc.MountPoints += 3 -> 1
  apc_nc.MountPoints += 4 -> 2
  apc_nc.MountPoints += 5 -> 3
  apc_nc.MountPoints += 6 -> 4
  apc_nc.MountPoints += 7 -> 5
  apc_nc.MountPoints += 8 -> 6
  apc_nc.MountPoints += 9 -> 7
  apc_nc.MountPoints += 10 -> 8
  apc_nc.MountPoints += 11 -> 9
  apc_nc.MountPoints += 12 -> 10
  apc_nc.TrunkSize = InventoryTile.Tile2016
  apc_nc.TrunkOffset = 30

  val
  apc_vs = VehicleDefinition(ObjectClass.apc_vs)
  apc_vs.Seats += 0 -> new SeatDefinition()
  apc_vs.Seats(0).ArmorRestriction = SeatArmorRestriction.NoReinforcedOrMax
  apc_vs.Seats += 1 -> new SeatDefinition()
  apc_vs.Seats(1).ControlledWeapon = 11
  apc_vs.Seats += 2 -> new SeatDefinition()
  apc_vs.Seats(2).ControlledWeapon = 12
  apc_vs.Seats += 3 -> new SeatDefinition()
  apc_vs.Seats += 4 -> new SeatDefinition()
  apc_vs.Seats += 5 -> new SeatDefinition()
  apc_vs.Seats(5).ControlledWeapon = 15
  apc_vs.Seats += 6 -> new SeatDefinition()
  apc_vs.Seats(6).ControlledWeapon = 16
  apc_vs.Seats += 7 -> new SeatDefinition()
  apc_vs.Seats(7).ControlledWeapon = 13
  apc_vs.Seats += 8 -> new SeatDefinition()
  apc_vs.Seats(8).ControlledWeapon = 14 
  apc_vs.Seats += 9 -> new SeatDefinition()
  apc_vs.Seats(9).ArmorRestriction = SeatArmorRestriction.MaxOnly
  apc_vs.Seats += 10 -> new SeatDefinition()
  apc_vs.Seats(10).ArmorRestriction = SeatArmorRestriction.MaxOnly
  apc_vs.Weapons += 11 -> apc_weapon_systemc_vs
  apc_vs.Weapons += 12 -> apc_weapon_systemb
  apc_vs.Weapons += 13 -> apc_weapon_systema
  apc_vs.Weapons += 14 -> apc_weapon_systemd_vs
  apc_vs.Weapons += 15 -> apc_ballgun_r
  apc_vs.Weapons += 16 -> apc_ballgun_l
  apc_vs.MountPoints += 1 -> 0
  apc_vs.MountPoints += 2 -> 0
  apc_vs.MountPoints += 3 -> 1
  apc_vs.MountPoints += 4 -> 2
  apc_vs.MountPoints += 5 -> 3
  apc_vs.MountPoints += 6 -> 4
  apc_vs.MountPoints += 7 -> 5
  apc_vs.MountPoints += 8 -> 6
  apc_vs.MountPoints += 9 -> 7
  apc_vs.MountPoints += 10 -> 8
  apc_vs.MountPoints += 11 -> 9
  apc_vs.MountPoints += 12 -> 10
  apc_vs.TrunkSize = InventoryTile.Tile2016
  apc_vs.TrunkOffset = 30

  val
  lightning = VehicleDefinition(ObjectClass.lightning)
  lightning.Seats += 0 -> new SeatDefinition()
  lightning.Seats(0).ArmorRestriction = SeatArmorRestriction.NoReinforcedOrMax
  lightning.Seats(0).ControlledWeapon = 1
  lightning.Weapons += 1 -> lightning_weapon_system
  lightning.MountPoints += 1 -> 0
  lightning.MountPoints += 2 -> 0
  lightning.TrunkSize = InventoryTile.Tile1511
  lightning.TrunkOffset = 30

  val
  prowler = VehicleDefinition(ObjectClass.prowler)
  prowler.Seats += 0 -> new SeatDefinition()
  prowler.Seats(0).ArmorRestriction = SeatArmorRestriction.NoReinforcedOrMax
  prowler.Seats += 1 -> new SeatDefinition()
  prowler.Seats(1).ControlledWeapon = 3
  prowler.Seats += 2 -> new SeatDefinition()
  prowler.Seats(2).ControlledWeapon = 4
  prowler.Weapons += 3 -> prowler_weapon_systemA
  prowler.Weapons += 4 -> prowler_weapon_systemB
  prowler.MountPoints += 1 -> 0
  prowler.MountPoints += 2 -> 1
  prowler.MountPoints += 3 -> 2
  prowler.TrunkSize = InventoryTile.Tile1511
  prowler.TrunkOffset = 30

  val
  vanguard = VehicleDefinition(ObjectClass.vanguard)
  vanguard.Seats += 0 -> new SeatDefinition()
  vanguard.Seats(0).ArmorRestriction = SeatArmorRestriction.NoReinforcedOrMax
  vanguard.Seats += 1 -> new SeatDefinition()
  vanguard.Seats(1).ControlledWeapon = 2
  vanguard.Weapons += 2 -> vanguard_weapon_system
  vanguard.MountPoints += 1 -> 0
  vanguard.MountPoints += 2 -> 1
  vanguard.TrunkSize = InventoryTile.Tile1511
  vanguard.TrunkOffset = 30

  val
  magrider = VehicleDefinition(ObjectClass.magrider)
  magrider.Seats += 0 -> new SeatDefinition()
  magrider.Seats(0).ArmorRestriction = SeatArmorRestriction.NoReinforcedOrMax
  magrider.Seats(0).ControlledWeapon = 2
  magrider.Seats += 1 -> new SeatDefinition()
  magrider.Seats(1).ControlledWeapon = 3
  magrider.Weapons += 2 -> particle_beam_magrider
  magrider.Weapons += 3 -> heavy_rail_beam_magrider
  magrider.MountPoints += 1 -> 0
  magrider.MountPoints += 2 -> 1
  magrider.TrunkSize = InventoryTile.Tile1511
  magrider.TrunkOffset = 30

  private val utilityConverter = new UtilityVehicleConverter
  val
  ant = VehicleDefinition(ObjectClass.ant)
  ant.Seats += 0 -> new SeatDefinition()
  ant.Seats(0).ArmorRestriction = SeatArmorRestriction.NoReinforcedOrMax
  ant.MountPoints += 1 -> 0
  ant.MountPoints += 2 -> 0
  ant.Packet = utilityConverter

  val
  ams = VehicleDefinition(ObjectClass.ams)
  ams.Seats += 0 -> new SeatDefinition()
  ams.Seats(0).ArmorRestriction = SeatArmorRestriction.NoReinforcedOrMax
  ams.MountPoints += 1 -> 0
  ams.MountPoints += 2 -> 0
  ams.Packet = utilityConverter

  private val variantConverter = new VariantVehicleConverter
  val
  router = VehicleDefinition(ObjectClass.router)
  router.Seats += 0 -> new SeatDefinition()
  router.MountPoints += 1 -> 0
  router.TrunkSize = InventoryTile.Tile1511
  router.TrunkOffset = 30
  router.Packet = variantConverter

  val
  switchblade = VehicleDefinition(ObjectClass.switchblade)
  switchblade.Seats += 0 -> new SeatDefinition()
  switchblade.Seats(0).ControlledWeapon = 1
  switchblade.Weapons += 1 -> scythe
  switchblade.MountPoints += 1 -> 0
  switchblade.MountPoints += 2 -> 0
  switchblade.TrunkSize = InventoryTile.Tile1511
  switchblade.TrunkOffset = 30
  switchblade.Packet = variantConverter

  val
  flail = VehicleDefinition(ObjectClass.flail)
  flail.Seats += 0 -> new SeatDefinition()
  flail.Seats(0).ControlledWeapon = 1
  flail.Weapons += 1 -> flail_weapon
  flail.MountPoints += 1 -> 0
  flail.TrunkSize = InventoryTile.Tile1511
  flail.TrunkOffset = 30
  flail.Packet = variantConverter

  val
  mosquito = VehicleDefinition(ObjectClass.mosquito)
  mosquito.Seats += 0 -> new SeatDefinition()
  mosquito.Seats(0).Bailable = true
  mosquito.Seats(0).ControlledWeapon = 1
  mosquito.Weapons += 1 -> rotarychaingun_mosquito
  mosquito.MountPoints += 1 -> 0
  mosquito.MountPoints += 2 -> 0
  mosquito.TrunkSize = InventoryTile.Tile1111
  mosquito.TrunkOffset = 30
  mosquito.Packet = variantConverter

  val
  lightgunship = VehicleDefinition(ObjectClass.lightgunship)
  lightgunship.Seats += 0 -> new SeatDefinition()
  lightgunship.Seats(0).Bailable = true
  lightgunship.Seats(0).ControlledWeapon = 1
  lightgunship.Weapons += 1 -> lightgunship_weapon_system
  lightgunship.MountPoints += 1 -> 0
  lightgunship.MountPoints += 2 -> 0
  lightgunship.TrunkSize = InventoryTile.Tile1511
  lightgunship.TrunkOffset = 30
  lightgunship.Packet = variantConverter

  val
  wasp = VehicleDefinition(ObjectClass.wasp)
  wasp.Seats += 0 -> new SeatDefinition()
  wasp.Seats(0).Bailable = true
  wasp.Seats(0).ControlledWeapon = 1
  wasp.Weapons += 1 -> wasp_weapon_system
  wasp.MountPoints += 1 -> 0
  wasp.MountPoints += 2 -> 0
  wasp.TrunkSize = InventoryTile.Tile1111
  wasp.TrunkOffset = 30
  wasp.Packet = variantConverter

  val
  liberator = VehicleDefinition(ObjectClass.liberator)
  liberator.Seats += 0 -> new SeatDefinition()
  liberator.Seats(0).ControlledWeapon = 3
  liberator.Seats += 1 -> new SeatDefinition()
  liberator.Seats(1).ControlledWeapon = 4
  liberator.Seats += 2 -> new SeatDefinition()
  liberator.Seats(2).ControlledWeapon = 5
  liberator.Weapons += 3 -> liberator_weapon_system
  liberator.Weapons += 4 -> liberator_bomb_bay
  liberator.Weapons += 5 -> liberator_25mm_cannon
  liberator.MountPoints += 1 -> 0
  liberator.MountPoints += 2 -> 1
  liberator.MountPoints += 3 -> 1
  liberator.MountPoints += 4 -> 2
  liberator.TrunkSize = InventoryTile.Tile1515
  liberator.TrunkOffset = 30
  liberator.Packet = variantConverter

  val
  vulture = VehicleDefinition(ObjectClass.vulture)
  vulture.Seats += 0 -> new SeatDefinition()
  vulture.Seats(0).ControlledWeapon = 3
  vulture.Seats += 1 -> new SeatDefinition()
  vulture.Seats(1).ControlledWeapon = 4
  vulture.Seats += 2 -> new SeatDefinition()
  vulture.Seats(2).ControlledWeapon = 5
  vulture.Weapons += 3 -> vulture_nose_weapon_system
  vulture.Weapons += 4 -> vulture_bomb_bay
  vulture.Weapons += 5 -> vulture_tail_cannon
  vulture.MountPoints += 1 -> 0
  vulture.MountPoints += 2 -> 1
  vulture.MountPoints += 3 -> 1
  vulture.MountPoints += 4 -> 2
  vulture.TrunkSize = InventoryTile.Tile1611
  vulture.TrunkOffset = 30
  vulture.Packet = variantConverter

  val
  dropship = VehicleDefinition(ObjectClass.dropship)
  dropship.Seats += 0 -> new SeatDefinition()
  dropship.Seats += 1 -> new SeatDefinition()
  dropship.Seats(1).Bailable = true
  dropship.Seats(1).ControlledWeapon = 12
  dropship.Seats += 2 -> new SeatDefinition()
  dropship.Seats(2).Bailable = true
  dropship.Seats(2).ControlledWeapon = 13
  dropship.Seats += 3 -> new SeatDefinition()
  dropship.Seats(3).Bailable = true
  dropship.Seats += 4 -> new SeatDefinition()
  dropship.Seats(4).Bailable = true
  dropship.Seats += 5 -> new SeatDefinition()
  dropship.Seats(5).Bailable = true
  dropship.Seats += 6 -> new SeatDefinition()
  dropship.Seats(6).Bailable = true
  dropship.Seats += 7 -> new SeatDefinition()
  dropship.Seats(7).Bailable = true
  dropship.Seats += 8 -> new SeatDefinition()
  dropship.Seats(8).Bailable = true
  dropship.Seats += 9 -> new SeatDefinition()
  dropship.Seats(9).Bailable = true
  dropship.Seats(9).ArmorRestriction = SeatArmorRestriction.MaxOnly
  dropship.Seats += 10 -> new SeatDefinition()
  dropship.Seats(10).Bailable = true
  dropship.Seats(10).ArmorRestriction = SeatArmorRestriction.MaxOnly
  dropship.Seats += 11 -> new SeatDefinition()
  dropship.Seats(11).Bailable = true
  dropship.Seats(11).ControlledWeapon = 14
  dropship.Weapons += 12 -> cannon_dropship_20mm
  dropship.Weapons += 13 -> cannon_dropship_20mm
  dropship.Weapons += 14 -> dropship_rear_turret
  dropship.MountPoints += 1 -> 0
  dropship.MountPoints += 2 -> 11
  dropship.MountPoints += 3 -> 1
  dropship.MountPoints += 4 -> 2
  dropship.MountPoints += 5 -> 3
  dropship.MountPoints += 6 -> 4
  dropship.MountPoints += 7 -> 5
  dropship.MountPoints += 8 -> 6
  dropship.MountPoints += 9 -> 7
  dropship.MountPoints += 10 -> 8
  dropship.MountPoints += 11 -> 9
  dropship.MountPoints += 12 -> 10
  dropship.TrunkSize = InventoryTile.Tile1612
  dropship.TrunkOffset = 30
  dropship.Packet = variantConverter

  val
  galaxy_gunship = VehicleDefinition(ObjectClass.galaxy_gunship)
  galaxy_gunship.Seats += 0 -> new SeatDefinition()
  galaxy_gunship.Seats += 1 -> new SeatDefinition()
  galaxy_gunship.Seats(1).ControlledWeapon = 6
  galaxy_gunship.Seats += 2 -> new SeatDefinition()
  galaxy_gunship.Seats(2).ControlledWeapon = 7
  galaxy_gunship.Seats += 3 -> new SeatDefinition()
  galaxy_gunship.Seats(3).ControlledWeapon = 8
  galaxy_gunship.Seats += 4 -> new SeatDefinition()
  galaxy_gunship.Seats(4).ControlledWeapon = 9
  galaxy_gunship.Seats += 5 -> new SeatDefinition()
  galaxy_gunship.Seats(5).ControlledWeapon = 10
  galaxy_gunship.Weapons += 6 -> galaxy_gunship_cannon
  galaxy_gunship.Weapons += 7 -> galaxy_gunship_cannon
  galaxy_gunship.Weapons += 8 -> galaxy_gunship_tailgun
  galaxy_gunship.Weapons += 9 -> galaxy_gunship_gun
  galaxy_gunship.Weapons += 10 -> galaxy_gunship_gun
  galaxy_gunship.MountPoints += 1 -> 0
  galaxy_gunship.MountPoints += 2 -> 3
  galaxy_gunship.MountPoints += 3 -> 1
  galaxy_gunship.MountPoints += 4 -> 2
  galaxy_gunship.MountPoints += 5 -> 4
  galaxy_gunship.MountPoints += 6 -> 5
  galaxy_gunship.TrunkSize = InventoryTile.Tile1816
  galaxy_gunship.TrunkOffset = 30
  galaxy_gunship.Packet = variantConverter

  val
  lodestar = VehicleDefinition(ObjectClass.lodestar)
  lodestar.Seats += 0 -> new SeatDefinition()
  lodestar.MountPoints += 1 -> 0
  lodestar.TrunkSize = InventoryTile.Tile1612
  lodestar.TrunkOffset = 30
  lodestar.Packet = variantConverter

  val
  phantasm = VehicleDefinition(ObjectClass.phantasm)
  phantasm.CanCloak = true
  phantasm.Seats += 0 -> new SeatDefinition()
  phantasm.Seats += 1 -> new SeatDefinition()
  phantasm.Seats(1).Bailable = true
  phantasm.Seats += 2 -> new SeatDefinition()
  phantasm.Seats(2).Bailable = true
  phantasm.Seats += 3 -> new SeatDefinition()
  phantasm.Seats(3).Bailable = true
  phantasm.Seats += 4 -> new SeatDefinition()
  phantasm.Seats(4).Bailable = true
  phantasm.MountPoints += 1 -> 0
  phantasm.MountPoints += 2 -> 1
  phantasm.MountPoints += 3 -> 2
  phantasm.MountPoints += 4 -> 3
  phantasm.MountPoints += 5 -> 4
  phantasm.TrunkSize = InventoryTile.Tile1107
  phantasm.TrunkOffset = 30
  phantasm.Packet = variantConverter

  val
  order_terminal = new OrderTerminalDefinition
  val
  cert_terminal = new CertTerminalDefinition
  val
  ground_vehicle_terminal = new GroundVehicleTerminalDefinition
  val
  air_vehicle_terminal = new AirVehicleTerminalDefinition
  val
  dropship_vehicle_terminal = new DropshipVehicleTerminalDefinition
  val
  vehicle_terminal_combined = new VehicleTerminalCombinedDefinition

  val
  spawn_pad = new ObjectDefinition(800) { Name = "spawn_pad" }

  val
  lock_external = new IFFLockDefinition
  val
  door = new DoorDefinition
}
