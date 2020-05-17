SUMMARY = "NPM: mimic-fn"
DESCRIPTION = "Make a function mimic another one"
HOMEPAGE = "https://github.com/sindresorhus/mimic-fn#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/mimic-fn/-/mimic-fn-2.1.0.tgz"
SRC_URI[md5sum] = "5c2b7035eec827dcc5f0700d10c5f8c9"
SRC_URI[sha256sum] = "ea705c261486c4ef2a8c936b159c86ad1d7451d7afc7b7f97cc2d1805c0466bf"

NPM_PKGNAME = "mimic-fn"

inherit npmhelper
inherit native
