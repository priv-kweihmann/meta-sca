SUMMARY = "NPM: @textlint/feature-flag"
DESCRIPTION = "textlint internal feature flag manager."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/feature-flag/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-map-like-native"

SRC_URI = "https://registry.npmjs.org/@textlint/feature-flag/-/feature-flag-3.2.4.tgz"
SRC_URI[md5sum] = "80216d7991866631ad81c81c87612176"
SRC_URI[sha256sum] = "aa54f5cf9927b7e60175ce49c8172188bfdb496bae652593871f64b0905abf75"

NPM_PKGNAME = "@textlint/feature-flag"

inherit npmhelper
inherit native
