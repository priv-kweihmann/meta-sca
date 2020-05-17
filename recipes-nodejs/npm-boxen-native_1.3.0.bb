SUMMARY = "NPM: boxen"
DESCRIPTION = "Create boxes in the terminal"
HOMEPAGE = "https://github.com/sindresorhus/boxen#readme"

DEPENDS = "npm-ansi-align-native npm-camelcase-native npm-chalk-native npm-cli-boxes-native npm-string-width-native npm-term-size-native npm-widest-line-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/boxen/-/boxen-1.3.0.tgz"
SRC_URI[md5sum] = "da3a994c4c7439857f4a8219e1926bf3"
SRC_URI[sha256sum] = "34fc6ff5e92a8b5503d2f434ce2c2151c118fec992e0537205df289a713a296e"

NPM_PKGNAME = "boxen"

inherit npmhelper
inherit native
