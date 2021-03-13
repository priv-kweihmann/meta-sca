SUMMARY = "NPM: quotation"
DESCRIPTION = "Quote a value"
HOMEPAGE = "https://github.com/wooorm/quotation#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/quotation/-/quotation-2.0.1.tgz"
SRC_URI[md5sum] = "cef5a0d82bed4a09b3839a4dc44aef39"
SRC_URI[sha256sum] = "304c8e47972ceb9d767cc14f8a6d0cd9548d33628e1490587fdb83d86cab3b8a"

NPM_PKGNAME = "quotation"

inherit npmhelper
inherit native
