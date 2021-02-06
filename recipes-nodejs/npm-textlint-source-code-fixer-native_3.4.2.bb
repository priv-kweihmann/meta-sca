SUMMARY = "NPM: @textlint/source-code-fixer"
DESCRIPTION = "Apply @textlint/kernel lint result to text."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/source-code-fixer/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=feaa9e77067014c95af709fcb652c2ca"

DEPENDS = "npm-debug-native \
           npm-textlint-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/source-code-fixer/-/source-code-fixer-3.4.2.tgz"
SRC_URI[md5sum] = "279bc91d43085e81de489b664eb936e0"
SRC_URI[sha256sum] = "73bc94ce8893af1e872d7e5eff2b282195b8665b0d70c97713b5bf833a318e04"

NPM_PKGNAME = "@textlint/source-code-fixer"

inherit npmhelper
inherit native
