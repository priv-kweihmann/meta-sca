SUMMARY = "A Python utility / library to sort imports"
HOMEPAGE = "https://github.com/timothycrosley/isort"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=197c46995787b46a2dbf0d519c1754cf"

PYPI_PACKAGE = "isort"

SRC_URI[md5sum] = "5153f92984efe4429c15b9686bfb40af"
SRC_URI[sha256sum] = "aaed790b463e8703fb1eddb831dfa8e8616bacde2c083bd557ef73c8189b7263"

inherit pypi
inherit setuptools3
inherit native

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
