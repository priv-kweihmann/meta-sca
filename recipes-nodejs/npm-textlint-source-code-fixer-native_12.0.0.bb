SUMMARY = "NPM: @textlint/source-code-fixer"
DESCRIPTION = "Apply @textlint/kernel lint result to text."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/source-code-fixer/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=feaa9e77067014c95af709fcb652c2ca"

DEPENDS = "npm-debug-native \
           npm-textlint-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/source-code-fixer/-/source-code-fixer-12.0.0.tgz"
SRC_URI[md5sum] = "41151b9c966c21cd7ef63bc6a1609d11"
SRC_URI[sha256sum] = "dc008f305e4241d80f3829294bf665a9b1f2cd42bb4f8ddf075a817f04d27a28"

NPM_PKGNAME = "@textlint/source-code-fixer"

inherit npmhelper
inherit native
