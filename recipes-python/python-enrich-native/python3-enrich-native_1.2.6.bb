SUMMARY = "Enriched extends rich library functionality"
DESCRIPTION = "Enriched extends rich library functionality with a set of changes that were not accepted to rich itself."
HOMEPAGE = "https://github.com/pycontribs/enrich"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d9a054ecfbccd5e9a2c26e29e92c14d2"

DEPENDS += "\
            python3-rich-native \
            python3-setuptools-scm-native \
            python3-toml-native \
            "

PYPI_PACKAGE = "enrich"

SRC_URI[md5sum] = "9981b0cdc88c5e64cf42c67c015e19e1"
SRC_URI[sha256sum] = "0e99ff57d87f7b5def0ca79917e88fb9351aa0d52e228ee38bff7cd858315fe4"

inherit pypi
inherit setuptools3
inherit native
