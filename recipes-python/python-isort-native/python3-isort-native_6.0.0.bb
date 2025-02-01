SUMMARY = "A Python utility / library to sort imports"
HOMEPAGE = "https://github.com/timothycrosley/isort"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=197c46995787b46a2dbf0d519c1754cf"

DEPENDS += "\
    python3-hatch-vcs-native \
"

PYPI_PACKAGE = "isort"

SRC_URI[md5sum] = "5a8ef64a4ffbeaf90e8864a77b783554"
SRC_URI[sha256sum] = "75d9d8a1438a9432a7d7b54f2d3b45cad9a4a0fdba43617d9873379704a8bdf1"

inherit pypi
inherit python_hatchling
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-datetime \
    nativesdk-python3-difflib \
    nativesdk-python3-json \
    nativesdk-python3-pprint \
    nativesdk-python3-requests \
    nativesdk-python3-setuptools \
    nativesdk-python3-shell \
    nativesdk-python3-stringold \
"
