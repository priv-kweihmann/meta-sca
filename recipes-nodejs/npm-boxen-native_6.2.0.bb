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

SRC_URI = "https://registry.npmjs.org/boxen/-/boxen-6.2.0.tgz"
SRC_URI[md5sum] = "55054339a3752cdc85fe32d7c2c5cd08"
SRC_URI[sha256sum] = "90139534bfa26a6a0a2607034dec0609f62b0e28d63faf3eaad12d18da636d0a"

NPM_PKGNAME = "boxen"

inherit npmhelper
inherit native
