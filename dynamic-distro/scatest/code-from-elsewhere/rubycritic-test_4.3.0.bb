SUMMARY = "Ruby critic test code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE.txt;md5=ebcb01890999ed287441ae4afce9a346"

SRC_URI = "git://github.com/whitesmith/rubycritic.git;protocol=https;tag=v${PV}"

S = "${WORKDIR}/git/test/samples"

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
