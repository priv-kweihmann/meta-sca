SUMMARY = "NPM: http2-wrapper"
DESCRIPTION = "HTTP2 client, just with the familiar `https` API"
HOMEPAGE = "https://github.com/szmarczak/http2-wrapper#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78fd36a7284eb85369521bcb6e863186"

DEPENDS = "npm-quick-lru-native \
           npm-resolve-alpn-native"

SRC_URI = "https://registry.npmjs.org/http2-wrapper/-/http2-wrapper-2.1.3.tgz"
SRC_URI[md5sum] = "cf8632d36ba52e0ac8e048f99779702c"
SRC_URI[sha256sum] = "17e8df5a9adb7cb757d03449fd8d28da3c271c4fd0132a76843220224d4e6b46"

NPM_PKGNAME = "http2-wrapper"

inherit npmhelper
inherit native
