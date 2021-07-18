SUMMARY = "NPM: @types/is-empty"
DESCRIPTION = "TypeScript definitions for is-empty"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b98fddd052bb2f5ddbcdbd417ffb26a8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/is-empty/-/is-empty-1.2.0.tgz"
SRC_URI[md5sum] = "372d01bf5764aa6cedd0ec70447768e1"
SRC_URI[sha256sum] = "eee3f9884ec019c012393d06b5d2c2f52221793ac5394270f9b7d24216224e4d"

NPM_PKGNAME = "@types/is-empty"

inherit npmhelper
inherit native

S = "${WORKDIR}/is-empty"
