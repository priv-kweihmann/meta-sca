SUMMARY = "NPM: @textlint/source-code-fixer"
DESCRIPTION = "Apply @textlint/kernel lint result to text."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/source-code-fixer/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=feaa9e77067014c95af709fcb652c2ca"

DEPENDS = "npm-debug-native \
           npm-textlint-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/source-code-fixer/-/source-code-fixer-3.4.5.tgz"
SRC_URI[md5sum] = "d7e5b332c7b49f5f61c46b675828f9a5"
SRC_URI[sha256sum] = "83a6bf4670abcf7ee4be7d8e0d4d79fb80610535a47369c0ee1d7cbd8dad54fc"

NPM_PKGNAME = "@textlint/source-code-fixer"

inherit npmhelper
inherit native
