SUMMARY = "A linter for prose"
HOMEPAGE = "https://github.com/amperser/proselint/"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=64a578e1ca1f25248a8d50f32fdf14e7"

DEPENDS += "\
            python3-click-native \
            python3-future-native \
            python3-native \
            python3-six-native \
           "

SRC_URI_append = " file://proselint.sca.description"
SRC_URI[md5sum] = "d9133e0c3e12169420a0d4aa26a1608e"
SRC_URI[sha256sum] = "e92e68b8bbb24dbf535eac59ac69b8b4ae9a0610f4f0dc83c18732150c465abf"

PYPI_PACKAGE = "proselint"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/proselint.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
