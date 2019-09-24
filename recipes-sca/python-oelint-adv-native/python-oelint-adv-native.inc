SUMMARY = "Advanced oelint"
DESCRIPTION = "Based on the OpenEmbedded Styleguide and work done by oe-stylize-tool\n \
               this module offers a (nearly) complete linter for bitbake-recipes."
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-adv"

SRC_URI = "git://github.com/priv-kweihmann/oelint-adv.git;protocol=http;branch=master;tag=${PV} \
           file://oelint.sca.description \
           file://oelint.sca.score"

S = "${WORKDIR}/git"
B = "${S}"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

inherit native

RDEPENDS_${PN} += "${PYTHON_PN}-core-native"

FILES_${PN} += "${datadir}"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/oelint.sca.description ${D}${datadir}
    install ${WORKDIR}/oelint.sca.score ${D}${datadir}
}
