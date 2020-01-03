# This is a dummy task, to ensure a proper rerun of sca-tasks
# even in case the sources didn't change
# this can be controlled with the variable 
# SCA_FORCE_RUN
python do_sca_do_force_meta_task() {
    bb.note("What???")
    bb.debug(2, "Forced run, yay!")
}

do_sca_do_force_meta_task[nostamp] = "1"
addtask do_sca_do_force_meta_task

# Some sanity checks to come...

addhandler check_rmwork_with_forcerun
check_rmwork_with_forcerun[eventmask] = "bb.event.SanityCheck"

python check_rmwork_with_forcerun() {
    if d.getVar("SCA_FORCE_RUN", True) != "0" and "rm_work" in [x for x in d.getVar("INHERIT", True).split(" ") if x]:
        bb.warn("You inherited 'rm_work', so enabling SCA_FORCE_RUN could slow down your build significantly")
}