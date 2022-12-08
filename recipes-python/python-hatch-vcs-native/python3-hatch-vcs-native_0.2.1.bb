SUMMARY = "Hatch plugin for versioning with your preferred VCS"
HOMEPAGE = "https://github.com/ofek/hatch-vcs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=26501cfd0bbddf830ee820e95551fa3d"

DEPENDS += "\
    python3-setuptools-scm-native \
"

PYPI_PACKAGE = "hatch_vcs"

SRC_URI[sha256sum] = "854e398586e7a0a9295c9d4365729d1ae6834ef39de33c88080f4eecc6fc5681"

inherit pypi
inherit python_hatchling
inherit native

UPSTREAM_CHECK_URI = "https://pypi.org/project/hatch-vcs/"
UPSTREAM_CHECK_REGEX = "/hatch-vcs/(?P<pver>(\d+[\.\-_]*)+)/"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-hatchling \
    nativesdk-python3-pathspec \
    nativesdk-python3-pluggy \
"
