SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.12.17.tgz"
SRC_URI[md5sum] = "71d3679bb9c8ec2f1d64ff011a9e669c"
SRC_URI[sha256sum] = "973cd38d1eef417be77e0f8e57d86fb231522f35fb66c4251e9acd52c530af8c"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
