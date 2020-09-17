SUMMARY = "NPM: nanoid"
DESCRIPTION = "A tiny (108 bytes), secure URL-friendly unique string ID generator"
HOMEPAGE = "https://github.com/ai/nanoid#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=237c21016e56a1ee4475a39fc00d1504"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/nanoid/-/nanoid-3.1.12.tgz"
SRC_URI[md5sum] = "73fb28323533988c5a1bfcf2cc59c896"
SRC_URI[sha256sum] = "001ddecbf62b1e58ad335bd0e5bc65480ffba4e64d63cb6b5cf18f924cd64780"

NPM_PKGNAME = "nanoid"

inherit npmhelper
inherit native
