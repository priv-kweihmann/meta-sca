SUMMARY = "NPM: version-compare"
DESCRIPTION = "Comparator to determine if a version is less than, equivalent to, or greater than another version"
HOMEPAGE = "https://github.com/bevry/version-compare"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=44539d46b91a76ee624d026c1869d233"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/version-compare/-/version-compare-1.1.0.tgz"
SRC_URI[md5sum] = "304cd873718cf2ff960006849b8aa8c5"
SRC_URI[sha256sum] = "8240dd7453f9f6930ee5b132eedccd1da061e123c784cbe8bce0a75bb27100ee"

NPM_PKGNAME = "version-compare"

inherit npmhelper
inherit native
