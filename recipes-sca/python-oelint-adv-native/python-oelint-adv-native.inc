SUMMARY = "Advanced oelint"
DESCRIPTION = "Based on the OpenEmbedded Styleguide and work done by oe-stylize-tool\n \
               this module offers a (nearly) complete linter for bitbake-recipes."
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-adv"

SRC_URI = "git://github.com/priv-kweihmann/oelint-adv.git;protocol=https;branch=master;tag=${PV} \
           file://oelint.sca.description"

S = "${WORKDIR}/git"
B = "${S}"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e926c89aceef6c1a4247d5df08f94533"

inherit native
inherit sca-sanity

RDEPENDS_${PN} += "${PYTHON_PN}-core-native"

FILES_${PN} += "${datadir}"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/oelint.sca.description ${D}${datadir}
}
