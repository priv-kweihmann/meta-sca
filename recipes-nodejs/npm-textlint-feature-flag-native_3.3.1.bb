SUMMARY = "NPM: @textlint/feature-flag"
DESCRIPTION = "textlint internal feature flag manager."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/feature-flag/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-map-like-native"

SRC_URI = "https://registry.npmjs.org/@textlint/feature-flag/-/feature-flag-3.3.1.tgz"
SRC_URI[md5sum] = "1756a13bc3b1636524f323d056830b6a"
SRC_URI[sha256sum] = "7a0acb7b82c24c9e8d3b803db3db0a4942d087d66f04c8f1af943d17341d5464"

NPM_PKGNAME = "@textlint/feature-flag"

inherit npmhelper
inherit native
