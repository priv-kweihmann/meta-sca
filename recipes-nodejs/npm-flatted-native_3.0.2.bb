SUMMARY = "NPM: flatted"
DESCRIPTION = "A super light and fast circular JSON parser."
HOMEPAGE = "https://github.com/WebReflection/flatted#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6e5d99ea62f60b0d450c3099eeff0bfd"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/flatted/-/flatted-3.0.2.tgz"
SRC_URI[md5sum] = "0ddbef91cf47a2ac66feead3328c1897"
SRC_URI[sha256sum] = "f8895f31a7c70882b68da2566850751caa05d0bc19d0953ec43401acd5c43f50"

NPM_PKGNAME = "flatted"

inherit npmhelper
inherit native
