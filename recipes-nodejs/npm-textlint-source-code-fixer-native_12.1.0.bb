SUMMARY = "NPM: @textlint/source-code-fixer"
DESCRIPTION = "Apply @textlint/kernel lint result to text."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/source-code-fixer/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=feaa9e77067014c95af709fcb652c2ca"

DEPENDS = "npm-debug-native \
           npm-textlint-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/source-code-fixer/-/source-code-fixer-12.1.0.tgz"
SRC_URI[md5sum] = "ffb053a418afc877f74b8da48f3a4497"
SRC_URI[sha256sum] = "456e2cece518b0e191d48affcaafcaaa1ed69658ca1e776ba3f6ad2325f3747f"

NPM_PKGNAME = "@textlint/source-code-fixer"

inherit npmhelper
inherit native
