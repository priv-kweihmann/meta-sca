SUMMARY = "NPM: has-own-prop"
DESCRIPTION = "A safer `.hasOwnProperty()`"
HOMEPAGE = "https://github.com/sindresorhus/has-own-prop#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/has-own-prop/-/has-own-prop-2.0.0.tgz"
SRC_URI[md5sum] = "544fcd0ba9d4049447de5ec06ec665ca"
SRC_URI[sha256sum] = "beb85eb47da8ceb1f6ae9d4ea8c4d0c552443dd21253e4b42828f92aece065ed"

NPM_PKGNAME = "has-own-prop"

inherit npmhelper
inherit native
