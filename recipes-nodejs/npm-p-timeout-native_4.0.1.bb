SUMMARY = "NPM: p-timeout"
DESCRIPTION = "Timeout a promise after a specified amount of time"
HOMEPAGE = "https://github.com/sindresorhus/p-timeout#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/p-timeout/-/p-timeout-4.0.1.tgz"
SRC_URI[md5sum] = "a1ebb6fa72816745a60b0dc310843589"
SRC_URI[sha256sum] = "72ee2cc545ec503261276351be46c42a9bdf75865dfcfb9fbd922204cf6715d9"

NPM_PKGNAME = "p-timeout"

inherit npmhelper
inherit native
