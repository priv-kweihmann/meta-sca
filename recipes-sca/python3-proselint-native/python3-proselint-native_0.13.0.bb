SUMMARY = "A linter for prose"
HOMEPAGE = "https://github.com/amperser/proselint/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=64a578e1ca1f25248a8d50f32fdf14e7"

DEPENDS += "\
            python3-click-native \
            python3-future-native \
            python3-native \
            python3-six-native \
           "

SRC_URI:append = " file://proselint.sca.description"
SRC_URI[md5sum] = "1f09f9fc6959111d745083b240e8c928"
SRC_URI[sha256sum] = "7dd2b63cc2aa390877c4144fcd3c80706817e860b017f04882fbcd2ab0852a58"

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
