SUMMARY = "NPM: comma-separated-tokens"
DESCRIPTION = "Parse and stringify comma-separated tokens"
HOMEPAGE = "https://github.com/wooorm/comma-separated-tokens#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/comma-separated-tokens/-/comma-separated-tokens-2.0.0.tgz"
SRC_URI[md5sum] = "877b5cdddcf2d5348ea6869a53a98a1e"
SRC_URI[sha256sum] = "c17aebd903d326cf992b887a1a4e8ae49df72db27019d9c53a859460943aa0d5"

NPM_PKGNAME = "comma-separated-tokens"

inherit npmhelper
inherit native
