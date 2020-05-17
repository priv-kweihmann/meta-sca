SUMMARY = "NPM: keyv"
DESCRIPTION = "Simple key-value storage with support for multiple backends"
HOMEPAGE = "https://github.com/lukechilds/keyv"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9a2baa6947d5018096b83508bd94026e"

DEPENDS = "npm-json-buffer-native"

SRC_URI = "https://registry.npmjs.org/keyv/-/keyv-3.1.0.tgz"
SRC_URI[md5sum] = "84f66702922a1ede9729ba9d96d0510d"
SRC_URI[sha256sum] = "51e3a85fb250880262e91a64038962cea919e43f281afd212501a9fb6424da32"

NPM_PKGNAME = "keyv"

inherit npmhelper
inherit native
