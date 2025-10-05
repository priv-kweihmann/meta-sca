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
SRCREV = "e866b33d8a14e1ecf1b119e6328d2261f20a629e"

inherit sca-description
inherit python_setuptools_build_meta
inherit_defer native

SCA_TOOL_DESCRIPTION = "pysymcheck"
PIP_INSTALL_PACKAGE = "pysymbolcheck"

do_install:append() {
    install -d ${D}${datadir}/pysymbolcheck
    install ${S}/pysymbolcheck/basic_rules.json ${D}${datadir}/pysymbolcheck
}

FILES:${PN} += "${datadir}"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3 \
    nativesdk-python3-jsonmerge \
    nativesdk-python3-pyelftools \
"
