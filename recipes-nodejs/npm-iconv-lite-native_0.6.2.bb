SUMMARY = "NPM: iconv-lite"
DESCRIPTION = "Convert character encodings in pure javascript."
HOMEPAGE = "https://github.com/ashtuchkin/iconv-lite"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f942263d98f0d75e0e0101884e86261d"

DEPENDS = "npm-safer-buffer-native"

SRC_URI = "https://registry.npmjs.org/iconv-lite/-/iconv-lite-0.6.2.tgz"
SRC_URI[md5sum] = "86c943ddaa2561dfa69047305ffa1588"
SRC_URI[sha256sum] = "9d6805cee66fc99871137caef9853acb11c8971e0085738f2ad71aa7c455727b"

NPM_PKGNAME = "iconv-lite"

inherit npmhelper
inherit native
