SUMMARY = "NPM: @textlint/source-code-fixer"
DESCRIPTION = "Apply @textlint/kernel lint result to text."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/source-code-fixer/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=feaa9e77067014c95af709fcb652c2ca"

DEPENDS = "npm-debug-native \
           npm-textlint-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/source-code-fixer/-/source-code-fixer-12.1.1.tgz"
SRC_URI[md5sum] = "5ddede6781f12a5eb12bd5efeb39a82f"
SRC_URI[sha256sum] = "a6af98fe496d5a9c2130f0920545e507bcd573de6f019f8a6aa9a3eb4886978e"

NPM_PKGNAME = "@textlint/source-code-fixer"

inherit npmhelper
inherit native
