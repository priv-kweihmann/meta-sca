SUMMARY = "NPM: http2-wrapper"
DESCRIPTION = "HTTP2 client, just with the familiar `https` API"
HOMEPAGE = "https://github.com/szmarczak/http2-wrapper#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78fd36a7284eb85369521bcb6e863186"

DEPENDS = "npm-quick-lru-native \
           npm-resolve-alpn-native"

SRC_URI = "https://registry.npmjs.org/http2-wrapper/-/http2-wrapper-2.0.7.tgz"
SRC_URI[md5sum] = "35ad98225eeb4590cb3a0bc14cc6d9f3"
SRC_URI[sha256sum] = "8285304851a15ba2354f7741de7373c39776a1aac0b464bcc42f1625d1cec176"

NPM_PKGNAME = "http2-wrapper"

inherit npmhelper
inherit native
