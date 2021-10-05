SUMMARY = "NPM: boxen"
DESCRIPTION = "Create boxes in the terminal"
HOMEPAGE = "https://github.com/sindresorhus/boxen#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-ansi-align-native \
           npm-camelcase-native \
           npm-chalk-native \
           npm-cli-boxes-native \
           npm-string-width-native \
           npm-type-fest-native \
           npm-widest-line-native \
           npm-wrap-ansi-native"

SRC_URI = "https://registry.npmjs.org/boxen/-/boxen-6.1.0.tgz"
SRC_URI[md5sum] = "188e6ad2d3912a14ec9601b049e1c85c"
SRC_URI[sha256sum] = "513ab5a8c38fcb19b7275f85a9cb6b0e0a0c2b0710c222d6701d9222b22db2b4"

NPM_PKGNAME = "boxen"

inherit npmhelper
inherit native
