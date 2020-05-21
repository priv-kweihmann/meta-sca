SUMMARY = "NPM: iconv-lite"
DESCRIPTION = "Convert character encodings in pure javascript."
HOMEPAGE = "https://github.com/ashtuchkin/iconv-lite"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f942263d98f0d75e0e0101884e86261d"

DEPENDS = "npm-safer-buffer-native"

SRC_URI = "https://registry.npmjs.org/iconv-lite/-/iconv-lite-0.5.1.tgz"
SRC_URI[md5sum] = "2a6934501c5fb4f9ed07bd894bb8b9f8"
SRC_URI[sha256sum] = "b14ef3c0f495693d569958263881404a0b1911a2951a9121d36a6623eb2668bc"

NPM_PKGNAME = "iconv-lite"

inherit npmhelper
inherit native
