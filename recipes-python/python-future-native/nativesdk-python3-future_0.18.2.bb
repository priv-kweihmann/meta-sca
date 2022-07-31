SUMMARY = "Clean single-source support for Python 3 and 2"
HOMEPAGE = "https://github.com/PythonCharmers/python-future"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a253924061f8ecc41ad7a2ba1560e8e7"

PYPI_PACKAGE = "future"

SRC_URI[md5sum] = "e4579c836b9c025872efe230f6270349"
SRC_URI[sha256sum] = "b1bead90b70cf6ec3f0710ae53a525360fa360d306a86583adc6bf83a4db537d"

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
