SUMMARY = "NPM: nanoid"
DESCRIPTION = "A tiny (108 bytes), secure URL-friendly unique string ID generator"
HOMEPAGE = "https://github.com/ai/nanoid#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=237c21016e56a1ee4475a39fc00d1504"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/nanoid/-/nanoid-3.1.13.tgz"
SRC_URI[md5sum] = "c394bf0d4930910efb30f490119342b6"
SRC_URI[sha256sum] = "6dfb887153ab92c03f720bdf341a7ddfc0b71c31fd7f7f00065a54090d82d39f"

NPM_PKGNAME = "nanoid"

inherit npmhelper
inherit native
