SUMMARY = "NPM: vfile-location"
DESCRIPTION = "vfile utility to convert between positional (line and column-based) and offset (range-based) locations"
HOMEPAGE = "https://github.com/vfile/vfile-location#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-types-unist-native \
           npm-vfile-native"

SRC_URI = "https://registry.npmjs.org/vfile-location/-/vfile-location-4.0.1.tgz"
SRC_URI[md5sum] = "a9d8dd49fb6b0da4efdb52fafa32166c"
SRC_URI[sha256sum] = "71a95f6c0595d58cd6c08045f930b876a281157e4b652ec8cb0c4aa379aebf50"

NPM_PKGNAME = "vfile-location"

inherit npmhelper
inherit native
