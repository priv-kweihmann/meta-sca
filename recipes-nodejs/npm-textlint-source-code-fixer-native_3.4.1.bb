SUMMARY = "NPM: @textlint/source-code-fixer"
DESCRIPTION = "Apply @textlint/kernel lint result to text."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/source-code-fixer/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=feaa9e77067014c95af709fcb652c2ca"

DEPENDS = "npm-debug-native \
           npm-textlint-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/source-code-fixer/-/source-code-fixer-3.4.1.tgz"
SRC_URI[md5sum] = "79e3eb5151adca6cb1ec609d4be32bca"
SRC_URI[sha256sum] = "8821d27f6c6b73ce63b4be61341a72c3126a39005e40fe7a5dd48a01434932ad"

NPM_PKGNAME = "@textlint/source-code-fixer"

inherit npmhelper
inherit native
