SUMMARY = "Tool for checking elf-symbols against rules"
HOMEPAGE = "https://github.com/priv-kweihmann/pysymbolcheck"

LICENSE = "BSD-2-Clause & PD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=39f57e3d40a441f0656539ac3aa225a5"

DEPENDS += "\
            ${PYTHON_PN}-jsonmerge-native \
            ${PYTHON_PN}-native \
            ${PYTHON_PN}-pyelftools-native \
            "

SRC_URI = "git://github.com/priv-kweihmann/pysymbolcheck.git;protocol=https;branch=master \
           file://pysymcheck.sca.description"
SRCREV = "34cd8f34221594014d610053ad20671cbb590a89"
S = "${WORKDIR}/git"

inherit native
inherit sca-description
inherit setuptools3

do_install_append() {
    install -d ${D}${datadir}/pysymbolcheck
    install ${WORKDIR}/pysymcheck.sca.description ${D}${datadir}
    install ${WORKDIR}/git/basic_rules.json ${D}${datadir}/pysymbolcheck
}

FILES_${PN} += "${datadir}"
