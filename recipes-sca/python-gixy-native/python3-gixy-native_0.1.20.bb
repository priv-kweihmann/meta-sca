SUMMARY = "Nginx configuration static analyzer"
HOMEPAGE = "https://github.com/yandex/gixy"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b3085af66f9d2f2bd50055c8d52ddb55"

DEPENDS += "\
            ${PYTHON_PN}-cached-property-native \
            ${PYTHON_PN}-configargparse-native \
            ${PYTHON_PN}-jinja2-native \
            ${PYTHON_PN}-native \
            ${PYTHON_PN}-pyparsing-native \
            ${PYTHON_PN}-six-native \
           "

SRC_URI = "git://github.com/yandex/gixy.git;protocol=https;tag=v${PV}"
SRC_URI += "file://gixy.sca.description \
            file://0001-No-argparse-needed.patch \
            file://0002-Add-root_dir-support.patch"

S = "${WORKDIR}/git"

inherit native
inherit sca-sanity
inherit setuptools3

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/gixy.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
