SUMMARY = "NPM: @textlint/source-code-fixer"
DESCRIPTION = "Apply @textlint/kernel lint result to text."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/source-code-fixer/"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=feaa9e77067014c95af709fcb652c2ca"

DEPENDS = "npm-debug-native \
           npm-textlint-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/source-code-fixer/-/source-code-fixer-12.0.2.tgz"
SRC_URI[md5sum] = "ef6a7f005c1d6628960374b3832d6f9a"
SRC_URI[sha256sum] = "c6eadedb6a575de93a356f10f23add2de06f0dda6edca38895fe3d4eda89ea45"

NPM_PKGNAME = "@textlint/source-code-fixer"

inherit npmhelper
inherit native
