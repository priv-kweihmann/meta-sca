SUMMARY = "Clean single-source support for Python 3 and 2"
HOMEPAGE = "https://github.com/PythonCharmers/python-future"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a253924061f8ecc41ad7a2ba1560e8e7"

PYPI_PACKAGE = "future"

SRC_URI[md5sum] = "dedcb70d14b23388670d54145aab8be4"
SRC_URI[sha256sum] = "34a17436ed1e96697a86f9de3d15a3b0be01d8bc8de9c1dffd59fb8234ed5307"

inherit pypi
inherit setuptools3
inherit nativesdk

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
