SUMMARY = "A Flake8 plugin for checking executable permissions and shebangs"
HOMEPAGE = "https://github.com/xuhdev/flake8-executable"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING.GPL;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS += "\
    nativesdk-python3-flake8 \
    python3-setuptools-scm-native \
"

PYPI_PACKAGE = "flake8-executable"

SRC_URI[md5sum] = "ed72412b89ac266e4dd09b9c5abc6cd5"
SRC_URI[sha256sum] = "c6230a089ad49dbeef049d8e1e89591d9823f06c829cd9d6b1ca83b4b1d7f54f"

inherit pypi
inherit setuptools3
inherit nativesdk

# put any LICENSE file into doc pkg
FILES:${PN}-doc += "${datadir}/LICENSE ${datadir}/COPYING*"
FILES:${PN}-doc += "${prefix}/LICENSE ${prefix}/COPYING*"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
