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

SRC_URI = "https://registry.npmjs.org/globby/-/globby-11.0.2.tgz"
SRC_URI[md5sum] = "1564b1c63fc285745c05680aee8138c4"
SRC_URI[sha256sum] = "1eb257881f1efccae4669b49f1f6468c9e00a9c427d44fe678717dd5822e0eb0"

NPM_PKGNAME = "globby"

inherit npmhelper
inherit native
