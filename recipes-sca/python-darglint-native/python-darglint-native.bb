## Tool isn't supported by python2

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

do_unpack() {
    bbfatal "darglint requires python3 - Please disable this tool for python2"
}
