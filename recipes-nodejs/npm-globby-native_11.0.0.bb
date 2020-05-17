SUMMARY = "NPM: globby"
DESCRIPTION = "User-friendly glob matching"
HOMEPAGE = "https://github.com/sindresorhus/globby#readme"

DEPENDS = "npm-array-union-native npm-dir-glob-native npm-fast-glob-native npm-ignore-native npm-merge2-native npm-slash-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/globby/-/globby-11.0.0.tgz"
SRC_URI[md5sum] = "0e5c968960bd8a3f84ef9b92306b4862"
SRC_URI[sha256sum] = "3b91f4a86ef660f3295c1efc043c1483553db864b069e2ed4b599f5759c828b7"

NPM_PKGNAME = "globby"

inherit npmhelper
inherit native
