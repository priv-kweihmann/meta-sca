SUMMARY = "NPM: http2-wrapper"
DESCRIPTION = "HTTP2 client, just with the familiar `https` API"
HOMEPAGE = "https://github.com/szmarczak/http2-wrapper#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78fd36a7284eb85369521bcb6e863186"

DEPENDS = "npm-quick-lru-native \
           npm-resolve-alpn-native"

SRC_URI = "https://registry.npmjs.org/http2-wrapper/-/http2-wrapper-2.1.4.tgz"
SRC_URI[md5sum] = "9ef7825a5fb3b168c89ad06f592f9ef0"
SRC_URI[sha256sum] = "7fc35c8a1ed588de45137d33f8a1f99d5314307dafc30315600acbf5432bdfd1"

NPM_PKGNAME = "http2-wrapper"

inherit npmhelper
inherit native
