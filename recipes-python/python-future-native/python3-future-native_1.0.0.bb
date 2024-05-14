SUMMARY = "Clean single-source support for Python 3 and 2"
HOMEPAGE = "https://github.com/PythonCharmers/python-future"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ce268d4c2f911490f47ac5473a24bb89"

PYPI_PACKAGE = "future"

SRC_URI[md5sum] = "028bd8af5a7dd853fd12c8bf627236a9"
SRC_URI[sha256sum] = "bd2968309307861edae1458a4f8a4f3598c03be43b97521076aebf5d94c07b05"

inherit pypi
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-2to3 \
    nativesdk-python3-audio \
    nativesdk-python3-core \
    nativesdk-python3-crypt \
    nativesdk-python3-datetime \
    nativesdk-python3-image \
    nativesdk-python3-io \
    nativesdk-python3-logging \
    nativesdk-python3-math \
    nativesdk-python3-mime \
    nativesdk-python3-netclient \
    nativesdk-python3-numbers \
    nativesdk-python3-pprint \
    nativesdk-python3-pydoc \
    nativesdk-python3-stringold \
    nativesdk-python3-tests \
    nativesdk-python3-unittest \
    nativesdk-python3-xml \
"
