SUMMARY = "NPM: p-limit"
DESCRIPTION = "Run multiple promise-returning & async functions with limited concurrency"
HOMEPAGE = "https://github.com/sindresorhus/p-limit#readme"

DEPENDS = "npm-p-try-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/p-limit/-/p-limit-2.3.0.tgz"
SRC_URI[md5sum] = "002eb5aeebd77c4c6a6570c7be31c0e9"
SRC_URI[sha256sum] = "384b452409cfeb5c6fa82dc68ebfa498b24717b74fb8d3fe6eb2bb89908db295"

NPM_PKGNAME = "p-limit"

inherit npmhelper
inherit native
