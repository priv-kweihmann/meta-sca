SUMMARY = "Just some test code for GO"

LICENSE ?= "BSD-2-Clause"
LIC_FILES_CHKSUM ?= "file://${SCA_LAYERDIR}/LICENSE;md5=e926c89aceef6c1a4247d5df08f94533"

SRC_URI = "file://test.go;subdir=source"

S = "${WORKDIR}/source"
B = "${WORKDIR}/source"

inherit sca

do_configure() {
    :
}

do_compile() {
    :
}

do_install() {
    :
}
