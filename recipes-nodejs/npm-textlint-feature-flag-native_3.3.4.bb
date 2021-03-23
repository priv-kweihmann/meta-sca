SUMMARY = "NPM: @textlint/feature-flag"
DESCRIPTION = "textlint internal feature flag manager."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/feature-flag/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-map-like-native"

SRC_URI = "https://registry.npmjs.org/@textlint/feature-flag/-/feature-flag-3.3.4.tgz"
SRC_URI[md5sum] = "dbf3a638e3be09f18da4013fc5a551b8"
SRC_URI[sha256sum] = "71749216dec86f454273c902ec132ffe59c30bb0d859180e47bd89ffa8311739"

NPM_PKGNAME = "@textlint/feature-flag"

inherit npmhelper
inherit native
