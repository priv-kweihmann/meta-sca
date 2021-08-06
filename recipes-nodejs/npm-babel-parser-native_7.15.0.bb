SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.15.0.tgz"
SRC_URI[md5sum] = "2065fe1415634f4dae50e2fa783e52a3"
SRC_URI[sha256sum] = "6022c54b9b649997b6ba908b3eefcc240569fce710d7ecddb767952b824b19b9"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
