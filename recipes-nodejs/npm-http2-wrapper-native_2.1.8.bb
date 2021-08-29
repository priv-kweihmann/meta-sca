SUMMARY = "NPM: http2-wrapper"
DESCRIPTION = "HTTP2 client, just with the familiar `https` API"
HOMEPAGE = "https://github.com/szmarczak/http2-wrapper#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78fd36a7284eb85369521bcb6e863186"

DEPENDS = "npm-quick-lru-native \
           npm-resolve-alpn-native"

SRC_URI = "https://registry.npmjs.org/http2-wrapper/-/http2-wrapper-2.1.8.tgz"
SRC_URI[md5sum] = "8a81c492ae39e7a12bde8e660c6ce91c"
SRC_URI[sha256sum] = "8ffe35e417ffddbc15d82adbb83cc06472f7124be7469fdb9fe37058e45b2f08"

NPM_PKGNAME = "http2-wrapper"

inherit npmhelper
inherit native
