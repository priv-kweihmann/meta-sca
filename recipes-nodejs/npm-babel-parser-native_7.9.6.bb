SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.9.6.tgz"
SRC_URI[md5sum] = "9f913c52439181ad95292ef13c25ec89"
SRC_URI[sha256sum] = "059a4a100b47b5e7a1a6d03d6c43fbde9bbe47bae7dd5fc5e743adef0eb98a2d"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
