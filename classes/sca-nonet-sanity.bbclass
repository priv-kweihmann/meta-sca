addhandler sca_check_sanity_eventhandler
sca_check_sanity_eventhandler[eventmask] = "bb.event.SanityCheck"
python sca_check_sanity_eventhandler() {
    if d.getVar("BB_NO_NETWORK") == "1":
        bb.error("This recipe cannot be used with 'BB_NO_NETWORK'")
}

python () {
    for task in ["do_compile", "do_install"]:
        if "nonetwork" in d.getVarFlags(task):
            d.delVarFlag(task, "nonetwork")
            bb.verbnote("Remove nonetwork flag from %s as the implementation requires network access" % task)
}
