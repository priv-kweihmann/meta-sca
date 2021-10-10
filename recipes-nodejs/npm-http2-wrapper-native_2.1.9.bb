SUMMARY = "NPM: http2-wrapper"
DESCRIPTION = "HTTP2 client, just with the familiar `https` API"
HOMEPAGE = "https://github.com/szmarczak/http2-wrapper#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78fd36a7284eb85369521bcb6e863186"

DEPENDS = "npm-quick-lru-native \
           npm-resolve-alpn-native"

SRC_URI = "https://registry.npmjs.org/http2-wrapper/-/http2-wrapper-2.1.9.tgz"
SRC_URI[md5sum] = "e9cdadf7a2b76ce2715ae7f4d0cefd42"
SRC_URI[sha256sum] = "77cf401b76e4dd80fc772dd7c47825a7f4d7b8933dc13d9eae07ad34822f554f"

NPM_PKGNAME = "http2-wrapper"

inherit npmhelper
inherit native
