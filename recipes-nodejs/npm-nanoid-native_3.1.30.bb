SUMMARY = "NPM: nanoid"
DESCRIPTION = "A tiny (130 bytes), secure URL-friendly unique string ID generator"
HOMEPAGE = "https://github.com/ai/nanoid#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=237c21016e56a1ee4475a39fc00d1504"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/nanoid/-/nanoid-3.1.30.tgz"
SRC_URI[md5sum] = "41ea066c59df137d09c6a82e2d2bd1c5"
SRC_URI[sha256sum] = "c2c56365ec4711770aeae3440f7975e0ac5b0737efabe7bef430d0cc1c2a7381"

NPM_PKGNAME = "nanoid"

inherit npmhelper
inherit native
