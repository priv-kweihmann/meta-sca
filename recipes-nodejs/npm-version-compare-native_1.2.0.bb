SUMMARY = "NPM: version-compare"
DESCRIPTION = "Comparator to determine if a version is less than, equivalent to, or greater than another version"
HOMEPAGE = "https://github.com/bevry/version-compare"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=c39fac9d20b79ade99d052803b1960ad"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/version-compare/-/version-compare-1.2.0.tgz"
SRC_URI[md5sum] = "18c9cc2a181f764cc2b2071bd0463b20"
SRC_URI[sha256sum] = "7d8010fb84249dd1c6a868a03b09067d3f2fb3c21cbcdc83810b554f3e8f70ba"

NPM_PKGNAME = "version-compare"

inherit npmhelper
inherit native
