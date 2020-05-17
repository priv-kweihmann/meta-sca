SUMMARY = "NPM: @textlint/feature-flag"
DESCRIPTION = "textlint internal feature flag manager."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/feature-flag/"

DEPENDS = "npm-map-like-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

SRC_URI = "https://registry.npmjs.org/@textlint/feature-flag/-/feature-flag-3.1.6.tgz"
SRC_URI[md5sum] = "2d8fab2eff6b273f08501913467f349a"
SRC_URI[sha256sum] = "2ef2627832c899fb79144f1db906f80e98541e6f03ec6b9239fc0dfa93537480"

NPM_PKGNAME = "@textlint/feature-flag"

inherit npmhelper
inherit native
