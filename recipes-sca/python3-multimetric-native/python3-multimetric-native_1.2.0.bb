SUMMARY = "Calculate code metrics in various languages"
HOMEPAGE = "https://github.com/priv-kweihmann/multimetric"

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
SRCREV = "fa2ac6a6e8db55e9edc7df1cb396978539703b64"
S = "${WORKDIR}/git"

inherit sca-description
inherit setuptools3
inherit native

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/multimetric.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
