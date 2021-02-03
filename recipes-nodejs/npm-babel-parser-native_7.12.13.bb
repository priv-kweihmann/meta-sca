SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.12.13.tgz"
SRC_URI[md5sum] = "2ebc6c8b8dff8b91efe4a4d282a614f0"
SRC_URI[sha256sum] = "05cb512ff340ab532731828de8218240f27ce61e892646492164d9cc8a7e2249"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
