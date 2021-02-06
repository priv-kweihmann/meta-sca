SUMMARY = "NPM: @textlint/feature-flag"
DESCRIPTION = "textlint internal feature flag manager."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/feature-flag/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-map-like-native"

SRC_URI = "https://registry.npmjs.org/@textlint/feature-flag/-/feature-flag-3.3.2.tgz"
SRC_URI[md5sum] = "a82f07dc956fa97b895cca0e3a9c249a"
SRC_URI[sha256sum] = "b38d0fb2e0914fa689cc1f1c3c0c207d59489d9d5710eb1e6ba0375f081860ab"

NPM_PKGNAME = "@textlint/feature-flag"

inherit npmhelper
inherit native
