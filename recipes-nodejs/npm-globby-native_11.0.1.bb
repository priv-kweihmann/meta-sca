SUMMARY = "NPM: globby"
DESCRIPTION = "User-friendly glob matching"
HOMEPAGE = "https://github.com/sindresorhus/globby#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-array-union-native \
           npm-dir-glob-native \
           npm-fast-glob-native \
           npm-ignore-native \
           npm-merge2-native \
           npm-slash-native"

SRC_URI = "https://registry.npmjs.org/globby/-/globby-11.0.1.tgz"
SRC_URI[md5sum] = "66342b9da5485cfa3992c77272014894"
SRC_URI[sha256sum] = "2d430835d507c505b8c9ea44b5116263e9504150a631f9e3596345ce0d1d53fb"

NPM_PKGNAME = "globby"

inherit npmhelper
inherit native
