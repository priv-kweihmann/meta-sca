SUMMARY = "NPM: @textlint/feature-flag"
DESCRIPTION = "textlint internal feature flag manager."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/feature-flag/"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@textlint/feature-flag/-/feature-flag-12.0.2.tgz"
SRC_URI[md5sum] = "ac143719c846f507826d3f545d7445e7"
SRC_URI[sha256sum] = "ebce06af0fde3ef89377ab8e8384b22a79ccb9a663c6f3aa66d7dd7631c83469"

NPM_PKGNAME = "@textlint/feature-flag"

inherit npmhelper
inherit native
