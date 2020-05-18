SUMMARY = "NPM: latest-version"
DESCRIPTION = "Get the latest version of an npm package"
HOMEPAGE = "https://github.com/sindresorhus/latest-version#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-package-json-native"

SRC_URI = "https://registry.npmjs.org/latest-version/-/latest-version-5.1.0.tgz"
SRC_URI[md5sum] = "48756740f75eccae19fa5a36c933caf5"
SRC_URI[sha256sum] = "6473a9d9ed6b9a7e34cdebf4789e48878d5cb5cfbf45a01a1abb366224d2b053"

NPM_PKGNAME = "latest-version"

inherit npmhelper
inherit native
