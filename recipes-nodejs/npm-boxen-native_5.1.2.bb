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

SRC_URI = "https://registry.npmjs.org/boxen/-/boxen-5.1.2.tgz"
SRC_URI[md5sum] = "98d9e47edf6b388530b1661fb82808f5"
SRC_URI[sha256sum] = "41812717c3ccd2438f8a864c7c24e3710d7bad2a81156b76375273223dfdfc3f"

NPM_PKGNAME = "boxen"

inherit npmhelper
inherit native
