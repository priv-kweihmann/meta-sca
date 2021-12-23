SUMMARY = "NPM: match-casing"
DESCRIPTION = "Match the case of `value` to that of `base`"
HOMEPAGE = "https://github.com/wooorm/match-casing#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/match-casing/-/match-casing-2.0.1.tgz"
SRC_URI[md5sum] = "ed675da07e33a29632cfafde1b5eaadb"
SRC_URI[sha256sum] = "0f6506bc4189b08f7c59cccb2bdece4bf8276831c6df69478a76659aaf257da5"

NPM_PKGNAME = "match-casing"

inherit npmhelper
inherit native
