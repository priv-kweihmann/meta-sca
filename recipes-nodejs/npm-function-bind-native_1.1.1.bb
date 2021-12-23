SUMMARY = "NPM: function-bind"
DESCRIPTION = "Implementation of Function.prototype.bind"
HOMEPAGE = "https://github.com/Raynos/function-bind"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e7417c1a8ad83f88bcac21ad440d48b2"

SRC_URI = "https://registry.npmjs.org/function-bind/-/function-bind-1.1.1.tgz"
SRC_URI[md5sum] = "ee976e75439af2b82e707f3a64c69684"
SRC_URI[sha256sum] = "2d552e7c98b4c3acbf6420cc2eed535e592bb987ed2b32e35795bf777dd2e082"

NPM_PKGNAME = "function-bind"

inherit npmhelper
inherit native
