SUMMARY = "NPM: nanoid"
DESCRIPTION = "A tiny (108 bytes), secure URL-friendly unique string ID generator"
HOMEPAGE = "https://github.com/ai/nanoid#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=237c21016e56a1ee4475a39fc00d1504"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/nanoid/-/nanoid-3.1.22.tgz"
SRC_URI[md5sum] = "e524e328d6aaa45dad6e625ec84f5c31"
SRC_URI[sha256sum] = "ffeb319270337b578d973d1db8c9894d95453d8ee3b810988fbe691b0d7402cd"

NPM_PKGNAME = "nanoid"

inherit npmhelper
inherit native
