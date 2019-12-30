SUMMARY = "Nginx configuration static analyzer"
DESCRIPTION = "Nginx configuration static analyzer"
HOMEPAGE = "https://github.com/yandex/gixy"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b3085af66f9d2f2bd50055c8d52ddb55"

SRC_URI = "git://github.com/yandex/gixy.git;protocol=https;tag=v${PV}"

S = "${WORKDIR}/git"

DEPENDS += "${PYTHON_PN}-native \
            ${PYTHON_PN}-pyparsing-native \
            ${PYTHON_PN}-cached-property-native \
            ${PYTHON_PN}-six-native \
            ${PYTHON_PN}-jinja2-native \
            ${PYTHON_PN}-configargparse-native"

FILES_${PN} += "${datadir}"
SRC_URI += "file://gixy.sca.description \
            file://0001-No-argparse-needed.patch \
            file://0002-Add-root_dir-support.patch"

inherit native
inherit sca-sanity

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/gixy.sca.description ${D}${datadir}
}