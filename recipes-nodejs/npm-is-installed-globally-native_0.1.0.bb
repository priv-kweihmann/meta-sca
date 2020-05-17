SUMMARY = "NPM: is-installed-globally"
DESCRIPTION = "Check if your package was installed globally"
HOMEPAGE = "https://github.com/sindresorhus/is-installed-globally#readme"

DEPENDS = "npm-global-dirs-native npm-is-path-inside-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/is-installed-globally/-/is-installed-globally-0.1.0.tgz"
SRC_URI[md5sum] = "0187402c2c534f0860be5b2170aadbde"
SRC_URI[sha256sum] = "239d829761ee5597b5e07e6f9417145abd3978a62c0fd54ca008623156e2b86e"

NPM_PKGNAME = "is-installed-globally"

inherit npmhelper
inherit native
