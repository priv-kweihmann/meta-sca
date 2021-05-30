SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.14.4.tgz"
SRC_URI[md5sum] = "f153b6ededb749c9d471e2337a57852f"
SRC_URI[sha256sum] = "5cefd4c894df3076f478efc3167226f2ba909791fdc1f5d41d4ddb0063e7f534"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
