SUMMARY = "NPM: term-size"
DESCRIPTION = "Reliably get the terminal window size (columns & rows)"
HOMEPAGE = "https://github.com/sindresorhus/term-size#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/term-size/-/term-size-2.2.0.tgz"
SRC_URI[md5sum] = "86c3f240a736cf5202db0a7c88b25f37"
SRC_URI[sha256sum] = "da95b4722c41aa82d4e6747e395695f69397824d1ca01b9118e93e9490ebaef0"

NPM_PKGNAME = "term-size"

inherit npmhelper
inherit native
