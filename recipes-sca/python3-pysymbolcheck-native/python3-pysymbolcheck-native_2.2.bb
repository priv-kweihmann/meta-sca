SUMMARY = "Tool for checking elf-symbols against rules"
HOMEPAGE = "https://github.com/priv-kweihmann/pysymbolcheck"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause & PD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=39f57e3d40a441f0656539ac3aa225a5"

DEPENDS += "\
            python3-jsonmerge-native \
            python3-native \
            python3-pyelftools-native \
            "

SRC_URI = "git://github.com/priv-kweihmann/pysymbolcheck.git;protocol=https;branch=master"
SRCREV = "a12e3ee6c64ec8d411bc2411fef3c670821db4a0"
S = "${WORKDIR}/git"

inherit sca-description
inherit setuptools3
inherit native

SCA_TOOL_DESCRIPTION = "pysymcheck"
PIP_INSTALL_PACKAGE = "pysymbolcheck"

do_install:append() {
    install -d ${D}${datadir}/pysymbolcheck
    install ${WORKDIR}/git/basic_rules.json ${D}${datadir}/pysymbolcheck
}

FILES:${PN} += "${datadir}"
