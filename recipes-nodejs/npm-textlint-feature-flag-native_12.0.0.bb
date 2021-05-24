SUMMARY = "NPM: @textlint/feature-flag"
DESCRIPTION = "textlint internal feature flag manager."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/feature-flag/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-map-like-native"

SRC_URI = "https://registry.npmjs.org/@textlint/feature-flag/-/feature-flag-12.0.0.tgz"
SRC_URI[md5sum] = "ea36b5a1ef00aba1627cea9eb87c59b3"
SRC_URI[sha256sum] = "ee3c7bdfa8b00c730958258d048a5a9f7a2a2fd18a05bbd99daecfcd62176166"

NPM_PKGNAME = "@textlint/feature-flag"

inherit npmhelper
inherit native
