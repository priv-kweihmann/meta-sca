SUMMARY = "NPM: p-limit"
DESCRIPTION = "Run multiple promise-returning & async functions with limited concurrency"
HOMEPAGE = "https://github.com/sindresorhus/p-limit#readme"

DEPENDS = "npm-p-try-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/p-limit/-/p-limit-1.3.0.tgz"
SRC_URI[md5sum] = "f674d1283c8ac4d11ec813efc2b5934a"
SRC_URI[sha256sum] = "c2fdcbbe99cec5a0ef58f887e690f8dd5dff21f5fbad138a9a3f1121c50cc150"

NPM_PKGNAME = "p-limit"

inherit npmhelper
inherit native
