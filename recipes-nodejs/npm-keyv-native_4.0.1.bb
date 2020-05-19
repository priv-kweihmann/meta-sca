SUMMARY = "NPM: keyv"
DESCRIPTION = "Simple key-value storage with support for multiple backends"
HOMEPAGE = "https://github.com/lukechilds/keyv"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9a2baa6947d5018096b83508bd94026e"

DEPENDS = "npm-json-buffer-native"

SRC_URI = "https://registry.npmjs.org/keyv/-/keyv-4.0.1.tgz"
SRC_URI[md5sum] = "0f4796c1de6c0f70b2125e0ecc5a6d23"
SRC_URI[sha256sum] = "62ba3778cf6050855e2ffc5262fa41a015630653b790c77d94f97f955af05115"

NPM_PKGNAME = "keyv"

inherit npmhelper
inherit native
