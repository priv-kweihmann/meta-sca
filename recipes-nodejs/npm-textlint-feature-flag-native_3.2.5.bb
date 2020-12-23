SUMMARY = "NPM: @textlint/feature-flag"
DESCRIPTION = "textlint internal feature flag manager."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/feature-flag/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-map-like-native"

SRC_URI = "https://registry.npmjs.org/@textlint/feature-flag/-/feature-flag-3.2.5.tgz"
SRC_URI[md5sum] = "bd421a119f0bf0e8721c98458f2affc5"
SRC_URI[sha256sum] = "4f091e6da35ae45c7f4b8c5df28347fcd95f910b51da6dd6145f11cba3d57c12"

NPM_PKGNAME = "@textlint/feature-flag"

inherit npmhelper
inherit native
