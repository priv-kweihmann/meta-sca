SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.16.3.tgz"
SRC_URI[md5sum] = "8812c7995da2b15cf1397ceaf2bbcfff"
SRC_URI[sha256sum] = "3f2850e43d2e8aa9a993a94348a1469a294301859731a29a7050adcd2113fffe"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
