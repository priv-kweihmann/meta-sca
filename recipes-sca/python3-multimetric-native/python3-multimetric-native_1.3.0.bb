SUMMARY = "Calculate code metrics in various languages"
HOMEPAGE = "https://github.com/priv-kweihmann/multimetric"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1e0b805e34c99594e846fa46c20d8b9b"

DEPENDS += "\
            python3-chardet-native \
            python3-pygments-native \
            "

SRC_URI += "\
            git://github.com/priv-kweihmann/multimetric.git;protocol=https;branch=master \
            file://multimetric.sca.description \
           "
SRCREV = "1bb8a8b2c28a7d817c3f57736d08e4fb13e9c16c"
S = "${WORKDIR}/git"

inherit sca-description
inherit setuptools3
inherit native

do_install:append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/multimetric.sca.description ${D}${datadir}
}

FILES:${PN} += "${datadir}"
