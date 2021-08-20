SUMMARY = "NPM: nanoid"
DESCRIPTION = "A tiny (108 bytes), secure URL-friendly unique string ID generator"
HOMEPAGE = "https://github.com/ai/nanoid#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=237c21016e56a1ee4475a39fc00d1504"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/nanoid/-/nanoid-3.1.25.tgz"
SRC_URI[md5sum] = "cf82465d90a5f488901aa5b70eeed864"
SRC_URI[sha256sum] = "1835a342a119a6ad8bcff0c9290ff73d87c8f6f760a16a32de6adec2f3e04a2d"

NPM_PKGNAME = "nanoid"

inherit npmhelper
inherit native
