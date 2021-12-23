SUMMARY = "NPM: rechoir"
DESCRIPTION = "Prepare a node environment to require files with different extensions."
HOMEPAGE = "https://github.com/gulpjs/rechoir#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5d993567c4655e439768e146094c1869"

DEPENDS = "npm-resolve-native"

SRC_URI = "https://registry.npmjs.org/rechoir/-/rechoir-0.8.0.tgz"
SRC_URI[md5sum] = "bb4294dcaba83070714c04abcd2fb634"
SRC_URI[sha256sum] = "6a9af1f7c2693a1b0d7824812b4db95f02367764bb2601f40bbdaf731b7a8d67"

NPM_PKGNAME = "rechoir"

inherit npmhelper
inherit native
