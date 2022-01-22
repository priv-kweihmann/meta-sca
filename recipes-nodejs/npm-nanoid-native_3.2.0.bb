SUMMARY = "NPM: nanoid"
DESCRIPTION = "A tiny (130 bytes), secure URL-friendly unique string ID generator"
HOMEPAGE = "https://github.com/ai/nanoid#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=237c21016e56a1ee4475a39fc00d1504"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/nanoid/-/nanoid-3.2.0.tgz"
SRC_URI[md5sum] = "044ae2ac093047923b789e20df03e34f"
SRC_URI[sha256sum] = "835597982cfa992fad421182b48fbcf455e780e9ceabefceca38e69c3598677c"

NPM_PKGNAME = "nanoid"

inherit npmhelper
inherit native
