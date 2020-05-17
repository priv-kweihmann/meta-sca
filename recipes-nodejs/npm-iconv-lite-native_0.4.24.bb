SUMMARY = "NPM: iconv-lite"
DESCRIPTION = "Convert character encodings in pure javascript."
HOMEPAGE = "https://github.com/ashtuchkin/iconv-lite"

DEPENDS = "npm-safer-buffer-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f942263d98f0d75e0e0101884e86261d"

SRC_URI = "https://registry.npmjs.org/iconv-lite/-/iconv-lite-0.4.24.tgz"
SRC_URI[md5sum] = "fd75d1bd67b550ece627b2ef307d775d"
SRC_URI[sha256sum] = "576c64f2098ed44c3d5e48d7a9dc65512700c1d6a969a71a74d474da8e734635"

S = "${WORKDIR}/package"

NPM_PKGNAME = "iconv-lite"

inherit npmhelper
inherit native
