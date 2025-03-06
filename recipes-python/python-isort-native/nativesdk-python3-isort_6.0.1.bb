SUMMARY = "A Python utility / library to sort imports"
HOMEPAGE = "https://github.com/timothycrosley/isort"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=197c46995787b46a2dbf0d519c1754cf"

DEPENDS += "python3-hatch-vcs-native"

PYPI_PACKAGE = "isort"

SRC_URI[md5sum] = "b5365c66250ac30d368eed25c3920918"
SRC_URI[sha256sum] = "1cb5df28dfbc742e490c5e41bad6da41b805b0a8be7bc93cd0fb2a8a890ac450"

inherit pypi
inherit python_hatchling
inherit_defer nativesdk

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
