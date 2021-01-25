SUMMARY = "Ruby critic test code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE.txt;md5=ebcb01890999ed287441ae4afce9a346"

SRC_URI = "git://github.com/whitesmith/rubycritic.git;protocol=https;nobranch=1"
SRCREV = "37da11747278523f2382844ad24b5c5bef0407cc"

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
