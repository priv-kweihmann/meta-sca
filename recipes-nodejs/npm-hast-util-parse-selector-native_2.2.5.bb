SUMMARY = "NPM: hast-util-parse-selector"
DESCRIPTION = "hast utility to create an element from a simple CSS selector"
HOMEPAGE = "https://github.com/syntax-tree/hast-util-parse-selector#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/hast-util-parse-selector/-/hast-util-parse-selector-2.2.5.tgz"
SRC_URI[md5sum] = "b04a4dc8a16fac34945d32c498f656c4"
SRC_URI[sha256sum] = "b7d9a6e070b8c5be0b128c8cd824643955b055da8a7136cea503f7df541a8bc6"

NPM_PKGNAME = "hast-util-parse-selector"

inherit npmhelper
inherit native
