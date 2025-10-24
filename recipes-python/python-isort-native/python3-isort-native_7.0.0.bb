SUMMARY = "A Python utility / library to sort imports"
HOMEPAGE = "https://github.com/timothycrosley/isort"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=197c46995787b46a2dbf0d519c1754cf"

DEPENDS += "\
    python3-hatch-vcs-native \
"

PYPI_PACKAGE = "isort"

SRC_URI[md5sum] = "19015ed232ba66d8e05a0598a95ff17e"
SRC_URI[sha256sum] = "5513527951aadb3ac4292a41a16cbc50dd1642432f5e8c20057d414bdafb4187"

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
