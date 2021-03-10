SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.13.10.tgz"
SRC_URI[md5sum] = "b7cafd5bf00df10c38624ecf3bbb1e50"
SRC_URI[sha256sum] = "4b1a4aea37286689f1e94fa970c530a0798bfd8d4569680049eb65d64780f69f"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
