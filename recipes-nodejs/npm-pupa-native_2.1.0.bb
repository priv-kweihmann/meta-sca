SUMMARY = "NPM: pupa"
DESCRIPTION = "Simple micro templating"
HOMEPAGE = "https://github.com/sindresorhus/pupa#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-escape-goat-native"

SRC_URI = "https://registry.npmjs.org/pupa/-/pupa-2.1.0.tgz"
SRC_URI[md5sum] = "d4bef305c9a8e0bda37a2134ad76343a"
SRC_URI[sha256sum] = "ffeaddda5dc6ce8a5c6eb6b651704a30347fab2127d838861db2897183291a15"

NPM_PKGNAME = "pupa"

inherit npmhelper
inherit native
