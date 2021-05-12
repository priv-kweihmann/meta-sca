SUMMARY = "NPM: @textlint/feature-flag"
DESCRIPTION = "textlint internal feature flag manager."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/feature-flag/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-map-like-native"

SRC_URI = "https://registry.npmjs.org/@textlint/feature-flag/-/feature-flag-3.3.5.tgz"
SRC_URI[md5sum] = "35d39cd40e145a9e500825a786db5c92"
SRC_URI[sha256sum] = "3532d9a1a7dcd455fb43236e6a668d7c3db61413b2408baa61ad0105e5ac780d"

NPM_PKGNAME = "@textlint/feature-flag"

inherit npmhelper
inherit native
