SUMMARY = "NPM: nanoid"
DESCRIPTION = "A tiny (108 bytes), secure URL-friendly unique string ID generator"
HOMEPAGE = "https://github.com/ai/nanoid#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=237c21016e56a1ee4475a39fc00d1504"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/nanoid/-/nanoid-3.1.29.tgz"
SRC_URI[md5sum] = "26f6a127703db44415157672a0c9ae28"
SRC_URI[sha256sum] = "dd3281802937611ce67bf51cb52f9fe852112a5b6acc62f9a7e1a5f6dfc384d9"

NPM_PKGNAME = "nanoid"

inherit npmhelper
inherit native
