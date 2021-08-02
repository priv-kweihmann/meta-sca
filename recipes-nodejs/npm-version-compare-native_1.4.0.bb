SUMMARY = "NPM: version-compare"
DESCRIPTION = "Comparator to determine if a version is less than, equivalent to, or greater than another version"
HOMEPAGE = "https://github.com/bevry/version-compare"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=c39fac9d20b79ade99d052803b1960ad"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/version-compare/-/version-compare-1.4.0.tgz"
SRC_URI[md5sum] = "451bb016f37bac39d24ecfc571a23366"
SRC_URI[sha256sum] = "713e900d6147ed082964bdf21ad95e45cbb679fe9dfd396288522b49b97a8f95"

NPM_PKGNAME = "version-compare"

inherit npmhelper
inherit native
