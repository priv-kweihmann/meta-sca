SUMMARY = "NPM: nanoid"
DESCRIPTION = "A tiny (108 bytes), secure URL-friendly unique string ID generator"
HOMEPAGE = "https://github.com/ai/nanoid#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=237c21016e56a1ee4475a39fc00d1504"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/nanoid/-/nanoid-3.1.21.tgz"
SRC_URI[md5sum] = "30be1accf629fd99f6a81975d0c0de3b"
SRC_URI[sha256sum] = "c6b4ecb2dac475b8806daebbf06b6049c2d8129b2c66574f9cc72f5a108dbea9"

NPM_PKGNAME = "nanoid"

inherit npmhelper
inherit native
