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

SRC_URI[md5sum] = "045f744bc561759622d8a8a030f5dc6b"
SRC_URI[sha256sum] = "619fe023e00c3d8e5113521d7200e1ebb04587c12d157f9a2fb167feb8cae66b"

inherit pypi
inherit setuptools3
inherit_defer nativesdk

# put any LICENSE file into doc pkg
FILES:${PN}-doc += "${datadir}/LICENSE ${datadir}/COPYING*"
FILES:${PN}-doc += "${prefix}/LICENSE ${prefix}/COPYING*"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
