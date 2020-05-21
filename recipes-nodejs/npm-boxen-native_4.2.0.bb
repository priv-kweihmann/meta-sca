SUMMARY = "NPM: boxen"
DESCRIPTION = "Create boxes in the terminal"
HOMEPAGE = "https://github.com/sindresorhus/boxen#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-ansi-align-native \
           npm-camelcase-native \
           npm-chalk-native \
           npm-cli-boxes-native \
           npm-string-width-native \
           npm-term-size-native \
           npm-type-fest-native \
           npm-widest-line-native"

SRC_URI = "https://registry.npmjs.org/boxen/-/boxen-4.2.0.tgz"
SRC_URI[md5sum] = "fdfa1ef3d4970422a2c3396f0aaa3a4b"
SRC_URI[sha256sum] = "808642c1076dded37f522d02e54f15bb9414a55fc92891618e3509e692d0e9dc"

NPM_PKGNAME = "boxen"

inherit npmhelper
inherit native
