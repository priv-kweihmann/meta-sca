SUMMARY = "prebuilt native libmagic binary and database"
HOMEPAGE = "https://github.com/nexB/typecode_libmagic_from_sources"

LICENSE = "BSD & PD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6a7382872edb68d33e1a9398b6e03188"

DEPENDS += "\
             python3-plugincode-native \
            "

PYPI_PACKAGE = "typecode_libmagic_from_sources"

SRC_URI[md5sum] = "79c5993036ace7c6766cb7616e85ac77"
SRC_URI[sha256sum] = "9cd12ba3145be1e8646d22b68d8ac91e851255875241622acfc631a5d9909fbe"

UPSTREAM_CHECK_REGEX = ".*/typecode_libmagic_from_sources-(?P<pver>\d+\.\d+\.\d+)\.tar\.gz"

inherit pypi
inherit setuptools3
inherit native
