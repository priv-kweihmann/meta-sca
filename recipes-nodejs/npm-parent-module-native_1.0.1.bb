SUMMARY = "NPM: parent-module"
DESCRIPTION = "Get the path of the parent module"
HOMEPAGE = "https://github.com/sindresorhus/parent-module#readme"

DEPENDS = "npm-callsites-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/parent-module/-/parent-module-1.0.1.tgz"
SRC_URI[md5sum] = "16d27a1a243976f82f8f2a30b33d0bf2"
SRC_URI[sha256sum] = "607e83127ea471fdf079c501148a17936cb4137ec779ce6ec52f083f149ae407"

NPM_PKGNAME = "parent-module"

inherit npmhelper
inherit native
