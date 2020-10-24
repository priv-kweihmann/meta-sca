SUMMARY = "NPM: nanoid"
DESCRIPTION = "A tiny (108 bytes), secure URL-friendly unique string ID generator"
HOMEPAGE = "https://github.com/ai/nanoid#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=237c21016e56a1ee4475a39fc00d1504"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/nanoid/-/nanoid-3.1.15.tgz"
SRC_URI[md5sum] = "22349728166a7301b33e15aec432df67"
SRC_URI[sha256sum] = "cbb9491599af73a161b7997decd45503d5eb03c2d011963b415b4f0f8823c4b2"

NPM_PKGNAME = "nanoid"

inherit npmhelper
inherit native
