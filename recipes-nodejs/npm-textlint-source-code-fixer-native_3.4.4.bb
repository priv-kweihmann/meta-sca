SUMMARY = "NPM: @textlint/source-code-fixer"
DESCRIPTION = "Apply @textlint/kernel lint result to text."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/source-code-fixer/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=feaa9e77067014c95af709fcb652c2ca"

DEPENDS = "npm-debug-native \
           npm-textlint-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/source-code-fixer/-/source-code-fixer-3.4.4.tgz"
SRC_URI[md5sum] = "99b896ce192d433d47a283ddcd224b8e"
SRC_URI[sha256sum] = "66da32d70a703d2fe3d621a9e4504963bfef97b65a2398f43ce27a8a2af0ea7e"

NPM_PKGNAME = "@textlint/source-code-fixer"

inherit npmhelper
inherit native
