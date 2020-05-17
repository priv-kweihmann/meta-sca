SUMMARY = "NPM: p-locate"
DESCRIPTION = "Get the first fulfilled promise that satisfies the provided testing function"
HOMEPAGE = "https://github.com/sindresorhus/p-locate#readme"

DEPENDS = "npm-p-limit-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/p-locate/-/p-locate-4.1.0.tgz"
SRC_URI[md5sum] = "ef4841bc32d15f49592f42a89d3f8cfd"
SRC_URI[sha256sum] = "d95a6ae462e3d967deb0c250bda1c3bbebfe86a58832d27b204c7b74a76fa5f0"

NPM_PKGNAME = "p-locate"

inherit npmhelper
inherit native
