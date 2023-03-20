package gg.rsmod.plugins.content.skills.slayer.data

import gg.rsmod.game.model.combat.SlayerAssignment
import gg.rsmod.plugins.api.cfg.Requirement

/**
 * @author Alycia <https://github.com/alycii>
 */
class SlayerData(private val assignmentsByMaster: Map<SlayerMaster, List<Assignment>>) {
    fun getAssignmentsForMaster(master: SlayerMaster): List<Assignment> {
        return assignmentsByMaster[master] ?: emptyList()
    }
}

data class Assignment(val assignment: SlayerAssignment, val amount: IntRange = 0..0, val requirement: List<Requirement> = emptyList())

enum class SlayerMaster(val defaultAmount: IntRange) {
    TURAEL(15..50),
    VANNAKA(60..120),
}

val slayerData = SlayerData(
    mapOf(
        SlayerMaster.TURAEL to listOf(
            Assignment(assignment = SlayerAssignment.BIRD),
            Assignment(assignment = SlayerAssignment.BEAR),
            Assignment(assignment = SlayerAssignment.COW),
            Assignment(assignment = SlayerAssignment.DWARF),
            Assignment(assignment = SlayerAssignment.GHOST),
            Assignment(assignment = SlayerAssignment.GOBLIN),
            Assignment(assignment = SlayerAssignment.ICEFIEND, amount = 10..20),
            Assignment(assignment = SlayerAssignment.MINOTAUR),
            Assignment(assignment = SlayerAssignment.SCORPION),
            Assignment(assignment = SlayerAssignment.SKELETON),
            Assignment(assignment = SlayerAssignment.SPIDER),
            Assignment(assignment = SlayerAssignment.WOLF),
            Assignment(assignment = SlayerAssignment.ZOMBIE),
        ),
        SlayerMaster.VANNAKA to listOf(

        ),
    )
)