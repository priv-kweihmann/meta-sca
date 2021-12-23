SUMMARY = "NPM: resolve-cwd"
DESCRIPTION = "Resolve the path of a module like `require.resolve()` but from the current working directory"
HOMEPAGE = "https://github.com/sindresorhus/resolve-cwd#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-resolve-from-native"

SRC_URI = "https://registry.npmjs.org/resolve-cwd/-/resolve-cwd-3.0.0.tgz"
SRC_URI[md5sum] = "145b6ef251ce86e20d6d5d53d0a18b18"
SRC_URI[sha256sum] = "a9d99831e70958349d753cff556d1efd10d818cb4affb1f32c1eacc013158ca6"

NPM_PKGNAME = "resolve-cwd"

inherit npmhelper
inherit native
