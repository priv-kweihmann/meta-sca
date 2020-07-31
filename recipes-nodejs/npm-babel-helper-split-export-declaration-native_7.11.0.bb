SUMMARY = "NPM: @babel/helper-split-export-declaration"
DESCRIPTION = ">"
HOMEPAGE = "https://github.com/babel/babel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-split-export-declaration/-/helper-split-export-declaration-7.11.0.tgz"
SRC_URI[md5sum] = "8129cd58d81b6b171bb46fd4bdf0ee21"
SRC_URI[sha256sum] = "73280b2b7c6b489df6c110422302a57c1a7791482ff441ad193702dc510db779"

NPM_PKGNAME = "@babel/helper-split-export-declaration"

inherit npmhelper
inherit native
