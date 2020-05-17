SUMMARY = "NPM: widest-line"
DESCRIPTION = "Get the visual width of the widest line in a string - the number of columns required to display it"
HOMEPAGE = "https://github.com/sindresorhus/widest-line#readme"

DEPENDS = "npm-string-width-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/widest-line/-/widest-line-2.0.1.tgz"
SRC_URI[md5sum] = "0c2e6f65a35e1125653f2f6e0e10ce93"
SRC_URI[sha256sum] = "104b8ae3c42acbadd5759de06f2b7d4fdf6a36261d8d188d4aca65aca1a7dc63"

NPM_PKGNAME = "widest-line"

inherit npmhelper
inherit native
