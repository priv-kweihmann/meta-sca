SUMMARY = "Just some test code for GO"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

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
