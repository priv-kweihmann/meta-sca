SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.12.7.tgz"
SRC_URI[md5sum] = "d3226d42ac1e0e4af7fcde094196029a"
SRC_URI[sha256sum] = "cc4d8a546c7cf32272e444acfc094a8e43be42ef54b0c2244df8207ea1487ef8"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
