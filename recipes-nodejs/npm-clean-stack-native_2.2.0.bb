SUMMARY = "NPM: clean-stack"
DESCRIPTION = "Clean up error stack traces"
HOMEPAGE = "https://github.com/sindresorhus/clean-stack#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/clean-stack/-/clean-stack-2.2.0.tgz"
SRC_URI[md5sum] = "98495454e4106c25e5ed97ae9a6b1148"
SRC_URI[sha256sum] = "056c37660ab8c6ff60e5b25b883241c335478fee9c1ab1ec4c15bf891cf55655"

NPM_PKGNAME = "clean-stack"

inherit npmhelper
inherit native
