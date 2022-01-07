SUMMARY = "NPM: damerau-levenshtein"
DESCRIPTION = "Damerau - Levenshtein distance by The Spanish Inquisition + relative distance"
HOMEPAGE = "https://github.com/tad-lispy/node-damerau-levenshtein#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=515a31477042f4c100e408de987a0b5b"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/damerau-levenshtein/-/damerau-levenshtein-1.0.8.tgz"
SRC_URI[md5sum] = "75deec9d3371712b847adabedd8b703f"
SRC_URI[sha256sum] = "a23cfcb0fcac3cab70443595dc31266a6e20efbdc63857cab53c985d95075688"

NPM_PKGNAME = "damerau-levenshtein"

inherit npmhelper
inherit native
