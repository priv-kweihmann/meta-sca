SUMMARY = "NPM: iconv-lite"
DESCRIPTION = "Convert character encodings in pure javascript."
HOMEPAGE = "https://github.com/ashtuchkin/iconv-lite"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f942263d98f0d75e0e0101884e86261d"

DEPENDS = "npm-safer-buffer-native"

SRC_URI = "https://registry.npmjs.org/iconv-lite/-/iconv-lite-0.6.0.tgz"
SRC_URI[md5sum] = "f9e3bd4a9321982b581e4ca9a19940ee"
SRC_URI[sha256sum] = "68279bcad852859e3f499232b9b486ab9de89338fcad44f747ae7f8deabf8768"

NPM_PKGNAME = "iconv-lite"

inherit npmhelper
inherit native
