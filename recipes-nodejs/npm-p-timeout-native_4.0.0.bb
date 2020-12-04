SUMMARY = "NPM: p-timeout"
DESCRIPTION = "Timeout a promise after a specified amount of time"
HOMEPAGE = "https://github.com/sindresorhus/p-timeout#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/p-timeout/-/p-timeout-4.0.0.tgz"
SRC_URI[md5sum] = "86e1a68d4947b53f92f3a58bc5ae9ec9"
SRC_URI[sha256sum] = "c3945108a81e84912352bf5a5ca5ba7b15a37ae2a9deb28e2a9872641739bd5e"

NPM_PKGNAME = "p-timeout"

inherit npmhelper
inherit native
