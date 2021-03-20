SUMMARY = "NPM: @textlint/source-code-fixer"
DESCRIPTION = "Apply @textlint/kernel lint result to text."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/source-code-fixer/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=feaa9e77067014c95af709fcb652c2ca"

DEPENDS = "npm-debug-native \
           npm-textlint-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/source-code-fixer/-/source-code-fixer-3.4.3.tgz"
SRC_URI[md5sum] = "d81231172a0acece3431395f8184ea20"
SRC_URI[sha256sum] = "2a5d835488f7ccabd675fa219764eccb9bc4e421aa4a72af433f18fd5a737d0d"

NPM_PKGNAME = "@textlint/source-code-fixer"

inherit npmhelper
inherit native
