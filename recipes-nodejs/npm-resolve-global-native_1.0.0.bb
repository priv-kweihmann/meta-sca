SUMMARY = "NPM: resolve-global"
DESCRIPTION = "Resolve the path of a globally installed module"
HOMEPAGE = "https://github.com/sindresorhus/resolve-global#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-global-dirs-native"

SRC_URI = "https://registry.npmjs.org/resolve-global/-/resolve-global-1.0.0.tgz"
SRC_URI[md5sum] = "a290ccbfb68423b6a2d1a0cbedf8a239"
SRC_URI[sha256sum] = "c1313f80aae61bf42b2e7c8b4b681d9582e46df7ee02c4bf88144edaa2445c56"

NPM_PKGNAME = "resolve-global"

inherit npmhelper
inherit native
