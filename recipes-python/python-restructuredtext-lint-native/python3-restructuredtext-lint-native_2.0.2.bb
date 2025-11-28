SUMMARY = "reStructuredText linter"
HOMEPAGE = "https://github.com/twolfson/restructuredtext-lint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://UNLICENSE;md5=7246f848faa4e9c9fc0ea91122d6e680"

DEPENDS += "python3-docutils-native"

PYPI_PACKAGE = "restructuredtext-lint"

SRC_URI[md5sum] = "844f75931a211759762c439c355c1fca"
SRC_URI[sha256sum] = "dd25209b9e0b726929d8306339faf723734a3137db382bcf27294fa18a6bc52b"

inherit pypi
inherit pypi-old
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-docutils \
    nativesdk-python3-json \
    nativesdk-python3-unittest \
"
