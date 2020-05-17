SUMMARY = "NPM: read-pkg-up"
DESCRIPTION = "Read the closest package.json file"
HOMEPAGE = "https://github.com/sindresorhus/read-pkg-up#readme"

DEPENDS = "npm-find-up-native npm-read-pkg-native npm-type-fest-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/read-pkg-up/-/read-pkg-up-7.0.1.tgz"
SRC_URI[md5sum] = "56d211c6b3fdf2f477998fc2a0535128"
SRC_URI[sha256sum] = "6e15fb7e1fa3ed6aeab8a28893eb0cf77de0d8027f1080a1929af4765a698678"

NPM_PKGNAME = "read-pkg-up"

inherit npmhelper
inherit native
