SUMMARY = "NPM: strip-indent"
DESCRIPTION = "Strip leading whitespace from each line in a string"
HOMEPAGE = "https://github.com/sindresorhus/strip-indent#readme"

DEPENDS = "npm-min-indent-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/strip-indent/-/strip-indent-3.0.0.tgz"
SRC_URI[md5sum] = "e72da010f26a8835baac27949a74e77b"
SRC_URI[sha256sum] = "e5957205b9664935858a2d2e2049118bf577b3afa64a83d513b99184ee7c247f"

NPM_PKGNAME = "strip-indent"

inherit npmhelper
inherit native
