SUMMARY = "NPM: http2-wrapper"
DESCRIPTION = "HTTP2 client, just with the familiar `https` API"
HOMEPAGE = "https://github.com/szmarczak/http2-wrapper#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78fd36a7284eb85369521bcb6e863186"

DEPENDS = "npm-quick-lru-native \
           npm-resolve-alpn-native"

SRC_URI = "https://registry.npmjs.org/http2-wrapper/-/http2-wrapper-2.1.2.tgz"
SRC_URI[md5sum] = "ecb141fba016c9dee56e9322a7c5e6ff"
SRC_URI[sha256sum] = "9960feab241eedbaa5f921d1cf7032302a85d1d9cc6c7f1aac82eebfd94ac89e"

NPM_PKGNAME = "http2-wrapper"

inherit npmhelper
inherit native
