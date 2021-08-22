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

SRC_URI:append = " file://proselint.sca.description"
SRC_URI[md5sum] = "c5ca1922f1dc61f7a1d8dd6b2b107903"
SRC_URI[sha256sum] = "2a98d9c14382d94ed9122a6c0b0657a814cd5c892c77d9477309fc99f86592e6"

PYPI_PACKAGE = "proselint"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

do_install:append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/proselint.sca.description ${D}${datadir}
}

FILES:${PN} += "${datadir}"
