SUMMARY = "NPM: iconv-lite"
DESCRIPTION = "Convert character encodings in pure javascript."
HOMEPAGE = "https://github.com/ashtuchkin/iconv-lite"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f942263d98f0d75e0e0101884e86261d"

DEPENDS = "npm-safer-buffer-native"

SRC_URI = "https://registry.npmjs.org/iconv-lite/-/iconv-lite-0.6.3.tgz"
SRC_URI[md5sum] = "af89073d7309cb2a34e76ed6468d1ee2"
SRC_URI[sha256sum] = "7127ec148f994f031eff658a50dc0629f6010775a8202213b0526ec5e30fc8f4"

NPM_PKGNAME = "iconv-lite"

inherit npmhelper
inherit native
