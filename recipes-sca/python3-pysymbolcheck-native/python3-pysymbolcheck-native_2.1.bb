SUMMARY = "Tool for checking elf-symbols against rules"
HOMEPAGE = "https://github.com/priv-kweihmann/pysymbolcheck"

LICENSE = "BSD-2-Clause & PD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=39f57e3d40a441f0656539ac3aa225a5"

DEPENDS += "\
            python3-jsonmerge-native \
            python3-native \
            python3-pyelftools-native \
            "

SRC_URI = "git://github.com/priv-kweihmann/pysymbolcheck.git;protocol=https;branch=master \
           file://pysymcheck.sca.description"
SRCREV = "dffc515d53c54d4dc8b6fdef52766decefe99526"
S = "${WORKDIR}/git"

inherit sca-description
inherit setuptools3
inherit native

do_install_append() {
    install -d ${D}${datadir}/pysymbolcheck
    install ${WORKDIR}/pysymcheck.sca.description ${D}${datadir}
    install ${WORKDIR}/git/basic_rules.json ${D}${datadir}/pysymbolcheck
}

FILES_${PN} += "${datadir}"
