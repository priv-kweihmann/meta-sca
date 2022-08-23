SUMMARY = "Flake8 plugin to find commented out or dead code"
HOMEPAGE = "https://github.com/sobolevn/flake8-eradicate"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=268c5fd9e64a788932af10a988ab35c4"

DEPENDS += "\
    nativesdk-python3-attrs \
    nativesdk-python3-eradicate \
    nativesdk-python3-flake8 \
"

PYPI_PACKAGE = "flake8-eradicate"

SRC_URI[md5sum] = "682f08b6a13a139e6d03bf067398eaae"
SRC_URI[sha256sum] = "e4c98f00d17dc8653e3388cac2624cd81e9735de2fd4a8dcf99029633ebd7a63"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-attrs \
    nativesdk-python3-core \
    nativesdk-python3-eradicate \
    nativesdk-python3-flake8 \
"
