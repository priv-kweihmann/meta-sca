SUMMARY = "NPM: http2-wrapper"
DESCRIPTION = "HTTP2 client, just with the familiar `https` API"
HOMEPAGE = "https://github.com/szmarczak/http2-wrapper#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78fd36a7284eb85369521bcb6e863186"

DEPENDS = "npm-quick-lru-native \
           npm-resolve-alpn-native"

SRC_URI = "https://registry.npmjs.org/http2-wrapper/-/http2-wrapper-2.0.8.tgz"
SRC_URI[md5sum] = "cccf0b623765869d697156a081ae34a6"
SRC_URI[sha256sum] = "ee824a3257fcf1ee78986de985d005bb2b9cc1abbc965b659a8fe52ba007b654"

NPM_PKGNAME = "http2-wrapper"

inherit npmhelper
inherit native
