SUMMARY = "NPM: comma-separated-tokens"
DESCRIPTION = "Parse and stringify comma-separated tokens"
HOMEPAGE = "https://github.com/wooorm/comma-separated-tokens#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/comma-separated-tokens/-/comma-separated-tokens-1.0.8.tgz"
SRC_URI[md5sum] = "dfd8198d4ecd3877cea7e11a0431759b"
SRC_URI[sha256sum] = "6b8d3679a62df21a7a68de73a74b70284735b45917bd33a9d0340d0f3aa20a89"

NPM_PKGNAME = "comma-separated-tokens"

inherit npmhelper
inherit native
