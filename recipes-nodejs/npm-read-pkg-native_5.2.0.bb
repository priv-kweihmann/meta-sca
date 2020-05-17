SUMMARY = "NPM: read-pkg"
DESCRIPTION = "Read a package.json file"
HOMEPAGE = "https://github.com/sindresorhus/read-pkg#readme"

DEPENDS = "npm-normalize-package-data-native npm-parse-json-native npm-type-fest-native npm-types-normalize-package-data-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/read-pkg/-/read-pkg-5.2.0.tgz"
SRC_URI[md5sum] = "7a0c0e334bcff64b359f19a1d25319a5"
SRC_URI[sha256sum] = "abf43e77ff207bbae82e4bc5fc69a5eedc13c466e3498d737d6310d473bbae41"

NPM_PKGNAME = "read-pkg"

inherit npmhelper
inherit native
