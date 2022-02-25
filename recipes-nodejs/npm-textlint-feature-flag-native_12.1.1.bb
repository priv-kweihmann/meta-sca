SUMMARY = "NPM: @textlint/feature-flag"
DESCRIPTION = "textlint internal feature flag manager."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/feature-flag/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@textlint/feature-flag/-/feature-flag-12.1.1.tgz"
SRC_URI[md5sum] = "b8329cbc9a1e806751c210518d2060c9"
SRC_URI[sha256sum] = "06d3bff123faaac6a0334421e520757b70b18f13a86ff12d3c324d3369432e47"

NPM_PKGNAME = "@textlint/feature-flag"

inherit npmhelper
inherit native
