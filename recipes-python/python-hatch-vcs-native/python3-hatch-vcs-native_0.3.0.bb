SUMMARY = "Hatch plugin for versioning with your preferred VCS"
HOMEPAGE = "https://github.com/ofek/hatch-vcs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=26501cfd0bbddf830ee820e95551fa3d"

DEPENDS += "\
    python3-setuptools-scm-native \
"

PYPI_PACKAGE = "hatch_vcs"

SRC_URI[sha256sum] = "cec5107cfce482c67f8bc96f18bbc320c9aa0d068180e14ad317bbee5a153fee"

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
