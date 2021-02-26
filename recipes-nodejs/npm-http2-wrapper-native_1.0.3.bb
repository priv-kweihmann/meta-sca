SUMMARY = "NPM: http2-wrapper"
DESCRIPTION = "HTTP2 client, just with the familiar `https` API"
HOMEPAGE = "https://github.com/szmarczak/http2-wrapper#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78fd36a7284eb85369521bcb6e863186"

DEPENDS = "npm-quick-lru-native \
           npm-resolve-alpn-native"

SRC_URI = "https://registry.npmjs.org/http2-wrapper/-/http2-wrapper-1.0.3.tgz"
SRC_URI[md5sum] = "6714adc65bf0d10550ef75aad14195dd"
SRC_URI[sha256sum] = "fd1d9e277bb8b41f07ab9ea28f60ac4bb00194e1cca9724ec9d4f6285036821e"

NPM_PKGNAME = "http2-wrapper"

inherit npmhelper
inherit native
