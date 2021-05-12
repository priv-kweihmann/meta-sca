SUMMARY = "NPM: nanoid"
DESCRIPTION = "A tiny (108 bytes), secure URL-friendly unique string ID generator"
HOMEPAGE = "https://github.com/ai/nanoid#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=237c21016e56a1ee4475a39fc00d1504"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/nanoid/-/nanoid-3.1.23.tgz"
SRC_URI[md5sum] = "78822287db035e1344404447cebd8f23"
SRC_URI[sha256sum] = "498065c8560b5f88f131c0e336f928bd314dad0664b35ddc7ac23e984d511f4b"

NPM_PKGNAME = "nanoid"

inherit npmhelper
inherit native
