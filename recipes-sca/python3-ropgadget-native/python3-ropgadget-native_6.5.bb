SUMMARY = "Find ROP exploitation pattern"
DESCRIPTION = "This tool lets you search your gadgets on your binaries to facilitate your ROP exploitation"
HOMEPAGE = "https://github.com/JonathanSalwan/ROPgadget"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE_BSD.txt;md5=e8b383a8cb935c894fbf61ff6c5d5121"

DEPENDS += "\
            python3-capstone-native \
            python3-native \
           "

SRC_URI = "git://github.com/JonathanSalwan/ROPgadget.git;protocol=https \
           file://ropgadget.sca.description"
SRCREV = "7c5d4cffc58dfa5e3ce45bdc5e6690122c70f8f3"
S = "${WORKDIR}/git"

inherit sca-description
inherit setuptools3
inherit native

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/ropgadget.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
