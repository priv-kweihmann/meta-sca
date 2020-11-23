SUMMARY = "NPM: nanoid"
DESCRIPTION = "A tiny (108 bytes), secure URL-friendly unique string ID generator"
HOMEPAGE = "https://github.com/ai/nanoid#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=237c21016e56a1ee4475a39fc00d1504"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/nanoid/-/nanoid-3.1.18.tgz"
SRC_URI[md5sum] = "0823df79206c0a80c362f23d1f11502b"
SRC_URI[sha256sum] = "d404ac739727880ec2685d64aa06a01b17c8c8d0747b121808dad426d6692777"

NPM_PKGNAME = "nanoid"

inherit npmhelper
inherit native
