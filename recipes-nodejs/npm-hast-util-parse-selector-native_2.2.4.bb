SUMMARY = "NPM: hast-util-parse-selector"
DESCRIPTION = "hast utility to create an element from a simple CSS selector"
HOMEPAGE = "https://github.com/syntax-tree/hast-util-parse-selector#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/hast-util-parse-selector/-/hast-util-parse-selector-2.2.4.tgz"
SRC_URI[md5sum] = "27ab530b7bd45c884860f4eb21193d50"
SRC_URI[sha256sum] = "67332a9954fe0172e3d90bec22ecf4dc6734a1b1814b411ed7ad3230e071605a"

NPM_PKGNAME = "hast-util-parse-selector"

inherit npmhelper
inherit native
