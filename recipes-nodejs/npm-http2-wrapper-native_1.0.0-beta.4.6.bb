SUMMARY = "NPM: http2-wrapper"
DESCRIPTION = "HTTP2 client, just with the familiar `https` API"
HOMEPAGE = "https://github.com/szmarczak/http2-wrapper#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78fd36a7284eb85369521bcb6e863186"

DEPENDS = "npm-quick-lru-native \
           npm-resolve-alpn-native"

SRC_URI = "https://registry.npmjs.org/http2-wrapper/-/http2-wrapper-1.0.0-beta.4.6.tgz"
SRC_URI[md5sum] = "681b479a3f4ae67a3ad10b714613fb5e"
SRC_URI[sha256sum] = "915c84451b4a8e7feca3242e4f84315e09231814d1174bcd55f50b5d87131454"

NPM_PKGNAME = "http2-wrapper"

inherit npmhelper
inherit native
