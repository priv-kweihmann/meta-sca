SUMMARY = "NPM: is-glob"
DESCRIPTION = "Returns `true` if the given string looks like a glob pattern or an extglob pattern. This makes it easy to create code that only uses external modules like node-glob when necessary, resulting in much faster code execution and initialization time, and a bet"
HOMEPAGE = "https://github.com/micromatch/is-glob"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3d83ea4c8ec9b31d9ff2c82fa29beabb"

DEPENDS = "npm-is-extglob-native"

SRC_URI = "https://registry.npmjs.org/is-glob/-/is-glob-4.0.3.tgz"
SRC_URI[md5sum] = "f2ae49ffa6c02bb48edae7c9360785b9"
SRC_URI[sha256sum] = "3fe453fb193bb58f6f0505dfb1151230935380b5b55e1f9864261c2aafc1bec6"

NPM_PKGNAME = "is-glob"

inherit npmhelper
inherit native
