SUMMARY = "NPM: http2-wrapper"
DESCRIPTION = "HTTP2 client, just with the familiar `https` API"
HOMEPAGE = "https://github.com/szmarczak/http2-wrapper#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78fd36a7284eb85369521bcb6e863186"

DEPENDS = "npm-quick-lru-native \
           npm-resolve-alpn-native"

SRC_URI = "https://registry.npmjs.org/http2-wrapper/-/http2-wrapper-2.0.1.tgz"
SRC_URI[md5sum] = "959c03fe9c2a8088fcac22dc056a3769"
SRC_URI[sha256sum] = "9361f6297abcf753a6d05aa5f10e2955bbecb94187c9d616da71c952e3c83b65"

NPM_PKGNAME = "http2-wrapper"

inherit npmhelper
inherit native
