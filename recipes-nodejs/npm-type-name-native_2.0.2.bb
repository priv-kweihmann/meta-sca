SUMMARY = "NPM: type-name"
DESCRIPTION = "Just a reasonable typeof"
HOMEPAGE = "https://github.com/twada/type-name"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=013726bb5a94b10eaec4cee110edd7a7"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-name/-/type-name-2.0.2.tgz"
SRC_URI[md5sum] = "02267775e7005eb598e3461138c7dd2b"
SRC_URI[sha256sum] = "292789925e236d9c16eaf8a1b3f7b4d3cb047c7888a25f63d670798ac07233a0"

NPM_PKGNAME = "type-name"

inherit npmhelper
inherit native
