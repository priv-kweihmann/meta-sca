SUMMARY = "Powerful and Lightweight Python Tree Data Structure"

HOMEPAGE = "https://github.com/c0fec0de/anytree"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

DEPENDS += "python3-six-native"

SRC_URI = "git://github.com/c0fec0de/anytree.git;branch=2.x.x;protocol=https"
SRCREV = "814da5904dacd1ba564be7188e0d9508ec95f67b"

S = "${WORKDIR}/git"

PIP_INSTALL_PACKAGE = "anytree"

inherit python_poetry_core
inherit native

# put any LICENSE file into doc pkg
FILES:${PN}-doc += "${datadir}/LICENSE ${prefix}/LICENSE"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-io \
    nativesdk-python3-json \
    nativesdk-python3-logging \
    nativesdk-python3-six \
"
