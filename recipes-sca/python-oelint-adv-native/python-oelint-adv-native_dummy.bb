SUMMARY = "Replacement for unspported oelint-adv"
LICENSE = "Unlicense"

inherit native

do_configure() {
    bbfatal "oelint-adv requires python3."
}