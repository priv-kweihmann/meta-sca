SUMMARY = "NPM: loud-rejection"
DESCRIPTION = "Make unhandled promise rejections fail loudly instead of the default silent fail"
HOMEPAGE = "https://github.com/sindresorhus/loud-rejection#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-currently-unhandled-native \
           npm-signal-exit-native"

SRC_URI = "https://registry.npmjs.org/loud-rejection/-/loud-rejection-2.2.0.tgz"
SRC_URI[md5sum] = "5d369657c1feffc1d66c188521cbadbc"
SRC_URI[sha256sum] = "2c07fac8bbb8fb89d3f3c69487b4f9d8a2adc2bf571d3eca8bb45f7ab674f8f9"

NPM_PKGNAME = "loud-rejection"

inherit npmhelper
inherit native
