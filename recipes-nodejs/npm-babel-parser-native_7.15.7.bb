SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.15.7.tgz"
SRC_URI[md5sum] = "728234bad8c87efaa3b53aa534620a63"
SRC_URI[sha256sum] = "1f2939304486e7c1892fd9047855ba243861e44ac7b941792f9588b4980aa2a3"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
