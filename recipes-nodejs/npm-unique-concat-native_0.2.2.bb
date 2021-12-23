SUMMARY = "NPM: unique-concat"
DESCRIPTION = "Concatenates two arrays, removing duplicates in the process and returns one array with unique values."
HOMEPAGE = "https://github.com/thlorenz/unique-concat"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bf595075ff556bc46c43e08f142fa4f5"

SRC_URI = "https://registry.npmjs.org/unique-concat/-/unique-concat-0.2.2.tgz"
SRC_URI[md5sum] = "d65a00562e8f1a07fd75c19f525482f6"
SRC_URI[sha256sum] = "6313a53feba4d9a7c6ae237fab83d10a26208bb711781e101573aaee9af324e0"

NPM_PKGNAME = "unique-concat"

inherit npmhelper
inherit native
