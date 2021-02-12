SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.12.16.tgz"
SRC_URI[md5sum] = "f573e5455fa39afadc1bb30f724622dd"
SRC_URI[sha256sum] = "33a407b6bf6c30fdeda12d1373fb192b49be135a0c48bc58040d9dfcebefd210"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
