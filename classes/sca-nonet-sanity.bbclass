addhandler sca_check_sanity_eventhandler
sca_check_sanity_eventhandler[eventmask] = "bb.event.SanityCheck"
python sca_check_sanity_eventhandler() {
    if d.getVar("BB_NO_NETWORK") == "1":
        bb.error("This recipe cannot be used with 'BB_NO_NETWORK'")
}

# recipe inheriting this class need network access while building
do_compile[network] = "1"
do_install[network] = "1"
