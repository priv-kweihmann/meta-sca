SUMMARY = "NPM: nanoid"
DESCRIPTION = "A tiny (108 bytes), secure URL-friendly unique string ID generator"
HOMEPAGE = "https://github.com/ai/nanoid#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=237c21016e56a1ee4475a39fc00d1504"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/nanoid/-/nanoid-3.1.17.tgz"
SRC_URI[md5sum] = "353fc84c2c4491d60df70ebf5477fefb"
SRC_URI[sha256sum] = "55761dc375b473c7730a8229a66b73509ae8b8b707570581f5ce8bda87627ec6"

NPM_PKGNAME = "nanoid"

inherit npmhelper
inherit native
