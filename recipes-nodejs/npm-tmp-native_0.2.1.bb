SUMMARY = "NPM: tmp"
DESCRIPTION = "Temporary file and directory creator"
HOMEPAGE = "http://github.com/raszi/node-tmp"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4502395b4fdb20719bf54bfb416efe5d"

DEPENDS = "npm-rimraf-native"

SRC_URI = "https://registry.npmjs.org/tmp/-/tmp-0.2.1.tgz"
SRC_URI[md5sum] = "b0586b91f2a985eab95b6b3a3d4cc0ee"
SRC_URI[sha256sum] = "7d6cd74f6fbc7fe2ff7d6f8ffe122a199d8b0aba6bf8f21d5444b0289463949a"

NPM_PKGNAME = "tmp"

inherit npmhelper
inherit native
