SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.13.9.tgz"
SRC_URI[md5sum] = "a57e94a3bc6d2e535eb3ee5432ba71f6"
SRC_URI[sha256sum] = "32fadac4bcd16282f0c4a11fb81e9fe310155d5baa34103b28ac402c35bb60b1"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
