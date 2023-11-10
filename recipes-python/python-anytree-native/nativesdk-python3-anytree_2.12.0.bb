SUMMARY = "Powerful and Lightweight Python Tree Data Structure"

HOMEPAGE = "https://github.com/c0fec0de/anytree"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

DEPENDS += "nativesdk-python3-six"

SRC_URI[sha256sum] = "0dde0365cc8b1f3531e927694f39b903c360eadab2be09c50f3426ecca967949"

PYPI_PACKAGE = "anytree"

inherit pypi
inherit python_poetry_core
inherit nativesdk

# put any LICENSE file into doc pkg
FILES:${PN}-doc += "${datadir}/LICENSE ${prefix}/LICENSE"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-io \
    nativesdk-python3-json \
    nativesdk-python3-logging \
    nativesdk-python3-six \
"
