SUMMARY = "NPM: nanoid"
DESCRIPTION = "A tiny (130 bytes), secure URL-friendly unique string ID generator"
HOMEPAGE = "https://github.com/ai/nanoid#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=237c21016e56a1ee4475a39fc00d1504"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/nanoid/-/nanoid-3.1.32.tgz"
SRC_URI[md5sum] = "a1a8e9389c437bb2528d40b9ad5b5678"
SRC_URI[sha256sum] = "dc18e05996015a48d3cffb42973f7c99a3f8979b4c141fd4a0d210ff7dd7e257"

NPM_PKGNAME = "nanoid"

inherit npmhelper
inherit native
