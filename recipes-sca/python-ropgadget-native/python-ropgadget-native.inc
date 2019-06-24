SUMMARY = "This tool lets you search your gadgets on your binaries to facilitate your ROP exploitation."
DESCRIPTION = "This tool lets you search your gadgets on your binaries to facilitate your ROP exploitation."
HOMEPAGE = "https://github.com/JonathanSalwan/ROPgadget"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE_BSD.txt;md5=e8b383a8cb935c894fbf61ff6c5d5121"

PYPI_PACKAGE = "ROPGadget"

SRC_URI = "git://github.com/JonathanSalwan/ROPgadget.git;protocol=https;tag=v${PV} \
           file://ropgadget.sca.description \
           file://ropgadget.sca.score"

DEPENDS += "${PYTHON_PN}-native ${PYTHON_PN}-capstone-native"

inherit native

S = "${WORKDIR}/git"

FILES_${PN} += "${datadir}"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/ropgadget.sca.description ${D}${datadir}
    install ${WORKDIR}/ropgadget.sca.score ${D}${datadir}
}
