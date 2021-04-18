SUMMARY = "NPM: wrap-ansi"
DESCRIPTION = "Wordwrap a string with ANSI escape codes"
HOMEPAGE = "https://github.com/chalk/wrap-ansi#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-ansi-styles-native \
           npm-string-width-native \
           npm-strip-ansi-native"

SRC_URI = "https://registry.npmjs.org/wrap-ansi/-/wrap-ansi-8.0.0.tgz"
SRC_URI[md5sum] = "c4ef71d333e8b925a4869ef202a94567"
SRC_URI[sha256sum] = "759d70283d38173e5800f2b6b8fadd0af0b6b49f74196aa59bfc5a50a5e853d6"

NPM_PKGNAME = "wrap-ansi"

inherit npmhelper
inherit native
