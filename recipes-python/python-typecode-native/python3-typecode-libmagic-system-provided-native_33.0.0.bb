SUMMARY = "plugin to provide a system package provided libmagic binary and database"
HOMEPAGE = "https://github.com/nexB/scancode-plugins"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://apache-2.0.LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "\
    file-replacement-native \
    python3-setuptools-scm-native \
"

PYPI_PACKAGE = "typecode-libmagic-system-provided"

SRC_URI[md5sum] = "335ef230b229210a987cd93673818932"
SRC_URI[sha256sum] = "b436a24535a8f4c912c13e064ee92d26ac75747af07a63550c92289951f8b211"

inherit pypi
inherit pypi-old
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-file-replacement"
