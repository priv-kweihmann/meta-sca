SUMMARY = "Discovery of Long Parameter List"
HOMEPAGE = "https://github.com/anapaulagomes/looong"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=062956eedf9cd0f703af1af680e8131c"

SRC_URI = "git://github.com/anapaulagomes/looong.git;protocol=https"
SRCREV = "86b9395715c774d7454a0d663dcc59a1dff2f757"

S = "${WORKDIR}/git"

FILES_${PN} += "${datadir}"
SRC_URI += "file://looong.sca.description"

inherit native
inherit sca-sanity
inherit setuptools3

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/looong.sca.description ${D}${datadir}
}
