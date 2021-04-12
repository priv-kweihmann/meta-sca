SUMMARY = "NPM: http2-wrapper"
DESCRIPTION = "HTTP2 client, just with the familiar `https` API"
HOMEPAGE = "https://github.com/szmarczak/http2-wrapper#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78fd36a7284eb85369521bcb6e863186"

DEPENDS = "npm-quick-lru-native \
           npm-resolve-alpn-native"

SRC_URI = "https://registry.npmjs.org/http2-wrapper/-/http2-wrapper-2.0.3.tgz"
SRC_URI[md5sum] = "f6769e37532951bf517a351cb02cda3d"
SRC_URI[sha256sum] = "549b13cafcad2dc2c99c646451173f0877f8caf792a9638b98c652f5140970c9"

NPM_PKGNAME = "http2-wrapper"

inherit npmhelper
inherit native
