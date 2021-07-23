SUMMARY = "NPM: http2-wrapper"
DESCRIPTION = "HTTP2 client, just with the familiar `https` API"
HOMEPAGE = "https://github.com/szmarczak/http2-wrapper#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78fd36a7284eb85369521bcb6e863186"

DEPENDS = "npm-quick-lru-native \
           npm-resolve-alpn-native"

SRC_URI = "https://registry.npmjs.org/http2-wrapper/-/http2-wrapper-2.1.1.tgz"
SRC_URI[md5sum] = "9f3a245450dc2f75c0eeddc8128c69ae"
SRC_URI[sha256sum] = "d240d882f4f586deae4a5eccd84fc10a5f158586fdcd6bb7dad315035c6135cf"

NPM_PKGNAME = "http2-wrapper"

inherit npmhelper
inherit native
