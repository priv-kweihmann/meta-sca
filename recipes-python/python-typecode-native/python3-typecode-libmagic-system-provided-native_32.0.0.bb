SUMMARY = "plugin to provide a system package provided libmagic binary and database"
HOMEPAGE = "https://github.com/nexB/scancode-plugins"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://apache-2.0.LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "\
    file-replacement-native \
    python3-setuptools-scm-native \
    python3-toml-native \
"

PYPI_PACKAGE = "typecode_libmagic_system_provided"

SRC_URI[md5sum] = "11a0c0582d0548a060222a4ff80a4c1a"
SRC_URI[sha256sum] = "2d5d331f97a0de972a553ea7f1873eb8e165772936ac914d48125b4b5f0a033d"

inherit pypi
inherit setuptools3
inherit_defer native

UPSTREAM_CHECK_URI = "https://pypi.org/project/typecode-libmagic-system-provided/"
UPSTREAM_CHECK_REGEX = "/typecode-libmagic-system-provided/(?P<pver>(\d+[\.\-_]*)+)/"

RDEPENDS:${PN}:class-nativesdk += "nativesdk-file-replacement"
