python do_nonetwork_sanity() {
    import glob
    import json

    for x in glob.glob(d.getVar("WORKDIR") + "/*.sca.description"):
        try:
            with open(x) as i:
                j = json.load(i)
                if "online" in j and j["online"] and d.getVar("BB_NO_NETWORK") == "1":
                    bb.error("Recipe requires network access. Please disable usage or unset 'BB_NO_NETWORK' before proceeding")
        except Exception:
            pass
}

do_nonetwork_sanity[doc] = "Sanity check for network access given"
addtask do_nonetwork_sanity after do_unpack before do_configure