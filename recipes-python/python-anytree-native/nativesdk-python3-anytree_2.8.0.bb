SUMMARY = "Powerful and Lightweight Python Tree Data Structure"

HOMEPAGE = "https://github.com/c0fec0de/anytree"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

DEPENDS += "nativesdk-python3-six"

SRC_URI = "git://github.com/c0fec0de/anytree.git;branch=master;protocol=https"
SRCREV = "75c0198636f8997967ba00df5077cd21350f68ce"

S = "${WORKDIR}/git"

PIP_INSTALL_PACKAGE = "anytree"

inherit setuptools3
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
