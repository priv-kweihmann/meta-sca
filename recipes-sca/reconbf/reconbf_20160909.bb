SUMMARY = "Recon system hardening scanner"
HOMEPAGE = "https://github.com/HewlettPackard/reconbf"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "${PYTHON_PN}-pbr-native"

SRC_URI = "git://github.com/HewlettPackard/reconbf.git;protocol=https \
           file://reconbf.sca.description"

SRCREV = "bfd15bef549f011a3de885c3267d4f718223b798"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

inherit setuptools3
inherit sca-description

do_install_append_class-native () {
    install -d ${D}/${datadir}
    install ${WORKDIR}/reconbf.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"

RDEPENDS_${PN}_class-target += "\
                                ${PYTHON_PN}-compression \
                                ${PYTHON_PN}-core \
                                ${PYTHON_PN}-json \
                                ${PYTHON_PN}-logging \
                                ${PYTHON_PN}-multiprocessing \
                                ${PYTHON_PN}-netserver \
                                ${PYTHON_PN}-pkgutil \
                                ${PYTHON_PN}-threading \
                                "

BBCLASSEXTEND = "native"
