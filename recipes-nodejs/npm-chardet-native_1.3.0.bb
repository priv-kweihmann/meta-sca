SUMMARY = "NPM: chardet"
DESCRIPTION = "Character encoding detector"
HOMEPAGE = "https://github.com/runk/node-chardet"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=90c339b6009a31625309f490cd17c9e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/chardet/-/chardet-1.3.0.tgz"
SRC_URI[md5sum] = "f9e6d8f2b53f1fae172babe9912b5d28"
SRC_URI[sha256sum] = "245623a91b1955955fcfdd133fd387f92d72895c88eb85f16c0d3fcc3274880c"

NPM_PKGNAME = "chardet"

inherit npmhelper
inherit native
