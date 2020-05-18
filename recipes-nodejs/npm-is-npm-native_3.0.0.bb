SUMMARY = "NPM: is-npm"
DESCRIPTION = "Check if your code is running as an npm script"
HOMEPAGE = "https://github.com/sindresorhus/is-npm#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-npm/-/is-npm-3.0.0.tgz"
SRC_URI[md5sum] = "f311396757bfcc444c05badb3b1d38d2"
SRC_URI[sha256sum] = "a4e51e546ad8382d9fa546899f22a9404b5e5bd6c42117bcbf7354f23625db94"

NPM_PKGNAME = "is-npm"

inherit npmhelper
inherit native
