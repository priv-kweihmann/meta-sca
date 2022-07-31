SUMMARY = "Removes commented-out code"
HOMEPAGE = "https://github.com/myint/eradicate"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://eradicate;beginline=3;endline=23;md5=4665a3ee1ecb347243801ec86697f8a0"

PYPI_PACKAGE = "eradicate"

SRC_URI[md5sum] = "4738597a1511ba8dfbcb74ad83aca509"
SRC_URI[sha256sum] = "aac7384ab25b1bf21c4c012de9b4bf8398945a14c98c911545b2ea50ab558014"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-difflib \
"
