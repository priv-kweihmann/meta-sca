SUMMARY = "NPM: is-glob"
DESCRIPTION = "Returns `true` if the given string looks like a glob pattern or an extglob pattern. This makes it easy to create code that only uses external modules like node-glob when necessary, resulting in much faster code execution and initialization time, and a bet"
HOMEPAGE = "https://github.com/micromatch/is-glob"

DEPENDS = "npm-is-extglob-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3d83ea4c8ec9b31d9ff2c82fa29beabb"

SRC_URI = "https://registry.npmjs.org/is-glob/-/is-glob-4.0.1.tgz"
SRC_URI[md5sum] = "f9332705861d412621445e47d3c3be2c"
SRC_URI[sha256sum] = "8b57563403911ae1fb38cb960dfe47c1c103d11dfa0eabd739dde3dc945ab90c"

NPM_PKGNAME = "is-glob"

inherit npmhelper
inherit native
