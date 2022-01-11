SUMMARY = "Enriched extends rich library functionality"
DESCRIPTION = "Enriched extends rich library functionality with a set of changes that were not accepted to rich itself."
HOMEPAGE = "https://github.com/pycontribs/enrich"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d9a054ecfbccd5e9a2c26e29e92c14d2"

DEPENDS += "\
            python3-rich-native \
            python3-setuptools-scm-native \
            python3-toml-native \
            "

PYPI_PACKAGE = "enrich"

SRC_URI[md5sum] = "272588dcb826a71e1745596514c11354"
SRC_URI[sha256sum] = "0a2ab0d2931dff8947012602d1234d2a3ee002d9a355b5d70be6bf5466008893"

inherit pypi
inherit setuptools3
inherit native
