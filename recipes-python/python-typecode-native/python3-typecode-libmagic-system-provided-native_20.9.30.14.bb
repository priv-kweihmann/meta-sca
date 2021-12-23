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

PYPI_PACKAGE = "typecode_libmagic-system-provided"

SRC_URI[md5sum] = "65522130a321cf2a821183a7202161c6"
SRC_URI[sha256sum] = "5ba9631648216a3ddec70de90fad357c9c7feb6cd8f9364fe8b895c7acf20c38"

inherit pypi
inherit setuptools3
inherit native

UPSTREAM_CHECK_URI = "https://pypi.org/project/typecode-libmagic-system-provided/"
UPSTREAM_CHECK_REGEX = "/typecode-libmagic-system-provided/(?P<pver>(\d+[\.\-_]*)+)/"
