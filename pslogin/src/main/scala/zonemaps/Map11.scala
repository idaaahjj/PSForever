package zonemaps

import net.psforever.objects.GlobalDefinitions._
import net.psforever.objects.serverobject.doors.Door
import net.psforever.objects.serverobject.implantmech.ImplantTerminalMech
import net.psforever.objects.serverobject.locks.IFFLock
import net.psforever.objects.serverobject.mblocker.Locker
import net.psforever.objects.serverobject.pad.VehicleSpawnPad
import net.psforever.objects.serverobject.structures.{Building, FoundationBuilder, StructureType, WarpGate}
import net.psforever.objects.serverobject.terminals.{CaptureTerminal, ProximityTerminal, Terminal}
import net.psforever.objects.serverobject.tube.SpawnTube
import net.psforever.objects.serverobject.turret.FacilityTurret
import net.psforever.objects.zones.ZoneMap
import net.psforever.types.Vector3

object Map11 {
  // HOME1 (NEW CONGLOMORATE SANCTUARY)
  val ZoneMap = new ZoneMap("map11") {

    Building37()

    def Building37(): Unit = { // Name: Cyssor_HART Type: orbital_building_nc GUID: 1, MapID: 37
      LocalBuilding(1, 37, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(2258f, 5538f, 65.20142f))))
      LocalObject(371, Door.Constructor(Vector3(2177.802f, 5527.388f, 69.30743f)), owning_building_guid = 1)
      LocalObject(372, Door.Constructor(Vector3(2178.221f, 5551.384f, 69.30743f)), owning_building_guid = 1)
      LocalObject(374, Door.Constructor(Vector3(2337.779f, 5524.616f, 69.30743f)), owning_building_guid = 1)
      LocalObject(375, Door.Constructor(Vector3(2338.198f, 5548.612f, 69.30743f)), owning_building_guid = 1)
      LocalObject(400, Door.Constructor(Vector3(2196.349f, 5539.076f, 69.30743f)), owning_building_guid = 1)
      LocalObject(401, Door.Constructor(Vector3(2196.349f, 5539.076f, 79.30743f)), owning_building_guid = 1)
      LocalObject(402, Door.Constructor(Vector3(2242.84f, 5586.262f, 84.30743f)), owning_building_guid = 1)
      LocalObject(403, Door.Constructor(Vector3(2274.835f, 5585.704f, 84.30743f)), owning_building_guid = 1)
      LocalObject(404, Door.Constructor(Vector3(2319.631f, 5536.924f, 69.30743f)), owning_building_guid = 1)
      LocalObject(405, Door.Constructor(Vector3(2319.631f, 5536.924f, 79.30743f)), owning_building_guid = 1)
      LocalObject(472, Door.Constructor(Vector3(2202.358f, 5558.984f, 79.30743f)), owning_building_guid = 1)
      LocalObject(473, Door.Constructor(Vector3(2314.34f, 5557.01f, 79.30743f)), owning_building_guid = 1)
      LocalObject(478, Door.Constructor(Vector3(2201.799f, 5526.994f, 69.30743f)), owning_building_guid = 1)
      LocalObject(479, Door.Constructor(Vector3(2201.799f, 5526.994f, 79.30743f)), owning_building_guid = 1)
      LocalObject(480, Door.Constructor(Vector3(2202.218f, 5550.991f, 69.30743f)), owning_building_guid = 1)
      LocalObject(481, Door.Constructor(Vector3(2202.218f, 5550.991f, 79.30743f)), owning_building_guid = 1)
      LocalObject(482, Door.Constructor(Vector3(2313.782f, 5525.009f, 69.30743f)), owning_building_guid = 1)
      LocalObject(483, Door.Constructor(Vector3(2313.782f, 5525.009f, 79.30743f)), owning_building_guid = 1)
      LocalObject(484, Door.Constructor(Vector3(2314.201f, 5549.006f, 69.30743f)), owning_building_guid = 1)
      LocalObject(485, Door.Constructor(Vector3(2314.201f, 5549.006f, 79.30743f)), owning_building_guid = 1)
      LocalObject(732, Locker.Constructor(Vector3(2254.307f, 5589.887f, 82.31142f)), owning_building_guid = 1)
      LocalObject(733, Locker.Constructor(Vector3(2255.637f, 5589.864f, 82.31142f)), owning_building_guid = 1)
      LocalObject(734, Locker.Constructor(Vector3(2256.954f, 5589.841f, 82.31142f)), owning_building_guid = 1)
      LocalObject(735, Locker.Constructor(Vector3(2258.229f, 5589.819f, 82.31142f)), owning_building_guid = 1)
      LocalObject(736, Locker.Constructor(Vector3(2259.518f, 5589.796f, 82.31142f)), owning_building_guid = 1)
      LocalObject(737, Locker.Constructor(Vector3(2260.838f, 5589.773f, 82.31142f)), owning_building_guid = 1)
      LocalObject(738, Locker.Constructor(Vector3(2262.18f, 5589.75f, 82.31142f)), owning_building_guid = 1)
      LocalObject(739, Locker.Constructor(Vector3(2263.544f, 5589.726f, 82.31142f)), owning_building_guid = 1)
      LocalObject(162, Terminal.Constructor(cert_terminal), owning_building_guid = 1)
      LocalObject(163, Terminal.Constructor(cert_terminal), owning_building_guid = 1)
      LocalObject(164, Terminal.Constructor(cert_terminal), owning_building_guid = 1)
      LocalObject(165, Terminal.Constructor(cert_terminal), owning_building_guid = 1)
      LocalObject(166, Terminal.Constructor(cert_terminal), owning_building_guid = 1)
      LocalObject(167, Terminal.Constructor(cert_terminal), owning_building_guid = 1)
      LocalObject(168, Terminal.Constructor(cert_terminal), owning_building_guid = 1)
      LocalObject(169, Terminal.Constructor(cert_terminal), owning_building_guid = 1)
      LocalObject(170, Terminal.Constructor(cert_terminal), owning_building_guid = 1)
      LocalObject(171, Terminal.Constructor(cert_terminal), owning_building_guid = 1)
      LocalObject(172, Terminal.Constructor(cert_terminal), owning_building_guid = 1)
      LocalObject(173, Terminal.Constructor(cert_terminal), owning_building_guid = 1)
      LocalObject(174, Terminal.Constructor(cert_terminal), owning_building_guid = 1)
      LocalObject(175, Terminal.Constructor(cert_terminal), owning_building_guid = 1)
      LocalObject(176, Terminal.Constructor(cert_terminal), owning_building_guid = 1)
      LocalObject(177, Terminal.Constructor(cert_terminal), owning_building_guid = 1)
      LocalObject(178, Terminal.Constructor(cert_terminal), owning_building_guid = 1)
      LocalObject(179, Terminal.Constructor(cert_terminal), owning_building_guid = 1)
      LocalObject(180, Terminal.Constructor(cert_terminal), owning_building_guid = 1)
      LocalObject(181, Terminal.Constructor(cert_terminal), owning_building_guid = 1)
      LocalObject(182, Terminal.Constructor(cert_terminal), owning_building_guid = 1)
      LocalObject(183, Terminal.Constructor(cert_terminal), owning_building_guid = 1)
      LocalObject(184, Terminal.Constructor(cert_terminal), owning_building_guid = 1)
      LocalObject(185, Terminal.Constructor(cert_terminal), owning_building_guid = 1)
      LocalObject(855, Terminal.Constructor(order_terminal), owning_building_guid = 1)
      LocalObject(856, Terminal.Constructor(order_terminal), owning_building_guid = 1)
      LocalObject(857, Terminal.Constructor(order_terminal), owning_building_guid = 1)
      LocalObject(858, Terminal.Constructor(order_terminal), owning_building_guid = 1)
      LocalObject(859, Terminal.Constructor(order_terminal), owning_building_guid = 1)
      LocalObject(860, Terminal.Constructor(order_terminal), owning_building_guid = 1)
      LocalObject(861, Terminal.Constructor(order_terminal), owning_building_guid = 1)
      LocalObject(862, Terminal.Constructor(order_terminal), owning_building_guid = 1)
      LocalObject(863, Terminal.Constructor(order_terminal), owning_building_guid = 1)
      LocalObject(864, Terminal.Constructor(order_terminal), owning_building_guid = 1)
      LocalObject(865, Terminal.Constructor(order_terminal), owning_building_guid = 1)
      LocalObject(866, Terminal.Constructor(order_terminal), owning_building_guid = 1)
      LocalObject(867, Terminal.Constructor(order_terminal), owning_building_guid = 1)
      LocalObject(868, Terminal.Constructor(order_terminal), owning_building_guid = 1)
      LocalObject(869, Terminal.Constructor(order_terminal), owning_building_guid = 1)
      LocalObject(870, Terminal.Constructor(order_terminal), owning_building_guid = 1)
      LocalObject(871, Terminal.Constructor(order_terminal), owning_building_guid = 1)
      LocalObject(872, Terminal.Constructor(order_terminal), owning_building_guid = 1)
      LocalObject(873, Terminal.Constructor(order_terminal), owning_building_guid = 1)
      LocalObject(874, Terminal.Constructor(order_terminal), owning_building_guid = 1)
      LocalObject(828, ProximityTerminal.Constructor(medical_terminal, Vector3(2186.923f, 5516.382f, 67.69242f)), owning_building_guid = 1)
      LocalObject(829, ProximityTerminal.Constructor(medical_terminal, Vector3(2187.742f, 5562.079f, 67.69242f)), owning_building_guid = 1)
      LocalObject(830, ProximityTerminal.Constructor(medical_terminal, Vector3(2328.283f, 5513.915f, 67.69242f)), owning_building_guid = 1)
      LocalObject(831, ProximityTerminal.Constructor(medical_terminal, Vector3(2329.019f, 5559.613f, 67.69242f)), owning_building_guid = 1)
      LocalObject(526, ImplantTerminalMech.Constructor, owning_building_guid = 1)
      LocalObject(502, Terminal.Constructor(implant_terminal_interface), owning_building_guid = 1)
      TerminalToInterface(526, 502)
      LocalObject(527, ImplantTerminalMech.Constructor, owning_building_guid = 1)
      LocalObject(503, Terminal.Constructor(implant_terminal_interface), owning_building_guid = 1)
      TerminalToInterface(527, 503)
      LocalObject(528, ImplantTerminalMech.Constructor, owning_building_guid = 1)
      LocalObject(504, Terminal.Constructor(implant_terminal_interface), owning_building_guid = 1)
      TerminalToInterface(528, 504)
      LocalObject(529, ImplantTerminalMech.Constructor, owning_building_guid = 1)
      LocalObject(505, Terminal.Constructor(implant_terminal_interface), owning_building_guid = 1)
      TerminalToInterface(529, 505)
      LocalObject(530, ImplantTerminalMech.Constructor, owning_building_guid = 1)
      LocalObject(506, Terminal.Constructor(implant_terminal_interface), owning_building_guid = 1)
      TerminalToInterface(530, 506)
      LocalObject(531, ImplantTerminalMech.Constructor, owning_building_guid = 1)
      LocalObject(507, Terminal.Constructor(implant_terminal_interface), owning_building_guid = 1)
      TerminalToInterface(531, 507)
      LocalObject(532, ImplantTerminalMech.Constructor, owning_building_guid = 1)
      LocalObject(508, Terminal.Constructor(implant_terminal_interface), owning_building_guid = 1)
      TerminalToInterface(532, 508)
      LocalObject(533, ImplantTerminalMech.Constructor, owning_building_guid = 1)
      LocalObject(509, Terminal.Constructor(implant_terminal_interface), owning_building_guid = 1)
      TerminalToInterface(533, 509)
    }

    Building23()

    def Building23(): Unit = { // Name: Amerish_HART Type: orbital_building_nc GUID: 2, MapID: 23
      LocalBuilding(2, 23, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4152f, 6070f, 43.87661f))))
      LocalObject(382, Door.Constructor(Vector3(4071.802f, 6059.388f, 47.98261f)), owning_building_guid = 2)
      LocalObject(383, Door.Constructor(Vector3(4072.221f, 6083.384f, 47.98261f)), owning_building_guid = 2)
      LocalObject(386, Door.Constructor(Vector3(4231.778f, 6056.616f, 47.98261f)), owning_building_guid = 2)
      LocalObject(387, Door.Constructor(Vector3(4232.197f, 6080.612f, 47.98261f)), owning_building_guid = 2)
      LocalObject(406, Door.Constructor(Vector3(4090.349f, 6071.076f, 47.98261f)), owning_building_guid = 2)
      LocalObject(407, Door.Constructor(Vector3(4090.349f, 6071.076f, 57.98261f)), owning_building_guid = 2)
      LocalObject(408, Door.Constructor(Vector3(4136.84f, 6118.262f, 62.98261f)), owning_building_guid = 2)
      LocalObject(409, Door.Constructor(Vector3(4168.835f, 6117.704f, 62.98261f)), owning_building_guid = 2)
      LocalObject(410, Door.Constructor(Vector3(4213.63f, 6068.924f, 47.98261f)), owning_building_guid = 2)
      LocalObject(411, Door.Constructor(Vector3(4213.63f, 6068.924f, 57.98261f)), owning_building_guid = 2)
      LocalObject(474, Door.Constructor(Vector3(4096.358f, 6090.984f, 57.98261f)), owning_building_guid = 2)
      LocalObject(475, Door.Constructor(Vector3(4208.34f, 6089.01f, 57.98261f)), owning_building_guid = 2)
      LocalObject(486, Door.Constructor(Vector3(4095.799f, 6058.994f, 47.98261f)), owning_building_guid = 2)
      LocalObject(487, Door.Constructor(Vector3(4095.799f, 6058.994f, 57.98261f)), owning_building_guid = 2)
      LocalObject(488, Door.Constructor(Vector3(4096.218f, 6082.991f, 47.98261f)), owning_building_guid = 2)
      LocalObject(489, Door.Constructor(Vector3(4096.218f, 6082.991f, 57.98261f)), owning_building_guid = 2)
      LocalObject(490, Door.Constructor(Vector3(4207.782f, 6057.009f, 47.98261f)), owning_building_guid = 2)
      LocalObject(491, Door.Constructor(Vector3(4207.782f, 6057.009f, 57.98261f)), owning_building_guid = 2)
      LocalObject(492, Door.Constructor(Vector3(4208.201f, 6081.006f, 47.98261f)), owning_building_guid = 2)
      LocalObject(493, Door.Constructor(Vector3(4208.201f, 6081.006f, 57.98261f)), owning_building_guid = 2)
      LocalObject(740, Locker.Constructor(Vector3(4148.307f, 6121.887f, 60.98661f)), owning_building_guid = 2)
      LocalObject(741, Locker.Constructor(Vector3(4149.637f, 6121.864f, 60.98661f)), owning_building_guid = 2)
      LocalObject(742, Locker.Constructor(Vector3(4150.954f, 6121.841f, 60.98661f)), owning_building_guid = 2)
      LocalObject(743, Locker.Constructor(Vector3(4152.229f, 6121.819f, 60.98661f)), owning_building_guid = 2)
      LocalObject(744, Locker.Constructor(Vector3(4153.518f, 6121.796f, 60.98661f)), owning_building_guid = 2)
      LocalObject(745, Locker.Constructor(Vector3(4154.838f, 6121.773f, 60.98661f)), owning_building_guid = 2)
      LocalObject(746, Locker.Constructor(Vector3(4156.18f, 6121.75f, 60.98661f)), owning_building_guid = 2)
      LocalObject(747, Locker.Constructor(Vector3(4157.543f, 6121.726f, 60.98661f)), owning_building_guid = 2)
      LocalObject(186, Terminal.Constructor(cert_terminal), owning_building_guid = 2)
      LocalObject(187, Terminal.Constructor(cert_terminal), owning_building_guid = 2)
      LocalObject(188, Terminal.Constructor(cert_terminal), owning_building_guid = 2)
      LocalObject(189, Terminal.Constructor(cert_terminal), owning_building_guid = 2)
      LocalObject(190, Terminal.Constructor(cert_terminal), owning_building_guid = 2)
      LocalObject(191, Terminal.Constructor(cert_terminal), owning_building_guid = 2)
      LocalObject(192, Terminal.Constructor(cert_terminal), owning_building_guid = 2)
      LocalObject(193, Terminal.Constructor(cert_terminal), owning_building_guid = 2)
      LocalObject(194, Terminal.Constructor(cert_terminal), owning_building_guid = 2)
      LocalObject(195, Terminal.Constructor(cert_terminal), owning_building_guid = 2)
      LocalObject(196, Terminal.Constructor(cert_terminal), owning_building_guid = 2)
      LocalObject(197, Terminal.Constructor(cert_terminal), owning_building_guid = 2)
      LocalObject(198, Terminal.Constructor(cert_terminal), owning_building_guid = 2)
      LocalObject(199, Terminal.Constructor(cert_terminal), owning_building_guid = 2)
      LocalObject(200, Terminal.Constructor(cert_terminal), owning_building_guid = 2)
      LocalObject(201, Terminal.Constructor(cert_terminal), owning_building_guid = 2)
      LocalObject(202, Terminal.Constructor(cert_terminal), owning_building_guid = 2)
      LocalObject(203, Terminal.Constructor(cert_terminal), owning_building_guid = 2)
      LocalObject(204, Terminal.Constructor(cert_terminal), owning_building_guid = 2)
      LocalObject(205, Terminal.Constructor(cert_terminal), owning_building_guid = 2)
      LocalObject(206, Terminal.Constructor(cert_terminal), owning_building_guid = 2)
      LocalObject(207, Terminal.Constructor(cert_terminal), owning_building_guid = 2)
      LocalObject(208, Terminal.Constructor(cert_terminal), owning_building_guid = 2)
      LocalObject(209, Terminal.Constructor(cert_terminal), owning_building_guid = 2)
      LocalObject(905, Terminal.Constructor(order_terminal), owning_building_guid = 2)
      LocalObject(906, Terminal.Constructor(order_terminal), owning_building_guid = 2)
      LocalObject(907, Terminal.Constructor(order_terminal), owning_building_guid = 2)
      LocalObject(908, Terminal.Constructor(order_terminal), owning_building_guid = 2)
      LocalObject(909, Terminal.Constructor(order_terminal), owning_building_guid = 2)
      LocalObject(910, Terminal.Constructor(order_terminal), owning_building_guid = 2)
      LocalObject(911, Terminal.Constructor(order_terminal), owning_building_guid = 2)
      LocalObject(912, Terminal.Constructor(order_terminal), owning_building_guid = 2)
      LocalObject(913, Terminal.Constructor(order_terminal), owning_building_guid = 2)
      LocalObject(914, Terminal.Constructor(order_terminal), owning_building_guid = 2)
      LocalObject(921, Terminal.Constructor(order_terminal), owning_building_guid = 2)
      LocalObject(925, Terminal.Constructor(order_terminal), owning_building_guid = 2)
      LocalObject(926, Terminal.Constructor(order_terminal), owning_building_guid = 2)
      LocalObject(927, Terminal.Constructor(order_terminal), owning_building_guid = 2)
      LocalObject(928, Terminal.Constructor(order_terminal), owning_building_guid = 2)
      LocalObject(929, Terminal.Constructor(order_terminal), owning_building_guid = 2)
      LocalObject(930, Terminal.Constructor(order_terminal), owning_building_guid = 2)
      LocalObject(931, Terminal.Constructor(order_terminal), owning_building_guid = 2)
      LocalObject(935, Terminal.Constructor(order_terminal), owning_building_guid = 2)
      LocalObject(936, Terminal.Constructor(order_terminal), owning_building_guid = 2)
      LocalObject(832, ProximityTerminal.Constructor(medical_terminal, Vector3(4080.923f, 6048.382f, 46.36761f)), owning_building_guid = 2)
      LocalObject(833, ProximityTerminal.Constructor(medical_terminal, Vector3(4081.742f, 6094.079f, 46.36761f)), owning_building_guid = 2)
      LocalObject(834, ProximityTerminal.Constructor(medical_terminal, Vector3(4222.283f, 6045.915f, 46.36761f)), owning_building_guid = 2)
      LocalObject(835, ProximityTerminal.Constructor(medical_terminal, Vector3(4223.019f, 6091.613f, 46.36761f)), owning_building_guid = 2)
      LocalObject(534, ImplantTerminalMech.Constructor, owning_building_guid = 2)
      LocalObject(510, Terminal.Constructor(implant_terminal_interface), owning_building_guid = 2)
      TerminalToInterface(534, 510)
      LocalObject(535, ImplantTerminalMech.Constructor, owning_building_guid = 2)
      LocalObject(511, Terminal.Constructor(implant_terminal_interface), owning_building_guid = 2)
      TerminalToInterface(535, 511)
      LocalObject(536, ImplantTerminalMech.Constructor, owning_building_guid = 2)
      LocalObject(512, Terminal.Constructor(implant_terminal_interface), owning_building_guid = 2)
      TerminalToInterface(536, 512)
      LocalObject(537, ImplantTerminalMech.Constructor, owning_building_guid = 2)
      LocalObject(513, Terminal.Constructor(implant_terminal_interface), owning_building_guid = 2)
      TerminalToInterface(537, 513)
      LocalObject(538, ImplantTerminalMech.Constructor, owning_building_guid = 2)
      LocalObject(514, Terminal.Constructor(implant_terminal_interface), owning_building_guid = 2)
      TerminalToInterface(538, 514)
      LocalObject(539, ImplantTerminalMech.Constructor, owning_building_guid = 2)
      LocalObject(515, Terminal.Constructor(implant_terminal_interface), owning_building_guid = 2)
      TerminalToInterface(539, 515)
      LocalObject(540, ImplantTerminalMech.Constructor, owning_building_guid = 2)
      LocalObject(516, Terminal.Constructor(implant_terminal_interface), owning_building_guid = 2)
      TerminalToInterface(540, 516)
      LocalObject(541, ImplantTerminalMech.Constructor, owning_building_guid = 2)
      LocalObject(517, Terminal.Constructor(implant_terminal_interface), owning_building_guid = 2)
      TerminalToInterface(541, 517)
    }

    Building4()

    def Building4(): Unit = { // Name: Esamir_HART Type: orbital_building_nc GUID: 3, MapID: 4
      LocalBuilding(3, 4, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4816f, 3506f, 68.73806f))))
      LocalObject(394, Door.Constructor(Vector3(4750.953f, 3457.91f, 72.84406f)), owning_building_guid = 3)
      LocalObject(395, Door.Constructor(Vector3(4767.924f, 3440.939f, 72.84406f)), owning_building_guid = 3)
      LocalObject(396, Door.Constructor(Vector3(4864.076f, 3571.061f, 72.84406f)), owning_building_guid = 3)
      LocalObject(397, Door.Constructor(Vector3(4881.047f, 3554.09f, 72.84406f)), owning_building_guid = 3)
      LocalObject(412, Door.Constructor(Vector3(4772.414f, 3462.414f, 72.84406f)), owning_building_guid = 3)
      LocalObject(413, Door.Constructor(Vector3(4772.414f, 3462.414f, 82.84406f)), owning_building_guid = 3)
      LocalObject(414, Door.Constructor(Vector3(4838.62f, 3460.752f, 87.84406f)), owning_building_guid = 3)
      LocalObject(415, Door.Constructor(Vector3(4859.6f, 3549.6f, 72.84406f)), owning_building_guid = 3)
      LocalObject(416, Door.Constructor(Vector3(4859.6f, 3549.6f, 82.84406f)), owning_building_guid = 3)
      LocalObject(417, Door.Constructor(Vector3(4861.248f, 3483.38f, 87.84406f)), owning_building_guid = 3)
      LocalObject(476, Door.Constructor(Vector3(4790.537f, 3452.267f, 82.84406f)), owning_building_guid = 3)
      LocalObject(477, Door.Constructor(Vector3(4869.747f, 3531.449f, 82.84406f)), owning_building_guid = 3)
      LocalObject(494, Door.Constructor(Vector3(4767.906f, 3474.898f, 72.84406f)), owning_building_guid = 3)
      LocalObject(495, Door.Constructor(Vector3(4767.906f, 3474.898f, 82.84406f)), owning_building_guid = 3)
      LocalObject(496, Door.Constructor(Vector3(4784.876f, 3457.927f, 72.84406f)), owning_building_guid = 3)
      LocalObject(497, Door.Constructor(Vector3(4784.876f, 3457.927f, 82.84406f)), owning_building_guid = 3)
      LocalObject(498, Door.Constructor(Vector3(4847.124f, 3554.073f, 72.84406f)), owning_building_guid = 3)
      LocalObject(499, Door.Constructor(Vector3(4847.124f, 3554.073f, 82.84406f)), owning_building_guid = 3)
      LocalObject(500, Door.Constructor(Vector3(4864.094f, 3537.102f, 72.84406f)), owning_building_guid = 3)
      LocalObject(501, Door.Constructor(Vector3(4864.094f, 3537.102f, 82.84406f)), owning_building_guid = 3)
      LocalObject(748, Locker.Constructor(Vector3(4849.358f, 3466.08f, 85.84806f)), owning_building_guid = 3)
      LocalObject(749, Locker.Constructor(Vector3(4850.322f, 3467.045f, 85.84806f)), owning_building_guid = 3)
      LocalObject(750, Locker.Constructor(Vector3(4851.271f, 3467.994f, 85.84806f)), owning_building_guid = 3)
      LocalObject(751, Locker.Constructor(Vector3(4852.205f, 3468.927f, 85.84806f)), owning_building_guid = 3)
      LocalObject(752, Locker.Constructor(Vector3(4853.116f, 3469.839f, 85.84806f)), owning_building_guid = 3)
      LocalObject(753, Locker.Constructor(Vector3(4854.018f, 3470.741f, 85.84806f)), owning_building_guid = 3)
      LocalObject(754, Locker.Constructor(Vector3(4854.95f, 3471.672f, 85.84806f)), owning_building_guid = 3)
      LocalObject(755, Locker.Constructor(Vector3(4855.89f, 3472.613f, 85.84806f)), owning_building_guid = 3)
      LocalObject(210, Terminal.Constructor(cert_terminal), owning_building_guid = 3)
      LocalObject(211, Terminal.Constructor(cert_terminal), owning_building_guid = 3)
      LocalObject(212, Terminal.Constructor(cert_terminal), owning_building_guid = 3)
      LocalObject(213, Terminal.Constructor(cert_terminal), owning_building_guid = 3)
      LocalObject(214, Terminal.Constructor(cert_terminal), owning_building_guid = 3)
      LocalObject(215, Terminal.Constructor(cert_terminal), owning_building_guid = 3)
      LocalObject(216, Terminal.Constructor(cert_terminal), owning_building_guid = 3)
      LocalObject(217, Terminal.Constructor(cert_terminal), owning_building_guid = 3)
      LocalObject(218, Terminal.Constructor(cert_terminal), owning_building_guid = 3)
      LocalObject(219, Terminal.Constructor(cert_terminal), owning_building_guid = 3)
      LocalObject(220, Terminal.Constructor(cert_terminal), owning_building_guid = 3)
      LocalObject(221, Terminal.Constructor(cert_terminal), owning_building_guid = 3)
      LocalObject(222, Terminal.Constructor(cert_terminal), owning_building_guid = 3)
      LocalObject(223, Terminal.Constructor(cert_terminal), owning_building_guid = 3)
      LocalObject(224, Terminal.Constructor(cert_terminal), owning_building_guid = 3)
      LocalObject(225, Terminal.Constructor(cert_terminal), owning_building_guid = 3)
      LocalObject(226, Terminal.Constructor(cert_terminal), owning_building_guid = 3)
      LocalObject(227, Terminal.Constructor(cert_terminal), owning_building_guid = 3)
      LocalObject(228, Terminal.Constructor(cert_terminal), owning_building_guid = 3)
      LocalObject(229, Terminal.Constructor(cert_terminal), owning_building_guid = 3)
      LocalObject(230, Terminal.Constructor(cert_terminal), owning_building_guid = 3)
      LocalObject(231, Terminal.Constructor(cert_terminal), owning_building_guid = 3)
      LocalObject(232, Terminal.Constructor(cert_terminal), owning_building_guid = 3)
      LocalObject(233, Terminal.Constructor(cert_terminal), owning_building_guid = 3)
      LocalObject(961, Terminal.Constructor(order_terminal), owning_building_guid = 3)
      LocalObject(962, Terminal.Constructor(order_terminal), owning_building_guid = 3)
      LocalObject(963, Terminal.Constructor(order_terminal), owning_building_guid = 3)
      LocalObject(964, Terminal.Constructor(order_terminal), owning_building_guid = 3)
      LocalObject(965, Terminal.Constructor(order_terminal), owning_building_guid = 3)
      LocalObject(966, Terminal.Constructor(order_terminal), owning_building_guid = 3)
      LocalObject(967, Terminal.Constructor(order_terminal), owning_building_guid = 3)
      LocalObject(968, Terminal.Constructor(order_terminal), owning_building_guid = 3)
      LocalObject(969, Terminal.Constructor(order_terminal), owning_building_guid = 3)
      LocalObject(970, Terminal.Constructor(order_terminal), owning_building_guid = 3)
      LocalObject(971, Terminal.Constructor(order_terminal), owning_building_guid = 3)
      LocalObject(972, Terminal.Constructor(order_terminal), owning_building_guid = 3)
      LocalObject(973, Terminal.Constructor(order_terminal), owning_building_guid = 3)
      LocalObject(974, Terminal.Constructor(order_terminal), owning_building_guid = 3)
      LocalObject(975, Terminal.Constructor(order_terminal), owning_building_guid = 3)
      LocalObject(976, Terminal.Constructor(order_terminal), owning_building_guid = 3)
      LocalObject(977, Terminal.Constructor(order_terminal), owning_building_guid = 3)
      LocalObject(978, Terminal.Constructor(order_terminal), owning_building_guid = 3)
      LocalObject(979, Terminal.Constructor(order_terminal), owning_building_guid = 3)
      LocalObject(980, Terminal.Constructor(order_terminal), owning_building_guid = 3)
      LocalObject(836, ProximityTerminal.Constructor(medical_terminal, Vector3(4749.852f, 3472.173f, 71.22906f)), owning_building_guid = 3)
      LocalObject(837, ProximityTerminal.Constructor(medical_terminal, Vector3(4782.213f, 3439.9f, 71.22906f)), owning_building_guid = 3)
      LocalObject(838, ProximityTerminal.Constructor(medical_terminal, Vector3(4849.824f, 3572.146f, 71.22906f)), owning_building_guid = 3)
      LocalObject(839, ProximityTerminal.Constructor(medical_terminal, Vector3(4882.126f, 3539.812f, 71.22906f)), owning_building_guid = 3)
      LocalObject(542, ImplantTerminalMech.Constructor, owning_building_guid = 3)
      LocalObject(518, Terminal.Constructor(implant_terminal_interface), owning_building_guid = 3)
      TerminalToInterface(542, 518)
      LocalObject(543, ImplantTerminalMech.Constructor, owning_building_guid = 3)
      LocalObject(519, Terminal.Constructor(implant_terminal_interface), owning_building_guid = 3)
      TerminalToInterface(543, 519)
      LocalObject(544, ImplantTerminalMech.Constructor, owning_building_guid = 3)
      LocalObject(520, Terminal.Constructor(implant_terminal_interface), owning_building_guid = 3)
      TerminalToInterface(544, 520)
      LocalObject(545, ImplantTerminalMech.Constructor, owning_building_guid = 3)
      LocalObject(521, Terminal.Constructor(implant_terminal_interface), owning_building_guid = 3)
      TerminalToInterface(545, 521)
      LocalObject(546, ImplantTerminalMech.Constructor, owning_building_guid = 3)
      LocalObject(522, Terminal.Constructor(implant_terminal_interface), owning_building_guid = 3)
      TerminalToInterface(546, 522)
      LocalObject(547, ImplantTerminalMech.Constructor, owning_building_guid = 3)
      LocalObject(523, Terminal.Constructor(implant_terminal_interface), owning_building_guid = 3)
      TerminalToInterface(547, 523)
      LocalObject(548, ImplantTerminalMech.Constructor, owning_building_guid = 3)
      LocalObject(524, Terminal.Constructor(implant_terminal_interface), owning_building_guid = 3)
      TerminalToInterface(548, 524)
      LocalObject(549, ImplantTerminalMech.Constructor, owning_building_guid = 3)
      LocalObject(525, Terminal.Constructor(implant_terminal_interface), owning_building_guid = 3)
      TerminalToInterface(549, 525)
    }

    Building50()

    def Building50(): Unit = { // Name: nc_SW_Cyssor_Warpgate_Tower Type: tower_a GUID: 28, MapID: 50
      LocalBuilding(28, 50, FoundationBuilder(Building.Structure(StructureType.Tower, Vector3(1980f, 5718f, 55.22141f))))
      LocalObject(1094, CaptureTerminal.Constructor(secondary_capture), owning_building_guid = 28)
      LocalObject(316, Door.Constructor(Vector3(1992f, 5710f, 56.74241f)), owning_building_guid = 28)
      LocalObject(317, Door.Constructor(Vector3(1992f, 5710f, 76.74141f)), owning_building_guid = 28)
      LocalObject(318, Door.Constructor(Vector3(1992f, 5726f, 56.74241f)), owning_building_guid = 28)
      LocalObject(319, Door.Constructor(Vector3(1992f, 5726f, 76.74141f)), owning_building_guid = 28)
      LocalObject(1108, Door.Constructor(Vector3(1991.146f, 5706.794f, 46.55741f)), owning_building_guid = 28)
      LocalObject(1109, Door.Constructor(Vector3(1991.146f, 5723.204f, 46.55741f)), owning_building_guid = 28)
      LocalObject(552, IFFLock.Constructor(Vector3(1989.957f, 5726.811f, 56.68241f), Vector3(0, 0, 0)), owning_building_guid = 28, door_guid = 318)
      LocalObject(553, IFFLock.Constructor(Vector3(1989.957f, 5726.811f, 76.68241f), Vector3(0, 0, 0)), owning_building_guid = 28, door_guid = 319)
      LocalObject(556, IFFLock.Constructor(Vector3(1994.047f, 5709.189f, 56.68241f), Vector3(0, 0, 180)), owning_building_guid = 28, door_guid = 316)
      LocalObject(557, IFFLock.Constructor(Vector3(1994.047f, 5709.189f, 76.68241f), Vector3(0, 0, 180)), owning_building_guid = 28, door_guid = 317)
      LocalObject(612, Locker.Constructor(Vector3(1995.716f, 5702.963f, 45.21541f)), owning_building_guid = 28)
      LocalObject(613, Locker.Constructor(Vector3(1995.751f, 5724.835f, 45.21541f)), owning_building_guid = 28)
      LocalObject(614, Locker.Constructor(Vector3(1997.053f, 5702.963f, 45.21541f)), owning_building_guid = 28)
      LocalObject(615, Locker.Constructor(Vector3(1997.088f, 5724.835f, 45.21541f)), owning_building_guid = 28)
      LocalObject(620, Locker.Constructor(Vector3(1999.741f, 5702.963f, 45.21541f)), owning_building_guid = 28)
      LocalObject(621, Locker.Constructor(Vector3(1999.741f, 5724.835f, 45.21541f)), owning_building_guid = 28)
      LocalObject(622, Locker.Constructor(Vector3(2001.143f, 5702.963f, 45.21541f)), owning_building_guid = 28)
      LocalObject(623, Locker.Constructor(Vector3(2001.143f, 5724.835f, 45.21541f)), owning_building_guid = 28)
      LocalObject(846, Terminal.Constructor(order_terminal), owning_building_guid = 28)
      LocalObject(847, Terminal.Constructor(order_terminal), owning_building_guid = 28)
      LocalObject(848, Terminal.Constructor(order_terminal), owning_building_guid = 28)
      LocalObject(1069, SpawnTube.Constructor(respawn_tube_tower, Vector3(1990.706f, 5705.742f, 44.70341f), Vector3(0, 0, 0)), owning_building_guid = 28)
      LocalObject(1070, SpawnTube.Constructor(respawn_tube_tower, Vector3(1990.706f, 5722.152f, 44.70341f), Vector3(0, 0, 0)), owning_building_guid = 28)
      LocalObject(713, FacilityTurret.Constructor(manned_turret, Vector3(1967.32f, 5705.295f, 74.16341f)), owning_building_guid = 28)
      TurretToWeapon(713, 5000)
      LocalObject(715, FacilityTurret.Constructor(manned_turret, Vector3(2002.647f, 5730.707f, 74.16341f)), owning_building_guid = 28)
      TurretToWeapon(715, 5001)
    }

    Building54()

    def Building54(): Unit = { // Name: nc_Far_Cyssor_Tower Type: tower_a GUID: 29, MapID: 54
      LocalBuilding(29, 54, FoundationBuilder(Building.Structure(StructureType.Tower, Vector3(2940f, 5192f, 47.96524f))))
      LocalObject(1096, CaptureTerminal.Constructor(secondary_capture), owning_building_guid = 29)
      LocalObject(326, Door.Constructor(Vector3(2952f, 5184f, 49.48624f)), owning_building_guid = 29)
      LocalObject(327, Door.Constructor(Vector3(2952f, 5184f, 69.48524f)), owning_building_guid = 29)
      LocalObject(328, Door.Constructor(Vector3(2952f, 5200f, 49.48624f)), owning_building_guid = 29)
      LocalObject(329, Door.Constructor(Vector3(2952f, 5200f, 69.48524f)), owning_building_guid = 29)
      LocalObject(1112, Door.Constructor(Vector3(2951.146f, 5180.794f, 39.30124f)), owning_building_guid = 29)
      LocalObject(1113, Door.Constructor(Vector3(2951.146f, 5197.204f, 39.30124f)), owning_building_guid = 29)
      LocalObject(564, IFFLock.Constructor(Vector3(2949.957f, 5200.811f, 49.42624f), Vector3(0, 0, 0)), owning_building_guid = 29, door_guid = 328)
      LocalObject(565, IFFLock.Constructor(Vector3(2949.957f, 5200.811f, 69.42624f), Vector3(0, 0, 0)), owning_building_guid = 29, door_guid = 329)
      LocalObject(566, IFFLock.Constructor(Vector3(2954.047f, 5183.189f, 49.42624f), Vector3(0, 0, 180)), owning_building_guid = 29, door_guid = 326)
      LocalObject(567, IFFLock.Constructor(Vector3(2954.047f, 5183.189f, 69.42624f), Vector3(0, 0, 180)), owning_building_guid = 29, door_guid = 327)
      LocalObject(632, Locker.Constructor(Vector3(2955.716f, 5176.963f, 37.95924f)), owning_building_guid = 29)
      LocalObject(633, Locker.Constructor(Vector3(2955.751f, 5198.835f, 37.95924f)), owning_building_guid = 29)
      LocalObject(634, Locker.Constructor(Vector3(2957.053f, 5176.963f, 37.95924f)), owning_building_guid = 29)
      LocalObject(635, Locker.Constructor(Vector3(2957.088f, 5198.835f, 37.95924f)), owning_building_guid = 29)
      LocalObject(636, Locker.Constructor(Vector3(2959.741f, 5176.963f, 37.95924f)), owning_building_guid = 29)
      LocalObject(637, Locker.Constructor(Vector3(2959.741f, 5198.835f, 37.95924f)), owning_building_guid = 29)
      LocalObject(638, Locker.Constructor(Vector3(2961.143f, 5176.963f, 37.95924f)), owning_building_guid = 29)
      LocalObject(639, Locker.Constructor(Vector3(2961.143f, 5198.835f, 37.95924f)), owning_building_guid = 29)
      LocalObject(890, Terminal.Constructor(order_terminal), owning_building_guid = 29)
      LocalObject(891, Terminal.Constructor(order_terminal), owning_building_guid = 29)
      LocalObject(892, Terminal.Constructor(order_terminal), owning_building_guid = 29)
      LocalObject(1073, SpawnTube.Constructor(respawn_tube_tower, Vector3(2950.706f, 5179.742f, 37.44724f), Vector3(0, 0, 0)), owning_building_guid = 29)
      LocalObject(1074, SpawnTube.Constructor(respawn_tube_tower, Vector3(2950.706f, 5196.152f, 37.44724f), Vector3(0, 0, 0)), owning_building_guid = 29)
      LocalObject(716, FacilityTurret.Constructor(manned_turret, Vector3(2927.32f, 5179.295f, 66.90723f)), owning_building_guid = 29)
      TurretToWeapon(716, 5002)
      LocalObject(717, FacilityTurret.Constructor(manned_turret, Vector3(2962.647f, 5204.707f, 66.90723f)), owning_building_guid = 29)
      TurretToWeapon(717, 5003)
    }

    Building55()

    def Building55(): Unit = { // Name: nc_Far_Amerish_Tower Type: tower_a GUID: 30, MapID: 55
      LocalBuilding(30, 55, FoundationBuilder(Building.Structure(StructureType.Tower, Vector3(4206f, 5296f, 67.51106f))))
      LocalObject(1100, CaptureTerminal.Constructor(secondary_capture), owning_building_guid = 30)
      LocalObject(344, Door.Constructor(Vector3(4218f, 5288f, 69.03207f)), owning_building_guid = 30)
      LocalObject(345, Door.Constructor(Vector3(4218f, 5288f, 89.03107f)), owning_building_guid = 30)
      LocalObject(346, Door.Constructor(Vector3(4218f, 5304f, 69.03207f)), owning_building_guid = 30)
      LocalObject(347, Door.Constructor(Vector3(4218f, 5304f, 89.03107f)), owning_building_guid = 30)
      LocalObject(1120, Door.Constructor(Vector3(4217.146f, 5284.794f, 58.84706f)), owning_building_guid = 30)
      LocalObject(1121, Door.Constructor(Vector3(4217.146f, 5301.204f, 58.84706f)), owning_building_guid = 30)
      LocalObject(582, IFFLock.Constructor(Vector3(4215.957f, 5304.811f, 68.97206f), Vector3(0, 0, 0)), owning_building_guid = 30, door_guid = 346)
      LocalObject(583, IFFLock.Constructor(Vector3(4215.957f, 5304.811f, 88.97206f), Vector3(0, 0, 0)), owning_building_guid = 30, door_guid = 347)
      LocalObject(584, IFFLock.Constructor(Vector3(4220.047f, 5287.189f, 68.97206f), Vector3(0, 0, 180)), owning_building_guid = 30, door_guid = 344)
      LocalObject(585, IFFLock.Constructor(Vector3(4220.047f, 5287.189f, 88.97206f), Vector3(0, 0, 180)), owning_building_guid = 30, door_guid = 345)
      LocalObject(664, Locker.Constructor(Vector3(4221.716f, 5280.963f, 57.50506f)), owning_building_guid = 30)
      LocalObject(665, Locker.Constructor(Vector3(4221.751f, 5302.835f, 57.50506f)), owning_building_guid = 30)
      LocalObject(666, Locker.Constructor(Vector3(4223.053f, 5280.963f, 57.50506f)), owning_building_guid = 30)
      LocalObject(667, Locker.Constructor(Vector3(4223.088f, 5302.835f, 57.50506f)), owning_building_guid = 30)
      LocalObject(668, Locker.Constructor(Vector3(4225.741f, 5280.963f, 57.50506f)), owning_building_guid = 30)
      LocalObject(669, Locker.Constructor(Vector3(4225.741f, 5302.835f, 57.50506f)), owning_building_guid = 30)
      LocalObject(670, Locker.Constructor(Vector3(4227.143f, 5280.963f, 57.50506f)), owning_building_guid = 30)
      LocalObject(671, Locker.Constructor(Vector3(4227.143f, 5302.835f, 57.50506f)), owning_building_guid = 30)
      LocalObject(932, Terminal.Constructor(order_terminal), owning_building_guid = 30)
      LocalObject(933, Terminal.Constructor(order_terminal), owning_building_guid = 30)
      LocalObject(934, Terminal.Constructor(order_terminal), owning_building_guid = 30)
      LocalObject(1081, SpawnTube.Constructor(respawn_tube_tower, Vector3(4216.706f, 5283.742f, 56.99306f), Vector3(0, 0, 0)), owning_building_guid = 30)
      LocalObject(1082, SpawnTube.Constructor(respawn_tube_tower, Vector3(4216.706f, 5300.152f, 56.99306f), Vector3(0, 0, 0)), owning_building_guid = 30)
      LocalObject(722, FacilityTurret.Constructor(manned_turret, Vector3(4193.32f, 5283.295f, 86.45306f)), owning_building_guid = 30)
      TurretToWeapon(722, 5004)
      LocalObject(724, FacilityTurret.Constructor(manned_turret, Vector3(4228.647f, 5308.707f, 86.45306f)), owning_building_guid = 30)
      TurretToWeapon(724, 5005)
    }

    Building44()

    def Building44(): Unit = { // Name: nc_Far_Esamir_Tower Type: tower_a GUID: 31, MapID: 44
      LocalBuilding(31, 44, FoundationBuilder(Building.Structure(StructureType.Tower, Vector3(4228f, 3982f, 63.52824f))))
      LocalObject(1101, CaptureTerminal.Constructor(secondary_capture), owning_building_guid = 31)
      LocalObject(348, Door.Constructor(Vector3(4240f, 3974f, 65.04925f)), owning_building_guid = 31)
      LocalObject(349, Door.Constructor(Vector3(4240f, 3974f, 85.04825f)), owning_building_guid = 31)
      LocalObject(350, Door.Constructor(Vector3(4240f, 3990f, 65.04925f)), owning_building_guid = 31)
      LocalObject(351, Door.Constructor(Vector3(4240f, 3990f, 85.04825f)), owning_building_guid = 31)
      LocalObject(1122, Door.Constructor(Vector3(4239.146f, 3970.794f, 54.86424f)), owning_building_guid = 31)
      LocalObject(1123, Door.Constructor(Vector3(4239.146f, 3987.204f, 54.86424f)), owning_building_guid = 31)
      LocalObject(586, IFFLock.Constructor(Vector3(4237.957f, 3990.811f, 64.98924f), Vector3(0, 0, 0)), owning_building_guid = 31, door_guid = 350)
      LocalObject(587, IFFLock.Constructor(Vector3(4237.957f, 3990.811f, 84.98924f), Vector3(0, 0, 0)), owning_building_guid = 31, door_guid = 351)
      LocalObject(588, IFFLock.Constructor(Vector3(4242.047f, 3973.189f, 64.98924f), Vector3(0, 0, 180)), owning_building_guid = 31, door_guid = 348)
      LocalObject(589, IFFLock.Constructor(Vector3(4242.047f, 3973.189f, 84.98924f), Vector3(0, 0, 180)), owning_building_guid = 31, door_guid = 349)
      LocalObject(672, Locker.Constructor(Vector3(4243.716f, 3966.963f, 53.52224f)), owning_building_guid = 31)
      LocalObject(673, Locker.Constructor(Vector3(4243.751f, 3988.835f, 53.52224f)), owning_building_guid = 31)
      LocalObject(674, Locker.Constructor(Vector3(4245.053f, 3966.963f, 53.52224f)), owning_building_guid = 31)
      LocalObject(675, Locker.Constructor(Vector3(4245.088f, 3988.835f, 53.52224f)), owning_building_guid = 31)
      LocalObject(676, Locker.Constructor(Vector3(4247.741f, 3966.963f, 53.52224f)), owning_building_guid = 31)
      LocalObject(677, Locker.Constructor(Vector3(4247.741f, 3988.835f, 53.52224f)), owning_building_guid = 31)
      LocalObject(678, Locker.Constructor(Vector3(4249.143f, 3966.963f, 53.52224f)), owning_building_guid = 31)
      LocalObject(679, Locker.Constructor(Vector3(4249.143f, 3988.835f, 53.52224f)), owning_building_guid = 31)
      LocalObject(937, Terminal.Constructor(order_terminal), owning_building_guid = 31)
      LocalObject(938, Terminal.Constructor(order_terminal), owning_building_guid = 31)
      LocalObject(939, Terminal.Constructor(order_terminal), owning_building_guid = 31)
      LocalObject(1083, SpawnTube.Constructor(respawn_tube_tower, Vector3(4238.706f, 3969.742f, 53.01025f), Vector3(0, 0, 0)), owning_building_guid = 31)
      LocalObject(1084, SpawnTube.Constructor(respawn_tube_tower, Vector3(4238.706f, 3986.152f, 53.01025f), Vector3(0, 0, 0)), owning_building_guid = 31)
      LocalObject(723, FacilityTurret.Constructor(manned_turret, Vector3(4215.32f, 3969.295f, 82.47025f)), owning_building_guid = 31)
      TurretToWeapon(723, 5006)
      LocalObject(725, FacilityTurret.Constructor(manned_turret, Vector3(4250.647f, 3994.707f, 82.47025f)), owning_building_guid = 31)
      TurretToWeapon(725, 5007)
    }

    Building48()

    def Building48(): Unit = { // Name: nc_SE_Amerish_Warpgate_Tower Type: tower_a GUID: 32, MapID: 48
      LocalBuilding(32, 48, FoundationBuilder(Building.Structure(StructureType.Tower, Vector3(4458f, 6256f, 43.92254f))))
      LocalObject(1102, CaptureTerminal.Constructor(secondary_capture), owning_building_guid = 32)
      LocalObject(352, Door.Constructor(Vector3(4470f, 6248f, 45.44354f)), owning_building_guid = 32)
      LocalObject(353, Door.Constructor(Vector3(4470f, 6248f, 65.44254f)), owning_building_guid = 32)
      LocalObject(354, Door.Constructor(Vector3(4470f, 6264f, 45.44354f)), owning_building_guid = 32)
      LocalObject(355, Door.Constructor(Vector3(4470f, 6264f, 65.44254f)), owning_building_guid = 32)
      LocalObject(1124, Door.Constructor(Vector3(4469.146f, 6244.794f, 35.25854f)), owning_building_guid = 32)
      LocalObject(1125, Door.Constructor(Vector3(4469.146f, 6261.204f, 35.25854f)), owning_building_guid = 32)
      LocalObject(590, IFFLock.Constructor(Vector3(4467.957f, 6264.811f, 45.38354f), Vector3(0, 0, 0)), owning_building_guid = 32, door_guid = 354)
      LocalObject(591, IFFLock.Constructor(Vector3(4467.957f, 6264.811f, 65.38354f), Vector3(0, 0, 0)), owning_building_guid = 32, door_guid = 355)
      LocalObject(592, IFFLock.Constructor(Vector3(4472.047f, 6247.189f, 45.38354f), Vector3(0, 0, 180)), owning_building_guid = 32, door_guid = 352)
      LocalObject(593, IFFLock.Constructor(Vector3(4472.047f, 6247.189f, 65.38354f), Vector3(0, 0, 180)), owning_building_guid = 32, door_guid = 353)
      LocalObject(680, Locker.Constructor(Vector3(4473.716f, 6240.963f, 33.91654f)), owning_building_guid = 32)
      LocalObject(681, Locker.Constructor(Vector3(4473.751f, 6262.835f, 33.91654f)), owning_building_guid = 32)
      LocalObject(682, Locker.Constructor(Vector3(4475.053f, 6240.963f, 33.91654f)), owning_building_guid = 32)
      LocalObject(683, Locker.Constructor(Vector3(4475.088f, 6262.835f, 33.91654f)), owning_building_guid = 32)
      LocalObject(684, Locker.Constructor(Vector3(4477.741f, 6240.963f, 33.91654f)), owning_building_guid = 32)
      LocalObject(685, Locker.Constructor(Vector3(4477.741f, 6262.835f, 33.91654f)), owning_building_guid = 32)
      LocalObject(686, Locker.Constructor(Vector3(4479.143f, 6240.963f, 33.91654f)), owning_building_guid = 32)
      LocalObject(687, Locker.Constructor(Vector3(4479.143f, 6262.835f, 33.91654f)), owning_building_guid = 32)
      LocalObject(946, Terminal.Constructor(order_terminal), owning_building_guid = 32)
      LocalObject(947, Terminal.Constructor(order_terminal), owning_building_guid = 32)
      LocalObject(948, Terminal.Constructor(order_terminal), owning_building_guid = 32)
      LocalObject(1085, SpawnTube.Constructor(respawn_tube_tower, Vector3(4468.706f, 6243.742f, 33.40454f), Vector3(0, 0, 0)), owning_building_guid = 32)
      LocalObject(1086, SpawnTube.Constructor(respawn_tube_tower, Vector3(4468.706f, 6260.152f, 33.40454f), Vector3(0, 0, 0)), owning_building_guid = 32)
      LocalObject(726, FacilityTurret.Constructor(manned_turret, Vector3(4445.32f, 6243.295f, 62.86454f)), owning_building_guid = 32)
      TurretToWeapon(726, 5008)
      LocalObject(727, FacilityTurret.Constructor(manned_turret, Vector3(4480.647f, 6268.707f, 62.86454f)), owning_building_guid = 32)
      TurretToWeapon(727, 5009)
    }

    Building46()

    def Building46(): Unit = { // Name: nc_W_Esamir_Warpgate_Tower Type: tower_a GUID: 33, MapID: 46
      LocalBuilding(33, 46, FoundationBuilder(Building.Structure(StructureType.Tower, Vector3(4886f, 3164f, 48.7764f))))
      LocalObject(1103, CaptureTerminal.Constructor(secondary_capture), owning_building_guid = 33)
      LocalObject(356, Door.Constructor(Vector3(4898f, 3156f, 50.2974f)), owning_building_guid = 33)
      LocalObject(357, Door.Constructor(Vector3(4898f, 3156f, 70.2964f)), owning_building_guid = 33)
      LocalObject(358, Door.Constructor(Vector3(4898f, 3172f, 50.2974f)), owning_building_guid = 33)
      LocalObject(359, Door.Constructor(Vector3(4898f, 3172f, 70.2964f)), owning_building_guid = 33)
      LocalObject(1126, Door.Constructor(Vector3(4897.146f, 3152.794f, 40.1124f)), owning_building_guid = 33)
      LocalObject(1127, Door.Constructor(Vector3(4897.146f, 3169.204f, 40.1124f)), owning_building_guid = 33)
      LocalObject(594, IFFLock.Constructor(Vector3(4895.957f, 3172.811f, 50.2374f), Vector3(0, 0, 0)), owning_building_guid = 33, door_guid = 358)
      LocalObject(595, IFFLock.Constructor(Vector3(4895.957f, 3172.811f, 70.2374f), Vector3(0, 0, 0)), owning_building_guid = 33, door_guid = 359)
      LocalObject(596, IFFLock.Constructor(Vector3(4900.047f, 3155.189f, 50.2374f), Vector3(0, 0, 180)), owning_building_guid = 33, door_guid = 356)
      LocalObject(597, IFFLock.Constructor(Vector3(4900.047f, 3155.189f, 70.2374f), Vector3(0, 0, 180)), owning_building_guid = 33, door_guid = 357)
      LocalObject(688, Locker.Constructor(Vector3(4901.716f, 3148.963f, 38.7704f)), owning_building_guid = 33)
      LocalObject(689, Locker.Constructor(Vector3(4901.751f, 3170.835f, 38.7704f)), owning_building_guid = 33)
      LocalObject(690, Locker.Constructor(Vector3(4903.053f, 3148.963f, 38.7704f)), owning_building_guid = 33)
      LocalObject(691, Locker.Constructor(Vector3(4903.088f, 3170.835f, 38.7704f)), owning_building_guid = 33)
      LocalObject(692, Locker.Constructor(Vector3(4905.741f, 3148.963f, 38.7704f)), owning_building_guid = 33)
      LocalObject(693, Locker.Constructor(Vector3(4905.741f, 3170.835f, 38.7704f)), owning_building_guid = 33)
      LocalObject(694, Locker.Constructor(Vector3(4907.143f, 3148.963f, 38.7704f)), owning_building_guid = 33)
      LocalObject(695, Locker.Constructor(Vector3(4907.143f, 3170.835f, 38.7704f)), owning_building_guid = 33)
      LocalObject(981, Terminal.Constructor(order_terminal), owning_building_guid = 33)
      LocalObject(982, Terminal.Constructor(order_terminal), owning_building_guid = 33)
      LocalObject(983, Terminal.Constructor(order_terminal), owning_building_guid = 33)
      LocalObject(1087, SpawnTube.Constructor(respawn_tube_tower, Vector3(4896.706f, 3151.742f, 38.2584f), Vector3(0, 0, 0)), owning_building_guid = 33)
      LocalObject(1088, SpawnTube.Constructor(respawn_tube_tower, Vector3(4896.706f, 3168.152f, 38.2584f), Vector3(0, 0, 0)), owning_building_guid = 33)
      LocalObject(728, FacilityTurret.Constructor(manned_turret, Vector3(4873.32f, 3151.295f, 67.7184f)), owning_building_guid = 33)
      TurretToWeapon(728, 5010)
      LocalObject(729, FacilityTurret.Constructor(manned_turret, Vector3(4908.647f, 3176.707f, 67.7184f)), owning_building_guid = 33)
      TurretToWeapon(729, 5011)
    }

    Building49()

    def Building49(): Unit = { // Name: nc_SE_Cyssor_Warpgate_Tower Type: tower_b GUID: 34, MapID: 49
      LocalBuilding(34, 49, FoundationBuilder(Building.Structure(StructureType.Tower, Vector3(2506f, 5776f, 63.62667f))))
      LocalObject(1095, CaptureTerminal.Constructor(secondary_capture), owning_building_guid = 34)
      LocalObject(320, Door.Constructor(Vector3(2518f, 5768f, 65.14667f)), owning_building_guid = 34)
      LocalObject(321, Door.Constructor(Vector3(2518f, 5768f, 75.14667f)), owning_building_guid = 34)
      LocalObject(322, Door.Constructor(Vector3(2518f, 5768f, 95.14667f)), owning_building_guid = 34)
      LocalObject(323, Door.Constructor(Vector3(2518f, 5784f, 65.14667f)), owning_building_guid = 34)
      LocalObject(324, Door.Constructor(Vector3(2518f, 5784f, 75.14667f)), owning_building_guid = 34)
      LocalObject(325, Door.Constructor(Vector3(2518f, 5784f, 95.14667f)), owning_building_guid = 34)
      LocalObject(1110, Door.Constructor(Vector3(2517.147f, 5764.794f, 54.96267f)), owning_building_guid = 34)
      LocalObject(1111, Door.Constructor(Vector3(2517.147f, 5781.204f, 54.96267f)), owning_building_guid = 34)
      LocalObject(558, IFFLock.Constructor(Vector3(2515.957f, 5784.811f, 65.08767f), Vector3(0, 0, 0)), owning_building_guid = 34, door_guid = 323)
      LocalObject(559, IFFLock.Constructor(Vector3(2515.957f, 5784.811f, 75.08767f), Vector3(0, 0, 0)), owning_building_guid = 34, door_guid = 324)
      LocalObject(560, IFFLock.Constructor(Vector3(2515.957f, 5784.811f, 95.08767f), Vector3(0, 0, 0)), owning_building_guid = 34, door_guid = 325)
      LocalObject(561, IFFLock.Constructor(Vector3(2520.047f, 5767.189f, 65.08767f), Vector3(0, 0, 180)), owning_building_guid = 34, door_guid = 320)
      LocalObject(562, IFFLock.Constructor(Vector3(2520.047f, 5767.189f, 75.08767f), Vector3(0, 0, 180)), owning_building_guid = 34, door_guid = 321)
      LocalObject(563, IFFLock.Constructor(Vector3(2520.047f, 5767.189f, 95.08767f), Vector3(0, 0, 180)), owning_building_guid = 34, door_guid = 322)
      LocalObject(624, Locker.Constructor(Vector3(2521.716f, 5760.963f, 53.62067f)), owning_building_guid = 34)
      LocalObject(625, Locker.Constructor(Vector3(2521.751f, 5782.835f, 53.62067f)), owning_building_guid = 34)
      LocalObject(626, Locker.Constructor(Vector3(2523.053f, 5760.963f, 53.62067f)), owning_building_guid = 34)
      LocalObject(627, Locker.Constructor(Vector3(2523.088f, 5782.835f, 53.62067f)), owning_building_guid = 34)
      LocalObject(628, Locker.Constructor(Vector3(2525.741f, 5760.963f, 53.62067f)), owning_building_guid = 34)
      LocalObject(629, Locker.Constructor(Vector3(2525.741f, 5782.835f, 53.62067f)), owning_building_guid = 34)
      LocalObject(630, Locker.Constructor(Vector3(2527.143f, 5760.963f, 53.62067f)), owning_building_guid = 34)
      LocalObject(631, Locker.Constructor(Vector3(2527.143f, 5782.835f, 53.62067f)), owning_building_guid = 34)
      LocalObject(887, Terminal.Constructor(order_terminal), owning_building_guid = 34)
      LocalObject(888, Terminal.Constructor(order_terminal), owning_building_guid = 34)
      LocalObject(889, Terminal.Constructor(order_terminal), owning_building_guid = 34)
      LocalObject(1071, SpawnTube.Constructor(respawn_tube_tower, Vector3(2516.706f, 5763.742f, 53.10867f), Vector3(0, 0, 0)), owning_building_guid = 34)
      LocalObject(1072, SpawnTube.Constructor(respawn_tube_tower, Vector3(2516.706f, 5780.152f, 53.10867f), Vector3(0, 0, 0)), owning_building_guid = 34)
    }

    Building47()

    def Building47(): Unit = { // Name: nc_SW_Amerish_Warpgate_Tower Type: tower_b GUID: 35, MapID: 47
      LocalBuilding(35, 47, FoundationBuilder(Building.Structure(StructureType.Tower, Vector3(3844f, 5888f, 44.39456f))))
      LocalObject(1098, CaptureTerminal.Constructor(secondary_capture), owning_building_guid = 35)
      LocalObject(334, Door.Constructor(Vector3(3856f, 5880f, 45.91456f)), owning_building_guid = 35)
      LocalObject(335, Door.Constructor(Vector3(3856f, 5880f, 55.91456f)), owning_building_guid = 35)
      LocalObject(336, Door.Constructor(Vector3(3856f, 5880f, 75.91457f)), owning_building_guid = 35)
      LocalObject(337, Door.Constructor(Vector3(3856f, 5896f, 45.91456f)), owning_building_guid = 35)
      LocalObject(338, Door.Constructor(Vector3(3856f, 5896f, 55.91456f)), owning_building_guid = 35)
      LocalObject(339, Door.Constructor(Vector3(3856f, 5896f, 75.91457f)), owning_building_guid = 35)
      LocalObject(1116, Door.Constructor(Vector3(3855.147f, 5876.794f, 35.73056f)), owning_building_guid = 35)
      LocalObject(1117, Door.Constructor(Vector3(3855.147f, 5893.204f, 35.73056f)), owning_building_guid = 35)
      LocalObject(572, IFFLock.Constructor(Vector3(3853.957f, 5896.811f, 45.85556f), Vector3(0, 0, 0)), owning_building_guid = 35, door_guid = 337)
      LocalObject(573, IFFLock.Constructor(Vector3(3853.957f, 5896.811f, 55.85556f), Vector3(0, 0, 0)), owning_building_guid = 35, door_guid = 338)
      LocalObject(574, IFFLock.Constructor(Vector3(3853.957f, 5896.811f, 75.85556f), Vector3(0, 0, 0)), owning_building_guid = 35, door_guid = 339)
      LocalObject(575, IFFLock.Constructor(Vector3(3858.047f, 5879.189f, 45.85556f), Vector3(0, 0, 180)), owning_building_guid = 35, door_guid = 334)
      LocalObject(576, IFFLock.Constructor(Vector3(3858.047f, 5879.189f, 55.85556f), Vector3(0, 0, 180)), owning_building_guid = 35, door_guid = 335)
      LocalObject(577, IFFLock.Constructor(Vector3(3858.047f, 5879.189f, 75.85556f), Vector3(0, 0, 180)), owning_building_guid = 35, door_guid = 336)
      LocalObject(648, Locker.Constructor(Vector3(3859.716f, 5872.963f, 34.38856f)), owning_building_guid = 35)
      LocalObject(649, Locker.Constructor(Vector3(3859.751f, 5894.835f, 34.38856f)), owning_building_guid = 35)
      LocalObject(650, Locker.Constructor(Vector3(3861.053f, 5872.963f, 34.38856f)), owning_building_guid = 35)
      LocalObject(651, Locker.Constructor(Vector3(3861.088f, 5894.835f, 34.38856f)), owning_building_guid = 35)
      LocalObject(652, Locker.Constructor(Vector3(3863.741f, 5872.963f, 34.38856f)), owning_building_guid = 35)
      LocalObject(653, Locker.Constructor(Vector3(3863.741f, 5894.835f, 34.38856f)), owning_building_guid = 35)
      LocalObject(654, Locker.Constructor(Vector3(3865.143f, 5872.963f, 34.38856f)), owning_building_guid = 35)
      LocalObject(655, Locker.Constructor(Vector3(3865.143f, 5894.835f, 34.38856f)), owning_building_guid = 35)
      LocalObject(896, Terminal.Constructor(order_terminal), owning_building_guid = 35)
      LocalObject(897, Terminal.Constructor(order_terminal), owning_building_guid = 35)
      LocalObject(898, Terminal.Constructor(order_terminal), owning_building_guid = 35)
      LocalObject(1077, SpawnTube.Constructor(respawn_tube_tower, Vector3(3854.706f, 5875.742f, 33.87656f), Vector3(0, 0, 0)), owning_building_guid = 35)
      LocalObject(1078, SpawnTube.Constructor(respawn_tube_tower, Vector3(3854.706f, 5892.152f, 33.87656f), Vector3(0, 0, 0)), owning_building_guid = 35)
    }

    Building45()

    def Building45(): Unit = { // Name: nc_N_Esamir_Warpgate_Tower Type: tower_b GUID: 36, MapID: 45
      LocalBuilding(36, 45, FoundationBuilder(Building.Structure(StructureType.Tower, Vector3(5020f, 3810f, 65.63448f))))
      LocalObject(1104, CaptureTerminal.Constructor(secondary_capture), owning_building_guid = 36)
      LocalObject(360, Door.Constructor(Vector3(5032f, 3802f, 67.15448f)), owning_building_guid = 36)
      LocalObject(361, Door.Constructor(Vector3(5032f, 3802f, 77.15448f)), owning_building_guid = 36)
      LocalObject(362, Door.Constructor(Vector3(5032f, 3802f, 97.15448f)), owning_building_guid = 36)
      LocalObject(363, Door.Constructor(Vector3(5032f, 3818f, 67.15448f)), owning_building_guid = 36)
      LocalObject(364, Door.Constructor(Vector3(5032f, 3818f, 77.15448f)), owning_building_guid = 36)
      LocalObject(365, Door.Constructor(Vector3(5032f, 3818f, 97.15448f)), owning_building_guid = 36)
      LocalObject(1128, Door.Constructor(Vector3(5031.147f, 3798.794f, 56.97048f)), owning_building_guid = 36)
      LocalObject(1129, Door.Constructor(Vector3(5031.147f, 3815.204f, 56.97048f)), owning_building_guid = 36)
      LocalObject(598, IFFLock.Constructor(Vector3(5029.957f, 3818.811f, 67.09548f), Vector3(0, 0, 0)), owning_building_guid = 36, door_guid = 363)
      LocalObject(599, IFFLock.Constructor(Vector3(5029.957f, 3818.811f, 77.09548f), Vector3(0, 0, 0)), owning_building_guid = 36, door_guid = 364)
      LocalObject(600, IFFLock.Constructor(Vector3(5029.957f, 3818.811f, 97.09548f), Vector3(0, 0, 0)), owning_building_guid = 36, door_guid = 365)
      LocalObject(601, IFFLock.Constructor(Vector3(5034.047f, 3801.189f, 67.09548f), Vector3(0, 0, 180)), owning_building_guid = 36, door_guid = 360)
      LocalObject(602, IFFLock.Constructor(Vector3(5034.047f, 3801.189f, 77.09548f), Vector3(0, 0, 180)), owning_building_guid = 36, door_guid = 361)
      LocalObject(603, IFFLock.Constructor(Vector3(5034.047f, 3801.189f, 97.09548f), Vector3(0, 0, 180)), owning_building_guid = 36, door_guid = 362)
      LocalObject(696, Locker.Constructor(Vector3(5035.716f, 3794.963f, 55.62848f)), owning_building_guid = 36)
      LocalObject(697, Locker.Constructor(Vector3(5035.751f, 3816.835f, 55.62848f)), owning_building_guid = 36)
      LocalObject(698, Locker.Constructor(Vector3(5037.053f, 3794.963f, 55.62848f)), owning_building_guid = 36)
      LocalObject(699, Locker.Constructor(Vector3(5037.088f, 3816.835f, 55.62848f)), owning_building_guid = 36)
      LocalObject(700, Locker.Constructor(Vector3(5039.741f, 3794.963f, 55.62848f)), owning_building_guid = 36)
      LocalObject(701, Locker.Constructor(Vector3(5039.741f, 3816.835f, 55.62848f)), owning_building_guid = 36)
      LocalObject(702, Locker.Constructor(Vector3(5041.143f, 3794.963f, 55.62848f)), owning_building_guid = 36)
      LocalObject(703, Locker.Constructor(Vector3(5041.143f, 3816.835f, 55.62848f)), owning_building_guid = 36)
      LocalObject(990, Terminal.Constructor(order_terminal), owning_building_guid = 36)
      LocalObject(991, Terminal.Constructor(order_terminal), owning_building_guid = 36)
      LocalObject(992, Terminal.Constructor(order_terminal), owning_building_guid = 36)
      LocalObject(1089, SpawnTube.Constructor(respawn_tube_tower, Vector3(5030.706f, 3797.742f, 55.11649f), Vector3(0, 0, 0)), owning_building_guid = 36)
      LocalObject(1090, SpawnTube.Constructor(respawn_tube_tower, Vector3(5030.706f, 3814.152f, 55.11649f), Vector3(0, 0, 0)), owning_building_guid = 36)
    }

    Building58()

    def Building58(): Unit = { // Name: nc_Cyssor_Outpost_Tower Type: tower_c GUID: 37, MapID: 58
      LocalBuilding(37, 58, FoundationBuilder(Building.Structure(StructureType.Tower, Vector3(1978f, 4802f, 62.46139f))))
      LocalObject(1093, CaptureTerminal.Constructor(secondary_capture), owning_building_guid = 37)
      LocalObject(312, Door.Constructor(Vector3(1990f, 4794f, 63.98239f)), owning_building_guid = 37)
      LocalObject(313, Door.Constructor(Vector3(1990f, 4794f, 83.98139f)), owning_building_guid = 37)
      LocalObject(314, Door.Constructor(Vector3(1990f, 4810f, 63.98239f)), owning_building_guid = 37)
      LocalObject(315, Door.Constructor(Vector3(1990f, 4810f, 83.98139f)), owning_building_guid = 37)
      LocalObject(1106, Door.Constructor(Vector3(1989.146f, 4790.794f, 53.79739f)), owning_building_guid = 37)
      LocalObject(1107, Door.Constructor(Vector3(1989.146f, 4807.204f, 53.79739f)), owning_building_guid = 37)
      LocalObject(550, IFFLock.Constructor(Vector3(1987.957f, 4810.811f, 63.92239f), Vector3(0, 0, 0)), owning_building_guid = 37, door_guid = 314)
      LocalObject(551, IFFLock.Constructor(Vector3(1987.957f, 4810.811f, 83.92239f), Vector3(0, 0, 0)), owning_building_guid = 37, door_guid = 315)
      LocalObject(554, IFFLock.Constructor(Vector3(1992.047f, 4793.189f, 63.92239f), Vector3(0, 0, 180)), owning_building_guid = 37, door_guid = 312)
      LocalObject(555, IFFLock.Constructor(Vector3(1992.047f, 4793.189f, 83.92239f), Vector3(0, 0, 180)), owning_building_guid = 37, door_guid = 313)
      LocalObject(608, Locker.Constructor(Vector3(1993.716f, 4786.963f, 52.45539f)), owning_building_guid = 37)
      LocalObject(609, Locker.Constructor(Vector3(1993.751f, 4808.835f, 52.45539f)), owning_building_guid = 37)
      LocalObject(610, Locker.Constructor(Vector3(1995.053f, 4786.963f, 52.45539f)), owning_building_guid = 37)
      LocalObject(611, Locker.Constructor(Vector3(1995.088f, 4808.835f, 52.45539f)), owning_building_guid = 37)
      LocalObject(616, Locker.Constructor(Vector3(1997.741f, 4786.963f, 52.45539f)), owning_building_guid = 37)
      LocalObject(617, Locker.Constructor(Vector3(1997.741f, 4808.835f, 52.45539f)), owning_building_guid = 37)
      LocalObject(618, Locker.Constructor(Vector3(1999.143f, 4786.963f, 52.45539f)), owning_building_guid = 37)
      LocalObject(619, Locker.Constructor(Vector3(1999.143f, 4808.835f, 52.45539f)), owning_building_guid = 37)
      LocalObject(843, Terminal.Constructor(order_terminal), owning_building_guid = 37)
      LocalObject(844, Terminal.Constructor(order_terminal), owning_building_guid = 37)
      LocalObject(845, Terminal.Constructor(order_terminal), owning_building_guid = 37)
      LocalObject(1067, SpawnTube.Constructor(respawn_tube_tower, Vector3(1988.706f, 4789.742f, 51.94339f), Vector3(0, 0, 0)), owning_building_guid = 37)
      LocalObject(1068, SpawnTube.Constructor(respawn_tube_tower, Vector3(1988.706f, 4806.152f, 51.94339f), Vector3(0, 0, 0)), owning_building_guid = 37)
      LocalObject(1004, ProximityTerminal.Constructor(pad_landing_tower_frame, Vector3(1976.907f, 4796.725f, 90.03139f)), owning_building_guid = 37)
      LocalObject(1005, Terminal.Constructor(air_rearm_terminal), owning_building_guid = 37)
      LocalObject(1007, ProximityTerminal.Constructor(pad_landing_tower_frame, Vector3(1976.907f, 4807.17f, 90.03139f)), owning_building_guid = 37)
      LocalObject(1008, Terminal.Constructor(air_rearm_terminal), owning_building_guid = 37)
      LocalObject(712, FacilityTurret.Constructor(manned_turret, Vector3(1963.07f, 4787.045f, 81.40339f)), owning_building_guid = 37)
      TurretToWeapon(712, 5012)
      LocalObject(714, FacilityTurret.Constructor(manned_turret, Vector3(2001.497f, 4816.957f, 81.40339f)), owning_building_guid = 37)
      TurretToWeapon(714, 5013)
    }

    Building51()

    def Building51(): Unit = { // Name: nc_Central_Tower Type: tower_c GUID: 38, MapID: 51
      LocalBuilding(38, 51, FoundationBuilder(Building.Structure(StructureType.Tower, Vector3(3340f, 4668f, 61.79601f))))
      LocalObject(1097, CaptureTerminal.Constructor(secondary_capture), owning_building_guid = 38)
      LocalObject(330, Door.Constructor(Vector3(3352f, 4660f, 63.31701f)), owning_building_guid = 38)
      LocalObject(331, Door.Constructor(Vector3(3352f, 4660f, 83.31601f)), owning_building_guid = 38)
      LocalObject(332, Door.Constructor(Vector3(3352f, 4676f, 63.31701f)), owning_building_guid = 38)
      LocalObject(333, Door.Constructor(Vector3(3352f, 4676f, 83.31601f)), owning_building_guid = 38)
      LocalObject(1114, Door.Constructor(Vector3(3351.146f, 4656.794f, 53.13201f)), owning_building_guid = 38)
      LocalObject(1115, Door.Constructor(Vector3(3351.146f, 4673.204f, 53.13201f)), owning_building_guid = 38)
      LocalObject(568, IFFLock.Constructor(Vector3(3349.957f, 4676.811f, 63.25701f), Vector3(0, 0, 0)), owning_building_guid = 38, door_guid = 332)
      LocalObject(569, IFFLock.Constructor(Vector3(3349.957f, 4676.811f, 83.25701f), Vector3(0, 0, 0)), owning_building_guid = 38, door_guid = 333)
      LocalObject(570, IFFLock.Constructor(Vector3(3354.047f, 4659.189f, 63.25701f), Vector3(0, 0, 180)), owning_building_guid = 38, door_guid = 330)
      LocalObject(571, IFFLock.Constructor(Vector3(3354.047f, 4659.189f, 83.25701f), Vector3(0, 0, 180)), owning_building_guid = 38, door_guid = 331)
      LocalObject(640, Locker.Constructor(Vector3(3355.716f, 4652.963f, 51.79001f)), owning_building_guid = 38)
      LocalObject(641, Locker.Constructor(Vector3(3355.751f, 4674.835f, 51.79001f)), owning_building_guid = 38)
      LocalObject(642, Locker.Constructor(Vector3(3357.053f, 4652.963f, 51.79001f)), owning_building_guid = 38)
      LocalObject(643, Locker.Constructor(Vector3(3357.088f, 4674.835f, 51.79001f)), owning_building_guid = 38)
      LocalObject(644, Locker.Constructor(Vector3(3359.741f, 4652.963f, 51.79001f)), owning_building_guid = 38)
      LocalObject(645, Locker.Constructor(Vector3(3359.741f, 4674.835f, 51.79001f)), owning_building_guid = 38)
      LocalObject(646, Locker.Constructor(Vector3(3361.143f, 4652.963f, 51.79001f)), owning_building_guid = 38)
      LocalObject(647, Locker.Constructor(Vector3(3361.143f, 4674.835f, 51.79001f)), owning_building_guid = 38)
      LocalObject(893, Terminal.Constructor(order_terminal), owning_building_guid = 38)
      LocalObject(894, Terminal.Constructor(order_terminal), owning_building_guid = 38)
      LocalObject(895, Terminal.Constructor(order_terminal), owning_building_guid = 38)
      LocalObject(1075, SpawnTube.Constructor(respawn_tube_tower, Vector3(3350.706f, 4655.742f, 51.27802f), Vector3(0, 0, 0)), owning_building_guid = 38)
      LocalObject(1076, SpawnTube.Constructor(respawn_tube_tower, Vector3(3350.706f, 4672.152f, 51.27802f), Vector3(0, 0, 0)), owning_building_guid = 38)
      LocalObject(1010, ProximityTerminal.Constructor(pad_landing_tower_frame, Vector3(3338.907f, 4662.725f, 89.36601f)), owning_building_guid = 38)
      LocalObject(1011, Terminal.Constructor(air_rearm_terminal), owning_building_guid = 38)
      LocalObject(1013, ProximityTerminal.Constructor(pad_landing_tower_frame, Vector3(3338.907f, 4673.17f, 89.36601f)), owning_building_guid = 38)
      LocalObject(1014, Terminal.Constructor(air_rearm_terminal), owning_building_guid = 38)
      LocalObject(718, FacilityTurret.Constructor(manned_turret, Vector3(3325.07f, 4653.045f, 80.73801f)), owning_building_guid = 38)
      TurretToWeapon(718, 5014)
      LocalObject(719, FacilityTurret.Constructor(manned_turret, Vector3(3363.497f, 4682.957f, 80.73801f)), owning_building_guid = 38)
      TurretToWeapon(719, 5015)
    }

    Building56()

    def Building56(): Unit = { // Name: nc_Esamir_Outpost_Tower Type: tower_c GUID: 39, MapID: 56
      LocalBuilding(39, 56, FoundationBuilder(Building.Structure(StructureType.Tower, Vector3(4140f, 2924f, 39.29424f))))
      LocalObject(1099, CaptureTerminal.Constructor(secondary_capture), owning_building_guid = 39)
      LocalObject(340, Door.Constructor(Vector3(4152f, 2916f, 40.81524f)), owning_building_guid = 39)
      LocalObject(341, Door.Constructor(Vector3(4152f, 2916f, 60.81424f)), owning_building_guid = 39)
      LocalObject(342, Door.Constructor(Vector3(4152f, 2932f, 40.81524f)), owning_building_guid = 39)
      LocalObject(343, Door.Constructor(Vector3(4152f, 2932f, 60.81424f)), owning_building_guid = 39)
      LocalObject(1118, Door.Constructor(Vector3(4151.146f, 2912.794f, 30.63024f)), owning_building_guid = 39)
      LocalObject(1119, Door.Constructor(Vector3(4151.146f, 2929.204f, 30.63024f)), owning_building_guid = 39)
      LocalObject(578, IFFLock.Constructor(Vector3(4149.957f, 2932.811f, 40.75524f), Vector3(0, 0, 0)), owning_building_guid = 39, door_guid = 342)
      LocalObject(579, IFFLock.Constructor(Vector3(4149.957f, 2932.811f, 60.75524f), Vector3(0, 0, 0)), owning_building_guid = 39, door_guid = 343)
      LocalObject(580, IFFLock.Constructor(Vector3(4154.047f, 2915.189f, 40.75524f), Vector3(0, 0, 180)), owning_building_guid = 39, door_guid = 340)
      LocalObject(581, IFFLock.Constructor(Vector3(4154.047f, 2915.189f, 60.75524f), Vector3(0, 0, 180)), owning_building_guid = 39, door_guid = 341)
      LocalObject(656, Locker.Constructor(Vector3(4155.716f, 2908.963f, 29.28824f)), owning_building_guid = 39)
      LocalObject(657, Locker.Constructor(Vector3(4155.751f, 2930.835f, 29.28824f)), owning_building_guid = 39)
      LocalObject(658, Locker.Constructor(Vector3(4157.053f, 2908.963f, 29.28824f)), owning_building_guid = 39)
      LocalObject(659, Locker.Constructor(Vector3(4157.088f, 2930.835f, 29.28824f)), owning_building_guid = 39)
      LocalObject(660, Locker.Constructor(Vector3(4159.741f, 2908.963f, 29.28824f)), owning_building_guid = 39)
      LocalObject(661, Locker.Constructor(Vector3(4159.741f, 2930.835f, 29.28824f)), owning_building_guid = 39)
      LocalObject(662, Locker.Constructor(Vector3(4161.143f, 2908.963f, 29.28824f)), owning_building_guid = 39)
      LocalObject(663, Locker.Constructor(Vector3(4161.143f, 2930.835f, 29.28824f)), owning_building_guid = 39)
      LocalObject(922, Terminal.Constructor(order_terminal), owning_building_guid = 39)
      LocalObject(923, Terminal.Constructor(order_terminal), owning_building_guid = 39)
      LocalObject(924, Terminal.Constructor(order_terminal), owning_building_guid = 39)
      LocalObject(1079, SpawnTube.Constructor(respawn_tube_tower, Vector3(4150.706f, 2911.742f, 28.77624f), Vector3(0, 0, 0)), owning_building_guid = 39)
      LocalObject(1080, SpawnTube.Constructor(respawn_tube_tower, Vector3(4150.706f, 2928.152f, 28.77624f), Vector3(0, 0, 0)), owning_building_guid = 39)
      LocalObject(1016, ProximityTerminal.Constructor(pad_landing_tower_frame, Vector3(4138.907f, 2918.725f, 66.86424f)), owning_building_guid = 39)
      LocalObject(1017, Terminal.Constructor(air_rearm_terminal), owning_building_guid = 39)
      LocalObject(1019, ProximityTerminal.Constructor(pad_landing_tower_frame, Vector3(4138.907f, 2929.17f, 66.86424f)), owning_building_guid = 39)
      LocalObject(1020, Terminal.Constructor(air_rearm_terminal), owning_building_guid = 39)
      LocalObject(720, FacilityTurret.Constructor(manned_turret, Vector3(4125.07f, 2909.045f, 58.23624f)), owning_building_guid = 39)
      TurretToWeapon(720, 5016)
      LocalObject(721, FacilityTurret.Constructor(manned_turret, Vector3(4163.497f, 2938.957f, 58.23624f)), owning_building_guid = 39)
      TurretToWeapon(721, 5017)
    }

    Building57()

    def Building57(): Unit = { // Name: nc_Amerish_Outpost_Tower Type: tower_c GUID: 40, MapID: 57
      LocalBuilding(40, 57, FoundationBuilder(Building.Structure(StructureType.Tower, Vector3(5290f, 6160f, 39.10642f))))
      LocalObject(1105, CaptureTerminal.Constructor(secondary_capture), owning_building_guid = 40)
      LocalObject(366, Door.Constructor(Vector3(5302f, 6152f, 40.62742f)), owning_building_guid = 40)
      LocalObject(367, Door.Constructor(Vector3(5302f, 6152f, 60.62642f)), owning_building_guid = 40)
      LocalObject(368, Door.Constructor(Vector3(5302f, 6168f, 40.62742f)), owning_building_guid = 40)
      LocalObject(369, Door.Constructor(Vector3(5302f, 6168f, 60.62642f)), owning_building_guid = 40)
      LocalObject(1130, Door.Constructor(Vector3(5301.146f, 6148.794f, 30.44242f)), owning_building_guid = 40)
      LocalObject(1131, Door.Constructor(Vector3(5301.146f, 6165.204f, 30.44242f)), owning_building_guid = 40)
      LocalObject(604, IFFLock.Constructor(Vector3(5299.957f, 6168.811f, 40.56742f), Vector3(0, 0, 0)), owning_building_guid = 40, door_guid = 368)
      LocalObject(605, IFFLock.Constructor(Vector3(5299.957f, 6168.811f, 60.56742f), Vector3(0, 0, 0)), owning_building_guid = 40, door_guid = 369)
      LocalObject(606, IFFLock.Constructor(Vector3(5304.047f, 6151.189f, 40.56742f), Vector3(0, 0, 180)), owning_building_guid = 40, door_guid = 366)
      LocalObject(607, IFFLock.Constructor(Vector3(5304.047f, 6151.189f, 60.56742f), Vector3(0, 0, 180)), owning_building_guid = 40, door_guid = 367)
      LocalObject(704, Locker.Constructor(Vector3(5305.716f, 6144.963f, 29.10042f)), owning_building_guid = 40)
      LocalObject(705, Locker.Constructor(Vector3(5305.751f, 6166.835f, 29.10042f)), owning_building_guid = 40)
      LocalObject(706, Locker.Constructor(Vector3(5307.053f, 6144.963f, 29.10042f)), owning_building_guid = 40)
      LocalObject(707, Locker.Constructor(Vector3(5307.088f, 6166.835f, 29.10042f)), owning_building_guid = 40)
      LocalObject(708, Locker.Constructor(Vector3(5309.741f, 6144.963f, 29.10042f)), owning_building_guid = 40)
      LocalObject(709, Locker.Constructor(Vector3(5309.741f, 6166.835f, 29.10042f)), owning_building_guid = 40)
      LocalObject(710, Locker.Constructor(Vector3(5311.143f, 6144.963f, 29.10042f)), owning_building_guid = 40)
      LocalObject(711, Locker.Constructor(Vector3(5311.143f, 6166.835f, 29.10042f)), owning_building_guid = 40)
      LocalObject(993, Terminal.Constructor(order_terminal), owning_building_guid = 40)
      LocalObject(994, Terminal.Constructor(order_terminal), owning_building_guid = 40)
      LocalObject(995, Terminal.Constructor(order_terminal), owning_building_guid = 40)
      LocalObject(1091, SpawnTube.Constructor(respawn_tube_tower, Vector3(5300.706f, 6147.742f, 28.58842f), Vector3(0, 0, 0)), owning_building_guid = 40)
      LocalObject(1092, SpawnTube.Constructor(respawn_tube_tower, Vector3(5300.706f, 6164.152f, 28.58842f), Vector3(0, 0, 0)), owning_building_guid = 40)
      LocalObject(1022, ProximityTerminal.Constructor(pad_landing_tower_frame, Vector3(5288.907f, 6154.725f, 66.67642f)), owning_building_guid = 40)
      LocalObject(1023, Terminal.Constructor(air_rearm_terminal), owning_building_guid = 40)
      LocalObject(1025, ProximityTerminal.Constructor(pad_landing_tower_frame, Vector3(5288.907f, 6165.17f, 66.67642f)), owning_building_guid = 40)
      LocalObject(1026, Terminal.Constructor(air_rearm_terminal), owning_building_guid = 40)
      LocalObject(730, FacilityTurret.Constructor(manned_turret, Vector3(5275.07f, 6145.045f, 58.04842f)), owning_building_guid = 40)
      TurretToWeapon(730, 5018)
      LocalObject(731, FacilityTurret.Constructor(manned_turret, Vector3(5313.497f, 6174.957f, 58.04842f)), owning_building_guid = 40)
      TurretToWeapon(731, 5019)
    }

    Building30()

    def Building30(): Unit = { // Name: Cyssor_Spawn1 Type: VT_building_nc GUID: 41, MapID: 30
      LocalBuilding(41, 30, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(2168f, 5392f, 65.21291f))))
      LocalObject(234, Door.Constructor(Vector3(2162.214f, 5444.023f, 67.2889f)), owning_building_guid = 41)
      LocalObject(235, Door.Constructor(Vector3(2162.343f, 5450.527f, 67.2889f)), owning_building_guid = 41)
      LocalObject(236, Door.Constructor(Vector3(2168.919f, 5443.906f, 67.2889f)), owning_building_guid = 41)
      LocalObject(237, Door.Constructor(Vector3(2169.048f, 5450.409f, 67.2889f)), owning_building_guid = 41)
      LocalObject(238, Door.Constructor(Vector3(2175.624f, 5443.789f, 67.2889f)), owning_building_guid = 41)
      LocalObject(239, Door.Constructor(Vector3(2175.753f, 5450.292f, 67.2889f)), owning_building_guid = 41)
      LocalObject(370, Door.Constructor(Vector3(2157.124f, 5458.601f, 66.9229f)), owning_building_guid = 41)
      LocalObject(373, Door.Constructor(Vector3(2181.174f, 5458.181f, 66.9229f)), owning_building_guid = 41)
      LocalObject(418, Door.Constructor(Vector3(2132.296f, 5408.613f, 68.38791f)), owning_building_guid = 41)
      LocalObject(419, Door.Constructor(Vector3(2148.385f, 5412.305f, 68.38791f)), owning_building_guid = 41)
      LocalObject(420, Door.Constructor(Vector3(2152.644f, 5428.286f, 68.38791f)), owning_building_guid = 41)
      LocalObject(421, Door.Constructor(Vector3(2184.613f, 5427.704f, 68.38791f)), owning_building_guid = 41)
      LocalObject(422, Door.Constructor(Vector3(2188.305f, 5411.615f, 68.38791f)), owning_building_guid = 41)
      LocalObject(423, Door.Constructor(Vector3(2204.286f, 5407.356f, 68.38791f)), owning_building_guid = 41)
      LocalObject(849, Terminal.Constructor(order_terminal), owning_building_guid = 41)
      LocalObject(850, Terminal.Constructor(order_terminal), owning_building_guid = 41)
      LocalObject(851, Terminal.Constructor(order_terminal), owning_building_guid = 41)
      LocalObject(852, Terminal.Constructor(order_terminal), owning_building_guid = 41)
      LocalObject(853, Terminal.Constructor(order_terminal), owning_building_guid = 41)
      LocalObject(854, Terminal.Constructor(order_terminal), owning_building_guid = 41)
      LocalObject(774, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(2162.234f, 5444.899f, 67.2449f), Vector3(0, 0, 181)), owning_building_guid = 41)
      LocalObject(775, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(2162.317f, 5449.653f, 67.2449f), Vector3(0, 0, 1)), owning_building_guid = 41)
      LocalObject(776, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(2168.941f, 5444.781f, 67.2449f), Vector3(0, 0, 181)), owning_building_guid = 41)
      LocalObject(777, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(2169.023f, 5449.536f, 67.2449f), Vector3(0, 0, 1)), owning_building_guid = 41)
      LocalObject(778, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(2175.648f, 5444.665f, 67.2449f), Vector3(0, 0, 181)), owning_building_guid = 41)
      LocalObject(779, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(2175.731f, 5449.419f, 67.2449f), Vector3(0, 0, 1)), owning_building_guid = 41)
    }

    Building35()

    def Building35(): Unit = { // Name: Cyssor_Spawn2 Type: VT_building_nc GUID: 42, MapID: 35
      LocalBuilding(42, 35, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(2400f, 5402f, 64.68082f))))
      LocalObject(240, Door.Constructor(Vector3(2354.615f, 5439.385f, 66.75681f)), owning_building_guid = 42)
      LocalObject(241, Door.Constructor(Vector3(2359.122f, 5434.694f, 66.75681f)), owning_building_guid = 42)
      LocalObject(242, Door.Constructor(Vector3(2359.439f, 5444.042f, 66.75681f)), owning_building_guid = 42)
      LocalObject(243, Door.Constructor(Vector3(2363.946f, 5439.353f, 66.75681f)), owning_building_guid = 42)
      LocalObject(244, Door.Constructor(Vector3(2364.264f, 5448.701f, 66.75681f)), owning_building_guid = 42)
      LocalObject(245, Door.Constructor(Vector3(2368.771f, 5444.011f, 66.75681f)), owning_building_guid = 42)
      LocalObject(376, Door.Constructor(Vector3(2345.215f, 5441.403f, 66.39082f)), owning_building_guid = 42)
      LocalObject(377, Door.Constructor(Vector3(2362.519f, 5458.113f, 66.39082f)), owning_building_guid = 42)
      LocalObject(424, Door.Constructor(Vector3(2363.007f, 5388.5f, 67.85582f)), owning_building_guid = 42)
      LocalObject(425, Door.Constructor(Vector3(2363.484f, 5416.799f, 67.85582f)), owning_building_guid = 42)
      LocalObject(426, Door.Constructor(Vector3(2371.772f, 5402.488f, 67.85582f)), owning_building_guid = 42)
      LocalObject(427, Door.Constructor(Vector3(2386.5f, 5438.993f, 67.85582f)), owning_building_guid = 42)
      LocalObject(428, Door.Constructor(Vector3(2400.488f, 5430.228f, 67.85582f)), owning_building_guid = 42)
      LocalObject(429, Door.Constructor(Vector3(2414.8f, 5438.516f, 67.85582f)), owning_building_guid = 42)
      LocalObject(875, Terminal.Constructor(order_terminal), owning_building_guid = 42)
      LocalObject(876, Terminal.Constructor(order_terminal), owning_building_guid = 42)
      LocalObject(877, Terminal.Constructor(order_terminal), owning_building_guid = 42)
      LocalObject(878, Terminal.Constructor(order_terminal), owning_building_guid = 42)
      LocalObject(879, Terminal.Constructor(order_terminal), owning_building_guid = 42)
      LocalObject(880, Terminal.Constructor(order_terminal), owning_building_guid = 42)
      LocalObject(780, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(2355.215f, 5438.748f, 66.71281f), Vector3(0, 0, 316)), owning_building_guid = 42)
      LocalObject(781, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(2358.517f, 5435.328f, 66.71281f), Vector3(0, 0, 136)), owning_building_guid = 42)
      LocalObject(782, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(2360.04f, 5443.408f, 66.71281f), Vector3(0, 0, 316)), owning_building_guid = 42)
      LocalObject(783, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(2363.344f, 5439.987f, 66.71281f), Vector3(0, 0, 136)), owning_building_guid = 42)
      LocalObject(784, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(2364.866f, 5448.068f, 66.71281f), Vector3(0, 0, 316)), owning_building_guid = 42)
      LocalObject(785, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(2368.168f, 5444.648f, 66.71281f), Vector3(0, 0, 136)), owning_building_guid = 42)
    }

    Building36()

    def Building36(): Unit = { // Name: Cyssor_Spawn3 Type: VT_building_nc GUID: 43, MapID: 36
      LocalBuilding(43, 36, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(2452f, 5542f, 65.20798f))))
      LocalObject(246, Door.Constructor(Vector3(2393.473f, 5547.714f, 67.28398f)), owning_building_guid = 43)
      LocalObject(247, Door.Constructor(Vector3(2393.59f, 5541.009f, 67.28398f)), owning_building_guid = 43)
      LocalObject(248, Door.Constructor(Vector3(2393.706f, 5534.304f, 67.28398f)), owning_building_guid = 43)
      LocalObject(249, Door.Constructor(Vector3(2399.976f, 5547.812f, 67.28398f)), owning_building_guid = 43)
      LocalObject(250, Door.Constructor(Vector3(2400.093f, 5541.107f, 67.28398f)), owning_building_guid = 43)
      LocalObject(251, Door.Constructor(Vector3(2400.21f, 5534.401f, 67.28398f)), owning_building_guid = 43)
      LocalObject(378, Door.Constructor(Vector3(2385.399f, 5552.856f, 66.91798f)), owning_building_guid = 43)
      LocalObject(379, Door.Constructor(Vector3(2385.819f, 5528.806f, 66.91798f)), owning_building_guid = 43)
      LocalObject(430, Door.Constructor(Vector3(2415.738f, 5557.356f, 68.38299f)), owning_building_guid = 43)
      LocalObject(431, Door.Constructor(Vector3(2416.272f, 5525.387f, 68.38299f)), owning_building_guid = 43)
      LocalObject(432, Door.Constructor(Vector3(2431.688f, 5561.608f, 68.38299f)), owning_building_guid = 43)
      LocalObject(433, Door.Constructor(Vector3(2432.392f, 5521.688f, 68.38299f)), owning_building_guid = 43)
      LocalObject(434, Door.Constructor(Vector3(2435.387f, 5577.728f, 68.38299f)), owning_building_guid = 43)
      LocalObject(435, Door.Constructor(Vector3(2436.644f, 5505.738f, 68.38299f)), owning_building_guid = 43)
      LocalObject(881, Terminal.Constructor(order_terminal), owning_building_guid = 43)
      LocalObject(882, Terminal.Constructor(order_terminal), owning_building_guid = 43)
      LocalObject(883, Terminal.Constructor(order_terminal), owning_building_guid = 43)
      LocalObject(884, Terminal.Constructor(order_terminal), owning_building_guid = 43)
      LocalObject(885, Terminal.Constructor(order_terminal), owning_building_guid = 43)
      LocalObject(886, Terminal.Constructor(order_terminal), owning_building_guid = 43)
      LocalObject(786, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(2394.346f, 5547.723f, 67.23998f), Vector3(0, 0, 269)), owning_building_guid = 43)
      LocalObject(787, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(2394.463f, 5541.015f, 67.23998f), Vector3(0, 0, 269)), owning_building_guid = 43)
      LocalObject(788, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(2394.58f, 5534.308f, 67.23998f), Vector3(0, 0, 269)), owning_building_guid = 43)
      LocalObject(789, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(2399.1f, 5547.806f, 67.23998f), Vector3(0, 0, 89)), owning_building_guid = 43)
      LocalObject(790, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(2399.218f, 5541.099f, 67.23998f), Vector3(0, 0, 89)), owning_building_guid = 43)
      LocalObject(791, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(2399.334f, 5534.391f, 67.23998f), Vector3(0, 0, 89)), owning_building_guid = 43)
    }

    Building53()

    def Building53(): Unit = { // Name: amerish_spawn1 Type: VT_building_nc GUID: 44, MapID: 53
      LocalBuilding(44, 53, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(3996f, 5924f, 43.87661f))))
      LocalObject(252, Door.Constructor(Vector3(3990.214f, 5976.023f, 45.95261f)), owning_building_guid = 44)
      LocalObject(253, Door.Constructor(Vector3(3990.343f, 5982.527f, 45.95261f)), owning_building_guid = 44)
      LocalObject(254, Door.Constructor(Vector3(3996.919f, 5975.906f, 45.95261f)), owning_building_guid = 44)
      LocalObject(255, Door.Constructor(Vector3(3997.048f, 5982.409f, 45.95261f)), owning_building_guid = 44)
      LocalObject(256, Door.Constructor(Vector3(4003.624f, 5975.789f, 45.95261f)), owning_building_guid = 44)
      LocalObject(257, Door.Constructor(Vector3(4003.753f, 5982.292f, 45.95261f)), owning_building_guid = 44)
      LocalObject(380, Door.Constructor(Vector3(3985.124f, 5990.601f, 45.58661f)), owning_building_guid = 44)
      LocalObject(381, Door.Constructor(Vector3(4009.174f, 5990.181f, 45.58661f)), owning_building_guid = 44)
      LocalObject(436, Door.Constructor(Vector3(3960.296f, 5940.613f, 47.05161f)), owning_building_guid = 44)
      LocalObject(437, Door.Constructor(Vector3(3976.385f, 5944.305f, 47.05161f)), owning_building_guid = 44)
      LocalObject(438, Door.Constructor(Vector3(3980.644f, 5960.286f, 47.05161f)), owning_building_guid = 44)
      LocalObject(439, Door.Constructor(Vector3(4012.613f, 5959.704f, 47.05161f)), owning_building_guid = 44)
      LocalObject(440, Door.Constructor(Vector3(4016.305f, 5943.615f, 47.05161f)), owning_building_guid = 44)
      LocalObject(441, Door.Constructor(Vector3(4032.286f, 5939.356f, 47.05161f)), owning_building_guid = 44)
      LocalObject(899, Terminal.Constructor(order_terminal), owning_building_guid = 44)
      LocalObject(900, Terminal.Constructor(order_terminal), owning_building_guid = 44)
      LocalObject(901, Terminal.Constructor(order_terminal), owning_building_guid = 44)
      LocalObject(902, Terminal.Constructor(order_terminal), owning_building_guid = 44)
      LocalObject(903, Terminal.Constructor(order_terminal), owning_building_guid = 44)
      LocalObject(904, Terminal.Constructor(order_terminal), owning_building_guid = 44)
      LocalObject(792, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(3990.234f, 5976.899f, 45.90862f), Vector3(0, 0, 181)), owning_building_guid = 44)
      LocalObject(793, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(3990.317f, 5981.653f, 45.90862f), Vector3(0, 0, 1)), owning_building_guid = 44)
      LocalObject(794, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(3996.941f, 5976.781f, 45.90862f), Vector3(0, 0, 181)), owning_building_guid = 44)
      LocalObject(795, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(3997.023f, 5981.536f, 45.90862f), Vector3(0, 0, 1)), owning_building_guid = 44)
      LocalObject(796, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4003.648f, 5976.665f, 45.90862f), Vector3(0, 0, 181)), owning_building_guid = 44)
      LocalObject(797, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4003.731f, 5981.419f, 45.90862f), Vector3(0, 0, 1)), owning_building_guid = 44)
    }

    Building18()

    def Building18(): Unit = { // Name: amerish_spawn2 Type: VT_building_nc GUID: 45, MapID: 18
      LocalBuilding(45, 18, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4148f, 5892f, 43.87661f))))
      LocalObject(258, Door.Constructor(Vector3(4142.213f, 5944.023f, 45.95261f)), owning_building_guid = 45)
      LocalObject(259, Door.Constructor(Vector3(4142.343f, 5950.527f, 45.95261f)), owning_building_guid = 45)
      LocalObject(260, Door.Constructor(Vector3(4148.919f, 5943.906f, 45.95261f)), owning_building_guid = 45)
      LocalObject(261, Door.Constructor(Vector3(4149.048f, 5950.409f, 45.95261f)), owning_building_guid = 45)
      LocalObject(262, Door.Constructor(Vector3(4155.624f, 5943.789f, 45.95261f)), owning_building_guid = 45)
      LocalObject(263, Door.Constructor(Vector3(4155.753f, 5950.292f, 45.95261f)), owning_building_guid = 45)
      LocalObject(384, Door.Constructor(Vector3(4137.124f, 5958.601f, 45.58661f)), owning_building_guid = 45)
      LocalObject(385, Door.Constructor(Vector3(4161.174f, 5958.181f, 45.58661f)), owning_building_guid = 45)
      LocalObject(442, Door.Constructor(Vector3(4112.296f, 5908.613f, 47.05161f)), owning_building_guid = 45)
      LocalObject(443, Door.Constructor(Vector3(4128.385f, 5912.305f, 47.05161f)), owning_building_guid = 45)
      LocalObject(444, Door.Constructor(Vector3(4132.644f, 5928.286f, 47.05161f)), owning_building_guid = 45)
      LocalObject(445, Door.Constructor(Vector3(4164.613f, 5927.704f, 47.05161f)), owning_building_guid = 45)
      LocalObject(446, Door.Constructor(Vector3(4168.305f, 5911.615f, 47.05161f)), owning_building_guid = 45)
      LocalObject(447, Door.Constructor(Vector3(4184.286f, 5907.356f, 47.05161f)), owning_building_guid = 45)
      LocalObject(915, Terminal.Constructor(order_terminal), owning_building_guid = 45)
      LocalObject(916, Terminal.Constructor(order_terminal), owning_building_guid = 45)
      LocalObject(917, Terminal.Constructor(order_terminal), owning_building_guid = 45)
      LocalObject(918, Terminal.Constructor(order_terminal), owning_building_guid = 45)
      LocalObject(919, Terminal.Constructor(order_terminal), owning_building_guid = 45)
      LocalObject(920, Terminal.Constructor(order_terminal), owning_building_guid = 45)
      LocalObject(798, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4142.234f, 5944.899f, 45.90862f), Vector3(0, 0, 181)), owning_building_guid = 45)
      LocalObject(799, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4142.317f, 5949.653f, 45.90862f), Vector3(0, 0, 1)), owning_building_guid = 45)
      LocalObject(800, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4148.941f, 5944.781f, 45.90862f), Vector3(0, 0, 181)), owning_building_guid = 45)
      LocalObject(801, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4149.023f, 5949.536f, 45.90862f), Vector3(0, 0, 1)), owning_building_guid = 45)
      LocalObject(802, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4155.648f, 5944.665f, 45.90862f), Vector3(0, 0, 181)), owning_building_guid = 45)
      LocalObject(803, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4155.731f, 5949.419f, 45.90862f), Vector3(0, 0, 1)), owning_building_guid = 45)
    }

    Building52()

    def Building52(): Unit = { // Name: amerish_spawn3 Type: VT_building_nc GUID: 46, MapID: 52
      LocalBuilding(46, 52, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4302f, 5918f, 43.87661f))))
      LocalObject(264, Door.Constructor(Vector3(4296.213f, 5970.023f, 45.95261f)), owning_building_guid = 46)
      LocalObject(265, Door.Constructor(Vector3(4296.343f, 5976.527f, 45.95261f)), owning_building_guid = 46)
      LocalObject(266, Door.Constructor(Vector3(4302.919f, 5969.906f, 45.95261f)), owning_building_guid = 46)
      LocalObject(267, Door.Constructor(Vector3(4303.048f, 5976.409f, 45.95261f)), owning_building_guid = 46)
      LocalObject(268, Door.Constructor(Vector3(4309.624f, 5969.789f, 45.95261f)), owning_building_guid = 46)
      LocalObject(269, Door.Constructor(Vector3(4309.753f, 5976.292f, 45.95261f)), owning_building_guid = 46)
      LocalObject(388, Door.Constructor(Vector3(4291.124f, 5984.601f, 45.58661f)), owning_building_guid = 46)
      LocalObject(389, Door.Constructor(Vector3(4315.174f, 5984.181f, 45.58661f)), owning_building_guid = 46)
      LocalObject(448, Door.Constructor(Vector3(4266.296f, 5934.613f, 47.05161f)), owning_building_guid = 46)
      LocalObject(449, Door.Constructor(Vector3(4282.385f, 5938.305f, 47.05161f)), owning_building_guid = 46)
      LocalObject(450, Door.Constructor(Vector3(4286.644f, 5954.286f, 47.05161f)), owning_building_guid = 46)
      LocalObject(451, Door.Constructor(Vector3(4318.613f, 5953.704f, 47.05161f)), owning_building_guid = 46)
      LocalObject(452, Door.Constructor(Vector3(4322.305f, 5937.615f, 47.05161f)), owning_building_guid = 46)
      LocalObject(453, Door.Constructor(Vector3(4338.286f, 5933.356f, 47.05161f)), owning_building_guid = 46)
      LocalObject(940, Terminal.Constructor(order_terminal), owning_building_guid = 46)
      LocalObject(941, Terminal.Constructor(order_terminal), owning_building_guid = 46)
      LocalObject(942, Terminal.Constructor(order_terminal), owning_building_guid = 46)
      LocalObject(943, Terminal.Constructor(order_terminal), owning_building_guid = 46)
      LocalObject(944, Terminal.Constructor(order_terminal), owning_building_guid = 46)
      LocalObject(945, Terminal.Constructor(order_terminal), owning_building_guid = 46)
      LocalObject(804, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4296.234f, 5970.899f, 45.90862f), Vector3(0, 0, 181)), owning_building_guid = 46)
      LocalObject(805, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4296.317f, 5975.653f, 45.90862f), Vector3(0, 0, 1)), owning_building_guid = 46)
      LocalObject(806, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4302.941f, 5970.781f, 45.90862f), Vector3(0, 0, 181)), owning_building_guid = 46)
      LocalObject(807, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4303.023f, 5975.536f, 45.90862f), Vector3(0, 0, 1)), owning_building_guid = 46)
      LocalObject(808, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4309.648f, 5970.665f, 45.90862f), Vector3(0, 0, 181)), owning_building_guid = 46)
      LocalObject(809, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4309.731f, 5975.419f, 45.90862f), Vector3(0, 0, 1)), owning_building_guid = 46)
    }

    Building5()

    def Building5(): Unit = { // Name: Esamir_Spawn1 Type: VT_building_nc GUID: 47, MapID: 5
      LocalBuilding(47, 5, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4662f, 3362f, 68.73806f))))
      LocalObject(270, Door.Constructor(Vector3(4695.403f, 3402.301f, 70.81406f)), owning_building_guid = 47)
      LocalObject(271, Door.Constructor(Vector3(4699.977f, 3397.396f, 70.81406f)), owning_building_guid = 47)
      LocalObject(272, Door.Constructor(Vector3(4700.171f, 3406.725f, 70.81406f)), owning_building_guid = 47)
      LocalObject(273, Door.Constructor(Vector3(4704.55f, 3392.492f, 70.81406f)), owning_building_guid = 47)
      LocalObject(274, Door.Constructor(Vector3(4704.744f, 3401.821f, 70.81406f)), owning_building_guid = 47)
      LocalObject(275, Door.Constructor(Vector3(4709.317f, 3396.916f, 70.81406f)), owning_building_guid = 47)
      LocalObject(390, Door.Constructor(Vector3(4702.353f, 3416.089f, 70.44806f)), owning_building_guid = 47)
      LocalObject(391, Door.Constructor(Vector3(4718.758f, 3398.496f, 70.44806f)), owning_building_guid = 47)
      LocalObject(454, Door.Constructor(Vector3(4649.148f, 3399.223f, 71.91306f)), owning_building_guid = 47)
      LocalObject(455, Door.Constructor(Vector3(4662.98f, 3390.215f, 71.91306f)), owning_building_guid = 47)
      LocalObject(456, Door.Constructor(Vector3(4677.435f, 3398.252f, 71.91306f)), owning_building_guid = 47)
      LocalObject(458, Door.Constructor(Vector3(4690.215f, 3361.02f, 71.91306f)), owning_building_guid = 47)
      LocalObject(460, Door.Constructor(Vector3(4698.252f, 3346.565f, 71.91306f)), owning_building_guid = 47)
      LocalObject(461, Door.Constructor(Vector3(4699.223f, 3374.852f, 71.91306f)), owning_building_guid = 47)
      LocalObject(949, Terminal.Constructor(order_terminal), owning_building_guid = 47)
      LocalObject(950, Terminal.Constructor(order_terminal), owning_building_guid = 47)
      LocalObject(951, Terminal.Constructor(order_terminal), owning_building_guid = 47)
      LocalObject(952, Terminal.Constructor(order_terminal), owning_building_guid = 47)
      LocalObject(953, Terminal.Constructor(order_terminal), owning_building_guid = 47)
      LocalObject(954, Terminal.Constructor(order_terminal), owning_building_guid = 47)
      LocalObject(810, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4696.047f, 3402.895f, 70.77006f), Vector3(0, 0, 227)), owning_building_guid = 47)
      LocalObject(811, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4699.524f, 3406.137f, 70.77006f), Vector3(0, 0, 47)), owning_building_guid = 47)
      LocalObject(812, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4700.622f, 3397.988f, 70.77006f), Vector3(0, 0, 227)), owning_building_guid = 47)
      LocalObject(813, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4704.099f, 3401.232f, 70.77006f), Vector3(0, 0, 47)), owning_building_guid = 47)
      LocalObject(814, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4705.197f, 3393.082f, 70.77006f), Vector3(0, 0, 227)), owning_building_guid = 47)
      LocalObject(815, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4708.674f, 3396.325f, 70.77006f), Vector3(0, 0, 47)), owning_building_guid = 47)
    }

    Building7()

    def Building7(): Unit = { // Name: Esamir_Spawn2 Type: VT_building_nc GUID: 48, MapID: 7
      LocalBuilding(48, 7, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4692f, 3636f, 68.73806f))))
      LocalObject(276, Door.Constructor(Vector3(4723.958f, 3594.54f, 70.81406f)), owning_building_guid = 48)
      LocalObject(277, Door.Constructor(Vector3(4728.546f, 3589.93f, 70.81406f)), owning_building_guid = 48)
      LocalObject(278, Door.Constructor(Vector3(4728.7f, 3599.282f, 70.81406f)), owning_building_guid = 48)
      LocalObject(279, Door.Constructor(Vector3(4733.288f, 3594.672f, 70.81406f)), owning_building_guid = 48)
      LocalObject(280, Door.Constructor(Vector3(4733.442f, 3604.024f, 70.81406f)), owning_building_guid = 48)
      LocalObject(281, Door.Constructor(Vector3(4738.03f, 3599.413f, 70.81406f)), owning_building_guid = 48)
      LocalObject(392, Door.Constructor(Vector3(4730.455f, 3580.55f, 70.44806f)), owning_building_guid = 48)
      LocalObject(393, Door.Constructor(Vector3(4747.464f, 3597.559f, 70.44806f)), owning_building_guid = 48)
      LocalObject(457, Door.Constructor(Vector3(4677.84f, 3599.231f, 71.91306f)), owning_building_guid = 48)
      LocalObject(459, Door.Constructor(Vector3(4692.005f, 3607.768f, 71.91306f)), owning_building_guid = 48)
      LocalObject(462, Door.Constructor(Vector3(4706.143f, 3599.248f, 71.91306f)), owning_building_guid = 48)
      LocalObject(463, Door.Constructor(Vector3(4720.232f, 3636.005f, 71.91306f)), owning_building_guid = 48)
      LocalObject(464, Door.Constructor(Vector3(4728.752f, 3650.143f, 71.91306f)), owning_building_guid = 48)
      LocalObject(465, Door.Constructor(Vector3(4728.769f, 3621.84f, 71.91306f)), owning_building_guid = 48)
      LocalObject(955, Terminal.Constructor(order_terminal), owning_building_guid = 48)
      LocalObject(956, Terminal.Constructor(order_terminal), owning_building_guid = 48)
      LocalObject(957, Terminal.Constructor(order_terminal), owning_building_guid = 48)
      LocalObject(958, Terminal.Constructor(order_terminal), owning_building_guid = 48)
      LocalObject(959, Terminal.Constructor(order_terminal), owning_building_guid = 48)
      LocalObject(960, Terminal.Constructor(order_terminal), owning_building_guid = 48)
      LocalObject(816, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4724.571f, 3593.914f, 70.77006f), Vector3(0, 0, 315)), owning_building_guid = 48)
      LocalObject(817, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4727.933f, 3590.552f, 70.77006f), Vector3(0, 0, 135)), owning_building_guid = 48)
      LocalObject(818, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4729.314f, 3598.658f, 70.77006f), Vector3(0, 0, 315)), owning_building_guid = 48)
      LocalObject(819, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4732.677f, 3595.296f, 70.77006f), Vector3(0, 0, 135)), owning_building_guid = 48)
      LocalObject(820, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4734.058f, 3603.401f, 70.77006f), Vector3(0, 0, 315)), owning_building_guid = 48)
      LocalObject(821, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4737.42f, 3600.039f, 70.77006f), Vector3(0, 0, 135)), owning_building_guid = 48)
    }

    Building6()

    def Building6(): Unit = { // Name: Esamir_Spawn3 Type: VT_building_nc GUID: 49, MapID: 6
      LocalBuilding(49, 6, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4966f, 3658f, 68.73806f))))
      LocalObject(282, Door.Constructor(Vector3(4919.299f, 3622.264f, 70.81406f)), owning_building_guid = 49)
      LocalObject(283, Door.Constructor(Vector3(4923.958f, 3617.439f, 70.81406f)), owning_building_guid = 49)
      LocalObject(284, Door.Constructor(Vector3(4923.989f, 3626.771f, 70.81406f)), owning_building_guid = 49)
      LocalObject(285, Door.Constructor(Vector3(4928.615f, 3612.615f, 70.81406f)), owning_building_guid = 49)
      LocalObject(286, Door.Constructor(Vector3(4928.647f, 3621.946f, 70.81406f)), owning_building_guid = 49)
      LocalObject(287, Door.Constructor(Vector3(4933.306f, 3617.122f, 70.81406f)), owning_building_guid = 49)
      LocalObject(398, Door.Constructor(Vector3(4909.887f, 3620.519f, 70.44806f)), owning_building_guid = 49)
      LocalObject(399, Door.Constructor(Vector3(4926.597f, 3603.215f, 70.44806f)), owning_building_guid = 49)
      LocalObject(466, Door.Constructor(Vector3(4929.007f, 3644.5f, 71.91306f)), owning_building_guid = 49)
      LocalObject(467, Door.Constructor(Vector3(4929.484f, 3672.8f, 71.91306f)), owning_building_guid = 49)
      LocalObject(468, Door.Constructor(Vector3(4937.772f, 3658.488f, 71.91306f)), owning_building_guid = 49)
      LocalObject(469, Door.Constructor(Vector3(4951.201f, 3621.484f, 71.91306f)), owning_building_guid = 49)
      LocalObject(470, Door.Constructor(Vector3(4965.512f, 3629.772f, 71.91306f)), owning_building_guid = 49)
      LocalObject(471, Door.Constructor(Vector3(4979.5f, 3621.007f, 71.91306f)), owning_building_guid = 49)
      LocalObject(984, Terminal.Constructor(order_terminal), owning_building_guid = 49)
      LocalObject(985, Terminal.Constructor(order_terminal), owning_building_guid = 49)
      LocalObject(986, Terminal.Constructor(order_terminal), owning_building_guid = 49)
      LocalObject(987, Terminal.Constructor(order_terminal), owning_building_guid = 49)
      LocalObject(988, Terminal.Constructor(order_terminal), owning_building_guid = 49)
      LocalObject(989, Terminal.Constructor(order_terminal), owning_building_guid = 49)
      LocalObject(822, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4919.932f, 3622.866f, 70.77006f), Vector3(0, 0, 226)), owning_building_guid = 49)
      LocalObject(823, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4923.352f, 3626.168f, 70.77006f), Vector3(0, 0, 46)), owning_building_guid = 49)
      LocalObject(824, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4924.592f, 3618.04f, 70.77006f), Vector3(0, 0, 226)), owning_building_guid = 49)
      LocalObject(825, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4928.013f, 3621.344f, 70.77006f), Vector3(0, 0, 46)), owning_building_guid = 49)
      LocalObject(826, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4929.252f, 3613.215f, 70.77006f), Vector3(0, 0, 226)), owning_building_guid = 49)
      LocalObject(827, SpawnTube.Constructor(respawn_tube_sanctuary, Vector3(4932.672f, 3616.517f, 70.77006f), Vector3(0, 0, 46)), owning_building_guid = 49)
    }

    Building34()

    def Building34(): Unit = { // Name: Cyssor_Air2 Type: vt_dropship GUID: 50, MapID: 34
      LocalBuilding(50, 34, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(2078f, 5496f, 65.20686f))))
      LocalObject(300, Terminal.Constructor(dropship_vehicle_terminal), owning_building_guid = 50)
      LocalObject(288, VehicleSpawnPad.Constructor(dropship_pad_doors, Vector3(2081.589f, 5495.958f, 61.22186f), Vector3(0, 0, 181)), owning_building_guid = 50, terminal_guid = 300)
    }

    Building38()

    def Building38(): Unit = { // Name: Cyssor_Air1 Type: vt_dropship GUID: 51, MapID: 38
      LocalBuilding(51, 38, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(2078f, 5572f, 65.20757f))))
      LocalObject(301, Terminal.Constructor(dropship_vehicle_terminal), owning_building_guid = 51)
      LocalObject(289, VehicleSpawnPad.Constructor(dropship_pad_doors, Vector3(2081.589f, 5571.958f, 61.22257f), Vector3(0, 0, 181)), owning_building_guid = 51, terminal_guid = 301)
    }

    Building39()

    def Building39(): Unit = { // Name: Cyssor_Air4 Type: vt_dropship GUID: 52, MapID: 39
      LocalBuilding(52, 39, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(2290f, 5386f, 65.21352f))))
      LocalObject(302, Terminal.Constructor(dropship_vehicle_terminal), owning_building_guid = 52)
      LocalObject(290, VehicleSpawnPad.Constructor(dropship_pad_doors, Vector3(2290.043f, 5389.589f, 61.22852f), Vector3(0, 0, 91)), owning_building_guid = 52, terminal_guid = 302)
    }

    Building33()

    def Building33(): Unit = { // Name: Cyssor_Air3 Type: vt_dropship GUID: 53, MapID: 33
      LocalBuilding(53, 33, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(2464f, 5640f, 65.20798f))))
      LocalObject(303, Terminal.Constructor(dropship_vehicle_terminal), owning_building_guid = 53)
      LocalObject(291, VehicleSpawnPad.Constructor(dropship_pad_doors, Vector3(2461.346f, 5637.583f, 61.22298f), Vector3(0, 0, -42)), owning_building_guid = 53, terminal_guid = 303)
    }

    Building22()

    def Building22(): Unit = { // Name: amerish_air3 Type: vt_dropship GUID: 54, MapID: 22
      LocalBuilding(54, 22, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(3926f, 6060f, 43.87661f))))
      LocalObject(304, Terminal.Constructor(dropship_vehicle_terminal), owning_building_guid = 54)
      LocalObject(292, VehicleSpawnPad.Constructor(dropship_pad_doors, Vector3(3929.589f, 6059.958f, 39.89161f), Vector3(0, 0, 181)), owning_building_guid = 54, terminal_guid = 304)
    }

    Building25()

    def Building25(): Unit = { // Name: amerish_air4 Type: vt_dropship GUID: 55, MapID: 25
      LocalBuilding(55, 25, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(3986f, 6176f, 43.87661f))))
      LocalObject(305, Terminal.Constructor(dropship_vehicle_terminal), owning_building_guid = 55)
      LocalObject(293, VehicleSpawnPad.Constructor(dropship_pad_doors, Vector3(3989.589f, 6175.958f, 39.89161f), Vector3(0, 0, 181)), owning_building_guid = 55, terminal_guid = 305)
    }

    Building24()

    def Building24(): Unit = { // Name: amerish_air2 Type: vt_dropship GUID: 56, MapID: 24
      LocalBuilding(56, 24, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4320f, 6168f, 43.87661f))))
      LocalObject(306, Terminal.Constructor(dropship_vehicle_terminal), owning_building_guid = 56)
      LocalObject(294, VehicleSpawnPad.Constructor(dropship_pad_doors, Vector3(4316.411f, 6168.042f, 39.89161f), Vector3(0, 0, 1)), owning_building_guid = 56, terminal_guid = 306)
    }

    Building21()

    def Building21(): Unit = { // Name: amerish_air1 Type: vt_dropship GUID: 57, MapID: 21
      LocalBuilding(57, 21, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4376f, 6058f, 43.87661f))))
      LocalObject(307, Terminal.Constructor(dropship_vehicle_terminal), owning_building_guid = 57)
      LocalObject(295, VehicleSpawnPad.Constructor(dropship_pad_doors, Vector3(4372.411f, 6058.042f, 39.89161f), Vector3(0, 0, 1)), owning_building_guid = 57, terminal_guid = 307)
    }

    Building14()

    def Building14(): Unit = { // Name: Esamir_Air2 Type: vt_dropship GUID: 58, MapID: 14
      LocalBuilding(58, 14, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4620f, 3466f, 68.73806f))))
      LocalObject(308, Terminal.Constructor(dropship_vehicle_terminal), owning_building_guid = 58)
      LocalObject(296, VehicleSpawnPad.Constructor(dropship_pad_doors, Vector3(4622.523f, 3468.552f, 64.75306f), Vector3(0, 0, 135)), owning_building_guid = 58, terminal_guid = 308)
    }

    Building17()

    def Building17(): Unit = { // Name: Esamir_Air1 Type: vt_dropship GUID: 59, MapID: 17
      LocalBuilding(59, 17, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4768f, 3318f, 68.73806f))))
      LocalObject(309, Terminal.Constructor(dropship_vehicle_terminal), owning_building_guid = 59)
      LocalObject(297, VehicleSpawnPad.Constructor(dropship_pad_doors, Vector3(4770.523f, 3320.552f, 64.75306f), Vector3(0, 0, 135)), owning_building_guid = 59, terminal_guid = 309)
    }

    Building15()

    def Building15(): Unit = { // Name: Esamir_Air4 Type: vt_dropship GUID: 60, MapID: 15
      LocalBuilding(60, 15, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4868f, 3696f, 68.73806f))))
      LocalObject(310, Terminal.Constructor(dropship_vehicle_terminal), owning_building_guid = 60)
      LocalObject(298, VehicleSpawnPad.Constructor(dropship_pad_doors, Vector3(4865.477f, 3693.448f, 64.75306f), Vector3(0, 0, -45)), owning_building_guid = 60, terminal_guid = 310)
    }

    Building16()

    def Building16(): Unit = { // Name: Esamir_Air3 Type: vt_dropship GUID: 61, MapID: 16
      LocalBuilding(61, 16, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(5010f, 3556f, 68.73806f))))
      LocalObject(311, Terminal.Constructor(dropship_vehicle_terminal), owning_building_guid = 61)
      LocalObject(299, VehicleSpawnPad.Constructor(dropship_pad_doors, Vector3(5007.477f, 3553.448f, 64.75306f), Vector3(0, 0, -45)), owning_building_guid = 61, terminal_guid = 311)
    }

    Building67()

    def Building67(): Unit = { // Name: NC_NW_Tport_04 Type: vt_spawn GUID: 62, MapID: 67
      LocalBuilding(62, 67, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(2132f, 5532f, 65.20512f))))
    }

    Building69()

    def Building69(): Unit = { // Name: NC_NW_Tport_02 Type: vt_spawn GUID: 63, MapID: 69
      LocalBuilding(63, 69, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(2242f, 5432f, 65.2088f))))
    }

    Building70()

    def Building70(): Unit = { // Name: NC_NW_Tport_01 Type: vt_spawn GUID: 64, MapID: 70
      LocalBuilding(64, 70, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(2258f, 5642f, 65.20429f))))
    }

    Building68()

    def Building68(): Unit = { // Name: NC_NW_Tport_03 Type: vt_spawn GUID: 65, MapID: 68
      LocalBuilding(65, 68, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(2388f, 5618f, 65.20798f))))
    }

    Building66()

    def Building66(): Unit = { // Name: NC_NE_Tport_02 Type: vt_spawn GUID: 66, MapID: 66
      LocalBuilding(66, 66, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4060f, 5986f, 43.87661f))))
    }

    Building65()

    def Building65(): Unit = { // Name: NC_NE_Tport_03 Type: vt_spawn GUID: 67, MapID: 65
      LocalBuilding(67, 65, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4156f, 6160f, 43.87661f))))
    }

    Building63()

    def Building63(): Unit = { // Name: NC_NE_Tport_01 Type: vt_spawn GUID: 68, MapID: 63
      LocalBuilding(68, 63, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4212f, 5954f, 43.87661f))))
    }

    Building64()

    def Building64(): Unit = { // Name: NC_NE_Tport_04 Type: vt_spawn GUID: 69, MapID: 64
      LocalBuilding(69, 64, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4258f, 6148f, 43.87661f))))
    }

    Building59()

    def Building59(): Unit = { // Name: NC_SE_Tport_04 Type: vt_spawn GUID: 70, MapID: 59
      LocalBuilding(70, 59, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4698f, 3506f, 68.73806f))))
    }

    Building60()

    def Building60(): Unit = { // Name: NC_SE_Tport_03 Type: vt_spawn GUID: 71, MapID: 60
      LocalBuilding(71, 60, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4818f, 3622f, 68.73806f))))
    }

    Building61()

    def Building61(): Unit = { // Name: NC_SE_Tport_02 Type: vt_spawn GUID: 72, MapID: 61
      LocalBuilding(72, 61, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4826f, 3398f, 68.73806f))))
    }

    Building62()

    def Building62(): Unit = { // Name: NC_SE_Tport_01 Type: vt_spawn GUID: 73, MapID: 62
      LocalBuilding(73, 62, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4922f, 3500f, 68.73806f))))
    }

    Building42()

    def Building42(): Unit = { // Name: Cyssor_Vehicle6 Type: vt_vehicle GUID: 74, MapID: 42
      LocalBuilding(74, 42, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(2078f, 5642f, 65.20348f))))
      LocalObject(1144, Terminal.Constructor(ground_vehicle_terminal), owning_building_guid = 74)
      LocalObject(756, VehicleSpawnPad.Constructor(mb_pad_creation, Vector3(2077.973f, 5642.147f, 63.73248f), Vector3(0, 0, 0)), owning_building_guid = 74, terminal_guid = 1144)
    }

    Building32()

    def Building32(): Unit = { // Name: Cyssor_Vehicle1 Type: vt_vehicle GUID: 75, MapID: 32
      LocalBuilding(75, 32, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(2082f, 5418f, 65.21249f))))
      LocalObject(1145, Terminal.Constructor(ground_vehicle_terminal), owning_building_guid = 75)
      LocalObject(757, VehicleSpawnPad.Constructor(mb_pad_creation, Vector3(2081.853f, 5417.973f, 63.74149f), Vector3(0, 0, -90)), owning_building_guid = 75, terminal_guid = 1145)
    }

    Building41()

    def Building41(): Unit = { // Name: Cyssor_Vehicle5 Type: vt_vehicle GUID: 76, MapID: 41
      LocalBuilding(76, 41, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(2186f, 5662f, 65.20142f))))
      LocalObject(1146, Terminal.Constructor(ground_vehicle_terminal), owning_building_guid = 76)
      LocalObject(758, VehicleSpawnPad.Constructor(mb_pad_creation, Vector3(2185.973f, 5662.147f, 63.73042f), Vector3(0, 0, 0)), owning_building_guid = 76, terminal_guid = 1146)
    }

    Building43()

    def Building43(): Unit = { // Name: Cyssor_Vehicle4 Type: vt_vehicle GUID: 77, MapID: 43
      LocalBuilding(77, 43, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(2328f, 5662f, 65.20798f))))
      LocalObject(1147, Terminal.Constructor(ground_vehicle_terminal), owning_building_guid = 77)
      LocalObject(759, VehicleSpawnPad.Constructor(mb_pad_creation, Vector3(2327.976f, 5662.147f, 63.73698f), Vector3(0, 0, 1)), owning_building_guid = 77, terminal_guid = 1147)
    }

    Building40()

    def Building40(): Unit = { // Name: Cyssor_Vehicle3 Type: vt_vehicle GUID: 78, MapID: 40
      LocalBuilding(78, 40, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(2410f, 5694f, 65.20798f))))
      LocalObject(1148, Terminal.Constructor(ground_vehicle_terminal), owning_building_guid = 78)
      LocalObject(760, VehicleSpawnPad.Constructor(mb_pad_creation, Vector3(2409.88f, 5694.089f, 63.73698f), Vector3(0, 0, -43)), owning_building_guid = 78, terminal_guid = 1148)
    }

    Building31()

    def Building31(): Unit = { // Name: Cyssor_Vehicle2 Type: vt_vehicle GUID: 79, MapID: 31
      LocalBuilding(79, 31, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(2468f, 5458f, 65.2127f))))
      LocalObject(1149, Terminal.Constructor(ground_vehicle_terminal), owning_building_guid = 79)
      LocalObject(761, VehicleSpawnPad.Constructor(mb_pad_creation, Vector3(2468.146f, 5458.03f, 63.7417f), Vector3(0, 0, 89)), owning_building_guid = 79, terminal_guid = 1149)
    }

    Building19()

    def Building19(): Unit = { // Name: amerish_vehicle1 Type: vt_vehicle GUID: 80, MapID: 19
      LocalBuilding(80, 19, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(3990f, 6094f, 43.87661f))))
      LocalObject(1151, Terminal.Constructor(ground_vehicle_terminal), owning_building_guid = 80)
      LocalObject(762, VehicleSpawnPad.Constructor(mb_pad_creation, Vector3(3989.88f, 6094.089f, 42.40561f), Vector3(0, 0, -43)), owning_building_guid = 80, terminal_guid = 1151)
    }

    Building29()

    def Building29(): Unit = { // Name: amerish_vehicle2 Type: vt_vehicle GUID: 81, MapID: 29
      LocalBuilding(81, 29, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4000f, 6248f, 43.87661f))))
      LocalObject(1150, Terminal.Constructor(ground_vehicle_terminal), owning_building_guid = 81)
      LocalObject(763, VehicleSpawnPad.Constructor(mb_pad_creation, Vector3(3999.978f, 6248.148f, 42.40561f), Vector3(0, 0, 2)), owning_building_guid = 81, terminal_guid = 1150)
    }

    Building28()

    def Building28(): Unit = { // Name: amerish_vehicle3 Type: vt_vehicle GUID: 82, MapID: 28
      LocalBuilding(82, 28, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4104f, 6194f, 43.87661f))))
      LocalObject(1152, Terminal.Constructor(ground_vehicle_terminal), owning_building_guid = 82)
      LocalObject(764, VehicleSpawnPad.Constructor(mb_pad_creation, Vector3(4103.976f, 6194.147f, 42.40561f), Vector3(0, 0, 1)), owning_building_guid = 82, terminal_guid = 1152)
    }

    Building27()

    def Building27(): Unit = { // Name: amerish_vehicle4 Type: vt_vehicle GUID: 83, MapID: 27
      LocalBuilding(83, 27, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4200f, 6196f, 43.87661f))))
      LocalObject(1153, Terminal.Constructor(ground_vehicle_terminal), owning_building_guid = 83)
      LocalObject(765, VehicleSpawnPad.Constructor(mb_pad_creation, Vector3(4199.976f, 6196.147f, 42.40561f), Vector3(0, 0, 1)), owning_building_guid = 83, terminal_guid = 1153)
    }

    Building26()

    def Building26(): Unit = { // Name: amerish_vehicle5 Type: vt_vehicle GUID: 84, MapID: 26
      LocalBuilding(84, 26, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4304f, 6244f, 43.92173f))))
      LocalObject(1154, Terminal.Constructor(ground_vehicle_terminal), owning_building_guid = 84)
      LocalObject(766, VehicleSpawnPad.Constructor(mb_pad_creation, Vector3(4303.976f, 6244.147f, 42.45073f), Vector3(0, 0, 1)), owning_building_guid = 84, terminal_guid = 1154)
    }

    Building20()

    def Building20(): Unit = { // Name: amerish_vehicle6 Type: vt_vehicle GUID: 85, MapID: 20
      LocalBuilding(85, 20, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4316f, 6094f, 43.87661f))))
      LocalObject(1155, Terminal.Constructor(ground_vehicle_terminal), owning_building_guid = 85)
      LocalObject(767, VehicleSpawnPad.Constructor(mb_pad_creation, Vector3(4316.083f, 6094.125f, 42.40561f), Vector3(0, 0, 44)), owning_building_guid = 85, terminal_guid = 1155)
    }

    Building12()

    def Building12(): Unit = { // Name: Esamir_Vehicle1 Type: vt_vehicle GUID: 86, MapID: 12
      LocalBuilding(86, 12, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4644f, 3540f, 68.73806f))))
      LocalObject(1156, Terminal.Constructor(ground_vehicle_terminal), owning_building_guid = 86)
      LocalObject(768, VehicleSpawnPad.Constructor(mb_pad_creation, Vector3(4643.917f, 3539.875f, 67.26706f), Vector3(0, 0, 224)), owning_building_guid = 86, terminal_guid = 1156)
    }

    Building13()

    def Building13(): Unit = { // Name: Esamir_Vehicle2 Type: vt_vehicle GUID: 87, MapID: 13
      LocalBuilding(87, 13, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4782f, 3680f, 68.73806f))))
      LocalObject(1157, Terminal.Constructor(ground_vehicle_terminal), owning_building_guid = 87)
      LocalObject(769, VehicleSpawnPad.Constructor(mb_pad_creation, Vector3(4782.085f, 3680.123f, 67.26706f), Vector3(0, 0, 45)), owning_building_guid = 87, terminal_guid = 1157)
    }

    Building8()

    def Building8(): Unit = { // Name: Esamir_Vehicle6 Type: vt_vehicle GUID: 88, MapID: 8
      LocalBuilding(88, 8, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4834f, 3276f, 68.73806f))))
      LocalObject(1158, Terminal.Constructor(ground_vehicle_terminal), owning_building_guid = 88)
      LocalObject(770, VehicleSpawnPad.Constructor(mb_pad_creation, Vector3(4834.123f, 3275.915f, 67.26706f), Vector3(0, 0, 135)), owning_building_guid = 88, terminal_guid = 1158)
    }

    Building9()

    def Building9(): Unit = { // Name: Esamir_Vehicle5 Type: vt_vehicle GUID: 89, MapID: 9
      LocalBuilding(89, 9, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4878f, 3378f, 68.73806f))))
      LocalObject(1159, Terminal.Constructor(ground_vehicle_terminal), owning_building_guid = 89)
      LocalObject(771, VehicleSpawnPad.Constructor(mb_pad_creation, Vector3(4878.123f, 3377.915f, 67.26706f), Vector3(0, 0, 135)), owning_building_guid = 89, terminal_guid = 1159)
    }

    Building10()

    def Building10(): Unit = { // Name: Esamir_Vehicle4 Type: vt_vehicle GUID: 90, MapID: 10
      LocalBuilding(90, 10, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(4948f, 3446f, 68.73806f))))
      LocalObject(1160, Terminal.Constructor(ground_vehicle_terminal), owning_building_guid = 90)
      LocalObject(772, VehicleSpawnPad.Constructor(mb_pad_creation, Vector3(4948.123f, 3445.915f, 67.26706f), Vector3(0, 0, 135)), owning_building_guid = 90, terminal_guid = 1160)
    }

    Building11()

    def Building11(): Unit = { // Name: Esamir_Vehicle3 Type: vt_vehicle GUID: 91, MapID: 11
      LocalBuilding(91, 11, FoundationBuilder(Building.Structure(StructureType.Building, Vector3(5048f, 3492f, 68.73806f))))
      LocalObject(1161, Terminal.Constructor(ground_vehicle_terminal), owning_building_guid = 91)
      LocalObject(773, VehicleSpawnPad.Constructor(mb_pad_creation, Vector3(5048.122f, 3491.913f, 67.26706f), Vector3(0, 0, 136)), owning_building_guid = 91, terminal_guid = 1161)
    }

    Building1()

    def Building1(): Unit = { // Name: WG_NCSanc_to_Cyssor Type: warpgate GUID: 92, MapID: 1
      LocalBuilding(92, 1, FoundationBuilder(WarpGate.Structure(Vector3(2190f, 5954f, 46.85717f))))
    }

    Building2()

    def Building2(): Unit = { // Name: WG_NCSanc_to_Amerish Type: warpgate GUID: 93, MapID: 2
      LocalBuilding(93, 2, FoundationBuilder(WarpGate.Structure(Vector3(4156f, 6490f, 43.88584f))))
    }

    Building3()

    def Building3(): Unit = { // Name: WG_NCSanc_to_Esamir Type: warpgate GUID: 94, MapID: 3
      LocalBuilding(94, 3, FoundationBuilder(WarpGate.Structure(Vector3(5174f, 3174f, 56.06128f))))
    }
  }
}
