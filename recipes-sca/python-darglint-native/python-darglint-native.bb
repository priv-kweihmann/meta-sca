## Tool isn't supported by python2

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=e926c89aceef6c1a4247d5df08f94533"

do_unpack() {
    bbfatal "darglint requires python3 - Please disable this tool for python2"
}
