SUMMARY = "NPM: http2-wrapper"
DESCRIPTION = "HTTP2 client, just with the familiar `https` API"
HOMEPAGE = "https://github.com/szmarczak/http2-wrapper#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78fd36a7284eb85369521bcb6e863186"

DEPENDS = "npm-quick-lru-native \
           npm-resolve-alpn-native"

SRC_URI = "https://registry.npmjs.org/http2-wrapper/-/http2-wrapper-1.0.0-beta.5.2.tgz"
SRC_URI[md5sum] = "714bd44e87ee0566ad467537f82d0303"
SRC_URI[sha256sum] = "a34973542e223b51789569fc66e1ed79542eb4413edb5f233839ab13ec25d13d"

NPM_PKGNAME = "http2-wrapper"

inherit npmhelper
inherit native
