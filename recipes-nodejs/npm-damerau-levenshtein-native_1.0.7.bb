SUMMARY = "NPM: damerau-levenshtein"
DESCRIPTION = "Damerau - Levenshtein distance by The Spanish Inquisition + relative distance"
HOMEPAGE = "https://github.com/tad-lispy/node-damerau-levenshtein#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=515a31477042f4c100e408de987a0b5b"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/damerau-levenshtein/-/damerau-levenshtein-1.0.7.tgz"
SRC_URI[md5sum] = "1d79834e0d08086cea0befedce775d46"
SRC_URI[sha256sum] = "cb217ebb4774318b17dac413bd031c72c6ed9124bd269fbba649a03953156b27"

NPM_PKGNAME = "damerau-levenshtein"

inherit npmhelper
inherit native
