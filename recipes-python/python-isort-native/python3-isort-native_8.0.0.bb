SUMMARY = "A Python utility / library to sort imports"
HOMEPAGE = "https://github.com/timothycrosley/isort"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=197c46995787b46a2dbf0d519c1754cf"

DEPENDS += "\
    python3-hatch-vcs-native \
"

PYPI_PACKAGE = "isort"

SRC_URI[md5sum] = "a2b6c1cf5942a2d09504e513efea8970"
SRC_URI[sha256sum] = "fddea59202f231e170e52e71e3510b99c373b6e571b55d9c7b31b679c0fed47c"

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
