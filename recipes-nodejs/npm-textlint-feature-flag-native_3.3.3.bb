SUMMARY = "NPM: @textlint/feature-flag"
DESCRIPTION = "textlint internal feature flag manager."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/feature-flag/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-map-like-native"

SRC_URI = "https://registry.npmjs.org/@textlint/feature-flag/-/feature-flag-3.3.3.tgz"
SRC_URI[md5sum] = "61d9322256eb6167f546171c505419ed"
SRC_URI[sha256sum] = "b24ec549d8e6db4f359b1b2a07fdbaee9dc5f27626c5c02685d1c11dff7541b3"

NPM_PKGNAME = "@textlint/feature-flag"

inherit npmhelper
inherit native
