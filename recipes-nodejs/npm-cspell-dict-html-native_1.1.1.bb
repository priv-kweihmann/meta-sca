SUMMARY = "NPM: cspell-dict-html"
DESCRIPTION = "HTML dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/html#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-html/-/cspell-dict-html-1.1.1.tgz"
SRC_URI[md5sum] = "8a90028e5d39045189558bd77651e720"
SRC_URI[sha256sum] = "6ea45dc6309a58893151b82027c0642100a38e5d088edf05a64cbd751d7a6e5a"

NPM_PKGNAME = "cspell-dict-html"

inherit npmhelper
inherit native
