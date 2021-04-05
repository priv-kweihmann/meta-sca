SUMMARY = "NPM: match-casing"
DESCRIPTION = "Match the case of `value` to that of `base`"
HOMEPAGE = "https://github.com/wooorm/match-casing#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/match-casing/-/match-casing-2.0.0.tgz"
SRC_URI[md5sum] = "47a09162d6de13bba1c194487efb0207"
SRC_URI[sha256sum] = "1dde9538c888b8daf3d4f512e74703c7563028b773283a7dcacc3d23fa99ae96"

NPM_PKGNAME = "match-casing"

inherit npmhelper
inherit native
