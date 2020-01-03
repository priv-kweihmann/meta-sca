python do_nonetwork_sanity() {
    import glob
    import json

    for x in glob.glob(d.getVar("WORKDIR", True) + "/*.sca.description"):
        try:
            with open(x) as i:
                j = json.load(i)
                if "online" in j and j["online"] and d.getVar("BB_NO_NETWORK", True) == "1":
                    bb.error("Recipe requires network access. Please disable usage or unset 'BB_NO_NETWORK' before proceeding")
        except Exception:
            pass
}

addtask do_nonetwork_sanity after do_unpack before do_configure