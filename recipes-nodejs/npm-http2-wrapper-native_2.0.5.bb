SUMMARY = "NPM: http2-wrapper"
DESCRIPTION = "HTTP2 client, just with the familiar `https` API"
HOMEPAGE = "https://github.com/szmarczak/http2-wrapper#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78fd36a7284eb85369521bcb6e863186"

DEPENDS = "npm-quick-lru-native \
           npm-resolve-alpn-native"

SRC_URI = "https://registry.npmjs.org/http2-wrapper/-/http2-wrapper-2.0.5.tgz"
SRC_URI[md5sum] = "2898a1ff4523ec25b3f97495d45260e1"
SRC_URI[sha256sum] = "a1da8d4dfdcd3104dd8690d717ffd8d98b612c5c72848e1a55c13aca006714ef"

NPM_PKGNAME = "http2-wrapper"

inherit npmhelper
inherit native
