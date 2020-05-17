SUMMARY = "NPM: npm-run-path"
DESCRIPTION = "Get your PATH prepended with locally installed binaries"
HOMEPAGE = "https://github.com/sindresorhus/npm-run-path#readme"

DEPENDS = "npm-path-key-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/npm-run-path/-/npm-run-path-2.0.2.tgz"
SRC_URI[md5sum] = "b216d34c94a739348a143604c6ddfb75"
SRC_URI[sha256sum] = "656d56148ba099836db1bc2bd397fd8a385bd63708f9bca79458217dc770e1f7"

NPM_PKGNAME = "npm-run-path"

inherit npmhelper
inherit native
