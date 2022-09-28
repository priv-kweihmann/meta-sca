SUMMARY = "A Flake8 plugin for checking executable permissions and shebangs"
HOMEPAGE = "https://github.com/xuhdev/flake8-executable"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING.GPL;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS += "\
    python3-flake8-native \
    python3-setuptools-scm-native \
"

PYPI_PACKAGE = "flake8-executable"

SRC_URI[md5sum] = "ea99350437ab4ab29a1eaf37e988530a"
SRC_URI[sha256sum] = "ecc80a70d8e4ac21d5b2a27c730770b2a4b96542ee4d82b9be5bad0e22fd5a70"

inherit pypi
inherit setuptools3
inherit native

# put any LICENSE file into doc pkg
FILES:${PN}-doc += "${datadir}/LICENSE ${datadir}/COPYING*"
FILES:${PN}-doc += "${prefix}/LICENSE ${prefix}/COPYING*"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
