SUMMARY = "NPM: nanoid"
DESCRIPTION = "A tiny (108 bytes), secure URL-friendly unique string ID generator"
HOMEPAGE = "https://github.com/ai/nanoid#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=237c21016e56a1ee4475a39fc00d1504"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/nanoid/-/nanoid-3.1.28.tgz"
SRC_URI[md5sum] = "e01184c30d0ad21ecb30d5c29c8c4f00"
SRC_URI[sha256sum] = "4dfa487e9191d50aa92a25242e9f3dd25e6debba3519500c7692d7bc766b2769"

NPM_PKGNAME = "nanoid"

inherit npmhelper
inherit native
