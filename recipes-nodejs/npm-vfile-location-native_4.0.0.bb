SUMMARY = "NPM: vfile-location"
DESCRIPTION = "vfile utility to convert between positional (line and column-based) and offset (range-based) locations"
HOMEPAGE = "https://github.com/vfile/vfile-location#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/vfile-location/-/vfile-location-4.0.0.tgz"
SRC_URI[md5sum] = "72db9591c165075f468fe8d087468150"
SRC_URI[sha256sum] = "6ee85f7bd543dcb286f923bf6885ff01db067019fbe5b0cd99be3c9891984163"

NPM_PKGNAME = "vfile-location"

inherit npmhelper
inherit native
