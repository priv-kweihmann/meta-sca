SUMMARY = "NPM: iconv-lite"
DESCRIPTION = "Convert character encodings in pure javascript."
HOMEPAGE = "https://github.com/ashtuchkin/iconv-lite"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f942263d98f0d75e0e0101884e86261d"

DEPENDS = "npm-safer-buffer-native"

SRC_URI = "https://registry.npmjs.org/iconv-lite/-/iconv-lite-0.6.1.tgz"
SRC_URI[md5sum] = "d0332c23f5770cbce151e1888288f3ae"
SRC_URI[sha256sum] = "a206ccc9904cfa20042e67073740a81ef6bff2806518665564c0f87b84702cc7"

NPM_PKGNAME = "iconv-lite"

inherit npmhelper
inherit native
