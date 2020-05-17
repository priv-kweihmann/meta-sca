SUMMARY = "NPM: p-timeout"
DESCRIPTION = "Timeout a promise after a specified amount of time"
HOMEPAGE = "https://github.com/sindresorhus/p-timeout#readme"

DEPENDS = "npm-p-finally-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/p-timeout/-/p-timeout-3.2.0.tgz"
SRC_URI[md5sum] = "d7352e9774140c4911b906e4f8e3907f"
SRC_URI[sha256sum] = "226b0886e0a837928501e3f5f96c5ec2f4c97aa2e287719b50d5341678da1c67"

NPM_PKGNAME = "p-timeout"

inherit npmhelper
inherit native
