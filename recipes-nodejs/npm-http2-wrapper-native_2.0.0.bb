SUMMARY = "NPM: http2-wrapper"
DESCRIPTION = "HTTP2 client, just with the familiar `https` API"
HOMEPAGE = "https://github.com/szmarczak/http2-wrapper#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78fd36a7284eb85369521bcb6e863186"

DEPENDS = "npm-quick-lru-native \
           npm-resolve-alpn-native"

SRC_URI = "https://registry.npmjs.org/http2-wrapper/-/http2-wrapper-2.0.0.tgz"
SRC_URI[md5sum] = "4d731f4d148443b2f53daf5aad8889c2"
SRC_URI[sha256sum] = "3a434bd4aa8950edade4f0dc0757a979df93c3934446035584640f5bffbfdd48"

NPM_PKGNAME = "http2-wrapper"

inherit npmhelper
inherit native
